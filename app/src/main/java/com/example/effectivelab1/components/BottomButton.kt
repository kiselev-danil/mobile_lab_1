package com.example.effectivelab1.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effectivelab1.R
import com.example.effectivelab1.ui.theme.MyTheme

@Composable
fun DrawInstallButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { },
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            MyTheme.Colors.ButtonColors.mainButtonColor,
            MyTheme.Colors.ButtonColors.contentColor,
            MyTheme.Colors.ButtonColors.disabledContainerColor,
            MyTheme.Colors.ButtonColors.disabledContentColor
        )
    ) {
        Text(text = stringResource(id = R.string.bottom_button_text))
    }
}

@Composable
@Preview
fun PreviewInstallButtoon() {
    DrawInstallButton()
}
