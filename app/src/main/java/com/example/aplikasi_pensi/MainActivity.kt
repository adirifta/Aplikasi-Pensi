package com.example.aplikasi_pensi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplikasi_pensi.beranda.Home
import com.example.aplikasi_pensi.intro.onboarding.OnBoardingScreen
import com.example.aplikasi_pensi.ui.theme.AplikasiPensiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            AplikasiPensiTheme{
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
                    NavHost(navController = navController, startDestination = "onBoardingScreen") {
                        composable("onBoardingScreen") {
                            OnBoardingScreen(navController = navController)
                        }
                        composable("signInScreen") {
                            SignIn(navController = navController)
                        }
                        composable("register") {
                            Register(navController = navController)
                        }
                        composable("home") {
                            Home()
                        }
                    }

                }
            }
        }
    }
}