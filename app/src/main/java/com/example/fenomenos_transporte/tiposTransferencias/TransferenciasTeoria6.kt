package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria6Binding

class transferenciasTeoria6 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasTeoria6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasTeoria6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirT6.setOnClickListener {
            val intent = Intent (this,transferenciasTeoria7::class.java)
            startActivity(intent)
        }
    }
}