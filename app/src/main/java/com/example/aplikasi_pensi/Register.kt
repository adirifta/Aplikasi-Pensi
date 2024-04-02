package com.example.aplikasi_pensi

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Register(navController: NavController) {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(id = R.drawable.top_bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Masuk Sekarang", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.height(15.dp))
        Image(painter = painterResource(id = R.drawable.logo2),
            contentDescription = "Login Image",
            modifier = Modifier.size(250.dp))

        Text(text = "Halo selamat datang!!", fontSize = 15.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "Mari mulai membuat akun Anda", fontSize = 15.sp, fontWeight = FontWeight.Medium)

        Spacer(modifier = Modifier.height(9.dp))
        OutlinedTextField(value = email, onValueChange = {email = it}, label = {
            Text(text = "Nama Lengkap")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = email, onValueChange = {email = it}, label = {
            Text(text = "Email/No. Hp")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = password, onValueChange = {password = it}, label = {
            Text(text = "Kata Sandi")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Belum punya akun?",
                fontSize = 12.sp,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Masuk",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    navController.navigate("signInScreen")
                }
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth(0.5f),
            onClick = {
//            Log.i("Credential", "Email : $email Password : $password")
            navController.navigate("signInScreen")
        }) {
            Text(text = "Daftar")
        }
    }
}