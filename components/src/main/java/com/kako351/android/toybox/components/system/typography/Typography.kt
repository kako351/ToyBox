package com.kako351.android.toybox.components.system.typography

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.kako351.android.toybox.components.system.resource.defaultTextSize

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.W900,
        fontSize = defaultTextSize.x2Large
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = defaultTextSize.xLarge
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = defaultTextSize.large
    )
)
