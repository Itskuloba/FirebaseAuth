package com.example.firebaseauth.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauth.data.Productviewmodel
import com.example.firebaseauth.navigation.ROUTE_ADD_PRODUCT
import com.example.firebaseauth.navigation.ROUTE_VIEW_PRODUCT

@Composable
fun HomeScreen(navController: NavHostController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
        var productdata=Productviewmodel(navController,context)

        Text(text = "Welcome to Home page",
            color = Color.Magenta,
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp)

        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCT)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add product")

        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = {
            navController.navigate(ROUTE_VIEW_PRODUCT)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "View product")

        }

    }

}

@Preview
@Composable
fun Homepreview() {
    HomeScreen(rememberNavController())

}