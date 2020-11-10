package com.strider.android

import android.app.Application
import com.chibatching.kotpref.Kotpref

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // инициализируем Kotpref
        Kotpref.init(baseContext)
        AppPreferences.count++
    }
}