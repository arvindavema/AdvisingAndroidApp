package com.example.advisingv2

import java.util.*

data class CalendarEvent(
	val date: Calendar,
	val title: String,
	val description: String,
	val category: String,
	val creatorOfEvent: String,
)
