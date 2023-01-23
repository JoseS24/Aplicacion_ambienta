package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityConveccionEjemplo1Binding
import com.example.fenomenos_transporte.databinding.ActivityConveccionEjemplo2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadActividadBinding

class conveccionEjemplo2 : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionEjemplo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionEjemplo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresoC.setOnClickListener {
            val intent = Intent(this, entradaConveccion::class.java)
            startActivity(intent)
        }
    }
}