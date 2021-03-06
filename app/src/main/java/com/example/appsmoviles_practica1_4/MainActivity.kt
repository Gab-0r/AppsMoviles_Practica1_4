package com.example.appsmoviles_practica1_4

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import com.example.appsmoviles_practica1_4.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var mainBinding: ActivityMainBinding

    var arr_dec = intArrayOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90)
    var arr_units = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var arr_tol = floatArrayOf(0.02f, 0.05f, 0.1f)

    var dec_ = 0
    var units_ = 0
    var mult_ = 1
    var tol_ = 0f
    var resValue = 0

    //Función que calcula el valor de la resistencia y actualiza el valor en el textView correspondiente
    fun calcAndUpdate(dec: Int, units: Int, mult: Int, tol: Float, textResult: TextView){
        dec_ = dec
        units_ = units
        mult_ = mult
        tol_ = tol
        resValue = (dec + units) * mult
        var resValue = ((dec_ + units_) * mult).toString()
        textResult.text = resValue + "   " + (tol_*100).toString() + "%"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        with(mainBinding){
            //Listeners para los botones de decenas
            blackDec.setOnClickListener{
                decColor.setBackgroundColor(Color.rgb(0,0,0))
                calcAndUpdate(0, units_, mult_, tol_, textViewResult)
            }

            brownDec.setOnClickListener{
                decColor.setBackgroundColor(Color.rgb(122,78,40))
                calcAndUpdate(10, units_, mult_, tol_, textViewResult)
            }

            redDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(243,13,13))
                calcAndUpdate(20, units_, mult_, tol_, textViewResult)
            }

            orangeDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(244,91,8))
                calcAndUpdate(30, units_, mult_, tol_, textViewResult)
            }

            yellowDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(239,192,45))
                calcAndUpdate(40, units_, mult_, tol_, textViewResult)
            }

            greenDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(8,182,26))
                calcAndUpdate(50, units_, mult_, tol_, textViewResult)
            }

            blueDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(56,64,139))
                calcAndUpdate(60, units_, mult_, tol_, textViewResult)
            }

            purpleDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(143,19,220))
                calcAndUpdate(70, units_, mult_, tol_, textViewResult)
            }

            grayDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(104,102,102))
                calcAndUpdate(80, units_, mult_, tol_, textViewResult)
            }

            whiteDec.setOnClickListener {
                decColor.setBackgroundColor(Color.rgb(216,210,210))
                calcAndUpdate(90, units_, mult_, tol_, textViewResult)
            }

            //Listeners para botones de unidades
            blackUnits.setOnClickListener{
                unitColor.setBackgroundColor(Color.rgb(0,0,0))
                calcAndUpdate(dec_, 0, mult_, tol_, textViewResult)
            }

            brownUnits.setOnClickListener{
                unitColor.setBackgroundColor(Color.rgb(122,78,40))
                calcAndUpdate(dec_, 1, mult_, tol_, textViewResult)
            }

            redUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(243,13,13))
                calcAndUpdate(dec_, 2, mult_, tol_, textViewResult)
            }

            orangeUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(244,91,8))
                calcAndUpdate(dec_, 3, mult_, tol_, textViewResult)
            }

            yellowUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(239,192,45))
                calcAndUpdate(dec_, 4, mult_, tol_, textViewResult)
            }

            greenUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(8,182,26))
                calcAndUpdate(dec_, 5, mult_, tol_, textViewResult)
            }

            blueUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(56,64,139))
                calcAndUpdate(dec_, 6, mult_, tol_, textViewResult)
            }

            purpleUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(143,19,220))
                calcAndUpdate(dec_, 7, mult_, tol_, textViewResult)
            }

            grayUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(104,102,102))
                calcAndUpdate(dec_, 8, mult_, tol_, textViewResult)
            }

            whiteUnits.setOnClickListener {
                unitColor.setBackgroundColor(Color.rgb(216,210,210))
                calcAndUpdate(dec_, 9, mult_, tol_, textViewResult)}

            //Listeners para botones de multiplicador
            blackMult.setOnClickListener{
                multColor.setBackgroundColor(Color.rgb(0,0,0))
                calcAndUpdate(dec_, units_, 1, tol_, textViewResult)
            }

            brownMult.setOnClickListener{
                multColor.setBackgroundColor(Color.rgb(122,78,40))
                calcAndUpdate(dec_, units_, 10, tol_, textViewResult)
            }

            redMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(243,13,13))
                calcAndUpdate(dec_, units_, 100, tol_, textViewResult)
            }

            orangeMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(244,91,8))
                calcAndUpdate(dec_, units_, 1000, tol_, textViewResult)
            }

            yellowMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(239,192,45))
                calcAndUpdate(dec_, units_, 10000, tol_, textViewResult)
            }

            greenMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(8,182,26))
                calcAndUpdate(dec_, units_, 100000, tol_, textViewResult)
            }

            blueMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(56,64,139))
                calcAndUpdate(dec_, units_, 1000000, tol_, textViewResult)
            }

            purpleMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(143,19,220))
                calcAndUpdate(dec_, units_, 10000000, tol_, textViewResult)}

            grayMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(104,102,102))
                calcAndUpdate(dec_, units_, 100000000, tol_, textViewResult)
            }

            whiteMult.setOnClickListener {
                multColor.setBackgroundColor(Color.rgb(216,210,210))
                calcAndUpdate(dec_, units_, 1000000000, tol_, textViewResult)
            }

            //Listeners para los botones de tolerancia
            redTol.setOnClickListener {
                tolColor.setBackgroundColor(Color.rgb(243,13,13))
                calcAndUpdate(dec_, units_, mult_, 0.02f, textViewResult)
            }

            silverTol.setOnClickListener {
                tolColor.setBackgroundColor(Color.rgb(145,144,144))
                calcAndUpdate(dec_, units_, mult_, 0.05f, textViewResult)
            }

            goldTol.setOnClickListener {
                tolColor.setBackgroundColor(Color.rgb(133,136,39))
                calcAndUpdate(dec_, units_, mult_, 0.1f, textViewResult)
            }
        }
    }
}