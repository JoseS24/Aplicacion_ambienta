package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria1Binding
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria2Binding

class conveccionTeoria2 : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionTeoria2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionTeoria2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pasarC2.setOnClickListener {
            val intent = Intent(this, conveccionTeoria3::class.java)
            startActivity(intent)
        }
    }
}