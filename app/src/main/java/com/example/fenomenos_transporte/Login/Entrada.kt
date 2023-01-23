package com.example.fenomenos_transporte.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.bd
import com.example.fenomenos_transporte.databinding.ActivityEntradaBinding

class entrada : AppCompatActivity() {
    private lateinit var binding: ActivityEntradaBinding
    private lateinit var ingresar: bd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buscarContrasena.setOnClickListener {
            val intent = Intent(this, recuperar_contra::class.java)
            startActivity(intent)
        }
        binding.ingresarMenu.setOnClickListener {
            if (binding.numeroControl.text.isNotBlank() && binding.contraEntrada.text.isNotBlank()){
                ingresar = bd(this)
                if (ingresar.iniciarSesion(binding.numeroControl.text.toString(), binding.contraEntrada.text.toString())){
                    val intent = Intent(this, temas::class.java)
                    startActivity(intent)
                } else {
                    AlertDialog.Builder(this)
                        .setTitle("Error")
                        .setMessage("El usuario no existe o la contraseña es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("No se ha podido iniciar sesión, faltan datos por llenar")
                    .setPositiveButton("Aceptar") { dialog, which ->
                        dialog.dismiss()
                    }
                    .show()
            }
        }
        binding.registroNuevo.setOnClickListener {
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }
    }
}