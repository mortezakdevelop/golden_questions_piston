package com.example.goldenquestionsposton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

@Composable
fun programRules(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp), horizontalAlignment = Alignment.End
    ) {
        Text(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp),
            color = colorResource(
                id = R.color.courcesBlue
            ),
            text = "قوانین برنامه"
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(1.dp)
                .background(color = Color.Gray),
        )
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Text(
                modifier = Modifier.padding(10.dp),
                color =  colorResource(id = R.color.courcesBlue),
                text = stringResource(id = R.string.ProgramRulesBody)
            )
        }
    }
}