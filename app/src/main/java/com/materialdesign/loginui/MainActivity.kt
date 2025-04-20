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


        binding.googleIcon.setOnClickListener {
            showFragmentInNewContainer(GoogleFragment())
        }


        binding.facebookicon.setOnClickListener {
            showFragmentInNewContainer(FacebookFragment())
        }


        binding.iconApple.setOnClickListener {
            showFragmentInNewContainer(AppleFragment())
        }


        binding.signUpButton.setOnClickListener {
            val email = binding.emailInputEditText.text.toString()
            val password = binding.passEditText.text.toString()


            if (email.isNotEmpty() && password.isNotEmpty()) {
                showFragmentInNewContainer(SignUpSuccessFragment.newInstance(email, password))
            }
        }
    }

    private fun showFragmentInNewContainer(fragment: Fragment) {

        binding.mainContent.visibility = android.view.View.GONE

        binding.fragmentContainer.visibility = android.view.View.VISIBLE

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }


    fun returnToMainScreen() {

        binding.mainContent.visibility = android.view.View.VISIBLE

        binding.fragmentContainer.visibility = android.view.View.GONE
    }
}