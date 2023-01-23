package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.Login.temas
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityEntradaTransferenciasBinding

class entradaTransferencias : AppCompatActivity() {
    private lateinit var binding: ActivityEntradaTransferenciasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaTransferenciasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.teoriaTr.setOnClickListener {
            val intent = Intent(this, transferenciasTeoria1::class.java)
            startActivity(intent)
        }
        binding.actividadesTr.setOnClickListener {
            val intent = Intent(this, transferenciasActividad::class.java)
            startActivity(intent)
        }
        binding.ejemploTr.setOnClickListener {
            val intent = Intent(this, transferenciasEjemplo1::class.java)
            startActivity(intent)
        }
        binding.regresarTr.setOnClickListener {
            val intent = Intent(this, temas::class.java)
            startActivity(intent)
        }

    }
}