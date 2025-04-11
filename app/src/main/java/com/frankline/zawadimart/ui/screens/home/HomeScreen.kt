package com.frankline.zawadimart.ui.screens.home
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.frankline.zawadimart.R
import com.frankline.zawadimart.navigation.ROUT_START
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.frankline.zawadimart.navigation.ROUT_ABOUT
import com.frankline.zawadimart.navigation.ROUT_DASHBOARD
import com.frankline.zawadimart.navigation.ROUT_HOME
import com.frankline.zawadimart.navigation.ROUT_INTENT
import com.frankline.zawadimart.navigation.ROUT_ITEM
import com.frankline.zawadimart.ui.screens.dashboard1.DashbaordScreen
import com.frankline.zawadimart.ui.screens.home.AboutScreen
import com.frankline.zawadimart.ui.screens.home.HomeScreen
import com.frankline.zawadimart.ui.screens.intent.IntentScreen
@Composable
fun HomeScreen(navController: NavController){
    Column (

        modifier = Modifier.fillMaxSize()
            .paint(painter = painterResource(R.drawable.truff), contentScale = ContentScale.FillBounds)
    ){



        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
            color = Color.Magenta,
            textDecoration = TextDecoration.Underline,
        )


        Text(
            text = "Welcome to my Ecommerce App",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic,
        )

        Image(

            painter = painterResource(R.drawable.photo),
            contentDescription = "bag"
        )



         Button(
             onClick = {
                 navController.navigate(ROUT_START)
             },
             colors = ButtonDefaults.buttonColors(Color.Magenta),
             shape = RoundedCornerShape(10.dp)
         ) {
           Text(text = "Add to Cart")

         }





    }



}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
     HomeScreen(rememberNavController())


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
            AboutScreen(navController)
        }
        composable(ROUT_START) {
            AboutScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            DashbaordScreen(navController)
        }

    }

    }




}