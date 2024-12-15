package com.example.phasmoapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.phasmoapp.R
import com.example.phasmoapp.navigation.AppScreen
import com.example.phasmoapp.viewmodel.AppViewModel
import kotlinx.coroutines.delay

@Composable
fun FirstScreen(navController: NavController) {
    LoadingScreen(navController)
}


@Composable
fun LoadingScreen(navController: NavController) {

    // Declarando la fuente
    val octoberCrow = FontFamily(Font(R.font.october_crow))

    Column(Modifier
            .fillMaxSize()
            .background(colorResource(R.color.fondo)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(
            text = "Phasmopedia",
            style = TextStyle(
                fontFamily = octoberCrow,
                fontSize = 30.sp,
                color = Color.White
            ),
            modifier = Modifier.padding(24.dp)
        )

        Image(painterResource(R.drawable.obake), "Obake logo")

        Text("Loading assets. . .", Modifier.padding(top = 16.dp), color = Color.White)

        LinearProgressIndicator(
            modifier = Modifier.padding(32.dp),
            color = colorResource(R.color.obakeHand)
        )

        LaunchedEffect(Unit) {
            delay(3000)

            navController.navigate(AppScreen.SecondScreen.route)

        }
    }

}


