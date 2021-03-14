package com.example.latihankotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.latihankotlin.databinding.AMainBinding

class A_Home : AppCompatActivity() {
    lateinit var bind: AMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = AMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        bind.btnEinstein.setOnClickListener {
            if (navController.currentDestination!!.label!!.equals("f_Einstein")) {
                return@setOnClickListener
            }
            navController.navigate(R.id.f_Einstein)
        }

        bind.btnTesla.setOnClickListener {
            if (navController.currentDestination!!.label!!.equals("f_Tesla")) {
                return@setOnClickListener
            }
            navController.navigate(R.id.f_Tesla)
        }

        bind.btnMusk.setOnClickListener {
            if (navController.currentDestination!!.label!!.equals("f_Musk")) {
                return@setOnClickListener
            }
            navController.navigate(R.id.f_Musk)
        }
    }
}