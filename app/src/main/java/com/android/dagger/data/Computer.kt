package com.android.dagger.data

import android.util.Log
import javax.inject.Inject

class Computer @Inject constructor(val a:Monitor, val b:Box) {
    fun turnOn() {Log.d("Messages", "Hi bruv! 4Head ")}
}
