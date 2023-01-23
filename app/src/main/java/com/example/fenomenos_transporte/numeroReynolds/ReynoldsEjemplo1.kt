package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsEjemplo1Binding

class reynoldsEjemplo1 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsEjemplo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsEjemplo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.problemaReynolds1.setOnClickListener {
            val intent = Intent(this, reynoldsEjemplo2::class.java)
            startActivity(intent)
        }
    }
}