package com.example.jetpack_compose_tutorial.ui.elements

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicButtonExample() {
    Button(
        // Лямбда-функция, которая вызывается при нажатии на кнопку
        onClick = { Log.i("Click", "Button click") }
    ) {
        // Текст, отображаемый внутри кнопки
        Text("Click Me")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomButtonExample() {
    Button(
        onClick = { Log.i("Click", "Button click") },
        enabled = true, // Определяет, может ли кнопка быть нажата
        elevation = ButtonDefaults.elevatedButtonElevation(8.dp), // Устанавливает высоту тени
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red) // Задает цвет кнопки
    ) {
        Text("Custom Button")
    }
}