package com.example.jetpack_compose_tutorial.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BottomAppBarExample() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                contentColor = Color.White,
                containerColor = Color.Gray,
                tonalElevation = NavigationBarDefaults.Elevation
            ) {
                IconButton(onClick = { /* Handle navigation icon press */ }) {
                    Icon(Icons.Filled.Menu, contentDescription = "Menu")
                }
                Spacer(modifier = Modifier.weight(1f, true))
                IconButton(onClick = { /* Handle search icon press */ }) {
                    Icon(Icons.Filled.Search, contentDescription = "Search")
                }
                Spacer(modifier = Modifier.weight(1f, true))
                IconButton(onClick = { /* Handle settings icon press */ }) {
                    Icon(Icons.Filled.Settings, contentDescription = "Settings")
                }
            }
        },
        content = { innerPadding ->
            Text(text = "Main Content", modifier = Modifier.padding(innerPadding))
        }
    )
}