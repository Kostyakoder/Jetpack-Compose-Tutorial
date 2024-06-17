package com.example.jetpack_compose_tutorial.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicSwitchExample() {
    var isChecked by remember { mutableStateOf(false) }

    Column {
        Switch(
            checked = isChecked, // Определяет текущее состояние переключателя (включено или выключено)
            onCheckedChange = {
                isChecked = it
            }, // Лямбда-функция, вызываемая при изменении состояния переключателя
            modifier = Modifier.padding(16.dp)
        )
        Text(text = if (isChecked) "Switch is ON" else "Switch is OFF")

        Switch(
            checked = !isChecked, // Определяет текущее состояние переключателя (включено или выключено)
            onCheckedChange = {
                isChecked = it
            }, // Лямбда-функция, вызываемая при изменении состояния переключателя
            modifier = Modifier.padding(16.dp)
        )
        Text(text = if (!isChecked) "Switch is ON" else "Switch is OFF")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomSwitchExample() {
    var isChecked by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {
        Switch(
            checked = isChecked,
            onCheckedChange = { isChecked = it },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Green, // Цвет ползунка в состоянии включено
                uncheckedThumbColor = Color.Red, // Цвет ползунка в состоянии выключено
                checkedTrackColor = Color.LightGray, // Цвет трека в состоянии включено
                uncheckedTrackColor = Color.DarkGray // Цвет трека в состоянии выключено
            ),
            enabled = true // Определяет, активен ли переключатель и может ли быть изменен пользователем
        )
        Text(text = if (isChecked) "Switch is ON" else "Switch is OFF")

        Switch(
            checked = !isChecked,
            onCheckedChange = { isChecked = it },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Green,
                uncheckedThumbColor = Color.Red,
                checkedTrackColor = Color.LightGray,
                uncheckedTrackColor = Color.DarkGray
            ),
            enabled = true
        )
        Text(text = if (!isChecked) "Switch is ON" else "Switch is OFF")
    }
}