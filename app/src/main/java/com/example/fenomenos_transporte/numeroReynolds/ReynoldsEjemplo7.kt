package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.analisisEjemplo1
import com.example.fenomenos_transporte.analisisDimensional.entradaAnalisis
import com.example.fenomenos_transporte.databinding.ActivityReynoldsEjemplo7Binding

class reynoldsEjemplo7 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsEjemplo7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsEjemplo7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rPaso10.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere repetir la explicación del ejemplo")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, reynoldsEjemplo3::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ ->
                    val intent = Intent(this, entradaNumReynolds::class.java)
                    startActivity(intent)
                }
                .create().show()
        }
        binding.rPaso9.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al paso anterior")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, reynoldsEjemplo6::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}