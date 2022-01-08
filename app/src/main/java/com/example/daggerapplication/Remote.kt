package com.example.daggerapplication

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun enableRemote(car: Car){
        Log.d("123","Remote is connected.")
    }

}