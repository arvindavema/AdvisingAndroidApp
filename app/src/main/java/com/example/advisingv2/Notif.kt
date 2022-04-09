package com.example.advisingv2

import java.util.*


// Each item in the inbox screen
data class Notif(
	val id: Int,
	val Sender: String,
	val subject: String,
	val body: String,
	val deliveredAT: Calendar,
	val read: Boolean,
)