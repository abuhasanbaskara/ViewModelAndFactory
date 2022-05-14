package com.baskara.viewmodelandfactory

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTitle: String, startingResult:Int):ViewModel() {
    private var title = startingTitle
    private var result = startingResult

    fun getTitle():String{
        return title
    }

    fun getResult():Int{
        return result
    }

    fun setPlus(input:Int){
        result += input
    }

    fun setMinus(input: Int){
        result -= input
    }

}