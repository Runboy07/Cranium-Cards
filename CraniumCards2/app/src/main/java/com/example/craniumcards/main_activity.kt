package com.example.craniumcards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class main_activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWelcome = findViewById<Button>(R.id.welcome)

        btnWelcome.setOnClickListener {
            startActivity(Intent(this, profileActivityy::class.java))
        }
    }
}