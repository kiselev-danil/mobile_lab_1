package com.example.effectivelab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effectivelab1.components.DrawHeader
import com.example.effectivelab1.components.DrawInstallButton
import com.example.effectivelab1.components.DrawLogo
import com.example.effectivelab1.components.DrawTextAnnotation
import com.example.effectivelab1.components.VideoPreview
import com.example.effectivelab1.components.comments
import com.example.effectivelab1.ui.theme.EffectiveLab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EffectiveLab1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    DrawDotaScreen("Android")
                }
            }
        }
    }
}

@Composable
fun DrawDotaScreen(name: String, modifier: Modifier = Modifier) {
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
            DrawHeader(Modifier.fillMaxWidth())
        }
        item {
            DrawLogo(Modifier.offset(21.dp, -30.dp))
        }
        item {
            DrawTextAnnotation()
        }
        item {
            VideoPreview(
                previews = listOf(
                    painterResource(id = R.drawable.gameplay_1),
                    painterResource(id = R.drawable.gameplay_2)
                ), modifier = Modifier.padding(24.dp, 0.dp, 0.dp, 0.dp)
            )
        }
        item {
            Spacer(Modifier.size(50.dp))
        }
        item {
            comments(defaultColorModifier)
        }
        item {
            DrawInstallButton(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 0.dp, bottom = 47.dp)
                    .height(64.dp)
            )
        }
    }
}


@Preview(showBackground = false, showSystemUi = false)
@Composable
fun GreetingPreview() {
    EffectiveLab1Theme {
        DrawDotaScreen("Android")
    }
}
