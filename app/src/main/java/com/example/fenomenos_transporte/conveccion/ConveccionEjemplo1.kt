package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityConveccionEjemplo1Binding

class conveccionEjemplo1 : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionEjemplo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionEjemplo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.problemaConveccion1.setOnClickListener {
            val intent = Intent(this, conveccionEjemplo2::class.java)
            startActivity(intent)
        }
    }
}