package com.burhanrashid52.photoediting.functionality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.burhanrashid52.photoediting.R
import com.burhanrashid52.photoediting.databinding.ActivityCreateLogoBinding

class CreateLogoActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreateLogoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCreateLogoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createYourLogo.setOnClickListener {
            startActivity(Intent(this , EditLogoActivity::class.java))
        }


    }
}