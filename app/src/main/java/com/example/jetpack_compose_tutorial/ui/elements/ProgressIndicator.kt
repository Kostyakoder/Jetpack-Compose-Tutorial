package com.example.jetpack_compose_tutorial.ui.elements

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicLinearProgressIndicator() {
    LinearProgressIndicator(
        progress = 0.5f, // Текущий прогресс от 0.0 до 1.0 ,
        color = MaterialTheme.colorScheme.onSurface, // Настройка цвета индикатора
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun BasicCircularProgressIndicator() {
    CircularProgressIndicator(
        progress = 0.75f, // Текущий прогресс от 0.0 до 1.0
        strokeWidth = ProgressIndicatorDefaults.CircularStrokeWidth * 2, // Увеличение толщины индикатора
        modifier = Modifier.size(48.dp)
    )
}