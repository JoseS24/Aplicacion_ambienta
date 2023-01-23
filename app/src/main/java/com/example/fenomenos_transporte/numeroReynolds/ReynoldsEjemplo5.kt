package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsEjemplo5Binding

class reynoldsEjemplo5 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsEjemplo5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsEjemplo5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rPaso6.setOnClickListener {
            val intent = Intent(this, reynoldsEjemplo6::class.java)
            startActivity(intent)
        }
        binding.rPaso5.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al paso anterior")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this,reynoldsEjemplo5::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}