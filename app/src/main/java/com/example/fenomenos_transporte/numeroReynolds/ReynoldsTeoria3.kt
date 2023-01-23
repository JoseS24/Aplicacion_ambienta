package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsTeoria3Binding

class reynoldsTeoria3 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsTeoria3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsTeoria3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguir7.setOnClickListener {
            val intent = Intent(this, reynoldsTeoria4::class.java)
            startActivity(intent)
        }
    }
}