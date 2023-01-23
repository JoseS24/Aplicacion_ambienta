package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityReynoldsEjemplo4Binding

class reynoldsEjemplo4 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsEjemplo4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsEjemplo4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rPaso4.setOnClickListener {
            val intent = Intent(this, reynoldsEjemplo5::class.java)
            startActivity(intent)
        }
        binding.rPaso3.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al paso anterior")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this,reynoldsEjemplo3::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}