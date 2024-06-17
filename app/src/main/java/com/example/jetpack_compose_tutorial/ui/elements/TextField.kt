package com.example.jetpack_compose_tutorial.ui.elements

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicTextFieldExample() {
    var text by remember { mutableStateOf("Hello, World!") }

    TextField(
        value = text, // Текущее значение текста в текстовом поле
        onValueChange = { text = it }, // Лямбда-функция, вызываемая при изменении текста
        label = { Text("Enter text") }, // Метка, отображаемая над текстовым полем
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun BasicOutlinedTextFieldExample() {
    var text by remember { mutableStateOf("Hello, Compose!") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Enter text") },
        modifier = Modifier.padding(16.dp)
    )
}