package com.burhanrashid52.photoediting.functionality

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.burhanrashid52.photoediting.databinding.ActivityCreateLogoBinding
import com.burhanrashid52.photoediting.databinding.ActivityCreatePosterBinding

class CreatePosterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreatePosterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCreatePosterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createYourLogo.setOnClickListener {
            startActivity(Intent(this, EditPosterActivity::class.java))
        }


    }
}