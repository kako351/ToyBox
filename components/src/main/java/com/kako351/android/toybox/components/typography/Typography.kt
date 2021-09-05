package com.kako351.android.toybox.components.typography

import androidx.compose.material.Typography
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kako351.android.toybox.components.R
import com.kako351.android.toybox.components.resource.regularDimensions
import com.kako351.android.toybox.components.resource.regularTextSize

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = regularTextSize.medium
    )
)
