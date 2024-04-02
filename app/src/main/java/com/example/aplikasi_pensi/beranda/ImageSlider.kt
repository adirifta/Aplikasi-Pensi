package com.example.aplikasi_pensi.beranda

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aplikasi_pensi.R
import kotlinx.coroutines.delay

@Composable
fun ImageSlider(modifier: Modifier = Modifier){
    val images = listOf(
        R.drawable.grid1,
        R.drawable.grid2,
        R.drawable.grid3
    )
    ImageSliderWithIndicator(images = images)
}

@Composable
fun ImageSliderItem(imageRes: Int){
    Box(
        modifier = Modifier
            .padding(start = 15.dp, end = 15.dp)
            .fillMaxWidth()
            .height(170.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(450.dp)
        )
    }
}

@Composable
fun Indicator(active: Boolean) {
    val color = if (active) colorResource(id = R.color.navy_blue) else Color.Gray
    val size = if (active) 10.dp else 10.dp
    Box (
        modifier = Modifier
            .clip(CircleShape)
            .background(color)
            .size(size)
    )
}

@Composable
fun ImageSliderWithIndicator(images: List<Int>){
    val currentIndex = remember {
        mutableStateOf(0)
    }

    LaunchedEffect(Unit) {
        while (true){
            delay(3000)
            currentIndex.value = (currentIndex.value + 1) % images.size
        }
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .padding(top = 10.dp)
                .weight(1f)
        ) {
            ImageSliderItem(imageRes = images[currentIndex.value])
        }
        Row(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .padding(start = 180.dp, bottom = 390.dp)
        ) {
            images.forEachIndexed { index, i ->
                Indicator(active = index == currentIndex.value)
                if (index < images.size - 1){
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }
        }
    }
}