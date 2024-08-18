package com.example.jetpack_compose_tutorial.navigation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BackStackExample() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") {
            BackStackScreen1(navController = navController)
        }
        composable("screen2") {
            BackStackScreen2(navController = navController)
        }
        composable("screen3") {
            BackStackScreen3(navController = navController)
        }
    }
}

@Composable
fun BackStackScreen1(navController: NavHostController) {
    Button(onClick = { navController.navigate("screen2") }) {
        Text(text = "Go to Screen 2")
    }
}

@Composable
fun BackStackScreen2(navController: NavHostController) {
    Button(onClick = { navController.navigate("screen3") }) {
        Text(text = "Go to Screen 3")
    }
}

@Composable
fun BackStackScreen3(navController: NavHostController) {
    Button(onClick = { navController.popBackStack("screen1", inclusive = false) }) {
        Text(text = "Back to Screen 1")
    }
}