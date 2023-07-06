package io.yanhao.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            App()
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()

    val currentScreen = AppScreen.valueOf(
        backStackEntry?.destination?.route ?: AppScreen.HomeScreen.name
    )

    Scaffold(
        topBar = {
            CommonTopAppBar(
                curScreen = currentScreen,
                canNavigationBack = navController.previousBackStackEntry != null,
                navigationUp = {navController.navigateUp()})
        }
    ) {innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            AppNavHost(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CommonTopAppBar(
    curScreen: AppScreen,
    canNavigationBack: Boolean,
    navigationUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(text = curScreen.title)
        },
        modifier = modifier,
        navigationIcon = { NavigationIcon(canNavigationBack, navigationUp)}
    )
}

@Composable
private fun NavigationIcon( canNavigationBack: Boolean,
                            navigationUp: () -> Unit){
    if (canNavigationBack){
        IconButton(onClick = navigationUp) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
        }
    }
}

@Composable
private fun AppNavHost(
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
    }
}