package com.example.advisingv2

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toast
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.advisingv2.databinding.FragmentDashboardBinding
import com.example.advisingv2.databinding.FragmentGpaCalculatorBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.zip.Inflater


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



class DashboardFragment : Fragment(){

	private var _binding: FragmentDashboardBinding? = null

	private val binding: FragmentDashboardBinding
		get() = _binding!!

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {

		_binding = FragmentDashboardBinding.inflate(inflater, container, false)
		val view = binding.root

		binding.addCourse.setOnClickListener {
			Toast.makeText(context, "Add Course Button Clicked", Toast.LENGTH_SHORT).show()
			val dialogBuilder = AlertDialog.Builder(context)
			dialogBuilder.setView(inflater.inflate(R.layout.add_course_dashboard, null))
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
		return view
	}
	
}



