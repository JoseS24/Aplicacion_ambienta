package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisEjemplo3Binding

class analisisEjemplo3 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisEjemplo3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisEjemplo3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continuarEjemplo1.setOnClickListener {
            val intent = Intent(this, analisisEjemplo4::class.java)
            startActivity(intent)
        }
        binding.regresoEjemplo1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al punto anterior?")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, analisisEjemplo2::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}