package com.example.goldenquestionsposton

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import java.lang.reflect.Modifier

@Composable
fun ShowAlertDialog(isDialogOpen: MutableList<Boolean>) {
    val isDialogOpen = remember { mutableStateOf(true) }
    if (isDialogOpen.value) {
        Dialog(onDismissRequest = { isDialogOpen.value = false }) {
            Surface(
                modifier = Modifier.width(300.dp).height(420.dp),
                shape = RoundedCornerShape(5.dp),
                colorResource(id = R.color.dark_gray)
            ) {
                Spacer(modifier = Modifier.padding(5.dp))

                Image(
                    painter = painterResource(id = R.drawable.alertdialog_lock_img),
                    contentDescription = "",
                    modifier = Modifier.width(120.dp).height(100.dp)
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = "body of alert dialog")
                Spacer(modifier = Modifier.padding(15.dp))
                Button(
                    onClick = {
                        isDialogOpen.value = false
                    }, modifier = Modifier.fillMaxWidth(0.5f).height(50.dp),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.dark_gray))
                ) {


                }
                Text(text = "button of alert dialog")
            }


        }
    }
}