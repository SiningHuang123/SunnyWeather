package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class SunnyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "BNBRvBveaD2VfHVI"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}