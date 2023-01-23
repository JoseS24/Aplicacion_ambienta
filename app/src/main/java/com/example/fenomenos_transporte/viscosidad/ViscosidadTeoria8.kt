package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria8Binding

class viscosidadTeoria8 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar8.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria9::class.java)
            startActivity(intent)
        }
    }
}