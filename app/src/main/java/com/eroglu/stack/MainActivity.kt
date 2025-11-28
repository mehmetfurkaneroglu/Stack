package com.eroglu.stack

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parenthesesInput: EditText = findViewById(R.id.parenthesesInput)
        val checkButton: Button = findViewById(R.id.checkButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        checkButton.setOnClickListener {
            val inputString = parenthesesInput.text.toString()
            val isValid = inputString.validParantheses()
            resultTextView.text = "Result: $isValid"
        }
    }
}