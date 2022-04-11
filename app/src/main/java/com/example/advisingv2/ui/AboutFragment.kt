package com.example.advisingv2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.advisingv2.R
import com.example.advisingv2.databinding.FragmentAboutBinding
import com.example.advisingv2.databinding.FragmentTransferInformationBinding

class AboutFragment : Fragment() {
	private var _binding: FragmentAboutBinding? = null

	private val binding: FragmentAboutBinding
		get() = _binding!!

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = FragmentAboutBinding.inflate(inflater, container, false)
		val view = binding.root
		return view
	}
}