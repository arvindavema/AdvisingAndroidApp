package com.example.advisingv2

import android.text.format.DateUtils
import java.time.LocalDateTime
import java.util.*


// Each item in the inbox screen
data class Notif(
	val id: Int,
	val sender: String="Bob Robert",
	val subject: String = "Your recent course request",
	val body: String= "Good Evening,\n\tI have reviewed your course permissions and unfortunately" +
			" you are not eligible to take CMSC422. This course has a sklasjgfljasd;lfkjas;" +
			"lkfjlasjdflasjdfljasdljflasjdfljasdlfjasldfjlsdfgljajsljvlj",
	val deliveredAT: LocalDateTime= LocalDateTime.now(),
	val read: Boolean= false,
	val urgent: Boolean= false,
)