package com.example.craniumcards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class createFlashCardsActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.createflashcards2)

        val btnHome = findViewById<Button>(R.id.home)
        val btnBack = findViewById<Button>(R.id.back)
        val btnSave = findViewById<Button>(R.id.save)

        btnHome.setOnClickListener {
            startActivity(Intent(this, homeActivity::class.java))
        }

        btnBack.setOnClickListener {
            finish()
        }

        btnSave.setOnClickListener {
            startActivity(Intent(this, viewFlashCardActivity::class.java))
        }


    }
}