package io.yanhao.compose.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.yanhao.compose.HomeScreen
import io.yanhao.compose.text.CustomTextScreen
import io.yanhao.compose.text.SimpleTextScreen

@Composable
fun AppNavHost(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = AppScreen.HomeScreen.name
    ){
        composable(route = AppScreen.HomeScreen.name){
            HomeScreen(navController)
        }
        composable(route = AppScreen.ScreenSimpleText.name){
            SimpleTextScreen()
        }
        composable(route = AppScreen.CustomText.name){
            CustomTextScreen()
        }
    }
}

enum class AppScreen(val title:String) {
    HomeScreen(title = "Home"),
    ScreenSimpleText(title = "SimpleText"),
    CustomText(title = "自定义样式文本")
}