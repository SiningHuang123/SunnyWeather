package com.sunnyweather.android.logic.dao

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.Place
import com.sunnyweather.android.logic.network.SunnyWeatherNetwork

object PlaceDao {
    fun savePlace(place: Place) {
        getSharedPreference().edit()
            .putString("place", Gson().toJson(place))
    }
    fun getSavedPlace(): Place {
        val jsonPlace = getSharedPreference().getString("place", "")
        return Gson().fromJson(jsonPlace, Place::class.java)
    }

    fun isPlaceSaved() = getSharedPreference().contains("place")

    private fun getSharedPreference() = SunnyWeatherApplication.context
        .getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}