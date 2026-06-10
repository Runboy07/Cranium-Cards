package com.example.craniumcards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class createFlashCardsActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.createflashcards)

        val btnCreate = findViewById<Button>(R.id.create)
        val btnHome = findViewById<Button>(R.id.home)
        val btnBack = findViewById<Button>(R.id.back)

        btnHome.setOnClickListener {
            startActivity(Intent(this, homeActivity::class.java))
        }

        btnCreate.setOnClickListener {
            startActivity(Intent(this, createFlashCardsActivity2::class.java))
        }

        btnBack.setOnClickListener {
            finish()
        }


    }
}