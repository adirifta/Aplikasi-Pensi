package com.example.aplikasi_pensi.ui_item

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FilterList
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplikasi_pensi.ui.theme.AplikasiPensiTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarM3(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Row(modifier = modifier.width(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Icon(imageVector = Icons.Outlined.FilterList, contentDescription = null, modifier = modifier.size(50.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                leadingIcon = { Icon(imageVector = Icons.Outlined.Search,
                    contentDescription = null)},
                placeholder = {Text(text = "Search here")})
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainSearch(){
    AplikasiPensiTheme {
        SearchBarM3()
    }
}