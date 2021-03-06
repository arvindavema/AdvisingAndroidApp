package com.example.advisingv2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.advisingv2.R
import com.example.advisingv2.databinding.FragmentAboutBinding
import com.example.advisingv2.databinding.FragmentContactBinding


// TODO: This is to display all of yhe contact info of important staff and advisors


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [ContactFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactFragment : Fragment() {
	// TODO: Rename and change types of parameters
	private var _binding: FragmentContactBinding? = null
	private var param1: String? = null
	private var param2: String? = null

	private val binding: FragmentContactBinding
		get() = _binding!!
	
	//Advisor info
	private var advisors = listOf(
		mapOf(
			"name" to "Courtney Cabansag",
			"office" to " 1154 Brendan Iribe Center",
			"email" to "cabansag@umd.edu",
			"summary" to "Courtney is a Senior Academic Advisor who received her B.A. in Language, Culture & Society from the University of California, Santa Barbara and her M.S. in Higher Postsecondary Education from Syracuse University. Courtney has worked in academic success, student involvement and leadership and most recently residence life before joining the Department of Computer Science in 2019. When she isn’t advising, Courtney enjoys exercising (everything from weightlifting to aerial yoga), watching reality television, and discovering new vegan recipes."
		),
		mapOf(
			"name" to "",
		)
	)
	
	//head of staff contacts
	private var heads = listOf(
		mapOf("name" to ""),
	)
	
	//Peer advisors
	private var peers = listOf(
		mapOf("name" to ""),
	)

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
		_binding = FragmentContactBinding.inflate(inflater, container, false)
		val view = binding.root
		return view
	}
	
	companion object {
		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 *
		 * @param param1 Parameter 1.
		 * @param param2 Parameter 2.
		 * @return A new instance of fragment ContactFragment.
		 */
		// TODO: Rename and change types and number of parameters
		@JvmStatic
		fun newInstance(param1: String, param2: String) =
			ContactFragment().apply {
				arguments = Bundle().apply {
					putString(ARG_PARAM1, param1)
					putString(ARG_PARAM2, param2)
				}
			}
	}
}