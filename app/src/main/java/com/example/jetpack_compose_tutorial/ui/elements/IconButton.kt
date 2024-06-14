package com.example.jetpack_compose_tutorial.ui.elements

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun BasicIconButtonExample() {
    IconButton(
        // Модификатор, задающий отступы внутри кнопки
        modifier = Modifier.padding(ButtonDefaults.ContentPadding),
        onClick = { Log.i("Click", "Button click") }) {
        // Иконка, отображаемая внутри кнопки
        Icon(Icons.Filled.Favorite, contentDescription = "Favorite")
    }
}

@Preview(showBackground = true)
@Composable
fun BasicIconToggleButtonExampleFalse() {
    var checked by remember { mutableStateOf(false) }

    IconToggleButton(
        // Определяет текущее состояние кнопки
        checked = checked,
        // Лямбда-функция, вызываемая при изменении состояния кнопки
        onCheckedChange = { checked = it }
    ) {
        Icon(
            imageVector = if (checked) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
            contentDescription = if (checked) "Unfavorite" else "Favorite"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BasicIconToggleButtonExampleTrue() {
    var checked by remember { mutableStateOf(true) }

    IconToggleButton(
        // Определяет текущее состояние кнопки
        checked = checked,
        // Лямбда-функция, вызываемая при изменении состояния кнопки
        onCheckedChange = { checked = it }
    ) {
        Icon(
            imageVector = if (checked) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
            contentDescription = if (checked) "Unfavorite" else "Favorite"
        )
    }
}