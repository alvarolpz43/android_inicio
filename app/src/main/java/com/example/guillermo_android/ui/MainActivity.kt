package com.example.guillermo_android.ui

import android.content.Intent
import com.example.guillermo_android.data.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.guillermo_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var usuario: String;
    lateinit var contraseña: String;

    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPref:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
         sharedPref = SharedPreferences(this)




        val ediTextUsuario: android.widget.EditText = binding.email
        val ediTextContraseña: android.widget.EditText = binding.password
        binding.registro.setOnClickListener {
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }

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
                val intent = Intent(this, inicio::class.java)
                val mensaje = "Bienvenido: $usuario"

                Toast.makeText(applicationContext,mensaje,Toast.LENGTH_SHORT).show()
                intent.putExtra("usuario",usuario)
                startActivity(intent)


            } else {
                Toast.makeText(applicationContext, "Inicio de Sesion Fallido", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}






