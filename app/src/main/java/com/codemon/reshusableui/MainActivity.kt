package com.codemon.reshusableui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /*==============================================================================================
    LIFECYCLE METHODS
    ==============================================================================================*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Set Night mode
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        setUi()
    }

    /*==============================================================================================
    PRIVATE METHODS
    ==============================================================================================*/
    private fun setUi(){
        //Start bundle for fragment
        val bundle = Bundle()
        bundle.putInt("color", android.R.color.holo_red_dark)

        //Declare fragment
        val exercise = ExerciseFragment()
        exercise.arguments = bundle

        //Start fragment
        supportFragmentManager.beginTransaction().replace(R.id.container, exercise).commit()
    }
}