package com.example.advisingv2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.advisingv2.databinding.FragmentInboxBinding

class InboxFragment : Fragment() {
	private lateinit var linearLayoutManager: LinearLayoutManager
	private var _binding: FragmentInboxBinding?= null
	private val binding get() = _binding!!
	
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = FragmentInboxBinding.inflate(inflater, container, false)
		binding.inboxRecyclerView.layoutManager = LinearLayoutManager(this.context)
		
		val notifs: Array<Notif> = Array<Notif>(40) {i-> Notif(i) }

		val adapter = NotificationsAdapter(notifs )
		binding.inboxRecyclerView.adapter = adapter
		
		return binding.root
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
	
	}
}