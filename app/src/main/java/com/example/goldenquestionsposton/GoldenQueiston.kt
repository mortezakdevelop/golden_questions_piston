package com.example.goldenquestionsposton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun question() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp),
    shape = RoundedCornerShape(15.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center,modifier = Modifier.background(colorResource(id = R.color.golden))) {
            Text(modifier = Modifier.padding(end = 40.dp),fontSize = 35.sp,text = "سوالات طلایی",color = Color.White)
            Image(modifier = Modifier.padding(end = 20.dp).size(110.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_check),
                contentDescription = "",

            )
        }

    }
}

