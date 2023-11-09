package com.example.guillermo_android.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.guillermo_android.data.SharedPreferences
import com.example.guillermo_android.databinding.ActivityRegistroBinding

class registro : AppCompatActivity() {
    private lateinit var binding:  ActivityRegistroBinding
    private lateinit var sharedPref: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        sharedPref = SharedPreferences(this)


        binding.login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}
