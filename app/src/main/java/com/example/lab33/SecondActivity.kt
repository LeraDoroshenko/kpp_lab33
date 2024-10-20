package com.example.lab33

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val infoType = intent.getStringExtra("infoType")
        val userInput = intent.getStringExtra("userInput")

        val textView = findViewById<TextView>(R.id.textViewInfo)
        when (infoType) {
            "author" -> textView.text = getString(R.string.author_info, userInput)
            "faculty" -> textView.text = getString(R.string.faculty_info, userInput)
            "city" -> textView.text = getString(R.string.city_info, userInput)
        }
    }
}