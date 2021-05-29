package com.sunnyweather.android.logic.network

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.await
import retrofit2.http.Query

object SunnyWeatherNetwork {
    private val placeService = ServiceCreator.create<PlaceService>()
    suspend fun searchPlaces(query: Query) = placeService.searchPlaces(query).await()
}