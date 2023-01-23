package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.analisisAct1
import com.example.fenomenos_transporte.analisisDimensional.entradaAnalisis
import com.example.fenomenos_transporte.databinding.ActivityReynoldsActividadBinding

class reynoldsActividad : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsActividadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.inicioReynolds.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Evaluacion tema 2")
                .setMessage("Al presionar aceptar se iniciara la evaluacion, si sales se reiniciara la evaluacion")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, reynoldsAct1::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    val intent = Intent(this, entradaNumReynolds::class.java)
                    startActivity(intent)
                }
                .show()
        }
    }
}