package com.strider.android

import com.chibatching.kotpref.KotprefModel

object AppPreferences: KotprefModel() {

    var count by intPref(0)
}