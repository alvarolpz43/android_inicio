package com.example.guillermo_android

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.guillermo_android.databinding.ActivityMainBinding
import com.example.guillermo_android.databinding.ActivityRegistroBinding

class registro : AppCompatActivity() {
    private lateinit var binding:  ActivityRegistroBinding
    private lateinit var sharedPref:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        binding.login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}