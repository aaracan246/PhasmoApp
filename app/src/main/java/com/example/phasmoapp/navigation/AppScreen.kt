package com.example.phasmoapp.navigation

sealed class AppScreen(val route: String) {
    data object FirstScreen: AppScreen("FirstScreen")
    data object SecondScreen: AppScreen("SecondScreen")
    data object ThirdScreen: AppScreen("ThirdScreen")
    data object FourthScreen: AppScreen("FourthScreen")
}