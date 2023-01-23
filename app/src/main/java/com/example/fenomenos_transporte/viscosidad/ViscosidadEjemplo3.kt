package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadEjemplo3Binding
import com.example.fenomenos_transporte.numeroReynolds.entradaNumReynolds
import com.example.fenomenos_transporte.numeroReynolds.reynoldsEjemplo4

class viscosidadEjemplo3 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadEjemplo3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadEjemplo3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPaso2.setOnClickListener {
            val intent = Intent(this, viscosidadEjemplo4::class.java)
            startActivity(intent)
        }
        binding.vPaso1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al menú principal?")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, entradaViscosidad::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}