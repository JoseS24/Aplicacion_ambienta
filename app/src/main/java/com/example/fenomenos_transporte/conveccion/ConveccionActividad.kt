package com.example.fenomenos_transporte.conveccion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.analisisAct1
import com.example.fenomenos_transporte.analisisDimensional.entradaAnalisis
import com.example.fenomenos_transporte.databinding.ActivityConveccionActividadBinding

class conveccionActividad : AppCompatActivity() {
    private lateinit var binding: ActivityConveccionActividadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConveccionActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iniciarConveccion.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Evaluacion tema 4")
                .setMessage("Al presionar aceptar se iniciara la evaluacion, si sales se reiniciara la evaluacion")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, conveccionAct1::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    val intent = Intent(this, entradaConveccion::class.java)
                    startActivity(intent)
                }
                .show()
        }
    }
}