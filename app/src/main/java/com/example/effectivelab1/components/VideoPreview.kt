package com.example.effectivelab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effectivelab1.R

@Composable
fun VideoPreview(previews: List<Painter>, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .horizontalScroll(state = ScrollState(0))
            .height(135.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        for(painter in previews){
            Image(
                painter= painter,
                contentDescription = "video preview",
                modifier = Modifier.clip(RoundedCornerShape(15.dp))
            )
        }
    }
}

@Composable
@Preview
fun PreviewVideoPreview(){
    VideoPreview(previews = listOf(
        painterResource(id = R.drawable.gameplay_1),
        painterResource(id = R.drawable.gameplay_2)
    ))
}
