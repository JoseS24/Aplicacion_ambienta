package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.analisisEjemplo3
import com.example.fenomenos_transporte.analisisDimensional.entradaAnalisis
import com.example.fenomenos_transporte.databinding.ActivityReynoldsEjemplo3Binding

class reynoldsEjemplo3 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsEjemplo3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsEjemplo3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rPaso2.setOnClickListener {
            val intent = Intent(this, reynoldsEjemplo4::class.java)
            startActivity(intent)
        }
        binding.rPaso1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al menú principal?")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this,entradaNumReynolds::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}