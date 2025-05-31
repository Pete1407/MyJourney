package com.example.myjourneyapp.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val ColorPrimary = "#F0E14A".toColor()
val WhiteColor = "#FFFFFF".toColor()
val BlackColor = "#000000".toColor()


fun String.toColor() = Color(android.graphics.Color.parseColor(this))