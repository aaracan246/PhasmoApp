package com.example.phasmoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.phasmoapp.R
import com.example.phasmoapp.navigation.AppNavigation
import com.example.phasmoapp.navigation.AppScreen


@Composable
fun Footer(navController: NavController) {
    NavigationBarFun(navController)
}

@Composable
fun NavigationBarFun(navController: NavController) {
    BottomNavigation(
        backgroundColor = colorResource(R.color.fondo),
        contentColor = Color.White
    ){
        BottomNavigationItem(
            selected = false,
            onClick = {
                navController.navigate(AppScreen.ThirdScreen.route)
            },
            icon = {
                Image(painter = painterResource(R.drawable.optionsicon), "Options", Modifier.size(40.dp))
            },
            modifier = Modifier.background(color = colorResource(R.color.barraNav))
        )

        Spacer(Modifier.padding(horizontal = 3.dp))

        BottomNavigationItem(
            selected = false,
            onClick = {
                navController.navigate(AppScreen.ThirdScreen.route)
            },
            icon = {
                Image(painter = painterResource(R.drawable.demonicon), "Ghosts", Modifier.size(40.dp))
            },
            modifier = Modifier.background(color = colorResource(R.color.barraNav))
        )

        Spacer(Modifier.padding(horizontal = 3.dp))

        BottomNavigationItem(
            selected = false,
            onClick = {
                navController.navigate(AppScreen.ThirdScreen.route)
            },
            icon = {
                Image(painter = painterResource(R.drawable.usericon), "Ghosts", Modifier.size(40.dp))
            },
            modifier = Modifier.background(color = colorResource(R.color.barraNav))
        )

        Spacer(Modifier.padding(horizontal = 3.dp))

        BottomNavigationItem(
            selected = false,
            onClick = {
                navController.navigate(AppScreen.ThirdScreen.route)
            },
            icon = {
                Image(painter = painterResource(R.drawable.adminicon), "Ghosts", Modifier.size(40.dp))
            },
            modifier = Modifier.background(color = colorResource(R.color.barraNav))
        )
    }
}
