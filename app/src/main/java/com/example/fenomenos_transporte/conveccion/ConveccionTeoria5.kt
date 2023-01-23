package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria4Binding
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria5Binding

class conveccionTeoria5 : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionTeoria5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionTeoria5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pasarC5.setOnClickListener {
            val intent = Intent(this, entradaConveccion::class.java)
            startActivity(intent)
        }
    }
}