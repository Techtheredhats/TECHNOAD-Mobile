package com.burhanrashid52.photoediting.functionality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.burhanrashid52.photoediting.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginTv.setOnClickListener {
            startActivity(Intent(this , LoginActivity::class.java))
        }
    }
}