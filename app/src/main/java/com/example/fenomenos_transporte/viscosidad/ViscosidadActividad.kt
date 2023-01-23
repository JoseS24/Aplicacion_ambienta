package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadActividadBinding
import com.example.fenomenos_transporte.tiposTransferencias.entradaTransferencias
import com.example.fenomenos_transporte.tiposTransferencias.transferenciasAct1

class viscosidadActividad : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadActividadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inicioViscosidad.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Evaluacion tema 5")
                .setMessage("Al presionar aceptar se iniciara la evaluacion, si sales se reiniciara la evaluacion")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, viscosidadAct1::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    val intent = Intent(this, entradaViscosidad::class.java)
                    startActivity(intent)
                }
                .show()
        }
    }
}