package com.example.myappweatherkotlin.ui.main

import androidx.lifecycle.ViewModel
import com.example.myappweatherkotlin.AppState

class MainViewModel (private val liveDataToObserve: MutableLiveData<AppState> =
                         MutableLiveData()) :
    ViewModel() {
    fun getLiveData() = liveDataToObserve
    fun getWeather() = getDataFromLocalSource()
    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(1000)
            liveDataToObserve.postValue(AppState.Success(Any()))
        }.start()
    }
}


















