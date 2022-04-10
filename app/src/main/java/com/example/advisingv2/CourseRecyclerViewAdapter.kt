package com.example.advisingv2

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.advisingv2.placeholder.PlaceholderContent.PlaceholderItem
import com.example.advisingv2.databinding.FragmentCourseBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class CourseRecyclerViewAdapter(
	private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<CourseRecyclerViewAdapter.ViewHolder>() {
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		
		return ViewHolder(
			FragmentCourseBinding.inflate(
				LayoutInflater.from(parent.context),
				parent,
				false
			)
		)
		
	}
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		val item = values[position]
		holder.idView.text = item.id
		holder.contentView.text = item.content
	}
	
	override fun getItemCount(): Int = values.size
	
	inner class ViewHolder(binding: FragmentCourseBinding) : RecyclerView.ViewHolder(binding.root) {
		val idView: TextView = binding.itemNumber
		val contentView: TextView = binding.content
		
		override fun toString(): String {
			return super.toString() + " '" + contentView.text + "'"
		}
	}
	
}