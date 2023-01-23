package com.example.fenomenos_transporte.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.entradaAnalisis
import com.example.fenomenos_transporte.conveccion.entradaConveccion
import com.example.fenomenos_transporte.databinding.ActivityTemasBinding
import com.example.fenomenos_transporte.numeroReynolds.entradaNumReynolds
import com.example.fenomenos_transporte.tiposTransferencias.entradaTransferencias
import com.example.fenomenos_transporte.viscosidad.entradaViscosidad

class temas : AppCompatActivity() {
    private lateinit var binding: ActivityTemasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTemasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tm1.setOnClickListener {
            val intent = Intent(this, entradaAnalisis::class.java)
            startActivity(intent)
        }
        binding.tm2.setOnClickListener {
            val intent = Intent(this, entradaNumReynolds::class.java)
            startActivity(intent)
        }
        binding.tm3.setOnClickListener {
            val intent = Intent(this, entradaViscosidad::class.java)
            startActivity(intent)
        }
        binding.tm4.setOnClickListener {
            val intent = Intent(this,entradaConveccion::class.java)
            startActivity(intent)
        }
        binding.tm5.setOnClickListener {
            val intent = Intent(this,entradaTransferencias::class.java)
            startActivity(intent)
        }
    }
}