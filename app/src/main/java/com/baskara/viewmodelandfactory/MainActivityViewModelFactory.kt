package com.baskara.viewmodelandfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainActivityViewModelFactory(private val startingTitle: String, private val startingResult: Int)
    : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingTitle, startingResult) as T
        }
        throw IllegalArgumentException("Type anything useful here as exception")
    }

}