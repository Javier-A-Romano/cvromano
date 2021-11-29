package com.example.cvjavierr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
val imageid= intArrayOf(
    R.drawable.perfil,R.drawable.gwen
)
val tech = listOf(
    "casco","gwen"
)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CVjavierRTheme {
                Surface(color = MaterialTheme.colors.secondaryVariant,modifier=Modifier.size(750.dp)) {
                    Column(modifier = Modifier.height(300.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        ProfileCV()

                       // Technology(data= listOf("android","kotlin","jetpack","android","kotlin","jetpack","android","kotlin","jetpack"))
                        Technologylist(imageid[0],tech[0])
                        Technologylist(imageid[1],tech[1])
                    }
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
     Surface(color = MaterialTheme.colors.secondaryVariant,modifier=Modifier.size(300.dp)) {
         Column(modifier = Modifier.height(300.dp),
             verticalArrangement = Arrangement.Top,
             horizontalAlignment = Alignment.CenterHorizontally) {
             ProfileCV()
             Technologylist(imageid[0],tech[0])
             Technologylist(imageid[1],tech[1])
         }
        }


    }
}
@Composable
fun ProfileCV(){

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
@Composable
fun Technology(data: List<String>){

        LazyColumn(modifier=Modifier.size(width = 450.dp, height = 550.dp,),verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            items(data){
                    item ->
                var id1 =  R.drawable.perfil
                Row(modifier=Modifier.padding(5.dp)) {
                    Image(painter = painterResource(id = id1), contentDescription ="$item" ,
                        modifier=Modifier.size(130.dp)
                        , contentScale = ContentScale.Crop)
                    Text("$item")
                }

            }
        }


}

fun coroutines(){
    runBlocking {
        (1..1_000_000).forEach{
            launch{

                print("*")
            }
        }
    }

}
@Composable
fun Technologylist(imagen: Int , tech : String){





            Row(modifier=Modifier.padding(5.dp)) {
                Image(painter = painterResource(id = imagen), contentDescription ="1234" ,
                    modifier=Modifier.size(130.dp)
                    , contentScale = ContentScale.Crop)
                Text(tech)
            }





}