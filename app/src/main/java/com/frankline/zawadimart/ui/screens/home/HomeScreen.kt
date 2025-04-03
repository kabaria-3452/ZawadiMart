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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frankline.zawadimart.R

@Composable
fun HomeScreen(){
    Column (
        modifier = Modifier.fillMaxSize()
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
             onClick = {},
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
     HomeScreen()



}