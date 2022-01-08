package com.example.daggerapplication

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    fun drive() {
        Log.d("", "I am driving.")
    }

    @Inject
    fun connectRemote(remote : Remote){
        remote.enableRemote(this)
    }

}