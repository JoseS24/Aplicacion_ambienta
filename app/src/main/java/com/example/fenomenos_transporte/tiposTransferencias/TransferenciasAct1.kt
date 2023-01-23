package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.fenomenos_transporte.MainViewModel
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasAct1Binding

class transferenciasAct1 : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasAct1Binding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasAct1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.problemasT1.text = viewModel.ejercicioT.problemaT

        binding.salirEjercicio.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Salir de evaluacion?. Al aceptar se reiniciara todo tu progreso")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, entradaTransferencias::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    dialog.dismiss()
                }
                .show()
        }

        binding.checarT1.setOnClickListener {
            if (binding.resultadoT1.text.toString() == viewModel.ejercicioT.solucionT) {
                AlertDialog.Builder(this)
                    .setTitle("Respuesta")
                    .setMessage("Tu respuesta es corecta")
                    .setPositiveButton("Siguiente") { dialog, which ->
                        val intent = Intent(this, transferenciasAct2::class.java)
                        startActivity(intent)
                    }
                    .show()
            } else {
                if (binding.resultadoT1.text.toString() == viewModel.ejercicioT.solucionT) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoT1.text.toString() == viewModel.ejercicioT.solucionT) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage("Tu respuesta es incorrecta")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                } else if (binding.resultadoT1.text.toString() == viewModel.ejercicioT.solucionT) {
                    AlertDialog.Builder(this)
                        .setTitle("Respuesta")
                        .setMessage(
                            "Tu respuesta es incorrecta, te recomendamos repasar la informacion de nuevo" +
                                    " para que puedas entender mejor el ejercicios"
                        )
                        .setPositiveButton("Aceptar") { dialog, which ->
                            val intent = Intent(this, entradaTransferencias::class.java)
                            startActivity(intent)
                        }
                        .show()
                }
            }
        }
    }
}