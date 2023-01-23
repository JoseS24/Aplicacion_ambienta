package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.fenomenos_transporte.MainViewModel
import com.example.fenomenos_transporte.databinding.ActivityReynoldsAct1Binding

class reynoldsAct1 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsAct1Binding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsAct1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.problemasReynolds.text = viewModel.ejercicioR.problemaR

        binding.salirEjercicio.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Salir de evaluacion?. Al aceptar se reiniciara todo tu progreso")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, entradaNumReynolds::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    dialog.dismiss()
                }
                .show()
        }

        binding.checarR1.setOnClickListener {
            if (binding.resultadoR1.text.toString() == viewModel.ejercicioR.solucionR) {
                AlertDialog.Builder(this)
                    .setTitle("Respuesta")
                    .setMessage("Tu respuesta es corecta")
                    .setPositiveButton("Siguiente") { dialog, which ->
                        val intent = Intent(this, reynoldsAct2::class.java)
                        startActivity(intent)
                    }
                    .show()
            } else {
                if (binding.resultadoR1.text.toString() == viewModel.ejercicioR.solucionR) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoR1.text.toString() == viewModel.ejercicioR.solucionR) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoR1.text.toString() == viewModel.ejercicioR.solucionR) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage(
                            "Tu respuesta es incorrecta, te recomendamos repasar la informacion de nuevo" +
                                    " para que puedas entender mejor el ejercicios"
                        )
                        .setPositiveButton("Aceptar") { dialog, which ->
                            val intent = Intent(this, entradaNumReynolds::class.java)
                            startActivity(intent)
                        }
                        .show()
                }
            }
        }
    }
}