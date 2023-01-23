package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.Login.temas
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.conveccion.conveccionTeoria1
import com.example.fenomenos_transporte.databinding.ActivityEntradaConveccionBinding
import com.example.fenomenos_transporte.databinding.ActivityEntradaViscosidadBinding

class entradaViscosidad : AppCompatActivity() {
    private lateinit var binding: ActivityEntradaViscosidadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaViscosidadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.teoriaV.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria1::class.java)
            startActivity(intent)
        }
        binding.regresoV.setOnClickListener {
            val intent = Intent(this, temas::class.java)
            startActivity(intent)
        }
    }
}