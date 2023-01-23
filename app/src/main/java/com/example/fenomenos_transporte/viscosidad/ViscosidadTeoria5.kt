package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria2Binding
import com.example.fenomenos_transporte.databinding.ActivityViscosidadTeoria5Binding

class viscosidadTeoria5 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadTeoria5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadTeoria5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPasar5.setOnClickListener {
            val intent = Intent(this, viscosidadTeoria6::class.java)
            startActivity(intent)
        }
    }
}