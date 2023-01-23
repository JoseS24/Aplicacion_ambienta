package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria6Binding

class viscosidadTeoria6 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar6.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria7::class.java)
            startActivity(intent)
        }
    }
}