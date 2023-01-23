package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.fenomenos_transporte.MainViewModel
import com.example.fenomenos_transporte.databinding.ActivityAnalisisAct3Binding

class analisisAct3 : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityAnalisisAct3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisAct3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.problemas2.text = viewModel.ejercicio.problema

        binding.salirEjercicio2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Salir de evaluacion?. Al aceptar se reiniciara todo tu progreso")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, entradaAnalisis::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    dialog.dismiss()
                }
                .show()
        }
        binding.checar3.setOnClickListener {
            if (binding.resultado3.text.toString() == viewModel.ejercicio.solucion) {
                AlertDialog.Builder(this)
                    .setTitle("Respuesta")
                    .setMessage("Tu respuesta es corecta")
                    .setPositiveButton("Siguiente") { dialog, which ->
                        val intent = Intent(this, analisisAct4::class.java)
                        startActivity(intent)
                    }
                    .show()
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Respuesta")
                    .setMessage("Tu respuesta es incorecta, vuelve a intentarlo")
                    .setPositiveButton("Aceptar") { dialog, which ->
                        dialog.dismiss()
                    }
                    .show()
            }
        }
    }
}