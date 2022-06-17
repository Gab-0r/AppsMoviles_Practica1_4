package com.example.appsmoviles_practica1_4.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    private var dec_: Int = 0
    private var units_: Int = 0
    private var mult_: Int = 1
    private var tol_ = 0f

    private var resistencia = 0
    private val resValue_: MutableLiveData<Int> = MutableLiveData()
    val resValueDone: LiveData<Int> = resValue_

    fun calcUpdate(){
        resistencia = (dec_ +units_)*mult_ //Valor de la resistencia
        resValue_.value = resistencia
    }

    fun decUpdate(x: Int){
        dec_ = x
        calcUpdate()
    }

    fun unitsUpdate(x: Int){
        units_ = x
        calcUpdate()
    }

    fun multUpdate(x: Int){
        mult_ = x
        calcUpdate()
    }

    fun tolUpdate(x: Float){
        tol_ = x
        calcUpdate()
    }


}