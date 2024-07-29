package com.example.jetpack_compose_tutorial.ui.containers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun CustomFlowRowWithDifferentSizesExample() {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp), // Расстояние между элементами по горизонтали
        verticalArrangement = Arrangement.spacedBy(8.dp), // Расстояние между элементами по вертикали
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Item 1",
            modifier = Modifier
                .size(60.dp)
                .background(Color.Cyan)
                .padding(8.dp)
        )
        Text(
            text = "Item 2",
            modifier = Modifier
                .size(100.dp)
                .background(Color.Magenta)
                .padding(8.dp)
        )
        Text(
            text = "Item 3",
            modifier = Modifier
                .size(200.dp)
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Item 4",
            modifier = Modifier
                .size(120.dp)
                .background(Color.Green)
                .padding(8.dp)
        )
        Text(
            text = "Item 5",
            modifier = Modifier
                .size(70.dp)
                .background(Color.Blue)
                .padding(8.dp)
        )
    }
}