package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.quadrant.ui.theme.QuadrantTheme
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}
@Composable
fun QuadrantScreen(modifier:Modifier=Modifier){
       Column(Modifier.fillMaxWidth()) {
           Row (Modifier.weight(1f)){
               Column (modifier=modifier.weight(1f).fillMaxSize().background(Color((0xFFEADDFF))).padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                   Text(text = stringResource(R.string.title1), fontWeight = FontWeight.Bold,modifier=Modifier.padding(bottom=16.dp))
                   Text(text = stringResource(R.string.text1),  textAlign = TextAlign.Justify )

               }
               Column(modifier=modifier.weight(1f).fillMaxSize().background(Color((0xFFD0BCFF))).padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                   Text(text = stringResource(R.string.title2), fontWeight = FontWeight.Bold,modifier=Modifier.padding(bottom=16.dp))
                   Text(text = stringResource(R.string.text2),  textAlign = TextAlign.Justify )

               }
           }
           Row (Modifier.weight(1f)){
               Column (modifier=modifier.weight(1f).fillMaxSize().background(Color((0xFFB69DF8))).padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                   Text(text = stringResource(R.string.title3), fontWeight = FontWeight.Bold,modifier=Modifier.padding(bottom=16.dp))
                   Text(text = stringResource(R.string.text3),  textAlign = TextAlign.Justify )

               }
               Column (modifier=modifier.weight(1f).fillMaxSize().background(Color((0xFFF6EDFF))).padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                   Text(text = stringResource(R.string.title4), fontWeight = FontWeight.Bold,modifier=Modifier.padding(bottom=16.dp))
                   Text(text = stringResource(R.string.text4),  textAlign = TextAlign.Justify )

               }
           }
       }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        QuadrantScreen()
    }
}