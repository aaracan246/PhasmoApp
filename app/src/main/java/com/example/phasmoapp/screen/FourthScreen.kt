package com.example.phasmoapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.phasmoapp.R
import com.example.phasmoapp.components.Footer
import com.example.phasmoapp.components.Header
import com.example.phasmoapp.components.PhasmoDivider

@Composable
fun FourthScreen(navController: NavController) {

    val userOptionsIcon = painterResource(id = R.drawable.trueusericon)
    val ghostInfoIcon = painterResource(id = R.drawable.demonicon)
    val evidenceInfoIcon = painterResource(id = R.drawable.usericon)
    val adminIcon = painterResource(id = R.drawable.adminicon)


    Column(
        Modifier
            .fillMaxSize()
            .background(colorResource(R.color.fondo)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){


        Header()

        PhasmoDivider()

        Text(
            text = LoremIpsum(70).values.joinToString(" "),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            color = Color.White
        )

        HorizontalDivider(Modifier.padding(16.dp))

        Footer(navController)
    }
}