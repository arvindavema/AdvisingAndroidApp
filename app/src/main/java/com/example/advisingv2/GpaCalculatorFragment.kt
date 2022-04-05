package com.example.advisingv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.advisingv2.databinding.FragmentGpaCalculatorBinding

class GpaCalculatorFragment : Fragment() {
	companion object {
		fun newInstance() = GpaCalculatorFragment()
	}
	
	private var _binding: FragmentGpaCalculatorBinding? = null
	
	private lateinit var viewModel: GpaCalculatorViewModel
	
	private var courseName: String?=null
	private var letterGrade: String?=null
	
	
	private val binding get() = _binding!!
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		
		_binding = FragmentGpaCalculatorBinding.inflate(inflater, container, false)
		val view = _binding?.root
		
		binding.buttonAddCourse.setOnClickListener {
			Toast.makeText(context, "Add Course Button Clicked", Toast.LENGTH_SHORT).show()
		}
		// Inflate the layout for this fragment
		return view
	}
	
	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProvider(this)[GpaCalculatorViewModel::class.java]
		// TODO: Use the ViewModel
	
	}
	
	
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
	
	
	
}