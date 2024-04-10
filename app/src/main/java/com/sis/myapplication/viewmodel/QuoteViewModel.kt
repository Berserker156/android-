package com.sis.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sis.myapplication.model.QuoteModel
import com.sis.myapplication.model.QuotePrivider

class QuoteViewModel : ViewModel() {

    val frase = MutableLiveData<QuoteModel>()

    init {
        randomQuote()
    }

    fun randomQuote(){
        val fraseActual = QuotePrivider.random()
        frase.postValue(fraseActual)
    }

}