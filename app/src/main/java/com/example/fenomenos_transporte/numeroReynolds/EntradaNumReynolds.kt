package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.Login.temas
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityEntradaNumReynoldsBinding

class entradaNumReynolds : AppCompatActivity() {
    private lateinit var binding: ActivityEntradaNumReynoldsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaNumReynoldsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.teoriaR1.setOnClickListener {
            val intent = Intent(this, reynoldsTeoria1::class.java)
            startActivity(intent)
        }
        binding.ejemploR1.setOnClickListener {
            val intent = Intent(this, reynoldsEjemplo1::class.java)
            startActivity(intent)
        }
        binding.regresoNum.setOnClickListener {
            val intent = Intent(this, temas::class.java)
            startActivity(intent)
        }
        binding.actividadesR1.setOnClickListener {
            val intent = Intent(this, reynoldsActividad::class.java)
            startActivity(intent)
        }
    }
}