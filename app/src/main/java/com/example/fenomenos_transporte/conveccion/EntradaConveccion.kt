package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.Login.entrada
import com.example.fenomenos_transporte.Login.temas
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityConveccionTeoria1Binding
import com.example.fenomenos_transporte.databinding.ActivityEntradaConveccionBinding

class entradaConveccion : AppCompatActivity() {
    private lateinit var binding: ActivityEntradaConveccionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaConveccionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.teoriaC.setOnClickListener {
            val intent = Intent(this, conveccionTeoria1::class.java)
            startActivity(intent)
        }
        binding.regresoC.setOnClickListener {
            val intent = Intent(this, temas::class.java)
            startActivity(intent)
        }
        binding.regresoC.setOnClickListener {
            val intent = Intent(this, temas::class.java)
            startActivity(intent)
        }
        binding.actividadesC.setOnClickListener {
            val intent = Intent(this, conveccionActividad::class.java)
            startActivity(intent)
        }
    }
}