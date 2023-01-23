package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria5Binding

class transferenciasTeoria5 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasTeoria5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasTeoria5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirT5.setOnClickListener {
            val intent = Intent (this,transferenciasTeoria6::class.java)
            startActivity(intent)
        }
    }
}