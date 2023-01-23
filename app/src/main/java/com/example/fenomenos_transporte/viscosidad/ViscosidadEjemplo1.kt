package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadEjemplo1Binding

class viscosidadEjemplo1 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadEjemplo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadEjemplo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.problemaViscosidad1.setOnClickListener {
            val Intent = Intent(this, viscosidadEjemplo2::class.java)
            startActivity(Intent)
        }
    }
}