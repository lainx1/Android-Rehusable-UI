package com.codemon.reshusableui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class ExerciseFragment : Fragment() {
    /*==============================================================================================
    VIEW COMPONENTS
     ==============================================================================================*/
    private var button: Button? = null
    private var button2: Button? = null
    private var button3: Button? = null
    private var button4: Button? = null
    private var mainContainer: LinearLayout? = null


    /*==============================================================================================
    LIFECYCLE METHODS
     ==============================================================================================*/
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_excersice, container, false)

        // Get color
        val color = arguments?.getInt("color")

        //Reference components of xml
        mainContainer = view.findViewById<LinearLayout>(R.id.mainContainer)
        button = view.findViewById<Button>(R.id.button)
        button2 = view.findViewById<Button>(R.id.button2)
        button3 = view.findViewById<Button>(R.id.button3)
        button4 = view.findViewById<Button>(R.id.button4)

        //Set background color
        if(color != null)
            mainContainer!!.setBackgroundColor(ContextCompat.getColor(activity!!.applicationContext, color))


        //Start ui
        setUi()

        return view
    }

    /*==============================================================================================
    PRIVATE METHODS
     ==============================================================================================*/
    /**
     * Init the ui.
     */
    private fun setUi(){
        //Set text in button
        button!!.text = "Button 1"
        button2!!.text = "Button 2"
        button3!!.text = "Button 3"
        button4!!.text = "Button 4"
    }

}