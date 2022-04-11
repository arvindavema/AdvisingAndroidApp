package com.example.advisingv2.ui

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.advisingv2.databinding.FragmentTransferInformationBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TransferInformationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TransferInformationFragment : Fragment() {
	// TODO: Rename and change types of parameters
	private var _binding: FragmentTransferInformationBinding? = null
	private var param1: String? = null
	private var param2: String? = null

	private val binding: FragmentTransferInformationBinding
		get() = _binding!!
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		arguments?.let {
			param1 = it.getString(ARG_PARAM1)
			param2 = it.getString(ARG_PARAM2)
		}
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		_binding = FragmentTransferInformationBinding.inflate(inflater, container, false)
		val view = binding.root
		binding.exExpand.setOnClickListener{
			if (binding.exInfo!!.visibility != View.VISIBLE) {
				TransitionManager.beginDelayedTransition(binding.exTransferCard, AutoTransition())
				binding.exInfo!!.visibility = View.VISIBLE
				binding.exExpand.text = "Click Here To Minimize"
			} else {
				TransitionManager.beginDelayedTransition(binding.exTransferCard, AutoTransition())
				binding.exInfo!!.visibility = View.GONE
				binding.exExpand.text = "Click Here To Learn More"
			}
		}
		binding.inExpand.setOnClickListener {
			if (binding.inInfo!!.visibility != View.VISIBLE) {
				TransitionManager.beginDelayedTransition(binding.inTransferCard, AutoTransition())
				binding.inInfo!!.visibility = View.VISIBLE
				binding.inExpand.text = "Click Here To Minimize"
			} else {
				TransitionManager.beginDelayedTransition(binding.inTransferCard, AutoTransition())
				binding.inInfo!!.visibility = View.GONE
				binding.inExpand.text = "Click Here To Learn More"
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
		 * @return A new instance of fragment TransferInformationFragment.
		 */
		// TODO: Rename and change types and number of parameters
		@JvmStatic
		fun newInstance(param1: String, param2: String) =
			TransferInformationFragment().apply {
				arguments = Bundle().apply {
					putString(ARG_PARAM1, param1)
					putString(ARG_PARAM2, param2)
				}
			}
	}
}