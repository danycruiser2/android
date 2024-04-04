package com.philip.imageactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()


        }
    }
}
@Preview(showBackground = true)
@Composable
fun Input() {
    LazyColumn (modifier = Modifier .fillMaxSize()){
    item {
        Icon(imageVector = Icons.Default.Menu, contentDescription = "" )
        Column(
            modifier = Modifier
                .background(color = Color.LightGray)
                .padding(10.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Row{
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(text = "Current location", fontWeight = FontWeight.Light, color = Color.LightGray)
                    Spacer(modifier = Modifier.height(10.dp))
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
              
                    Text(text = "Denhansa, Bahlin")




                }
                Row{


                    }

                    }
               


                }

            }
        }





}


