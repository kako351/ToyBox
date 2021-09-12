package com.kako351.android.toybox.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    LazyColumn {
        item {
            H1(
            text = "My new gear...",
            modifier = Modifier
                .padding(
                    start = ToyBoxTheme.dimens.spaceLarge,
                    end = ToyBoxTheme.dimens.spaceLarge,
                    top = ToyBoxTheme.dimens.spaceMedium,
                    bottom = ToyBoxTheme.dimens.spaceMedium
                )
            )
        }

        item {
            LazyRow {
                items(3) {
                    CardLarge(
                        toy = toy,
                        modifier = Modifier
                            .width(LocalConfiguration.current.screenWidthDp.dp)
                            .padding(ToyBoxTheme.dimens.spaceLarge)
                    ) {

                    }
                }
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun HomeContentsPreview() {
    ToyBoxTheme {
        HomeContents()
    }
}
