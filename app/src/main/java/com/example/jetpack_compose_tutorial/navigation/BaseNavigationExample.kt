package com.example.jetpack_compose_tutorial.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BaseNavigationExample() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screen1") {
        composable(route = "screen1") {
            Screen1(navController = navController)
        }
        composable(route = "screen2") {
            Screen2(navController = navController)
        }
        composable(route = "screen3") {
            Screen3(navController = navController)
        }
    }
}

@Composable
fun Screen1(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen 1")

        Button(onClick = { navController.navigate("screen2") }) {
            Text(text = "Go to Screen 2")
        }
    }
}

@Composable
fun Screen2(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen 2")

        Button(onClick = { navController.navigate("screen1") }) {
            Text(text = "Back to Screen 1")
        }

        Button(onClick = { navController.navigate("screen3") }) {
            Text(text = "Go to Screen 3")
        }
    }
}

@Composable
fun Screen3(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen 3")

        Button(onClick = { navController.navigate("screen2") }) {
            Text(text = "Back to Screen 2")
        }

        Button(onClick = { navController.navigate("screen1") }) {
            Text(text = "Go to Screen 1")
        }
    }
}