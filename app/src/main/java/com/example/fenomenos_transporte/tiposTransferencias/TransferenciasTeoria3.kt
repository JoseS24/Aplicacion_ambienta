package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria3Binding

class transferenciasTeoria3 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasTeoria3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasTeoria3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirT3.setOnClickListener {
            val intent = Intent (this,transferenciasTeoria4::class.java)
            startActivity(intent)
        }
    }
}