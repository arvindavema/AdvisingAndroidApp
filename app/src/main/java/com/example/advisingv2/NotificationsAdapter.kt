	package com.example.advisingv2
	
	import android.app.AlertDialog
	import android.app.Dialog
	import android.content.DialogInterface
	import android.os.Bundle
	import android.view.LayoutInflater
	import android.view.View
	import android.view.ViewGroup
	import android.widget.TextView
	import androidx.fragment.app.DialogFragment
	import androidx.recyclerview.widget.RecyclerView
	import java.time.format.DateTimeFormatter
	import java.util.*
	
	class NotificationsAdapter(val dataSet: Array<Notif>): RecyclerView
	.Adapter<NotificationsAdapter.ViewHolder>() {
		
		class ViewHolder(itemView: View) : RecyclerView.ViewHolder
			(itemView) {
			val deliveredAtTextView: TextView
			val senderTextView: TextView
			val bodyTextView: TextView
			val subjectTextView: TextView
			val unreadTextView: TextView
			val cardRootView: View
			init {
				deliveredAtTextView = itemView.findViewById(R.id.textViewDeliveredAt)
				bodyTextView = itemView.findViewById(R.id.textViewNotificationBody)
				subjectTextView = itemView.findViewById(R.id.textViewNotificationSubject)
				unreadTextView = itemView.findViewById(R.id.textViewUnread)
				cardRootView = itemView.rootView
				senderTextView = itemView.findViewById(R.id.textViewSender)
				
				cardRootView.setOnClickListener {
					//					MatrialAlertDialogBuilder(this.itemView.context)
					//						.setTitle(subjectTextView.text)
					//						.setMessage(bodyTextView.text).show()
					val body = bodyTextView.text
					val subject = subjectTextView.text
					val del = deliveredAtTextView.text
					val from = senderTextView.text
					val builder: AlertDialog.Builder = AlertDialog.Builder(it.context)
					builder
						.setTitle("$del\ns$from")
						.setMessage("$subject\n$body\n")
					val dialog = builder.create()
					dialog.show()
				}
				
			}
			
		}
		
		override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
			val view = LayoutInflater.from(parent.context).inflate(
				R.layout.notification_item,
				parent, false
			)
			return ViewHolder(view)
		}
		
		override fun getItemCount(): Int {
			return dataSet.count()
		}
		
		override fun onBindViewHolder(holder: ViewHolder, position: Int) {
			val notification = dataSet[position]
			
			holder.bodyTextView.text = notification.body
			holder.subjectTextView.text = notification.subject
			holder.senderTextView.text = notification.sender
			val formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")
			holder.deliveredAtTextView.text = notification.deliveredAT.format(formatter).toString()
		}
		
		
	}