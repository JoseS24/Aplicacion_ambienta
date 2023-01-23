package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria7Binding

class transferenciasTeoria7 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasTeoria7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasTeoria7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirT7.setOnClickListener {
            val intent = Intent (this,entradaTransferencias::class.java)
            startActivity(intent)
        }
    }
}