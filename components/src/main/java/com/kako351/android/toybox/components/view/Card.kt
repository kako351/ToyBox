package com.kako351.android.toybox.components.view

import android.icu.number.Scale
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kako351.android.toybox.components.R
import com.kako351.android.toybox.components.system.resource.ToyBoxTheme
import com.kako351.android.toybox.components.system.resource.defaultDimensions
import com.kako351.android.toybox.components.system.typography.Body1
import com.kako351.android.toybox.model.Toy

@Composable
fun CardLarge(toy: Toy, modifier: Modifier? = null,onClick: () -> Unit) {
    Card(
        modifier = modifier ?: Modifier.padding(defaultDimensions.spaceLarge),
        shape = MaterialTheme.shapes.medium,
        elevation = defaultDimensions.elevationMedium,
        backgroundColor = MaterialTheme.colors.background
    ) {
        Column(
            Modifier
                .clickable(onClick = onClick)
                .wrapContentHeight()
        ) {
            Image(
                painter = painterResource(toy.image),
                contentDescription = toy.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(defaultDimensions.cardLargeMaxHeight)
                    .fillMaxWidth()
            )
            Body1(text = toy.title, modifier = Modifier.padding(defaultDimensions.spaceMedium))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardLargePreview(){
    val toy = Toy(
        "gaming_keyboard",
        "ゲーミングキーボード",
        "ColorMaster SK-622 ゲーミングキーボード",
        R.drawable.gaming_keyboard
    )
    ToyBoxTheme {
        CardLarge(toy, onClick = {})
    }
}
