package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria10Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding

class viscosidadTeoria10 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar10.setOnClickListener {
            val intent = Intent(this, entradaViscosidad::class.java)
            startActivity(intent)
        }
    }
}