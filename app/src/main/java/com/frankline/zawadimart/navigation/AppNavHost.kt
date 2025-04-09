package com.frankline.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.frankline.zawadimart.navigation.ROUT_ABOUT
import com.frankline.zawadimart.navigation.ROUT_DASHBOARD
import com.frankline.zawadimart.navigation.ROUT_HOME
import com.frankline.zawadimart.navigation.ROUT_INTENT
import com.frankline.zawadimart.navigation.ROUT_ITEM
import com.frankline.zawadimart.navigation.ROUT_SERVICE
import com.frankline.zawadimart.navigation.ROUT_START
import com.frankline.zawadimart.ui.screens.dashboard1.DashbaordScreen
import com.frankline.zawadimart.ui.screens.dashboard1.DashbaordScreen
import com.frankline.zawadimart.ui.screens.home.AboutScreen
import com.frankline.zawadimart.ui.screens.home.HomeScreen
import com.frankline.zawadimart.ui.screens.intent.IntentScreen
import com.frankline.zawadimart.ui.screens.item.ItemScreen
import com.frankline.zawadimart.ui.screens.service.ServiceScreen
import com.frankline.zawadimart.ui.screens.startscreen.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            DashbaordScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }



    }

}




