package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria3Binding

class conveccionTeoria3 : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionTeoria3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionTeoria3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pasarC3.setOnClickListener {
            val intent = Intent(this, conveccionTeoria4::class.java)
            startActivity(intent)
        }
    }
}