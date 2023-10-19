package com.example.guillermo_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // variables normales, el lateinit es para una variable que no se va a usar aun

    lateinit  var micadena:String
    var micadena2 = ""

    // variable constante
    val miconstante = "Pepito"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.boton).setOnClickListener {
            Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show()
        }


    }
}

