package com.kako351.android.toybox.components.view


import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kako351.android.toybox.components.system.resource.ToyBoxTheme
import com.kako351.android.toybox.components.system.typography.SubTitle1

@Composable
fun ToyBoxTopAppBar() {
    TopAppBar(
        title = { SubTitle1("ToyBox") },
        navigationIcon = {
            IconButton(onClick = { /* do something */ }) {
                Icon(Icons.Filled.Menu, contentDescription = "Open drawer")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun ToyBoxTopAppBarPreview(){
    ToyBoxTheme {
        ToyBoxTopAppBar()
    }
}
