package com.example.fenomenos_transporte.tiposTransferencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.conveccion.conveccionAct1
import com.example.fenomenos_transporte.conveccion.entradaConveccion
import com.example.fenomenos_transporte.databinding.ActivityTransferenciasActividadBinding

class transferenciasActividad : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciasActividadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciasActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iniciarTransferencias.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Evaluacion tema 5")
                .setMessage("Al presionar aceptar se iniciara la evaluacion, si sales se reiniciara la evaluacion")
                .setPositiveButton("Aceptar") { dialog, which ->
                    val intent = Intent(this, transferenciasAct1::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Cancelar") { dialog, which ->
                    val intent = Intent(this, entradaTransferencias::class.java)
                    startActivity(intent)
                }
                .show()
        }
    }
}