package com.example.jetpack_compose_tutorial.ui.containers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicBoxExample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(
            text = "Top Left",
            modifier = Modifier
                .align(Alignment.TopStart)
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Center",
            modifier = Modifier
                .align(Alignment.Center)
                .background(Color.Green)
                .padding(8.dp)
        )
        Text(
            text = "Bottom Right",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .background(Color.Blue)
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CustomBoxExample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        contentAlignment = Alignment.Center // Центрирование всех элементов внутри Box
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green)
                .align(Alignment.TopEnd) // Переопределение выравнивания для конкретного элемента
        )
        Box(
            modifier = Modifier
                .matchParentSize() // Заставляет элемент заполнить весь размер родителя Box
                .background(Color.Blue.copy(alpha = 0.3f))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoxWithConstraintsExample() {
    // Специальная версия Box, которая позволяет реагировать на изменения ограничений размера контейнера
    BoxWithConstraints {
        val boxSize = if (maxWidth < 300.dp) 100.dp else 200.dp

        Box(
            modifier = Modifier
                .size(boxSize)
                .background(Color.Magenta)
        )
    }
}