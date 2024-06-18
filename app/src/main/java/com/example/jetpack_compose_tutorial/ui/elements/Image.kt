package com.example.jetpack_compose_tutorial.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_tutorial.R

@Preview(showBackground = true)
@Composable
fun BasicImageExample() {
    Image(
        // Используется для загрузки изображения из ресурсов
        painter = painterResource(id = R.drawable.ic_launcher_background),
        // Описание изображения для обеспечения доступности
        contentDescription = "Sample Image",
        modifier = Modifier.size(128.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun CustomImageExample() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Custom Image",
        contentScale = ContentScale.Crop, // Установка масштаба содержимого
        alpha = 0.8f, // Установка прозрачности
        colorFilter = ColorFilter.tint(Color.Blue), // Наложение цветового фильтра
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun ClippedImageExample() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Clipped Image",
        modifier = Modifier
            .size(128.dp)
            .clip(CircleShape) // Обрезка изображения в форму круга
            .border(2.dp, Color.Red, CircleShape) // Добавление красной границы вокруг изображения
            .padding(16.dp)
    )
}