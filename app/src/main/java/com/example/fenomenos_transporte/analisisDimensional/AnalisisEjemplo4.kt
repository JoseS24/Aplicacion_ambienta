package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisEjemplo4Binding

class analisisEjemplo4 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisEjemplo4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisEjemplo4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continuarEjemplo2.setOnClickListener {
            val intent = Intent(this, analisisEjemplo5::class.java)
            startActivity(intent)
        }
        binding.regresoEjemplo2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al punto anterior?")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, analisisEjemplo3::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}