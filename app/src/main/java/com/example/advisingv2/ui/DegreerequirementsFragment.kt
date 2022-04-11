package com.example.advisingv2.ui

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.Group
import androidx.fragment.app.Fragment
import com.example.advisingv2.R
import com.example.advisingv2.databinding.FragmentDegreerequirementsBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DegreerequirementsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DegreerequirementsFragment : Fragment() {
	// TODO: Rename and change types of parameters
	private var _binding: FragmentDegreerequirementsBinding? = null
	private var param1: String? = null
	private var param2: String? = null
	private var cardView: CardView? = null
	private var expand: Button? = null
	private var hiddenGroup: TextView? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		arguments?.let {
			param1 = it.getString(ARG_PARAM1)
			param2 = it.getString(ARG_PARAM2)
		}
	}

	private val binding: FragmentDegreerequirementsBinding
		get() = _binding!!
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		_binding = FragmentDegreerequirementsBinding.inflate(inflater, container, false)
		val view = binding.root
		//cardView = binding.genTrackCard
		//expand = binding.gtExpand
		//hiddenGroup = binding.gtInfo

		binding.gtExpand.setOnClickListener{
			if (binding.gtInfo!!.visibility != View.VISIBLE) {
				TransitionManager.beginDelayedTransition(binding.genTrackCard, AutoTransition())
				binding.gtInfo!!.visibility = View.VISIBLE
				binding.gtExpand.text = "Read Less"
			} else {
				TransitionManager.beginDelayedTransition(binding.genTrackCard, AutoTransition())
				binding.gtInfo!!.visibility = View.GONE
				binding.gtExpand.text = "Read More"
			}
		}
		binding.cyberExpand.setOnClickListener{
			if (binding.cyberInfo!!.visibility != View.VISIBLE) {
				TransitionManager.beginDelayedTransition(binding.cyberCard, AutoTransition())
				binding.cyberInfo!!.visibility = View.VISIBLE
				binding.cyberExpand.text = "Read Less"
			} else {
				TransitionManager.beginDelayedTransition(binding.cyberCard, AutoTransition())
				binding.cyberInfo!!.visibility = View.GONE
				binding.cyberExpand.text = "Read More"
			}
		}
		binding.dsExpand.setOnClickListener{
			if (binding.dsInfo!!.visibility != View.VISIBLE) {
				TransitionManager.beginDelayedTransition(binding.dsCard, AutoTransition())
				binding.dsInfo!!.visibility = View.VISIBLE
				binding.dsExpand.text = "Read Less"
			} else {
				TransitionManager.beginDelayedTransition(binding.dsCard, AutoTransition())
				binding.dsInfo!!.visibility = View.GONE
				binding.dsExpand.text = "Read More"
			}
		}
		binding.qiExpand.setOnClickListener{
			if (binding.qiInfo!!.visibility != View.VISIBLE) {
				TransitionManager.beginDelayedTransition(binding.qiCard, AutoTransition())
				binding.qiInfo!!.visibility = View.VISIBLE
				binding.qiExpand.text = "Read Less"
			} else {
				TransitionManager.beginDelayedTransition(binding.qiCard, AutoTransition())
				binding.qiInfo!!.visibility = View.GONE
				binding.qiExpand.text = "Read More"
			}
		}
		binding.mlExpand.setOnClickListener{
			if (binding.mlInfo!!.visibility != View.VISIBLE) {
				TransitionManager.beginDelayedTransition(binding.mlCard, AutoTransition())
				binding.mlInfo!!.visibility = View.VISIBLE
				binding.mlExpand.text = "Read Less"
			} else {
				TransitionManager.beginDelayedTransition(binding.mlCard, AutoTransition())
				binding.mlInfo!!.visibility = View.GONE
				binding.mlExpand.text = "Read More"
			}
		}
		return view
	}
	
	companion object {
		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 *
		 * @param param1 Parameter 1.
		 * @param param2 Parameter 2.
		 * @return A new instance of fragment DegreerequirementsFragment.
		 */
		// TODO: Rename and change types and number of parameters
		@JvmStatic
		fun newInstance(param1: String, param2: String) =
			DegreerequirementsFragment().apply {
				arguments = Bundle().apply {
					putString(ARG_PARAM1, param1)
					putString(ARG_PARAM2, param2)
				}
			}
	}
}