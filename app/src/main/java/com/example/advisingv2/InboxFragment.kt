package com.example.advisingv2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.advisingv2.databinding.FragmentInboxBinding

class InboxFragment : Fragment() {
	private var _binding: FragmentInboxBinding?= null
	private val binding get() = _binding!!
	
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = FragmentInboxBinding.inflate(inflater, container, false)
		val view = binding.root
		return view
		
	}
}