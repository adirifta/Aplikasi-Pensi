package com.example.aplikasi_pensi.ui_item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Collections
import androidx.compose.material.icons.rounded.Forum
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person3
import androidx.compose.material.icons.rounded.VideoLibrary
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.aplikasi_pensi.R

val items = listOf(
    BottomNavigation(
        title = "Beranda",
        icon = Icons.Rounded.Home,
        name = "Beranda"
    ),
    BottomNavigation(
        title = "Konten",
        icon = Icons.Rounded.Collections,
        name = "Konten"
    ),
    BottomNavigation(
        title = "Forum",
        icon = Icons.Rounded.Forum,
        name = "Forum"
    ),
    BottomNavigation(
        title = "Live",
        icon = Icons.Rounded.VideoLibrary,
        name = "Live"
    ),
    BottomNavigation(
        title = "Profile",
        icon = Icons.Rounded.Person3,
        name = "Profile"
    ),
)

@Composable
fun BottomNavigationBar(){
    NavigationBar {
        Row(
            modifier = Modifier
                .background(colorResource(id = R.color.navy_blue),
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                )
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem (
                    selected = index == 0,
                    onClick = {},
                    icon = {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title,
                                tint = colorResource(id = R.color.white)
                            )
                            Text(
                                text = item.name,
                                style = MaterialTheme.typography.labelMedium,
                                color = colorResource(id = R.color.white),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }
    }
}