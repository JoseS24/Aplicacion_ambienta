package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadEjemplo2Binding
import com.example.fenomenos_transporte.numeroReynolds.entradaNumReynolds
import com.example.fenomenos_transporte.numeroReynolds.reynoldsEjemplo3

class viscosidadEjemplo2 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadEjemplo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadEjemplo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.problemaViscosidad2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Informacion")
                .setMessage("A continuacion se explicara paso a paso la resolucion de un ejercicio, si quieres regresar a un paso anterior lo puedes hacer")
                .setPositiveButton("Aceptar") {_, _ ->
                    val intent = Intent(this, viscosidadEjemplo3::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") {_, _ ->
                    val intent = Intent(this, entradaViscosidad::class.java)
                    startActivity(intent)
                }
                .create().show()
        }
    }
}