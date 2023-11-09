package com.example.effectivelab1.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object MyTheme {
    object Colors {
        val mainBackgroundColor = Color(0xFF050B18)
        val reviewsBlockLabelColor = Color(0xFFEEF2FB)
        val commentAuthorNameColor = Color(0xFFFFFFFF)
        val commentDateColor = Color(0x66FFFFFF)
        val commentTextColor = Color(0xFFA8ADB7)
        val logoBackroundColor = Color.Black
        val textAnnotationColor = Color(0xB2EEF2FB)

        object ButtonColors {
            val mainButtonColor = Color.Yellow
            val contentColor = Color.Black
            val disabledContainerColor = Color.LightGray
            val disabledContentColor = Color.DarkGray
        }
    }

    object TextStyles {
        val textAnnotation = TextStyle(
            fontSize = 12.sp,
            lineHeight = 19.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = MyTheme.Colors.textAnnotationColor
        )
        val commentLabel = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(700),
            color = Colors.reviewsBlockLabelColor,
            letterSpacing = 0.6.sp,
        )
        val commentAuthorName = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = MyTheme.Colors.commentAuthorNameColor,
            letterSpacing = 0.5.sp,
        )
        val commentDate = TextStyle(
            fontSize = 12.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = MyTheme.Colors.commentDateColor,
            letterSpacing = 0.5.sp,
        )
        val commentText = TextStyle(
            fontSize = 12.sp,
            lineHeight = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = MyTheme.Colors.commentTextColor,
            letterSpacing = 0.5.sp
        )
    }


}