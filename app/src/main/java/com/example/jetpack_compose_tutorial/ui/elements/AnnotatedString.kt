package com.example.jetpack_compose_tutorial.ui.elements

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.LocaleList
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun AnnotatedStringExample() {
    val annotatedText = buildAnnotatedString { // Функция для создания AnnotatedString
        append("This is an ")
        // Применяет стили к части строки, например, красный цвет и тонкий шрифт
        withStyle(style = SpanStyle(color = Color.Red, fontWeight = FontWeight.Thin)) {
            append("annotated ")
        }
        append("string.")
    }

    Text(
        text = annotatedText,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ClickableAnnotatedStringExample() {
    val annotatedText = buildAnnotatedString {
        append("Click ")
        // Добавляем ссылку к части текста
        pushStringAnnotation(tag = "URL", annotation = "https://developer.android.com")
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            )
        ) {
            append("here")
        }
        pop()
        append(" to visit Android developer website.")
    }

    val context = LocalContext.current

    // Обрабатывает клики по аннотированному тексту и выполняет действия на основе аннотаций.
    ClickableText(
        text = annotatedText,
        onClick = { offset ->
            annotatedText.getStringAnnotations(tag = "URL", start = offset, end = offset)
                .firstOrNull()?.let { annotation ->
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(annotation.item))
                    context.startActivity(intent)
                }
        },
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun CustomAnnotatedStringExample() {
    val annotatedText = buildAnnotatedString {
        append("Here is a ")
        // Применяем зачеркнутый стиль к части текста
        withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough)) {
            append("strikethrough ")
        }
        append("and a text with different locale settings: ")
        // Устанавливает языковые настройки для части текста, например, японский язык.
        withStyle(style = SpanStyle(localeList = LocaleList("ja-JP"))) {
            append("日本語")
        }
    }

    Text(
        text = annotatedText,
        style = MaterialTheme.typography.displaySmall,
        modifier = Modifier.padding(16.dp)
    )
}