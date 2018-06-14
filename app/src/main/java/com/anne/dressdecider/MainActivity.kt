package com.anne.dressdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val addFood = arrayListOf("Yellow Dress" , "Blue Dress")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chooseDressBtn.setOnClickListener {
            val random = Random()
            val randomDress = random.nextInt(addFood.count())
            selectedDressTxt.text = addFood[randomDress]

        }
        addDressBtn.setOnClickListener {
            val newdress = addFoodTxt.text.toString()
            addFood.add(newdress)
            addFoodTxt.text.clear()
        }
    }




}
