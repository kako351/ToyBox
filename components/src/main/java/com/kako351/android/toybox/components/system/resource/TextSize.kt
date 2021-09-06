package com.kako351.android.toybox.components.system.resource

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

class TextSize (
    val small: TextUnit,
    val medium: TextUnit,
    val large: TextUnit,
    val xLarge: TextUnit,
    val x2Large: TextUnit
)

val defaultTextSize = TextSize(
    small = 14.sp,
    medium = 16.sp,
    large = 20.sp,
    xLarge = 24.sp,
    x2Large = 28.sp
)
