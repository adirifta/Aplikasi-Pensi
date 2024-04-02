package com.example.aplikasi_pensi.beranda

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val categories = listOf("Patung", "Lukisan", "Grafis")
val karyaCount = listOf(300, 500, 1000)
@Composable
fun CategoryApp() {
    Column {
        Text(text = "Kategori", style = MaterialTheme.typography.labelMedium)
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Semua", modifier = Modifier.weight(1f))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = ">", modifier = Modifier.weight(0.1f))
        }
        TabRow(selectedTabIndex = 0) {
            categories.forEachIndexed { index, category ->
                Tab(
                    text = { Text(category) },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            categories.forEachIndexed { index, category ->
                Text(text = karyaCount[index].toString() + " karya", modifier = Modifier.weight(1f))
            }
        }
    }
}