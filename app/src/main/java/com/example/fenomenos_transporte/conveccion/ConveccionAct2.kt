package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.fenomenos_transporte.MainViewModel
import com.example.fenomenos_transporte.databinding.ActivityConveccionAct2Binding

class conveccionAct2 : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityConveccionAct2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionAct2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.problemasC2.text = viewModel.ejercicioC.problemaC

        binding.salirEjercicio.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Salir de evaluacion?. Al aceptar se reiniciara todo tu progreso")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, entradaConveccion::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    dialog.dismiss()
                }
                .show()
        }

        binding.checarC2.setOnClickListener {
            if (binding.resultadoC2.text.toString() == viewModel.ejercicioC.solucionC) {
                AlertDialog.Builder(this)
                    .setTitle("Respuesta")
                    .setMessage("Tu respuesta es corecta")
                    .setPositiveButton("Siguiente") { dialog, which ->
                        val intent = Intent(this, conveccionAct3::class.java)
                        startActivity(intent)
                    }
                    .show()
            } else {
                if (binding.resultadoC2.text.toString() == viewModel.ejercicioC.solucionC) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoC2.text.toString() == viewModel.ejercicioC.solucionC) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoC2.text.toString() == viewModel.ejercicioC.solucionC) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage(
                            "Tu respuesta es incorrecta, te recomendamos repasar la informacion de nuevo" +
                                    " para que puedas entender mejor el ejercicios"
                        )
                        .setPositiveButton("Aceptar") { dialog, which ->
                            val intent = Intent(this, entradaConveccion::class.java)
                            startActivity(intent)
                        }
                        .show()
                }
            }
        }
    }
}