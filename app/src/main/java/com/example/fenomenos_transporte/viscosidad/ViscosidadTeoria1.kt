package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria1Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding

class viscosidadTeoria1 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar1.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria2::class.java)
            startActivity(intent)
        }
    }
}