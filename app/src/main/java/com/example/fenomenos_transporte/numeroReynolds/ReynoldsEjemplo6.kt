package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsEjemplo6Binding

class reynoldsEjemplo6 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsEjemplo6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsEjemplo6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rPaso8.setOnClickListener {
            val intent = Intent(this, reynoldsEjemplo7::class.java)
            startActivity(intent)
        }
        binding.rPaso7.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al paso anterior")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this,reynoldsEjemplo6::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}