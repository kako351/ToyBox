package com.kako351.android.toybox.components.system.resource

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import com.kako351.android.toybox.components.system.typography.Typography

private val LightColorPalette = lightColors(
    primary = ToyRedLight,
    primaryVariant = ToyOrangeLight,
    secondary = ToyBlueLight,
    surface = ToyRedLight,
    background = ToyBackgroundLight
)

private val DarkColorPalette = darkColors (
    primary = ToyRedDark,
    primaryVariant = ToyOrangeDark,
    secondary = ToyBlueDark,
    surface = ToyRedDark,
    background = ToyBackgroundDark
)

@Composable
fun ToyBoxTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    ProvideDimens(defaultDimensions) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

@Composable
fun ProvideDimens(
    dimensions: Dimensions,
    content: @Composable () -> Unit
) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

private val LocalAppDimens = staticCompositionLocalOf {
    defaultDimensions
}

object ToyBoxTheme {
    val dimens: Dimensions
        @Composable
        get() = LocalAppDimens.current
}
