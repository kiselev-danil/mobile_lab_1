package com.example.effectivelab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.effectivelab1.components.DrawLogo
import com.example.effectivelab1.components.DrawTextAnnotation
import com.example.effectivelab1.components.comments
import com.example.effectivelab1.ui.theme.EffectiveLab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EffectiveLab1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val pageWidth = 375.dp;
    val defaultElementBackgroundColor = Color(0xFF050B18)
    val defaultBackgroundColor = defaultElementBackgroundColor//Color.Magenta
    val defaultColorModifier: Modifier =
        Modifier.background(defaultElementBackgroundColor, RectangleShape)

    LazyColumn(
        modifier = Modifier
            .width(pageWidth)
            .background(color = defaultBackgroundColor, shape = RectangleShape)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.poster),
                contentDescription = "There must be poster",
                modifier = modifier.fillMaxWidth()
            )
        }
        item {
            DrawLogo(Modifier.offset(21.dp, -30.dp))
        }
        item {
            DrawTextAnnotation()
        }
        item {
            Row(
                modifier = Modifier
                    .horizontalScroll(state = ScrollState(0))
                    .background(defaultElementBackgroundColor, shape = RectangleShape)
                    .padding(start = 24.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)
                    .border(width = 0.dp, shape = RectangleShape, color = Color.Unspecified)
                    .padding(0.dp, 0.dp, 0.dp, 47.dp)
                    .height(135.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gameplay_1),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = modifier
                        .width(240.dp)
                        .clip(RoundedCornerShape(5.dp))
                )
                Image(
                    painter = painterResource(id = R.drawable.gameplay_2),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = modifier
                        .width(240.dp)
                        .clip(RoundedCornerShape(5.dp))
                )
            }
        }
        item {
            comments(defaultColorModifier)
        }
        item {
            Button(
                onClick = { },
                modifier = modifier
                    .fillMaxWidth()
                    .background(defaultElementBackgroundColor, shape = RectangleShape)
                    .padding(start = 20.dp, end = 20.dp, top = 0.dp, bottom = 47.dp)
                    .height(64.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color.Yellow, Color.Black, Color.LightGray, Color.DarkGray
                )
            ) {
                Text(text = "INSTALL")
            }

        }
    }
}


@Preview(showBackground = false, showSystemUi = false)
@Composable
fun GreetingPreview() {
    EffectiveLab1Theme {
        Greeting("Android")
    }
}
