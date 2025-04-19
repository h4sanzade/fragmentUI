package com.materialdesign.loginui

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout
import com.materialdesign.loginui.databinding.ActivityMainBinding
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.facebookicon.setOnClickListener {

        }

        binding.iconApple.setOnClickListener {

        }

        binding.googleIcon.setOnClickListener {

        }

        binding.signUpButton.setOnClickListener {

        }
    }
}