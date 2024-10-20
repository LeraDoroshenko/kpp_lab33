package com.example.lab33

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAuthor = findViewById<Button>(R.id.buttonAuthor)
        val buttonFaculty = findViewById<Button>(R.id.buttonFaculty)
        val buttonCity = findViewById<Button>(R.id.buttonCity)
        val editText = findViewById<EditText>(R.id.editText1)

        buttonAuthor.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("infoType", "author")
            intent.putExtra("userInput", editText.text.toString())
            startActivity(intent)
        }

        buttonFaculty.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("infoType", "faculty")
            intent.putExtra("userInput", editText.text.toString())
            startActivity(intent)
        }

        buttonCity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("infoType", "city")
            intent.putExtra("userInput", editText.text.toString())
            startActivity(intent)
        }
    }
}