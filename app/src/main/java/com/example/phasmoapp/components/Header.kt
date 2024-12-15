package com.example.phasmoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.phasmoapp.R

@Composable
fun Header(){

    val octoberCrow = FontFamily(Font(R.font.october_crow))

    Row(
    modifier = Modifier.padding(26.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Center) {

        Image(painter = painterResource(R.drawable.obake), contentDescription = "Imagen del icono de Godot")
        Text("Phasmopedia",
            modifier = Modifier
                .padding(start = 12.dp),
            color = colorResource(R.color.white),
            style = TextStyle(
                fontFamily = octoberCrow,
                fontSize = 30.sp,
            color = Color.White))
    }
}
