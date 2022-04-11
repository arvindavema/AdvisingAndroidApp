package com.example.advisingv2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.advisingv2.*
import com.example.advisingv2.databinding.FragmentOverviewBinding
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"

val tabNames = arrayOf("CS Department", "Degree", "Transferring", "Staff Contacts")

/**
 * A simple [Fragment] subclass.
 * Use the [OverviewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OverviewFragment : Fragment() {
	// TODO: Rename and change types of parameters
	private lateinit var overviewCollectionAdapter: OverviewCollectionAdapter
	private lateinit var viewPager: ViewPager2

	private lateinit var binding: FragmentOverviewBinding

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		binding = FragmentOverviewBinding.inflate(inflater, container, false)
		// Inflate the layout for this fragment
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		overviewCollectionAdapter  = OverviewCollectionAdapter(this)
		viewPager = view.findViewById(R.id.overviewViewPager)
		viewPager.adapter = overviewCollectionAdapter

		TabLayoutMediator(binding.tabLayoutOverview, binding.overviewViewPager) { tab, position ->
			tab.text = tabNames[position]
		}.attach()
	}
}



class OverviewCollectionAdapter(fragment: Fragment) :
	FragmentStateAdapter(fragment) {

	override fun getItemCount(): Int {
		return 4
	}

	override fun createFragment(position: Int): Fragment {
		return when(position) {
			0 -> AboutFragment()
			1 -> DegreerequirementsFragment()
			2 -> TransferInformationFragment()
			else -> ContactFragment()
		}
	}

}