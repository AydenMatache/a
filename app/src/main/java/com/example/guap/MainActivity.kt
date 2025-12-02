package com.example.guap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guap.ui.theme.GuapTheme
import com.example.guap.ui.theme.StartScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GuapTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InspectionNavHost()
                }
            }
        }
    }
}

@Composable
fun InspectionNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "start") {
        composable("start") {
            StartScreen(onStartClicked = { /* TODO: Navigate to the first checklist item */ })
        }
    }
}
