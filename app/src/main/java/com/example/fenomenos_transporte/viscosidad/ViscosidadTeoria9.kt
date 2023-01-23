package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria9Binding

class viscosidadTeoria9 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar9.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria10::class.java)
            startActivity(intent)
        }
    }
}