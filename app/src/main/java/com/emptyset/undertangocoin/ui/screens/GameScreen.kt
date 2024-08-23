package com.emptyset.undertangocoin.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emptyset.undertangocoin.databinding.ActivityGameBinding

class GameScreen : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aquí puedes añadir la lógica para tu pantalla de juego
    }
}