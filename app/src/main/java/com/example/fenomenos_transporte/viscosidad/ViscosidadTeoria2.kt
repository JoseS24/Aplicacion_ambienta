package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding

class viscosidadTeoria2 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar2.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria3::class.java)
            startActivity(intent)
        }
    }
}