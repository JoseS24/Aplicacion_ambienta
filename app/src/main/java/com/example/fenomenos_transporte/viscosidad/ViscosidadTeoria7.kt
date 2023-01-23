package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria7Binding

class viscosidadTeoria7 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar7.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria8::class.java)
            startActivity(intent)
        }
    }
}