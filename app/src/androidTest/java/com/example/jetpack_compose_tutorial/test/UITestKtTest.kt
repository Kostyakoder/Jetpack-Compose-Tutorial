package com.example.jetpack_compose_tutorial.test

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UITestKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun uiTest1() {
        // Устанавливаем контент для тестирования
        composeTestRule.setContent { UITest1() }
        // Проверяем, что начальный текст отображается
        composeTestRule.onNodeWithText("Hello, World!").assertExists()
        // Выполняем клик по кнопке с текстом "Click me"
        composeTestRule.onNodeWithText("Click me").performClick()
        // Проверяем, что текст обновился
        composeTestRule.onNodeWithText("Button Clicked!").assertTextEquals("Button Clicked!")
    }

    @Test
    fun uiTest2() {
        // Устанавливаем контент для тестирования
        composeTestRule.setContent { UITest2() }
        // Вводим текст "Compose Testing"
        composeTestRule.onNodeWithText("Enter text").performTextInput("Compose Testing")
        // Проверяем, что текст отображается правильно
        composeTestRule.onNodeWithText("You entered: Compose Testing").assertExists()
    }

    @Test
    fun uiTest3() {
        // Устанавливаем контент для тестирования
        composeTestRule.setContent { UITest3() }
        // Проверяем, что загрузка не завершилась, если превышено время ожидания
        composeTestRule.waitUntil(timeoutMillis = 2000) {
            composeTestRule.onAllNodesWithText("Data from server").fetchSemanticsNodes()
                .isNotEmpty()
        }
    }
}