package com.example.fenomenos_transporte.numeroReynolds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.analisisDimensional.analisisEjemplo2
import com.example.fenomenos_transporte.analisisDimensional.entradaAnalisis
import com.example.fenomenos_transporte.databinding.ActivityReynoldsEjemplo2Binding

class reynoldsEjemplo2 : AppCompatActivity() {
    private lateinit var binding: ActivityReynoldsEjemplo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReynoldsEjemplo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.problemaReynolds2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Informacion")
                .setMessage("A continuacion se explicara paso a paso la resolucion de un ejercicio, si quieres regresar a un paso anterior lo puedes hacer")
                .setPositiveButton("Aceptar") {_, _ ->
                    val intent = Intent(this, reynoldsEjemplo3::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") {_, _ ->
                    val intent = Intent(this, entradaNumReynolds::class.java)
                    startActivity(intent)
                }
                .create().show()
        }
    }
}