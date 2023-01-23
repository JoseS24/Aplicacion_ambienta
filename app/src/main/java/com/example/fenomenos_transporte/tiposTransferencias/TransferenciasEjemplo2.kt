package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.conveccion.entradaConveccion
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasEjemplo2Binding

class transferenciasEjemplo2 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasEjemplo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasEjemplo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresoT.setOnClickListener {
            val intent = Intent(this, entradaTransferencias::class.java)
            startActivity(intent)
        }
    }
}