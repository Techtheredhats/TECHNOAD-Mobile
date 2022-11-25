package com.burhanrashid52.photoediting.functionality

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.burhanrashid52.photoediting.R
import com.burhanrashid52.photoediting.databinding.ActivityDigitalCompaignBinding

class DigitalCompaignActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDigitalCompaignBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digital_compaign)

        binding = ActivityDigitalCompaignBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.selectFromDesign.setOnClickListener {
            startActivity(Intent(this, RunDigitalCompaignActivity::class.java))
        }
        binding.selectFromDesign.setOnClickListener {
            startActivity(Intent(this, RunDigitalCompaignActivity::class.java))
        }
    }
}