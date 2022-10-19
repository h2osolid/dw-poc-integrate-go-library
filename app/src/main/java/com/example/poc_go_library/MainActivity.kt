package com.example.poc_go_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cppmodule.GoModule
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textInput = findViewById<TextInputEditText>(R.id.editText)
        val button = findViewById<MaterialButton>(R.id.button)

        button.setOnClickListener {
            textInput.setText(
                GoModule().reverse(
                    textInput.text.toString()
                )
            )
        }
    }
}
