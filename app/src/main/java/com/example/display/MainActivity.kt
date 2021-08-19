package com.example.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.editTextName)
        val  submitButton =  findViewById<Button>(R.id.button)
        val dispMessage = findViewById<TextView>(R.id.responseTv)


        submitButton.setOnClickListener {
            dispMessage.setText(Name.text)

        }



    }
}