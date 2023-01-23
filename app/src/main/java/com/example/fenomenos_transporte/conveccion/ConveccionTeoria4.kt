package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria3Binding
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria4Binding

class conveccionTeoria4 : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionTeoria4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionTeoria4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pasarC4.setOnClickListener {
            val intent = Intent(this, conveccionTeoria5::class.java)
            startActivity(intent)
        }
    }
}