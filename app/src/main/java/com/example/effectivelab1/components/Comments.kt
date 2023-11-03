package com.example.effectivelab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.effectivelab1.R
import com.example.effectivelab1.model.CommentModel


@Composable
fun comments(mod: Modifier) {
    Text(
        text = "Review & Ratings",
        modifier = mod.padding(horizontal = 24.dp, vertical = 0.dp),
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(700),
            color = Color(0xFFEEF2FB),

            letterSpacing = 0.6.sp,
        )
    )
    val list: MutableList<CommentModel> = mutableListOf()
    list.add(
        CommentModel(
            name = "Auguste Conte",
            date = "February 14, 2019",
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            painterResource(id = R.drawable.comment1)
        )
    )
    list.add(
        CommentModel(
            name = "Jang Marcelino",
            date = "February 14, 2019",
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            painterResource(id = R.drawable.comment2)
        )
    )
    for (i in 1..list.size) {
        commentDraw(comment = list[i - 1], mod = mod)
        if (i != list.size) {
            Divider(
                color = MaterialTheme.colorScheme.secondary,
                modifier = mod.padding(horizontal = 38.dp, vertical = 24.dp)
            )
        }
    }

}

@Composable
fun commentDraw(comment: CommentModel, mod: Modifier) {
    val imageModifier = Modifier
        .clip(shape = CircleShape)
        .width(36.dp)
        .height(36.dp)

    Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 32.dp)) {
        Row(
            modifier = Modifier
                .padding(horizontal = 0.dp, vertical = 16.dp)
        ) {
            Image(
                painter = comment.image,
                contentDescription = "Comment",
                modifier = imageModifier.align(Alignment.CenterVertically),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 0.dp)) {
                Text(
                    text = comment.name, style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),

                        letterSpacing = 0.5.sp,
                    )
                )
                Spacer(modifier = Modifier.size(7.dp))
                Text(
                    text = comment.date, style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(400),
                        color = Color(0x66FFFFFF),
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }
        Text(
            text = comment.text, style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(400),
                color = Color(0xFFA8ADB7),
                letterSpacing = 0.5.sp
            ), modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = false, showSystemUi = false)
@Composable
fun CommentsPreview() {
    Column {
        comments(mod = Modifier)
    }
}