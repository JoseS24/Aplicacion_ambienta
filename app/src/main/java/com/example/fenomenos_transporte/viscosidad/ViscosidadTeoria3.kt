package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria3Binding

class viscosidadTeoria3 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar3.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria4::class.java)
            startActivity(intent)
        }
    }
}