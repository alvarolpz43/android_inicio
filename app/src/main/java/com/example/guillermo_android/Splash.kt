package com.example.guillermo_android

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.guillermo_android.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        Handler().postDelayed({
            // Crea un Intent para iniciar la actividad principal
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Cierra la actividad actual (splash screen)
            finish()
        }, SPLASH_TIME_OUT)
    }
}
