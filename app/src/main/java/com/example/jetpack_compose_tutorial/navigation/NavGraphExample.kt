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
import androidx.navigation.navigation

@Composable
fun NavGraphExample() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        // Вложенный граф для "Home"
        navigation(startDestination = "homeScreen", route = "home") {
            composable("homeScreen") { HomeScreen(navController) }
            composable("detailsScreen") { HomeDetailsScreen(navController) }
        }
        // Вложенный граф для "Profile"
        navigation(startDestination = "profileScreen", route = "profile") {
            composable("profileScreen") { ProfileScreen(navController) }
            composable("settingsScreen") { ProfileSettingsScreen(navController) }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Home Screen")

        Button(onClick = { navController.navigate("detailsScreen") }) {
            Text(text = "Go to Details Screen")
        }
    }
}

@Composable
fun HomeDetailsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Home Details Screen")

        Button(onClick = { navController.navigate("profileScreen") }) {
            Text(text = "Go to Profile Screen")
        }
    }
}

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Profile Screen")

        Button(onClick = { navController.navigate("settingsScreen") }) {
            Text(text = "Go to Settings Screen")
        }
    }
}

@Composable
fun ProfileSettingsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Profile Settings Screen")

        Button(onClick = { navController.navigate("homeScreen") }) {
            Text(text = "Go to Home Screen")
        }
    }
}