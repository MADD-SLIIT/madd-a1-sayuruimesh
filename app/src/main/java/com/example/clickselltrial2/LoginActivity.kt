package com.example.clickselltrial2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Get the buttons from the layout
        val backButton: ImageButton = findViewById(R.id.backButton)
        val signInButton: Button = findViewById(R.id.btnSignIn)

        // Set click listener for the back button to return to the main screen
        backButton.setOnClickListener {
            finish() // This will close the current activity and go back to the previous screen
        }

        // Set click listener for the sign-in button (navigate to another activity after sign-in)
        signInButton.setOnClickListener {
            // You can add authentication logic here
            // After successful sign-in, move to another activity (like the dashboard)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
