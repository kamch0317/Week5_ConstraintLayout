package com.example.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.constraintlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
//        val boxOneTV = findViewById<TextView>(R.id.box1)
//        val boxTwoTV: TextView = findViewById(R.id.boxTwo)
//        val boxThreeTV = findViewById<TextView>(R.id.BoxThree)
//        val boxFourTV = findViewById<TextView>(R.id.BoxFour)
//        val boxFiveTV = findViewById<TextView>(R.id.BoxFive)
//        val redButton = findViewById<Button>(R.id.red_button)
//        val greenButton = findViewById<Button>(R.id.green_button)
//        val yellowButton = findViewById<Button>(R.id.yellow_button)


        val clickableViews: List<View> =
            listOf(
                binding.box1, binding.boxTwo,binding.BoxThree, binding.BoxFour, binding.BoxFive ,binding.redButton,binding.greenButton,binding.yellowButton
            )

        for(item in clickableViews){
            item.setOnClickListener { makecolored(it) }
        }
    }

    private fun makecolored(view:View){
        when (view.id){
            R.id.box1 -> view.setBackgroundColor(Color.RED)
            R.id.boxTwo -> view.setBackgroundColor(Color.BLUE)
            R.id.BoxThree -> view.setBackgroundColor(Color.CYAN)
            R.id.BoxFour -> view.setBackgroundColor(Color.MAGENTA)
            R.id.BoxFive -> view.setBackgroundColor(Color.GREEN)


            // Boxes using custom colors for background
            R.id.red_button -> binding.box1.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> binding.boxTwo.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> binding.BoxThree.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}