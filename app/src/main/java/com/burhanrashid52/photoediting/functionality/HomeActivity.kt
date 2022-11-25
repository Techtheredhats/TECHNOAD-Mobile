package com.burhanrashid52.photoediting.functionality

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.burhanrashid52.photoediting.R
import com.burhanrashid52.photoediting.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_home)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        /*val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_compaigns, R.id.navigation_designs ,R.id.navigation_go_pro))
        setupActionBarWithNavController(navController, appBarConfiguration)*/
        navView.setupWithNavController(navController)
    }
}