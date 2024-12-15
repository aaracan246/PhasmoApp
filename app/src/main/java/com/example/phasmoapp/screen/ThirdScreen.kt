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
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.phasmoapp.R
import com.example.phasmoapp.components.Footer
import com.example.phasmoapp.components.Header
import com.example.phasmoapp.components.PhasmoDivider
import com.example.phasmoapp.navigation.AppScreen
import kotlinx.coroutines.delay

@Composable
fun ThirdScreen(navController: NavController) {
    OptionsMenu(navController)
}

@Composable
fun OptionsMenu(navController: NavController) {

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

        // User Options - Esto llevaría a una pantalla con más opciones con los endpoints /update_user y /delete_user para Admins y aquellos autentificados (solo sobre su cuenta)
        Button(
            onClick = {  },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.obakeHand)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = userOptionsIcon,
                    contentDescription = "User Options",
                    modifier = Modifier.size(40.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text("User Options", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.padding(16.dp))

        // Ghost Info - Esto llevaría a una pantalla con más opciones con los endpoints /insert_ghost, /update_ghost y /delete_ghost para Admins y /ghosts para aquel usuario normal
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.obakeHand)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = ghostInfoIcon,
                    contentDescription = "Ghost Info",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Ghosts", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.padding(16.dp))

        // Evidence Info - Esto llevaría a una pantalla con más opciones con los endpoints /insert_evidence, /update_evidence y /delete_evidence para Admins y /evidences para aquel usuario normal
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.obakeHand)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = evidenceInfoIcon,
                    contentDescription = "Evidence Info",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Evidences", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.padding(16.dp))

        // Admin - Esto llevaría a una pantalla con más opciones con los endpoints /update_user y /delete_user
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.obakeHand)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = adminIcon,
                    contentDescription = "Admin",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Admin", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }

        HorizontalDivider(Modifier.padding(16.dp))

        Footer(navController)
    }

}

