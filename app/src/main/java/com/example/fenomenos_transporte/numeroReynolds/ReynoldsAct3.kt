package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.fenomenos_transporte.Login.temas
import com.example.fenomenos_transporte.MainViewModel
import com.example.fenomenos_transporte.databinding.ActivityReynoldsAct3Binding

class reynoldsAct3 : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityReynoldsAct3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsAct3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.problemasReynolds2.text = viewModel.ejercicioR.problemaR

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

        binding.checarR3.setOnClickListener {
            if (binding.resultadoR3.text.toString() == viewModel.ejercicioR.solucionR) {
                AlertDialog.Builder(this)
                    .setTitle("Respuesta")
                    .setMessage("Tu respuesta es corecta, has acabado los ejercicios correctamente")
                    .setPositiveButton("Siguiente") { dialog, which ->
                        val intent = Intent(this, temas::class.java)
                        startActivity(intent)
                    }
                    .show()
            } else {
                if (binding.resultadoR3.text.toString() == viewModel.ejercicioR.solucionR) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoR3.text.toString() == viewModel.ejercicioR.solucionR) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoR3.text.toString() == viewModel.ejercicioR.solucionR) {
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