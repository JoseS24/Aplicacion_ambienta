package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisEjemplo2Binding

class analisisEjemplo2 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisEjemplo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisEjemplo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continuarEjemplo.setOnClickListener {
            val intent = Intent(this, analisisEjemplo3::class.java)
            startActivity(intent)
        }
        binding.regresoEjemplo.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al menú principal?")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, entradaAnalisis::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}