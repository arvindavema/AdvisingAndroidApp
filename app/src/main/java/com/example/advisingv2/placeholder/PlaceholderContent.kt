package com.example.advisingv2.placeholder

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {
	
	/**
	 * An array of sample (placeholder) items.
	 */
	val ITEMS: MutableList<PlaceholderItem> = ArrayList()
	
	/**
	 * A map of sample (placeholder) items, by ID.
	 */
	val ITEM_MAP: MutableMap<String, PlaceholderItem> = HashMap()
	
	private val COUNT = 78
	private val courses = arrayOf("100", "122", "125", "131", "132", "133", "216", "250", "298A", "320", "330", "335", "351", "396H", "411", "412", "414", "416", "417", "420", "421", "422", "423", "424", "425", "426", "427", "430", "433", "434", "435", "436", "451", "454", "456","460", "466", "470", "473", "474", "475", "488A", "498A", "498I", "499A", "614", "624", "630", "631", "657", "660", "666", "673", "714", "715", "723", "730", "733", "734", "740", "751", "756", "798", "799", "801", "818X", "828C", "828J", "828V", "828W", "828X", "829A", "838X", "848B", "848C", "858F", "858O", "898", "899")

	init {
		// Add some sample items.
		for (i in 1..COUNT) {
			addItem(createPlaceholderItem(i))
		}
	}
	
	private fun addItem(item: PlaceholderItem) {
		ITEMS.add(item)
		ITEM_MAP.put(item.id, item)
	}
	
	private fun createPlaceholderItem(position: Int): PlaceholderItem {
		return PlaceholderItem(position.toString(), "CMSC" + courses[position], makeDetails(position))
	}
	
	private fun makeDetails(position: Int): String {
		val builder = StringBuilder()
		builder.append("Details about Item: ").append(position)
		for (i in 0..position - 1) {
			builder.append("\nMore details information here.")
		}
		return builder.toString()
	}
	
	/**
	 * A placeholder item representing a piece of content.
	 */
	data class PlaceholderItem(val id: String, val content: String, val details: String) {
		override fun toString(): String = content
	}
}