package com.example.timeofdaygreeting

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.Calendar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance()
        val greeting: TextView = findViewById(R.id.greeting)
        val hourOfDay = calendar.get(Calendar.HOUR_OF_DAY)


        val greetingText = when(hourOfDay){
            in 0..11 -> "Good Morning"
            in 12..17 -> "Good Afternoon"
            else -> "Good Evening"
        }

        greeting.text = greetingText
    }
}
