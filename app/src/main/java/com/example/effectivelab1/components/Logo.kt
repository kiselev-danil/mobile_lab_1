package com.example.effectivelab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effectivelab1.R
import com.example.effectivelab1.ui.theme.MyTheme

@Composable
fun DrawLogo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.game_logo),
        contentDescription = "game logo was there",
        contentScale = ContentScale.Inside,
        modifier = modifier
            .padding(0.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(14.dp),
            )
            .background(
                color = MyTheme.Colors.logoBackroundColor,
                shape = RoundedCornerShape(14.dp)
            )
            .padding(17.dp)
            .width(54.dp)
            .height(54.dp)
    )
}

@Composable
@Preview
fun LogoPreview() {
    DrawLogo()
}