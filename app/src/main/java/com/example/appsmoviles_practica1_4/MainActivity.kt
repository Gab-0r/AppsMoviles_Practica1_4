package com.example.appsmoviles_practica1_4

import android.app.Activity
import android.os.Bundle
import com.example.appsmoviles_practica1_4.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        with(mainBinding){

        }
    }

}