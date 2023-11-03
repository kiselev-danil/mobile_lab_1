package com.example.effectivelab1.model

import androidx.compose.ui.graphics.painter.Painter

data class CommentModel(
    val name: String,
    val date: String,
    val text: String,
    val image: Painter
)