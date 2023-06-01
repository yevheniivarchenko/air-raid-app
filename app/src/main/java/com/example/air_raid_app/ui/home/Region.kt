package com.example.air_raid_app.ui.home

data class Region(val regionId: String,
                  val regionType: String,
                  val regionName: String,
                  val lastUpdate: String,
                  val activeAlerts: Map<String, String>)
