package com.kako351.android.toybox.components.system.resource

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class Dimensions (
    val roundedCornerSmall: Dp,
    val roundedCornerMedium: Dp,
    val roundedCornerLarge: Dp,
    val spaceSmall: Dp,
    val spaceMedium: Dp,
    val spaceLarge: Dp,
    val elevationMedium: Dp,
    val cardLargeMaxHeight: Dp,
)

val defaultDimensions = Dimensions(
    roundedCornerSmall = 4.dp,
    roundedCornerMedium = 4.dp,
    roundedCornerLarge = 8.dp,
    spaceSmall = 4.dp,
    spaceMedium = 8.dp,
    spaceLarge = 16.dp,
    elevationMedium = 4.dp,
    cardLargeMaxHeight = 200.dp
)
