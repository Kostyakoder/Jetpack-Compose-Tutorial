package com.example.jetpack_compose_tutorial.ui.containers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicRowExample() {
    Row(modifier = Modifier.padding(16.dp)) {
        Text(text = "Item 1")
        Text(text = "Item 2")
        Text(text = "Item 3")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomRowExample() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween, // Распределение элементов с равными отступами
        verticalAlignment = Alignment.CenterVertically, // Выравнивание элементов по центру вертикально
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Item 1")
        Text(text = "Item 2")
        Text(text = "Item 3")
    }
}