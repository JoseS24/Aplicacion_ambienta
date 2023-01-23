package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisEjemplo6Binding

class analisisEjemplo6 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisEjemplo6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisEjemplo6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.continuarEjemplo4.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere repetir la explicación del ejemplo")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, analisisEjemplo1::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ ->
                    val intent = Intent(this, entradaAnalisis::class.java)
                    startActivity(intent)
                }
                .create().show()
        }
        binding.regresoEjemplo4.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al menú principal")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, entradaAnalisis::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}