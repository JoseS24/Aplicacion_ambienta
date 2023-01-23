package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria3Binding

class analisisTeoria3 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria3Binding

    private var mp = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mp = MediaPlayer.create(this, R.raw.audio4)

        binding.psr3.setOnClickListener {
            val intent = Intent(this, analisisTeoria4::class.java)
            startActivity(intent)
        }
        binding.analisisT4.setOnClickListener{
            mp.start()
        }
    }
}