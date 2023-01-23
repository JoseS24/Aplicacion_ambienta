package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisAct1Binding
import com.example.fenomenos_transporte.databinding.ActivityEntradaViscosidadBinding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria1Binding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria2Binding

class transferenciasTeoria1 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasTeoria1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasTeoria1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirT1.setOnClickListener {
            val intent = Intent (this,transferenciasTeoria2::class.java)
            startActivity(intent)
        }
    }
}