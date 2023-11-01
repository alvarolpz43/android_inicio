package com.example.guillermo_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class inicio : AppCompatActivity() {

    // variables normales, el lateinit es para una variable que no se va a usar aun

    lateinit  var micadena:String
    var micadena2 = ""

    // variable constante
    val miconstante = "Pepito"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)




    }


}