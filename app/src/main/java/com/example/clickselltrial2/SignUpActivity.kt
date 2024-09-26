package com.example.clickselltrial2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Back button to go to the previous screen
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()  // Closes current activity and returns to the previous one
        }

        // Sign up button to move to another activity after sign up
        val signUpButton: Button = findViewById(R.id.btnSignUp)
        signUpButton.setOnClickListener {
            // You can add sign-up logic here

            // After successful sign-up, move to another activity (like dashboard or login)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

