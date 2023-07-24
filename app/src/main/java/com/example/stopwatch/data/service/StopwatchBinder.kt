package com.example.stopwatch.data.service

import android.os.Binder
import androidx.compose.animation.ExperimentalAnimationApi

@ExperimentalAnimationApi
class StopwatchBinder : Binder() {
    fun getService(): StopwatchService = StopwatchService()
}