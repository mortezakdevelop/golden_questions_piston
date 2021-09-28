package com.example.goldenquestionsposton

import android.app.Notification
import android.inputmethodservice.Keyboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle
import androidx.compose.ui.text.input.KeyboardType.Companion as KeyboardType1

@Composable
fun allBoards() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "")
                },
                backgroundColor = Color.White,

                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            modifier = Modifier
                                .width(20.dp)
                                .padding(start = 2.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(color = colorResource(id = R.color.courcesBlue))
                                .height(20.dp),
                            imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
                            contentDescription = "",
                            tint = Color.Unspecified
                        )

                    }
                },
                actions = {

                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = "search",
                            modifier = Modifier.background(color = colorResource(id = R.color.courcesBlue))
                        )

                    }
                }
            )

        }
    ) {

    }
}

