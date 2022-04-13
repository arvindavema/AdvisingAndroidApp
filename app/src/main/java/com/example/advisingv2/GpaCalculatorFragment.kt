package com.example.advisingv2

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

import com.example.advisingv2.databinding.FragmentGpaCalculatorBinding
import com.example.advisingv2.databinding.SemesterGpaDialogBinding

class GpaCalculatorFragment : Fragment() {
	companion object {
		fun newInstance() = GpaCalculatorFragment()
	}
	private var _binding: FragmentGpaCalculatorBinding? = null
	private var _binding2: SemesterGpaDialogBinding? = null
	private val viewModel: GpaCalculatorViewModel by activityViewModels()

	private var courseName: String = ""
	private var letterGrade: String = ""
	private var numCredits: Int = 0

	private lateinit var courseList: MutableList<String>

	private val binding: FragmentGpaCalculatorBinding
		get() = _binding!!

	private val binding2: SemesterGpaDialogBinding
		get() = _binding2!!


	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {

		_binding = FragmentGpaCalculatorBinding.inflate(inflater, container, false)
		_binding2 = SemesterGpaDialogBinding.inflate(inflater, container, false)
		courseName = binding2.courseNameEditText.text.toString()
		letterGrade = binding2.letterGradeEditText.text.toString()
		numCredits = binding2.numCredits.text.toString().toInt()
		val view = binding.root


		binding.buttonAddCourse.setOnClickListener {
			Toast.makeText(context, "Add Course Button Clicked", Toast.LENGTH_SHORT).show()
			val dialogBuilder = AlertDialog.Builder(context)
			dialogBuilder.setView(inflater.inflate(R.layout.semester_gpa_dialog, null))
				.setCancelable(true)
				.setPositiveButton("Add",
					DialogInterface.OnClickListener { _, _ ->
							Toast.makeText(context, "Sem Dialog Add Pressed", Toast.LENGTH_SHORT)
								.show()
					})
				.setNegativeButton("Cancel", DialogInterface.OnClickListener { d, id ->
					Toast.makeText(context, "Sem Dialog Cancelled", Toast.LENGTH_SHORT).show()
					d.cancel()
				})

			val alert = dialogBuilder.create()
			alert.setTitle("Add Course To Semester")
			alert.show()
		}
		binding.buttonCalculateCumulative.setOnClickListener {
			Toast.makeText(context, "Add Course Button Clicked", Toast.LENGTH_SHORT).show()

			val dialogBuilder = AlertDialog.Builder(context)

			dialogBuilder
				.setMessage("Calculate Cumulative Gpa")
				.setPositiveButton("Enter", DialogInterface.OnClickListener{ _, _->
					Toast.makeText(context, "OK button for cumlative pressed", Toast.LENGTH_SHORT).show()
					// todo THE LOGIC
				})
				.setNegativeButton("Cancel", DialogInterface.OnClickListener{ d, _ ->
					Toast.makeText(context,"Sem Dialog Cancelled", Toast.LENGTH_SHORT).show()
					d.cancel()
				})

			val alert : AlertDialog = dialogBuilder.create()

			alert.setTitle("Cumulative GPA Input")
			alert.show()
		}
		val semesterUserInputObserver = Observer<String> {newInput ->
			binding.textViewSemGPAOutput.text = newInput
		}
		viewModel.semesterUserInput.observe(this.viewLifecycleOwner, semesterUserInputObserver)
		return view
	}
	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}

}