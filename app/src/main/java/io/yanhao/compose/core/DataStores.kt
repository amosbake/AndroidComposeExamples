package io.yanhao.compose.core

import io.yanhao.compose.AppScreen

data class LearnSection(
    val name:String,
    val route:AppScreen
)

fun getLearnSections() = listOf(
    LearnSection("Simple Text",AppScreen.ScreenSimpleText)
)