package com.example.advisingv2.ui.resourcez

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResourcesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Resource Fragment"
    }
    val text: LiveData<String> = _text
}