package com.example.craniumcards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class homeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.home)

        val btnBack = findViewById<Button>(R.id.back)
        val btnView = findViewById<Button>(R.id.view)
        val btnProfile = findViewById<Button>(R.id.profile)

        btnBack.setOnClickListener {
            finish()
        }

        btnView.setOnClickListener {
            startActivity(Intent(this, viewFlashCardActivity::class.java))
        }

        btnProfile.setOnClickListener {
            startActivity(Intent(this, signInActivity::class.java))
        }


    }
}