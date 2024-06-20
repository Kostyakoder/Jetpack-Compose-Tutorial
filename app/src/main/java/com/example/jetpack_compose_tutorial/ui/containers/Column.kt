package com.example.jetpack_compose_tutorial.ui.containers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicColumnExample() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Item 1")
        Text(text = "Item 2")
        Text(text = "Item 3")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomColumnExample() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween, // Распределение элементов с равными отступами
        horizontalAlignment = Alignment.CenterHorizontally, // Выравнивание элементов по центру
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Item 1")
        Text(text = "Item 2")
        Text(text = "Item 3")
    }
}

@Preview(showBackground = true)
@Composable
fun WeightedColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Item 1",
            modifier = Modifier
                .weight(1f)
                .background(Color.Red) // Элемент занимает 1/4 часть пространства
        )
        Text(
            text = "Item 2",
            modifier = Modifier
                .weight(2f)
                .background(Color.Green) // Элемент занимает 2/4 части пространства
        )
        Text(
            text = "Item 3",
            modifier = Modifier
                .weight(1f)
                .background(Color.Blue) // Элемент занимает 1/4 часть пространства
        )
    }
}