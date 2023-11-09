package com.example.effectivelab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.effectivelab1.R
import com.example.effectivelab1.model.CommentModel


@Composable
fun CommetsLabel(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.reviews_block_label),
        modifier = modifier,
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(700),
            color = Color(0xFFEEF2FB),
            letterSpacing = 0.6.sp,
        )
    )
}

@Composable
fun SingleComment(comment: CommentModel, modifier: Modifier = Modifier) {
    val imageModifier = Modifier
        .clip(shape = CircleShape)
        .width(36.dp)
        .height(36.dp)

    Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 32.dp)) {
        Row(
            modifier = Modifier.padding(horizontal = 0.dp, vertical = 16.dp)
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
    val list: List<CommentModel> = listOf(
        CommentModel(
            name = stringResource(id = R.string.comment_1_author),
            date = stringResource(id = R.string.comment_date),
            text = stringResource(id = R.string.comment_1_text),
            painterResource(id = R.drawable.comment1)
        ), CommentModel(
            name = stringResource(id = R.string.comment_2_author),
            date = stringResource(id = R.string.comment_date),
            text = stringResource(id = R.string.comment_2_text),
            painterResource(id = R.drawable.comment2)
        )
    )
    LazyColumn {
        item {
            CommetsLabel()
        }
        itemsIndexed(list) { index, item ->
            SingleComment(item, Modifier)
            if (index < list.lastIndex) {
                Divider(
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.padding(horizontal = 38.dp, vertical = 24.dp)
                )
            }
        }
    }


}

