package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.fenomenos_transporte.MainViewModel
import com.example.fenomenos_transporte.databinding.ActivityAnalisisAct2Binding

class analisisAct2 : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityAnalisisAct2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisAct2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.problemas1.text = viewModel.ejercicio.problema

        binding.salirEjercicio1.setOnClickListener {
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
        binding.checar2.setOnClickListener {
            if (binding.resultado2.text.toString() == viewModel.ejercicio.solucion) {
                AlertDialog.Builder(this)
                    .setTitle("Respuesta")
                    .setMessage("Tu respuesta es corecta")
                    .setPositiveButton("Siguiente") { dialog, which ->
                        val intent = Intent(this, analisisAct3::class.java)
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