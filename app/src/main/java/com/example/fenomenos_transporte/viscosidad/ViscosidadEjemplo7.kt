package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.entradaAnalisis
import com.example.fenomenos_transporte.databinding.ActivityViscosidadEjemplo7Binding
import com.example.fenomenos_transporte.numeroReynolds.entradaNumReynolds
import com.example.fenomenos_transporte.numeroReynolds.reynoldsEjemplo2

class viscosidadEjemplo7 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadEjemplo7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadEjemplo7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPaso10.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere repetir la explicación del ejemplo")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, viscosidadEjemplo3::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ ->
                    val intent = Intent(this, entradaViscosidad::class.java)
                    startActivity(intent)
                }
                .create().show()
        }
        binding.vPaso9.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al paso anterior")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, viscosidadEjemplo6::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}