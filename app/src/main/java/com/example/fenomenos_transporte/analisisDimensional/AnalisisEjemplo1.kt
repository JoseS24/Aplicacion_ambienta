package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisEjemplo1Binding

class analisisEjemplo1 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisEjemplo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisEjemplo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vuelta5.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Informacion")
                .setMessage("A continuacion se explicara paso a paso la resolucion de un ejercicio, si quieres regresar a un paso anterior lo puedes hacer")
                .setPositiveButton("Aceptar") {_, _ ->
                    val intent = Intent(this, analisisEjemplo2::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") {_, _ ->
                    val intent = Intent(this, entradaAnalisis::class.java)
                    startActivity(intent)
                }
                .create().show()
        }
    }
}