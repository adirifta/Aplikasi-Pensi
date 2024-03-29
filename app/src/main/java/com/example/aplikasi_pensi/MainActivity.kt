package com.example.aplikasi_pensi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import com.example.aplikasi_pensi.ui.theme.AplikasiPensiTheme
import com.example.aplikasi_pensi.intro.onboarding.OnBoardingScreen
import com.example.aplikasi_pensi.intro.onboarding.SetupNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplikasiPensiTheme{
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
                    SetupNavigation()
                }
            }
        }
    }
}