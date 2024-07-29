package com.example.jetpack_compose_tutorial.ui.containers

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicSurfaceExample() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        tonalElevation = 16.dp // Добавление тени
    ) {
        Text(
            text = "Hello, Surface!",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CustomSurfaceExample() {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(16.dp), // Задание формы с скругленными углами
        border = BorderStroke(1.dp, Color.Black), // Добавление границы
        modifier = Modifier.size(200.dp)
    ) {
        Text(
            text = "Styled Surface",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ClickableSurfaceExample() {
    val clicked = remember { mutableStateOf(false) }

    Surface(
        color = if (clicked.value) Color.Green else Color.Red,
        modifier = Modifier
            .size(200.dp)
            .clickable { clicked.value = !clicked.value } // Добавление кликабельности
    ) {
        Text(
            text = if (clicked.value) "Clicked!" else "Click Me",
            color = Color.White,
            modifier = Modifier.padding(16.dp)
        )
    }
}