package com.burhanrashid52.photoediting.functionality

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.burhanrashid52.photoediting.R
import com.burhanrashid52.photoediting.databinding.ActivityRunDigitalCompaignBinding

class RunDigitalCompaignActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRunDigitalCompaignBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRunDigitalCompaignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_run_digital_compaign)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
       /* val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)*/
        navView.setupWithNavController(navController)
    }
}