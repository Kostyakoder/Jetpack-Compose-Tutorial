package com.example.jetpack_compose_tutorial.ui.containers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun BasicLazyColumnExample() {
    val itemsList = List(100) { "Item #$it" }
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(itemsList) { item ->
            Text(text = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomLazyColumnExample() {
    val itemsList = List(20) { "Item #$it" }
    LazyColumn(
        contentPadding = PaddingValues(16.dp), // Отступы вокруг списка
        verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
    ) {
        items(itemsList) { item ->
            Text(
                text = item,
                modifier = Modifier.padding(8.dp) // Внутренние отступы для каждого элемента
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyColumnWithHeadersExample() {
    val section1Items = List(5) { "Section 1 - Item #$it" }
    val section2Items = List(5) { "Section 2 - Item #$it" }

    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        item {
            Text(
                text = "Section 1",
                modifier = Modifier.padding(vertical = 8.dp),
                style = androidx.compose.ui.text.TextStyle.Default.copy(
                    fontSize = 20.sp
                )
            )
        }
        items(section1Items) { item ->
            BasicText(
                text = item,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
        item {
            Text(
                text = "Section 2",
                modifier = Modifier.padding(vertical = 8.dp),
                style = androidx.compose.ui.text.TextStyle.Default.copy(
                    fontSize = 20.sp
                )
            )
        }
        items(section2Items) { item ->
            BasicText(
                text = item,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }
}