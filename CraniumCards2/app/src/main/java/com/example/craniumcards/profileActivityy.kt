package com.example.craniumcards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class profileActivityy : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_main)

        val btnHome = findViewById<Button>(R.id.viewCards)
        val btnCreate = findViewById<Button>(R.id.createCards)
        val btnShare = findViewById<Button>(R.id.viewCards)
        val btnSignOut = findViewById<Button>(R.id.profileSettings)


        btnHome.setOnClickListener {
            startActivity(Intent(this, homeActivity::class.java))
        }


        btnCreate.setOnClickListener {
            startActivity(Intent(this, createFlashCardsActivity1::class.java))
        }


        btnShare.setOnClickListener {
            startActivity(Intent(this, homeActivity::class.java))
        }


        btnSignOut.setOnClickListener {
            startActivity(Intent(this, signInActivity::class.java))
        }
    }
}
