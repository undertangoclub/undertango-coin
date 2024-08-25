package com.emptyset.undertangocoin.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emptyset.undertangocoin.databinding.ActivityTradeBinding

class TradeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityTradeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTradeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aquí puedes añadir la lógica para manejar las transacciones de intercambio, compra, y venta
    }
}
