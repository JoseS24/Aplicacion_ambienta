package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria1Binding

class analisisTeoria1 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria1Binding
    private var mp = MediaPlayer()
    private var mp2 = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mp = MediaPlayer.create(this, R.raw.audio1)
        mp2 = MediaPlayer.create(this, R.raw.audio2)

        binding.psr1.setOnClickListener {
            val intent = Intent(this, analisisTeoria2::class.java)
            startActivity(intent)
        }
        binding.analisisT1.setOnClickListener{
            mp.start()
        }
        binding.analisisT2.setOnClickListener {
            mp2.start()
        }
    }
}