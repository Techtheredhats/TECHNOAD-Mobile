package com.burhanrashid52.photoediting.functionality

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.burhanrashid52.photoediting.databinding.ActivityPosterBinding

class PosterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPosterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPosterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createYourLogo.setOnClickListener {
            startActivity(Intent(this , EditPosterActivity::class.java))
        }
    }
}