package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadEjemplo5Binding

class viscosidadEjemplo5 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadEjemplo5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadEjemplo5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPaso6.setOnClickListener {
            val intent = Intent(this, viscosidadEjemplo6::class.java)
            startActivity(intent)
        }
        binding.vPaso5.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al paso anterior?")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, viscosidadEjemplo4::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}