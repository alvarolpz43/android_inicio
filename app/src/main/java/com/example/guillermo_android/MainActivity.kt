package com.example.guillermo_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.Toast
import com.example.guillermo_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var usuario: String;
    lateinit var contraseña: String;

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val ediTextUsuario: android.widget.EditText = findViewById(R.id.email)
        val ediTextContraseña: android.widget.EditText = findViewById(R.id.password)


        // initUI()


        // private  fun initUI(){
        //setupOnClickListener()
        //}


        binding.boton.setOnClickListener {

            usuario = ediTextUsuario.text.toString()
            contraseña = ediTextContraseña.text.toString()

            println(usuario)
            println(contraseña)


            if (usuario == "lopezquira10@gmail.com" && contraseña == "12345678") {
                val intent = Intent(this, inicio::class.java).apply {
                    putExtra(usuario, contraseña)
                }
                startActivity(intent)

                finish()
            } else {
                Toast.makeText(applicationContext, "Inicio de Sesion Fallido", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}






