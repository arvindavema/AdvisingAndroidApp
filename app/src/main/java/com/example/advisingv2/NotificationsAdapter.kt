package com.example.advisingv2

import android.graphics.Color
import android.service.autofill.Validators.not
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class NotificationsAdapter(private val dataSet: Array<Notif>): RecyclerView
.Adapter<NotificationsAdapter.ViewHolder>() {
	
	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
		val deliveredAtTextView: TextView
		val bodyTextView: TextView
		val subjectTextView : TextView
		val unreadTextView: TextView
		val cardRootView: View
		
		init {
				deliveredAtTextView = itemView.findViewById(R.id.textViewDeliveredAt)
				bodyTextView = itemView.findViewById(R.id.textViewNotificationBody)
				subjectTextView = itemView.findViewById(R.id.textViewNotificationSubject)
				unreadTextView = itemView.findViewById(R.id.textViewUnread)
				cardRootView = itemView.rootView
				
				cardRootView.setOnClickListener {
					MaterialAlertDialogBuilder(this.itemView.context)
						.setTitle(subjectTextView.text)
						.setMessage(bodyTextView.text).show()
						}
				}
				
			}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.notification_item, 
			parent, false)
		return ViewHolder(view)
	}
	
	override fun getItemCount(): Int {
		return 45
	}
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
	
	
	}
	
}