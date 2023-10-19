package com.example.layoutke3

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutke3.ui.theme.Layoutke3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layoutke3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Home()
                        BoxHeader()
                        Lokasi()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Weather App", fontSize = 40.sp)
        BoxHeader()
        Lokasi()
    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20))
        .background(Color.Cyan))
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.image), contentDescription = null, modifier = Modifier.size(200.dp))
            Text(text = "Rain", fontSize = 25.sp, modifier = Modifier.padding(18.dp))
        }
    }
}

@Composable
fun Lokasi(){
    Text(
        text = "19 C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )
    Row(){
        Image(painter = painterResource(id = R.drawable.location), contentDescription = null, modifier = Modifier.size(20.dp))
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp)
    }
    Text(text = "Kasihan, Kabupaten Bantul Daerah Istimewa Yogyakarta", textAlign = TextAlign.Center, color = Color.Gray)
}