package com.kako351.android.toybox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kako351.android.toybox.components.R
import com.kako351.android.toybox.components.system.resource.ToyBoxTheme
import com.kako351.android.toybox.components.view.CardLarge
import com.kako351.android.toybox.components.view.ToyBoxTopAppBar
import com.kako351.android.toybox.model.Toy
import com.kako351.android.toybox.ui.HomeContents

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToyBoxApp()
        }
    }
}

@Composable
fun ToyBoxApp() {
    ToyBoxTheme {
        Scaffold(
            topBar = { ToyBoxTopAppBar() },
            content = { HomeContents() }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ToyBoxApp()
}
