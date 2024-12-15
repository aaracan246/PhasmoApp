package com.example.phasmoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.phasmoapp.navigation.AppNavigation
import com.example.phasmoapp.screen.FirstScreen
import com.example.phasmoapp.screen.SecondScreen
import com.example.phasmoapp.ui.theme.PhasmoAppTheme
import com.example.phasmoapp.viewmodel.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhasmoAppTheme {

                val navController = rememberNavController()
                val appViewModel = AppViewModel()
                AppNavigation(navController, appViewModel)
            }
        }
    }
}
