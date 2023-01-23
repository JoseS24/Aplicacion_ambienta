package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasTeoria4Binding

class transferenciasTeoria4 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasTeoria4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasTeoria4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirT4.setOnClickListener {
            val intent = Intent (this,transferenciasTeoria5::class.java)
            startActivity(intent)
        }
    }
}