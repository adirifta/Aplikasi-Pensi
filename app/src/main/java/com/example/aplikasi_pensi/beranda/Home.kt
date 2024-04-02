package com.example.aplikasi_pensi.beranda

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplikasi_pensi.R
import com.example.aplikasi_pensi.ui_item.BottomNavigationBar
import com.example.aplikasi_pensi.ui_item.SearchBarM3

@Preview
@Composable
fun Home(){
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 75.dp),
                    contentAlignment = Alignment.TopCenter,
                ){
                    Column(modifier = Modifier.fillMaxWidth()) {
                        SearchBarM3()
                        ImageSlider()
                    }
                    Column(
                        modifier = Modifier.padding(top = 280.dp)
                    ) {
                        TabLayout(selectedTabIndex = 0) { /* handle tab selection */ }
                        CategoryApp()
                    }
                }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            Image(
                painterResource(id = R.drawable.top_bg2),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            )

            Image(painter = painterResource(id = R.drawable.pensi),
                contentDescription = "Login Image",
                modifier = Modifier.size(100.dp))

            Text(
                text = "Galeri",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 90.dp, top = 25.dp)
            )

            Icon(
                imageVector = Icons.Rounded.Notifications,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 310.dp, top = 25.dp)
                    .size(25.dp)
            )

            Icon(
                imageVector = Icons.Rounded.ShoppingCart,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 350.dp, top = 25.dp)
                    .size(25.dp)
            )
        }
    }
}