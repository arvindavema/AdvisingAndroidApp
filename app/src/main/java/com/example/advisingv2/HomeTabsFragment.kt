package com.example.advisingv2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.advisingv2.databinding.FragmentHomeTabsBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.DisposableHandle

val pagesArray = arrayOf("Dashboard",  "Upcoming", "Grades",  "Inbox")
/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class HomeTabsFragment : Fragment() {
	private var _binding: FragmentHomeTabsBinding? = null
	private val binding
		get() = _binding!!
	
	private lateinit var tabLayout: TabLayout
	private lateinit var viewPager: ViewPager2
	
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		_binding = FragmentHomeTabsBinding.inflate(inflater, container, false)
		return binding.root
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		viewPager = binding.viewPager
		tabLayout = binding.tabLayout
		
		val dAdapter =  DashCollectionAdapter(this)
		viewPager.adapter = dAdapter
		
		TabLayoutMediator(tabLayout, viewPager) { tab, position ->
			tab.text= pagesArray[(position)]
		}.attach()
	}
	
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
}

class DashCollectionAdapter(fragment: Fragment) :
	FragmentStateAdapter(fragment) {
	
	override fun getItemCount(): Int {
		return 4
	}
	
	override fun createFragment(position: Int): Fragment {
		return when(position) {
			0 -> DashboardFragment()
			1 -> CalendarFragment()
			2 -> GpaCalculatorFragment()
			else -> InboxFragment()
		}
	}
	
}
