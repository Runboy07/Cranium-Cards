package com.example.craniumcards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class viewFlashCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.viewflashcards)

        val btnBack = findViewById<Button>(R.id.back)
        val btnHome = findViewById<Button>(R.id.home)

        btnBack.setOnClickListener {
            finish()
        }

        btnHome.setOnClickListener {
            startActivity(Intent(this, homeActivity::class.java))
        }


    }
}