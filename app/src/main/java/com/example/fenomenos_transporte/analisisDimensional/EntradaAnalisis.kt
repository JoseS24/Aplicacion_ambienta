package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.Login.temas
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityEntradaAnalisisBinding

class entradaAnalisis : AppCompatActivity() {
    private lateinit var binding: ActivityEntradaAnalisisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaAnalisisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.teoriaA.setOnClickListener {
            val intent = Intent(this, analisisTeoria1::class.java)
            startActivity(intent)
        }
        binding.ejemplosA.setOnClickListener {
            val intent = Intent(this, analisisEjemplo1::class.java)
            startActivity(intent)
        }
        binding.actividadesA.setOnClickListener {
            val intent = Intent(this, analisisActividad::class.java)
            startActivity(intent)
        }
        binding.vuelta1.setOnClickListener {
            val intent = Intent(this, temas::class.java)
            startActivity(intent)
        }
    }
}