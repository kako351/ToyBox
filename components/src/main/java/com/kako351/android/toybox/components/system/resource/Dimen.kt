package com.kako351.android.toybox.components.system.resource

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class Dimensions (
    val roundedCornerSmall: Dp,
    val roundedCornerMedium: Dp,
    val roundedCornerLarge: Dp
)

val regularDimensions = Dimensions(
    roundedCornerSmall = 4.dp,
    roundedCornerMedium = 4.dp,
    roundedCornerLarge = 0.dp
)
