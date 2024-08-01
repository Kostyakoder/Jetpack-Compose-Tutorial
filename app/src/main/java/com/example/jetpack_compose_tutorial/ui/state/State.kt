package com.example.jetpack_compose_tutorial.ui.state

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun State() {
    val count = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: ${count.value}")
        Button(
            onClick = { count.value++ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Increment")
        }
    }
}

@Composable
fun Variable() {
    var count = 0

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count")
        Button(
            onClick = {
                count++
                Log.e("Count", count.toString())
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Increment")
        }
    }
}

@Composable
fun TextFieldExample() {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter text") },
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(text = "You typed: $text")
    }
}

@Composable
fun ChangeState() {
    val text = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = text.value,
            onValueChange = { text.value = it },
            label = { Text("Enter text") },
            modifier = Modifier.padding(bottom = 8.dp)
        )

        TextString(text = text)
    }
}

@Composable
fun TextString(text: MutableState<String>) {
    Text(
        modifier = Modifier.clickable { text.value = "" },
        text = text.value
    )
}

@Composable
fun SaveableCounterExample() {
    val count = rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: ${count.value}")
        Button(
            onClick = { count.value++ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Increment")
        }
    }
}
