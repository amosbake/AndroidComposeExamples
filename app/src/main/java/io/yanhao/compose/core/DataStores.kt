package io.yanhao.compose.core


data class LearnSection(
    val name: String, val route: AppScreen
)

fun getLearnSections() = AppScreen.values().filter { it != AppScreen.HomeScreen }.map {
        LearnSection(it.name, it)
    }