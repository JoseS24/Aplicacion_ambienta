package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.databinding.ActivityAnalisisActividadBinding

class analisisActividad : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisActividadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.a.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Evaluacion tema 1")
                .setMessage("Al presionar aceptar se iniciara la evaluacion, si sales se reiniciara la evaluacion")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, analisisAct1::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    val intent = Intent(this, entradaAnalisis::class.java)
                    startActivity(intent)
                }
                .show()
        }
    }
}