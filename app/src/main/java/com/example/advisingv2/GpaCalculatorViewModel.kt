package com.example.advisingv2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GpaCalculatorViewModel : ViewModel() {
	// TODO: Implement the ViewModel
	
	//Text that lists the courses that the user has inputted
	val currSemOutput: MutableLiveData<String> by lazy {
		MutableLiveData<String>()
	}
	
	val currSemGpa: MutableLiveData<Double> by lazy {
		MutableLiveData<Double>()
	}
	
	
	
	private fun gradeToGpa( grade: String): Double {
		var gpa = 0.0
		//*If you receive an 'F' for a course that is being taken on a P/F or S/F grading
		// method, the F will be calculated into your GPA. However, grades of P or S will
		// not be included in your GPA.
		when (grade.uppercase()) {
			"A+" -> gpa = 4.0
			"A" -> gpa = 4.0
			"A-" -> gpa = 3.7
			"B+" -> gpa = 3.3
			"B" -> gpa = 3.0
			"B-" -> gpa = 2.7
			"C+" -> gpa = 2.3
			"C" -> gpa = 2.0
			"C-" -> gpa = 1.7
			"D+" -> gpa = 1.3
			"D" -> gpa = 1.0
			"D-" -> gpa = 0.7
			"F" -> gpa = 0.0
		}
		return gpa
	}
	
	private fun gpaEquation( ){
		// (Grades * credits)/ credits = gpa
		
	}
}
data class GPACourse(val name: String, val grade: Double, val credits: Int)
