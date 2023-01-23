package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsTeoria2Binding

class reynoldsTeoria2 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsTeoria2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsTeoria2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguir6.setOnClickListener {
            val intent = Intent(this, reynoldsTeoria3::class.java)
            startActivity(intent)
        }
    }
}