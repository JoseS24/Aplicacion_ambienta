package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria4Binding

class analisisTeoria4 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria4Binding
    private var mp = MediaPlayer()
    private var mp2 = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mp = MediaPlayer.create(this, R.raw.audio5)
        mp2 = MediaPlayer.create(this, R.raw.audio6)

        binding.seguirProp12.setOnClickListener {
            val intent = Intent(this, analisisTeoria5::class.java)
            startActivity(intent)
        }
        binding.analisisT5.setOnClickListener{
            mp.start()
        }
        binding.analisisT6.setOnClickListener {
            mp2.start()
        }
    }
}