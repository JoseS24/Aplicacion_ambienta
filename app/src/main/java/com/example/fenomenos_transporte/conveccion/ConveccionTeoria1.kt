package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.analisisTeoria2
import com.example.fenomenos_transporte.databinding.ActivityAnalisisAct1Binding
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria1Binding

class conveccionTeoria1 : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionTeoria1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionTeoria1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pasarC1.setOnClickListener {
            val intent = Intent(this, conveccionTeoria2::class.java)
            startActivity(intent)
        }

    }
}