package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria4Binding

class viscosidadTeoria4 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar4.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria5::class.java)
            startActivity(intent)
        }
    }
}