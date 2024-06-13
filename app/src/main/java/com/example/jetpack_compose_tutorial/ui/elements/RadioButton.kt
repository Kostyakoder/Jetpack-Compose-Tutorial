package com.example.jetpack_compose_tutorial.ui.elements

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun CustomRadioButtonExample() {
    var selected by remember { mutableStateOf(false) }

    Row {
        RadioButton(
            selected = selected,
            onClick = { selected = !selected },
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Green,
                unselectedColor = Color.Red
            ),
            enabled = true
        )
        Text(text = if (selected) "Selected" else "Not Selected")
        RadioButton(
            selected = !selected,
            onClick = { selected = !selected },
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Green,
                unselectedColor = Color.Red
            ),
            enabled = true
        )
        Text(text = if (!selected) "Selected" else "Not Selected")
    }
}