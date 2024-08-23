package com.emptyset.undertangocoin.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emptyset.undertangocoin.databinding.ActivityTutorialBinding

class TutorialScreen : AppCompatActivity() {
    private lateinit var binding: ActivityTutorialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTutorialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aquí puedes añadir la lógica para tu pantalla de tutorial
    }
}