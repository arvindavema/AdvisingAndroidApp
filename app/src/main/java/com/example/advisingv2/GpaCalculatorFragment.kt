package com.example.advisingv2

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.advisingv2.databinding.FragmentGpaCalculatorBinding

class GpaCalculatorFragment : Fragment() {
	companion object {
		fun newInstance() = GpaCalculatorFragment()
	}
	
	private var _binding: FragmentGpaCalculatorBinding? = null
	
	private val viewModel: GpaCalculatorViewModel by activityViewModels()
	
	private var courseName: String = ""
	private var letterGrade: String = ""
	private var numCredits: Int = 0
	
	
	private val binding get() = _binding!!
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		
		_binding = FragmentGpaCalculatorBinding.inflate(inflater, container, false)
		val view = _binding?.root
		
		binding.buttonAddCourse.setOnClickListener {
			Toast.makeText(context, "Add Course Button Clicked", Toast.LENGTH_SHORT).show()
			val dialogBuilder = AlertDialog.Builder(context)
			
			dialogBuilder.setView(inflater.inflate(R.layout.semester_gpa_dialog, null))
				.setCancelable(true)
				.setPositiveButton("Add",
				DialogInterface.OnClickListener{ _, _->
					Toast.makeText(context, "Sem Dialog Add Pressed", Toast.LENGTH_SHORT).show()
					
				})
				.setNegativeButton("Cancel", DialogInterface.OnClickListener{ d, id ->
				Toast.makeText(context,"Sem Dialog Cancelled", Toast.LENGTH_SHORT).show()
				d.cancel()
			})
			
			val alert = dialogBuilder.create()
			alert.setTitle("Add Couse To Semester")
			alert.show()
		}
		
		// Inflate the layout for this fragment
		return view
	}
	
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
	
}