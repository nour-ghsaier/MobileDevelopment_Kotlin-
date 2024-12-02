package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                LemonadeApp()
            }
        }
    }
}
@Composable
fun LemonadeApp(){
    var step by remember { mutableStateOf(1) }
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
      Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){


          Text(
              text = "Lemonade", fontWeight = FontWeight.Bold, textAlign= TextAlign.Center,modifier = Modifier
                  .fillMaxWidth()
                  .background(Color.Yellow)
                  .padding(20.dp)
          )

              when (step) {
                  1 ->
                      Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                          Image(painter = painterResource(R.drawable.lemon_tree),
                              contentDescription = stringResource(R.string.LemonTree),
                              modifier = Modifier
                                  .clickable { step = 2 }
                                  .wrapContentSize()
                                  .background(Color.Magenta)
                                  .clip(RoundedCornerShape(10)))
                          Spacer(modifier = Modifier.height(32.dp))
                          Text(text = stringResource(R.string.Lemon_tree))
                      }

                  2 -> Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                      Image(painter = painterResource(R.drawable.lemon_squeeze),
                          contentDescription = stringResource(R.string.LemonString),
                          modifier = Modifier
                              .clickable { step = 3 }
                              .wrapContentSize()
                              .background(Color.Magenta)
                              .clip(RoundedCornerShape(10)))
                      Spacer(modifier = Modifier.height(32.dp))
                      Text(text = stringResource(R.string.Lemon))
                  }

                  3 -> Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                      Image(painter = painterResource(R.drawable.lemon_drink),
                          contentDescription = stringResource(R.string.GlassOfLemonade),
                          modifier = Modifier
                              .clickable { step = 4 }
                              .wrapContentSize()
                              .background(Color.Magenta)
                              .clip(RoundedCornerShape(10)))
                      Spacer(modifier = Modifier.height(32.dp))
                      Text(text = stringResource(R.string.Glass_of_lemonade))
                  }

                  4 -> Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                      Image(painter = painterResource(R.drawable.lemon_restart),
                          contentDescription = stringResource(R.string.EmptyGlass),
                          modifier = Modifier
                              .clickable { step = 1 }
                              .wrapContentSize()
                              .background(Color.Magenta)
                              .clip(RoundedCornerShape(30))
                              )
                      Spacer(modifier = Modifier.height(32.dp))
                      Text(text = stringResource(R.string.Empty_glass))
                  }
              }
          }

    }

}
@Preview
@Composable
fun LemonadeAppPreview(){
    LemonadeApp()
}