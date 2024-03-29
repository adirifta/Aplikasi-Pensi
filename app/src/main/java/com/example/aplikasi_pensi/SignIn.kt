package com.example.aplikasi_pensi

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SignIn(navController: NavController){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Selamat Datang", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "Masuk Sekarang", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.height(15.dp))
        Image(painter = painterResource(id = R.drawable.logo2),
            contentDescription = "Login Image",
            modifier = Modifier.size(330.dp))

        OutlinedTextField(value = email, onValueChange = {email = it}, label = {
            Text(text = "Email/No. Hp")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = password, onValueChange = {password = it}, label = {
            Text(text = "Kata Sandi")
        }, visualTransformation = PasswordVisualTransformation())

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 260.dp, end = 0.dp)
        ) {
            Text(text = "Lupa Kata Sandi?",
                modifier = Modifier.clickable {  },
                fontSize = 10.sp,
                fontWeight = FontWeight.Light)
        }

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Belum punya akun? Daftar", fontSize = 12.sp, fontWeight = FontWeight.Light)
        Button(onClick = {
            Log.i("Credential", "Email : $email Password : $password")
        }) {
            Text(text = "Masuk")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Atau", fontSize = 12.sp, fontWeight = FontWeight.Light)

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.google),
                contentDescription = "Google",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { /* google */ })

            Image(painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Facebook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { /* facebook */ })
        }
    }
}