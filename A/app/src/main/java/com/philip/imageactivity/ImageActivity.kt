package com.philip.imageactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.philip.imageactivity.R
import com.philip.imageactivity.ui.theme.ui.theme.ImageActivityTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

object Modifier {

}

@Preview(showBackground = true)
@Composable
fun Main() {
    Column {
        Image(painter = painterResource(id = R.drawable.kkj ), contentDescription = "",
            modifier =  Modifier
            .size(300.dp),

            colorFilter = ColorFilter.tint(Color.White)

        )

        Spacer(modifier = Modifier
            .width(20.dp)


        )
        AsyncImage(
            model = "chrome://branding/content/about-logo.png",
            contentDescription = null,
        )
    }

}
