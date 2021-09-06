package com.kako351.android.toybox.components.system.typography

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Body1(text: String, modifier: Modifier = Modifier.padding(0.dp)) {
    Text(text = text, style = Typography.body1, modifier = modifier)
}
