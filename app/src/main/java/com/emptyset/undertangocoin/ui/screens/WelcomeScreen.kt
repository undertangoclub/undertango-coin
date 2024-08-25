package com.emptyset.undertangocoin.ui.screens

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.emptyset.undertangocoin.R
import com.emptyset.undertangocoin.databinding.ActivityWelcomeBinding

class WelcomeScreen : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Añadimos el log de depuración aquí
        Log.d("MyApp", "WelcomeScreen onCreate called")

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar los listeners para los botones usando View Binding
        binding.btnTutorial.setOnClickListener {
            Log.d("MyApp", "Tutorial button clicked")
            val intent = Intent(this, TutorialScreen::class.java)
            startActivity(intent)
        }

        binding.btnPlay.setOnClickListener {
            Log.d("MyApp", "Play button clicked")
            val intent = Intent(this, GameScreen::class.java)
            startActivity(intent)
        }

        // Configurar el listener para el nuevo botón de intercambio
        binding.btnTrade.setOnClickListener {
            Log.d("MyApp", "Trade button clicked")
            val intent = Intent(this, TradeScreen::class.java)
            startActivity(intent)
        }

        Log.d("MyApp", "WelcomeScreen onCreate finished")
    }
}
