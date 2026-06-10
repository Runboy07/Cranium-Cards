package com.example.craniumcards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class signInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.signin)

        val btnSignIn = findViewById<Button>(R.id.signIn)

        btnSignIn.setOnClickListener {
            startActivity(Intent(this, profileActivityy::class.java))
        }


    }
}