package com.example.guillermo_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.guillermo_android.R

class inicio : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)


        val Intent = intent
        val usu= Intent.getStringExtra("usuario")
        val mostrar = findViewById<TextView>(R.id.email)

        mostrar.text = "Bienvenido: $usu";


    }


}