package com.burhanrashid52.photoediting.functionality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.burhanrashid52.photoediting.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerTv.setOnClickListener {
            startActivity(Intent(this , RegisterActivity::class.java))
        }

        binding.loginBtn.setOnClickListener {
            startActivity(Intent(this , HomeActivity::class.java))
        }
    }
}