//package com.example.air_raid_app.ui.map
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//
//class MapViewModel : ViewModel() {
//
//    private val _text = MutableLiveData<String>().apply {
//        value = "This is map Fragment"
//    }
//    val text: LiveData<String> = _text
//}

package com.example.air_raid_app.ui.map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MapViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is map Fragment"
    }
    val text: LiveData<String> = _text

    val webUrl: String = "https://alerts.in.ua" // Replace with your desired URL
}