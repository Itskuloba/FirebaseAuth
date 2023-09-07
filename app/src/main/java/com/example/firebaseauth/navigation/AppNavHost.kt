package com.example.firebaseauth.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauth.ui.theme.screens.about.AboutScreen
import com.example.firebaseauth.ui.theme.screens.home.HomeScreen
import com.example.firebaseauth.ui.theme.screens.login.LoginScreen
import com.example.firebaseauth.ui.theme.screens.products.AddProductScreen
import com.example.firebaseauth.ui.theme.screens.products.UpdateProductScreen
import com.example.firebaseauth.ui.theme.screens.products.ViewProductScreen
import com.example.firebaseauth.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_LOGIN) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT){
            UpdateProductScreen(navController)
        }
    }

}