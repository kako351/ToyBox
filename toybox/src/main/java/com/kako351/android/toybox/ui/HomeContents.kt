package com.kako351.android.toybox.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kako351.android.toybox.ToyBoxApp
import com.kako351.android.toybox.components.R
import com.kako351.android.toybox.components.system.resource.ToyBoxTheme
import com.kako351.android.toybox.components.system.resource.defaultDimensions
import com.kako351.android.toybox.components.system.typography.H1
import com.kako351.android.toybox.components.view.CardLarge
import com.kako351.android.toybox.model.Toy

@Composable
fun HomeContents() {
    val toy = Toy(
        "gaming_keyboard",
        "ゲーミングキーボード",
        "ColorMaster SK-622 ゲーミングキーボード",
        R.drawable.gaming_keyboard
    )
    Column {
        H1(
            text = "My new gear...",
            modifier = Modifier
                .padding(
                    start = defaultDimensions.spaceLarge,
                    end = defaultDimensions.spaceLarge,
                    top = defaultDimensions.spaceMedium,
                    bottom = defaultDimensions.spaceMedium
                )
        )
        CardLarge(toy) {}
    }
}

@Preview(showBackground = true)
@Composable
fun HomeContentsPreview() {
    ToyBoxTheme {
        HomeContents()
    }
}
