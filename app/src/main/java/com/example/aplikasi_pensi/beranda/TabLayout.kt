package com.example.aplikasi_pensi.beranda
//
//import androidx.compose.animation.Animatable
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Tab
//import androidx.compose.material.TabRow
//import androidx.compose.material.TabRowDefaults
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.colorResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.aplikasi_pensi.R
//import com.google.accompanist.pager.ExperimentalPagerApi
//import com.google.accompanist.pager.HorizontalPager
//import com.google.accompanist.pager.pagerTabIndicatorOffset
//import com.google.accompanist.pager.rememberPagerState
//import kotlinx.coroutines.launch
//
//var Denim = Color(0xFF1D5AA6)
//
//@OptIn(ExperimentalPagerApi::class)
//@Composable
//fun TabLayout() {
//    val tabItems = listOf("Terkait", "Terbaru", "Terlaris")
//    val pagerState = rememberPagerState()
//    val coroutineScope = rememberCoroutineScope()
//
//    Surface(color = Color.Transparent) {
//        Column {
//            TabRow(
//                selectedTabIndex = pagerState.currentPage,
//                backgroundColor = colorResource(id = R.color.navy_blue),
//                modifier = Modifier.padding(all = 20.dp),
//                indicator = { tabPositions ->
//                    TabRowDefaults.Indicator(
//                        modifier = Modifier
//                            .pagerTabIndicatorOffset(pagerState, tabPositions)
//                            .background(Color.Transparent)
//                    )
//                }
//            ) {
//                tabItems.forEachIndexed { index, title ->
//                    val textColor = remember {
//                        Animatable(Denim)
//                    }
//
//                    LaunchedEffect(pagerState.currentPage) {
//                        textColor.animateTo(if (pagerState.currentPage == index) Color.White else Denim)
//                    }
//
//                    Tab(
//                        selected = pagerState.currentPage == index,
//                        onClick = {
//                            coroutineScope.launch {
//                                pagerState.animateScrollToPage(index)
//                            }
//                        },
//                        modifier = Modifier
//                            .background(
//                                color = textColor.value,
//                                shape = RoundedCornerShape(30.dp)
//                            )
//                    ) {
//                        val textStyle = TextStyle(
//                            color = if (pagerState.currentPage == index) Color.Blue else Denim,
//                            fontSize = if (pagerState.currentPage == index) 18.sp else 16.sp
//                        )
//                        Text(
//                            text = title,
//                            style = textStyle
//                        )
//                    }
//                }
//            }
//            HorizontalPager(
//                count = tabItems.size,
//                state = pagerState,
//                modifier = Modifier.fillMaxSize(),
//            ) { page ->
//                Text(
//                    text = tabItems[page],
//                    modifier = Modifier.padding(50.dp),
//                    color = Color.White
//                )
//            }
//        }
//    }
//}

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TabLayout(
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit
) {
    val tabs = listOf("Terkait", "Terbaru", "Terlaris")

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 8.dp)
    ) {
        tabs.forEachIndexed { index, title ->
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 4.dp)
                    .clickable { onTabSelected(index) },
                color = if (index == selectedTabIndex) MaterialTheme.colorScheme.primary else Color.Transparent
            ) {
                Text(
                    text = title,
                    color = if (index == selectedTabIndex) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewTabLayout() {
    TabLayout(selectedTabIndex = 0, onTabSelected = {}) // Ganti parameter sesuai kebutuhan
}
