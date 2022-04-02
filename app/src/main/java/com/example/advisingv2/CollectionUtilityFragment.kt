package com.example.advisingv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2






// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [CollectionUtilityFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CollectionUtilityFragment : Fragment() {
	// TODO: Rename and change types of parameters
	private var param1: String? = null
	private var param2: String? = null
	
	private lateinit var collectionUtilityAdapter: CollectionUtilityAdapter
	private lateinit var viewPager: ViewPager2
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		arguments?.let {
			param1 = it.getString(ARG_PARAM1)
			param2 = it.getString(ARG_PARAM2)
		}
	}
	
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_utility, container, false)
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		collectionUtilityAdapter = CollectionUtilityAdapter(this)
		viewPager = view.findViewById(R.id.pager)
		viewPager.adapter = collectionUtilityAdapter
	}
	
	
//	companion object {
//		/**
//		 * Use this factory method to create a new instance of
//		 * this fragment using the provided parameters.
//		 *
//		 * @param param1 Parameter 1.
//		 * @param param2 Parameter 2.
//		 * @return A new instance of fragment UtilityFragment.
//		 */
//		// TODO: Rename and change types and number of parameters
//		@JvmStatic
//		fun newInstance(param1: String, param2: String) =
//			CollectionUtilityFragment().apply {
//				arguments = Bundle().apply {
//					putString(ARG_PARAM1, param1)
//					putString(ARG_PARAM2, param2)
//				}
//			}
//	}
}

class CollectionUtilityAdapter(fragment: Fragment): FragmentStateAdapter(fragment){
	override fun getItemCount(): Int = 100
	
	override fun createFragment(position: Int): Fragment {
		val fragment = UtilityObjectFragment()
		
		fragment.arguments= Bundle().apply {
			putInt(ARG_OBJECT, position+1)
		}
		return fragment
	}
}

private const val ARG_OBJECT = "object"


class UtilityObjectFragment: Fragment(){
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_utility, container, false)
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
			val textView: TextView = view.findViewById(android.R.id.text1)
			textView.text = getInt(ARG_OBJECT).toString()
		}
	}
}