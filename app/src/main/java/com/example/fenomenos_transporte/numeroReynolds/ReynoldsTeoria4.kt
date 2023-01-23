package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsTeoria4Binding

class reynoldsTeoria4 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsTeoria4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsTeoria4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.segui8.setOnClickListener {
            val intent = Intent(this, reynoldsTeoria5::class.java)
            startActivity(intent)
        }
    }
}