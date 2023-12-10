package com.example.numsquared

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usrInput:TextView = findViewById(R.id.usrInput)
        val submit: Button = findViewById(R.id.submit)
        val output: TextView = findViewById(R.id.output)


        submit.setOnClickListener{
            val num:String = usrInput.text.toString()
            try {
                square(num.toInt())
            }catch (e: Exception){
                output.text = "Invalid Input"
            }
        }


    }

    private fun square(number: Int){
        val output: TextView = findViewById(R.id.output)
        output.text = "$number squared is ${number*number}"
    }


}