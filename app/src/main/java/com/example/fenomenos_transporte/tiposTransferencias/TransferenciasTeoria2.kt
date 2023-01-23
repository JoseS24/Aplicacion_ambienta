package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria1Binding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria2Binding

class transferenciasTeoria2 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasTeoria2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasTeoria2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirT2.setOnClickListener {
            val intent = Intent (this,transferenciasTeoria3::class.java)
            startActivity(intent)
        }
    }
}