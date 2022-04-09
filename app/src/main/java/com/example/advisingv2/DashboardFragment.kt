package com.example.advisingv2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.advisingv2.databinding.FragmentDashboardBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.zip.Inflater


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



class DashboardFragment : Fragment(){
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_dashboard, container, false)
	}
	
}



