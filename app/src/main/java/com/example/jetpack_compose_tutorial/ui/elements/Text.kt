package com.example.jetpack_compose_tutorial.ui.elements

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun BasicTextExample() {
    Text(
        text = "Hello, Jetpack Compose!", // Текст, который будет отображаться
        fontSize = 20.sp, // Размер шрифта
        color = Color.Black // Цвет текста
    )
}

@Preview(showBackground = true)
@Composable
fun StyledTextExample() {
    Text(
        text = "Styled Text",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold, // Толщина шрифта
        color = Color.Blue,
        modifier = Modifier.padding(all = 16.dp) // Модификатор для добавления отступов вокруг текста
    )
}

@Preview(showBackground = true)
@Composable
fun OverflowTextExample() {
    Text(
        text = "This is a very long text that will be truncated if it exceeds the maximum number of lines." +
                "This is a very long text that will be truncated if it exceeds the maximum number of lines." +
                "This is a very long text that will be truncated if it exceeds the maximum number of lines.",
        fontSize = 16.sp,
        maxLines = 2, // Максимальное количество строк для текста
        overflow = TextOverflow.Ellipsis, // Устанавливает поведение переполнения текста (троеточие)
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun SpacingTextExample() {
    Text(
        text = "Text with custom letter and line spacing",
        fontSize = 18.sp,
        letterSpacing = 0.1.em, // Интервал между символами текста
        lineHeight = 24.sp, // Высота строки текста
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun AlignedTextExample() {
    Text(
        text = "Centered Text",
        fontSize = 20.sp,
        textAlign = TextAlign.Center, // Выравнивание текста по центру
        modifier = Modifier // Модификатор для заполнения всей ширины контейнера
            .fillMaxWidth()
            .padding(16.dp)
    )
}