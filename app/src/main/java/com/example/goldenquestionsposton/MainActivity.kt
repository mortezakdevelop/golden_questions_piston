package com.example.goldenquestionsposton

import android.graphics.Paint
import android.graphics.drawable.VectorDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.goldenquestionsposton.ui.theme.Brown
import com.example.goldenquestionsposton.ui.theme.GoldenQuestionsPostonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            uiGoldenQuestions()
        }
    }
}

@Composable
fun uiGoldenQuestions() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        androidx.compose.material.Surface(color = Color.Blue) {
            Row(modifier = Modifier.fillMaxWidth()) {
                textQuestion()
                Image(modifier = Modifier.fillMaxWidth(1.0f).size(100.dp).align(Alignment.CenterVertically).padding(10.dp),imageVector = ImageVector.vectorResource(id = R.drawable.ic_check), contentDescription = "")

            }
        }
    }
}
@Composable
fun textQuestion() {
    Text(
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .fillMaxHeight(), textAlign = TextAlign.Center, //style = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
        fontSize = 30.sp,
        color = Color.White,
        text = "سوالات طلایی"
    )
}



@Preview(showBackground = true)
@Composable
fun DefaultGoldenQuestions() {
    uiGoldenQuestions()
}


