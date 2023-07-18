package com.mkrdeveloper.jetpackstylingtextfieldexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkrdeveloper.jetpackstylingtextfieldexample.ui.theme.JetpackStylingTextFieldExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackStylingTextFieldExampleTheme {

                StylingTextField()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StylingTextField() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 40.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            var textstate by remember { mutableStateOf("") }
            var textstate2 by remember { mutableStateOf("") }
            var textstate3 by remember { mutableStateOf("") }
            var textstate4 by remember { mutableStateOf("") }
            var textstate5 by remember { mutableStateOf("") }
            var textstate6 by remember { mutableStateOf("") }
            var textstate7 by remember { mutableStateOf("") }
            val myColor = Color(0xFFD50000)
            val myColor2 = Color(0xFF0091EA)
            val myColor3 = Color(0xFFAA00FF)
            val myColor4 = Color(0xFFD50000)
            val myColor5 = Color(0xFF00C853)
            val myColor6 = Color(0xFFF86B3F)
            val myColor7 = Color(0xFF00838F)

            TextField(
                value = textstate,
                onValueChange = { textstate = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Enter your first name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Face,
                        contentDescription ="Email icon",
                        tint = myColor
                    )

                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor,
                    cursorColor = myColor,
                    focusedLabelColor = myColor,
                    textColor = myColor,
                    containerColor = myColor.copy(.2f),
                    focusedIndicatorColor =myColor,
                    unfocusedIndicatorColor = myColor.copy(
                        0.5f)
                ),
            )




            TextField(
                value = textstate7,
                onValueChange = { textstate7 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Middle name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.AccountCircle,
                        contentDescription ="Email icon",
                        tint = myColor7
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor7,
                    cursorColor = myColor7,
                    focusedLabelColor = myColor7,
                    textColor = myColor7,
                    containerColor = Color.Transparent,
                    focusedIndicatorColor =Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = CutCornerShape(14.dp)
            )

            TextField(
                value = textstate4,
                onValueChange = { textstate4 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Last name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.MailOutline,
                        contentDescription ="Email icon",
                        tint = myColor4
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor4,
                    cursorColor = myColor4,
                    focusedLabelColor = myColor4,
                    textColor = myColor4,
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = myColor4,
                    unfocusedIndicatorColor = myColor4.copy(
                        .5f)),
                shape = CutCornerShape(14.dp)
            )


            // Text3
            TextField(
                value = textstate2,
                onValueChange = { textstate2 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Phone number")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Phone,
                        contentDescription ="Email icon",
                        tint = myColor2
                    )

                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor2,
                    cursorColor = myColor2,
                    focusedLabelColor = myColor2,
                    textColor = myColor2,
                    containerColor = myColor2.copy(
                        .2f),
                    focusedIndicatorColor =myColor2,
                    unfocusedIndicatorColor = myColor2.copy(
                        .5f)
                ),
                shape = RoundedCornerShape(topStart = 25.dp , topEnd = 25.dp)
            )

            TextField(
                value = textstate3,
                onValueChange = { textstate3 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "User name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person,
                        contentDescription ="Email icon",
                        tint = myColor3
                    )

                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor3,
                    cursorColor = myColor3,
                    focusedLabelColor = myColor3,
                    textColor = myColor3,
                    containerColor = myColor3.copy(
                        .2f),
                    focusedIndicatorColor =myColor3,
                    unfocusedIndicatorColor = myColor3.copy(
                        .5f)
                ),
                shape = CutCornerShape(topStart = 15.dp , topEnd = 15.dp)
            )

            //Text4
            TextField(
                value = textstate5,
                onValueChange = { textstate5 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "your Location")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.LocationOn,
                        contentDescription ="Email icon",
                        // tint = myColor5
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor5,
                    focusedLabelColor = myColor5,
                    cursorColor = myColor5,
                    textColor = myColor5,
                    focusedLeadingIconColor = myColor5,
                    unfocusedLeadingIconColor = myColor5,
                    containerColor = myColor5.copy(
                        .2f),
                    focusedIndicatorColor =Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = CutCornerShape(15.dp)
            )

            //t5

            TextField(
                value = textstate6,
                onValueChange = { textstate6 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = " your name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email,
                        contentDescription ="Email icon",
                        // tint = myColor5
                    )
                },
                trailingIcon = {
                    Icon(imageVector = Icons.Filled.Send, contentDescription = null)

                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor6,
                    focusedLabelColor = myColor6,
                    cursorColor = myColor6,
                    textColor = myColor6,
                    focusedLeadingIconColor = myColor6,
                    unfocusedLeadingIconColor = myColor6,
                    focusedTrailingIconColor = myColor6,
                    unfocusedTrailingIconColor = myColor6,
                    containerColor = myColor6.copy(
                        .2f),
                    focusedIndicatorColor =Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = RoundedCornerShape(25.dp)
            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackStylingTextFieldExampleTheme {
        StylingTextField()
    }
}