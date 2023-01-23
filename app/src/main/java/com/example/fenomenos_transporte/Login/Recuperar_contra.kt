package com.example.fenomenos_transporte.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.bd
import com.example.fenomenos_transporte.databinding.ActivityRecuperarContraBinding

class recuperar_contra : AppCompatActivity() {
    private lateinit var binding: ActivityRecuperarContraBinding
    private lateinit var buscar: bd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecuperarContraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.inSesion.setOnClickListener {
            val intent = Intent(this, entrada::class.java)
            startActivity(intent)
            binding.recuperar.setOnClickListener {
                if (binding.recContraNumControl.text.isNotBlank()) {
                    buscar = bd(this)
                    val contrasena =
                        buscar.recuperarContra(binding.recContraNumControl.text.toString())
                    binding.contraRecuperada.text = contrasena
                } else {
                    Toast.makeText(this, "Datos incompletos o incorrectos", Toast.LENGTH_LONG)
                        .show()
                }
            }
        }
    }
}