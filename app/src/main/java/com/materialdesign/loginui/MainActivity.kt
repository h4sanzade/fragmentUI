package com.materialdesign.loginui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.materialdesign.loginui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up Google icon click listener
        binding.googleIcon.setOnClickListener {
            navigateToFragment(GoogleFragment())
        }

        // Set up Facebook icon click listener
        binding.facebookicon.setOnClickListener {
            navigateToFragment(FacebookFragment())
        }

        // Set up Apple icon click listener
        binding.iconApple.setOnClickListener {
            navigateToFragment(AppleFragment())
        }

        // Set up Sign Up button click listener
        binding.signUpButton.setOnClickListener {
            val email = binding.emailInputEditText.text.toString()
            val password = binding.passEditText.text.toString()

            // Validate inputs (optional)
            if (email.isNotEmpty() && password.isNotEmpty()) {
                navigateToFragment(SignUpSuccessFragment.newInstance(email, password))
            }
        }
    }

    private fun navigateToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main, fragment)
            .addToBackStack(null)
            .commit()
    }
}