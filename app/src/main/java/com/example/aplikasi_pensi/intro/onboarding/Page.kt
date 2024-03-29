package com.example.aplikasi_pensi.intro.onboarding

import androidx.annotation.DrawableRes
import com.example.aplikasi_pensi.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
    val imageSizeFraction: Float
)


val pages = listOf(
    Page(
        title = "",
        description = "Jual beli karya seni rupa nusantara dengan mudah dan berkualitas hanya dalam genggamanmu saja.",
        image = R.drawable.intro1,
        imageSizeFraction = 0.55f
    ),
    Page(
        title = "FITUR CANGGIH",
        description = "Ada fitur AR yang siap menemani pengalaman belanjamu supaya lebih interaktif.",
        image = R.drawable.intro2,
        imageSizeFraction = 0.5f
    ),
    Page(
        title = "EDUKASI DAN KOMUNITAS",
        description = "Belanja saja tidak cukup. \n" +
                "Temukan konten edukasi seni favoritmu dan bergabung dalam komunitas pencinta seni.",
        image = R.drawable.intro3,
        imageSizeFraction = 0.5f
    )
)