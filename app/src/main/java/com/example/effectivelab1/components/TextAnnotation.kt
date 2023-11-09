package com.example.effectivelab1.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.effectivelab1.R

@Composable
fun DrawTextAnnotation(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.annotation_text),
        style = TextStyle(
            fontSize = 12.sp,
            lineHeight = 19.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = Color(0xB2EEF2FB)
        ),
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 24.dp, top = 20.dp, bottom = 43.dp, end = 21.dp)
    )
}
//TODO: Move string into resources, move text style into separate file, move colours into Theme.

@Preview
@Composable
fun PreviewTextAnnotation() {
    DrawTextAnnotation()
}
