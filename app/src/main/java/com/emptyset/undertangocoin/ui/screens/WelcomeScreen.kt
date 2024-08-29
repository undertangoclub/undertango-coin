package com.emptyset.undertangocoin.ui.screens
import com.emptyset.undertangocoin.ui.screens.RegisterActivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emptyset.undertangocoin.R

class WelcomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MyApp", "WelcomeScreen onCreate called")

        setContent {
            WelcomeScreenContent(
                onTutorialClick = {
                    Log.d("MyApp", "Tutorial button clicked")
                    val intent = Intent(this, TutorialScreen::class.java)
                    startActivity(intent)
                },
                onPlayClick = {
                    Log.d("MyApp", "Play button clicked")
                    val intent = Intent(this, GameScreen::class.java)
                    startActivity(intent)
                },
                onTradeClick = {
                    Log.d("MyApp", "Trade button clicked")
                    val intent = Intent(this, TradeScreen::class.java)
                    startActivity(intent)
                },
                onRegisterClick = {
                    Log.d("MyApp", "Register button clicked")
                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)
                }
            )
        }

        Log.d("MyApp", "WelcomeScreen onCreate finished")
    }
}

@Composable
fun WelcomeScreenContent(
    onTutorialClick: () -> Unit,
    onPlayClick: () -> Unit,
    onTradeClick: () -> Unit,
    onRegisterClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = onTutorialClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Ver Tutorial")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onPlayClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Empezar a Jugar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onTradeClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Mercado de Intercambio")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onRegisterClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Registrarse")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreenContent(
        onTutorialClick = {},
        onPlayClick = {},
        onTradeClick = {},
        onRegisterClick = {}
    )
}