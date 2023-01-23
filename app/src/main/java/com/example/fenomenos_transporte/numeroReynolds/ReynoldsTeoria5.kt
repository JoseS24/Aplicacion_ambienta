package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsTeoria5Binding

class reynoldsTeoria5 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsTeoria5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsTeoria5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguir9.setOnClickListener {
            val intent = Intent(this, entradaNumReynolds::class.java)
            startActivity(intent)
        }
    }
}