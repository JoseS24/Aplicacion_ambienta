package com.example.fenomenos_transporte.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.bd
import com.example.fenomenos_transporte.databinding.ActivityRegistroBinding

class registro : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding
    private lateinit var ingresar: bd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ingresar = bd(this)

        binding.guardarUsuario.setOnClickListener {
                if (binding.nvoNomUsuario.text.isNotBlank() &&
                    binding.nvoNumControl.text.isNotBlank() &&
                    binding.nvoContrasena.text.isNotBlank()
                ) {
                    ingresar.insertarUsuario(
                        binding.nvoNomUsuario.text.toString(),
                        binding.nvoNumControl.text.toString(),
                        binding.nvoContrasena.text.toString()
                    )
                    AlertDialog.Builder(this)
                        .setTitle("Registro exitoso")
                        .setMessage("El usuario se ha registrado correctamente")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            val intent = Intent(this, entrada::class.java)
                            startActivity(intent)
                        }
                        .show()
                    binding.nvoNomUsuario.text.clear()
                    binding.nvoNumControl.text.clear()
                    binding.nvoContrasena.text.clear()
                } else {
                    AlertDialog.Builder(this)
                        .setTitle("Error")
                        .setMessage("No se ha podido registrar el usuario, faltan datos por llenar")
                        .setPositiveButton("Aceptar") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }
            }
        }
    }



