package com.example.kiddy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting2() {

    Column(
        modifier = Modifier
            .background(Color.Blue)
//            .fillMaxWidth()
//            .fillMaxHeight()
            .padding(12.dp)
            .fillMaxSize(),
//        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    )

    {
        Row(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()

        )
        {
            Text(text = "Home ", fontSize = 30.sp, fontFamily = FontFamily.Cursive)
            Spacer(modifier = Modifier.width(30.dp))
            Text(text= "About", fontSize = 30.sp, fontFamily = FontFamily.Cursive)
            Spacer(modifier = Modifier.width(30.dp))
            Text(text= "Services", fontSize = 30.sp, fontFamily = FontFamily.Cursive)

        }
        Text(text = "Hello World",
            fontSize = 35.sp, fontFamily = FontFamily.Cursive, modifier = Modifier
//                .background(Color.Cyan)
//                .fillMaxWidth()


        )

        Text(text = "Welcome all", fontFamily = FontFamily.Cursive, fontSize = 40.sp)
        val main = LocalContext.current
        Button(onClick = {
            main.startActivity(Intent(main, MainActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Cyan),
//            shape = RectangleShape
//            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(1.dp, Color.Black),
            shape = CutCornerShape(10)


        )
        {
            Text(text = "home " )

        }
        Spacer(modifier = Modifier.height(10.dp))


        val kk = AnnotatedString("Click")
        val hh = LocalContext.current

        ClickableText(text = kk, onClick = {

            hh. startActivity(Intent(hh, MainActivity::class.java))

        }
        )
    }
}

