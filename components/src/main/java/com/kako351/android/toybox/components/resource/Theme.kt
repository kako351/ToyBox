package com.kako351.android.toybox.components.resource

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.kako351.android.toybox.components.typography.Typography

private val LightColorPalette = lightColors(
    primary = ToyRedLight,
    primaryVariant = ToyOrangeLight,
    secondary = ToyBlueLight
)

private val DarkColorPalette = darkColors (
    primary = ToyRedDark,
    primaryVariant = ToyOrangeDark,
    secondary = ToyBlueDark
)

@Composable
fun ToyBoxTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
