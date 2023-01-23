package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsTeoria1Binding

class reynoldsTeoria1 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsTeoria1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsTeoria1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguir5.setOnClickListener {
            val intent = Intent(this, reynoldsTeoria2::class.java)
            startActivity(intent)
        }
    }
}