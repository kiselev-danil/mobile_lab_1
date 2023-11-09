package com.example.effectivelab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.effectivelab1.R

@Composable
fun DrawHeader(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.poster),
        contentDescription = "There must be poster",
        modifier = modifier
    )
}

@Preview
@Composable
fun PreviewHeader(){
    DrawHeader()
}