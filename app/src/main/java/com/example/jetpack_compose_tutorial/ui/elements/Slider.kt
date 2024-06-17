package com.example.jetpack_compose_tutorial.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BasicSliderExample() {
    var sliderPosition by remember { mutableFloatStateOf(15f) }

    Slider(
        value = sliderPosition, // Текущее значение ползунка
        onValueChange = { sliderPosition = it }, // Лямбда-функция, вызываемая при изменении значения ползунка
        valueRange = 0f..100f // Диапазон допустимых значений для ползунка
    )
}

@Preview(showBackground = true)
@Composable
fun CustomSliderExample() {
    var sliderPosition by remember { mutableFloatStateOf(55f) }

    Slider(
        value = sliderPosition,
        onValueChange = { sliderPosition = it },
        valueRange = 0f..100f,
        steps = 4, // Количество промежуточных шагов между минимальным и максимальным значениями
        colors = SliderDefaults.colors(
            thumbColor = Color.Red, // Цвет ползунка
            activeTrackColor = Color.Green, // Цвет части которая уже пройдена ползунком
            inactiveTrackColor = Color.Gray // Цвет части которая еще не пройдена ползунком
        ),
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun AdvancedSliderExample() {
    var sliderPosition by remember { mutableFloatStateOf(50f) }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Value: ${sliderPosition.toInt()}")
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..100f,
            steps = 10,
            colors = SliderDefaults.colors(
                thumbColor = Color.Blue,
                activeTrackColor = Color.Cyan,
                inactiveTrackColor = Color.LightGray
            )
        )
    }
}