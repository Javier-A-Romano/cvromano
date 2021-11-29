package com.example.cvjavierr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.cvjavierr.ui.theme.CVjavierRTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CVjavierRTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    CVjavierRTheme {
     Surface(color = MaterialTheme.colors.secondaryVariant) {
         Column(modifier = Modifier.height(300.dp),
             verticalArrangement = Arrangement.Top,
             horizontalAlignment = Alignment.CenterHorizontally) {

             Surface(
                 modifier = Modifier.padding(10.dp)
             ) {
                 Text("CV JavierR", fontSize = 30.sp , textAlign = TextAlign.Center)
             }
             Surface(modifier = Modifier
                 .size(150.dp)
                 .padding(5.dp)
                 , shape = CircleShape,
                 border = BorderStroke(0.5.dp, Color.Black),
                 elevation = 4.dp,
                 color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
             ) {
                 Image(painter = painterResource(id = R.drawable.perfil), contentDescription ="shorlak" ,
                     modifier=Modifier.size(130.dp)
                     , contentScale = ContentScale.Crop)
             }
         }
        }


    }
}