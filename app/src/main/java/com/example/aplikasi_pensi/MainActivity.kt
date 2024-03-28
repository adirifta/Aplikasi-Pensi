package com.example.aplikasi_pensi

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplikasi_pensi.ui.theme.AplikasiPensiTheme

class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            OnBoardingComposeTheme{
//                val navController = rememberNavController()
//                SetupNavGraph(navController = navController)
//            }
//        }
//    }
}


//@Composable
//fun navigation(){
//
//    val navController = rememberNavController()
//    NavHost(
//        navController = navController,
//        startDestination = "splash_screen"
//    ){
//        composable("splash_screen"){
//            SplashScreen(navController = navController)
//        }
//
//        composable("main_screen"){
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAligment = Alignment.CenterHorizontally
//            ){
//                Text(text = "Main Screen", fontSize = 30.sp, fontWeight = FontWeight.)
//            }
//        }
//    }
//}