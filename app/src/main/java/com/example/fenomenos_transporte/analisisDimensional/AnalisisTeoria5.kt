package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria5Binding

class analisisTeoria5 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria5Binding
    private var mp = MediaPlayer()
    private var mp2 = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mp = MediaPlayer.create(this, R.raw.audio7)
        mp2 = MediaPlayer.create(this, R.raw.audio8)

        binding.seguirProp34.setOnClickListener {
            val intent = Intent(this, entradaAnalisis::class.java)
            startActivity(intent)
        }
        binding.analisisT7.setOnClickListener{
            mp.start()
        }
        binding.analisisT8.setOnClickListener {
            mp2.start()
        }
    }
}