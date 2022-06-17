package com.example.appsmoviles_practica1_4.ui.main

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appsmoviles_practica1_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    //Función que calcula el valor de la resistencia y actualiza el valor en el textView correspondiente
    /*
    fun calcAndUpdate(dec: Int, units: Int, mult: Int, tol: Float, textResult: TextView){
        dec_ = dec
        units_ = units
        mult_ = mult
        tol_ = tol
        resValue = (dec + units) * mult
        var resValue = ((dec_ + units_) * mult).toString()
        textResult.text = resValue + "   " + (tol_*100).toString() + "%"
    }
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root

        setContentView(view)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mainViewModel.resValueDone.observe(this){ resValue_ ->
            mainBinding.textViewResult.text = resValue_.toString()
        }

        with(mainBinding){
            //Listeners para los botones de decenas
            blackDec.setOnClickListener{
                decColor.setBackgroundColor(Color.rgb(0,0,0))
                mainViewModel.decUpdate(0)
                //calcAndUpdate(0, units_, mult_, tol_, textViewResult)
            }

            brownDec.setOnClickListener{
                decColor.setBackgroundColor(Color.rgb(122,78,40))
                mainViewModel.decUpdate(10)
                //calcAndUpdate(10, units_, mult_, tol_, textViewResult)
            }

            redDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(243,13,13))
                mainViewModel.decUpdate(20)
                //calcAndUpdate(20, units_, mult_, tol_, textViewResult)
            }

            orangeDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(244,91,8))
                mainViewModel.decUpdate(30)
                //calcAndUpdate(30, units_, mult_, tol_, textViewResult)
            }

            yellowDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(239,192,45))
                mainViewModel.decUpdate(40)
                //calcAndUpdate(40, units_, mult_, tol_, textViewResult)
            }

            greenDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(8,182,26))
                mainViewModel.decUpdate(50)
                //calcAndUpdate(50, units_, mult_, tol_, textViewResult)
            }

            blueDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(56,64,139))
                mainViewModel.decUpdate(60)
                //calcAndUpdate(60, units_, mult_, tol_, textViewResult)
            }

            purpleDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(143,19,220))
                mainViewModel.decUpdate(70)
                //calcAndUpdate(70, units_, mult_, tol_, textViewResult)
            }

            grayDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(104,102,102))
                mainViewModel.decUpdate(80)
                //calcAndUpdate(80, units_, mult_, tol_, textViewResult)
            }

            whiteDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(216,210,210))
                mainViewModel.decUpdate(90)
                //alcAndUpdate(90, units_, mult_, tol_, textViewResult)
            }

            //Listeners para botones de unidades
            blackUnits.setOnClickListener{
                unitColor.setBackgroundColor(Color.rgb(0,0,0))
                mainViewModel.unitsUpdate(0)
                //calcAndUpdate(dec_, 0, mult_, tol_, textViewResult)
            }

            brownUnits.setOnClickListener{
                unitColor.setBackgroundColor(Color.rgb(122,78,40))
                mainViewModel.unitsUpdate(1)
                //calcAndUpdate(dec_, 1, mult_, tol_, textViewResult)
            }

            redUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(243,13,13))
                mainViewModel.unitsUpdate(2)
                //calcAndUpdate(dec_, 2, mult_, tol_, textViewResult)
            }

            orangeUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(244,91,8))
                mainViewModel.unitsUpdate(3)
                //calcAndUpdate(dec_, 3, mult_, tol_, textViewResult)
            }

            yellowUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(239,192,45))
                mainViewModel.unitsUpdate(4)
                //calcAndUpdate(dec_, 4, mult_, tol_, textViewResult)
            }

            greenUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(8,182,26))
                mainViewModel.unitsUpdate(5)
                //calcAndUpdate(dec_, 5, mult_, tol_, textViewResult)
            }

            blueUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(56,64,139))
                mainViewModel.unitsUpdate(6)
                //calcAndUpdate(dec_, 6, mult_, tol_, textViewResult)
            }

            purpleUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(143,19,220))
                mainViewModel.unitsUpdate(7)
                //calcAndUpdate(dec_, 7, mult_, tol_, textViewResult)
            }

            grayUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(104,102,102))
                mainViewModel.unitsUpdate(8)
                //calcAndUpdate(dec_, 8, mult_, tol_, textViewResult)
            }

            whiteUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(216,210,210))
                mainViewModel.unitsUpdate(9)
                //calcAndUpdate(dec_, 9, mult_, tol_, textViewResult)
            }

            //Listeners para botones de multiplicador
            blackMult.setOnClickListener{
                multColor.setBackgroundColor(Color.rgb(0,0,0))
                mainViewModel.multUpdate(1)
                //calcAndUpdate(dec_, units_, 1, tol_, textViewResult)
            }

            brownMult.setOnClickListener{
                multColor.setBackgroundColor(Color.rgb(122,78,40))
                mainViewModel.multUpdate(10)
                //calcAndUpdate(dec_, units_, 10, tol_, textViewResult)
            }

            redMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(243,13,13))
                mainViewModel.multUpdate(100)
                //calcAndUpdate(dec_, units_, 100, tol_, textViewResult)
            }

            orangeMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(244,91,8))
                mainViewModel.multUpdate(1000)
                //calcAndUpdate(dec_, units_, 1000, tol_, textViewResult)
            }

            yellowMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(239,192,45))
                mainViewModel.multUpdate(10000)
                //calcAndUpdate(dec_, units_, 10000, tol_, textViewResult)
            }

            greenMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(8,182,26))
                mainViewModel.multUpdate(100000)
                //calcAndUpdate(dec_, units_, 100000, tol_, textViewResult)
            }

            blueMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(56,64,139))
                mainViewModel.multUpdate(1000000)
                //calcAndUpdate(dec_, units_, 1000000, tol_, textViewResult)
            }

            purpleMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(143,19,220))
                mainViewModel.multUpdate(10000000)
                //calcAndUpdate(dec_, units_, 10000000, tol_, textViewResult)
            }

            grayMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(104,102,102))
                mainViewModel.multUpdate(100000000)
                //calcAndUpdate(dec_, units_, 100000000, tol_, textViewResult)
            }

            whiteMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(216,210,210))
                mainViewModel.multUpdate(1000000000)
                //calcAndUpdate(dec_, units_, 1000000000, tol_, textViewResult)
            }

            //Listeners para los botones de tolerancia
            redTol.setOnClickListener {
                tolColor.setBackgroundColor(Color.rgb(243,13,13))
                mainViewModel.tolUpdate(0.02f)
                //calcAndUpdate(dec_, units_, mult_, 0.02f, textViewResult)
            }

            silverTol.setOnClickListener {
                tolColor.setBackgroundColor(Color.rgb(145,144,144))
                mainViewModel.tolUpdate(0.05f)
                //calcAndUpdate(dec_, units_, mult_, 0.05f, textViewResult)
            }

            goldTol.setOnClickListener {
                tolColor.setBackgroundColor(Color.rgb(133,136,39))
                mainViewModel.tolUpdate(0.1f)
                //calcAndUpdate(dec_, units_, mult_, 0.1f, textViewResult)
            }
        }
    }
}