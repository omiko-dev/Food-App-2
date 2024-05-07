package com.omo.foodapp.presentation.ui.screen.register.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omo.foodapp.R
import com.omo.foodapp.presentation.ui.component.atom.MyButton
import com.omo.foodapp.presentation.ui.component.atom.MyOutlinedTextField
import com.omo.foodapp.presentation.ui.component.atom.MyText
import com.omo.foodapp.presentation.ui.theme.OrangeRed
import com.omo.foodapp.presentation.ui.theme.typography

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        MyOutlinedTextField(
            modifier = Modifier.fillMaxWidth(.85f),
            value = email,
            onValueChange = { email = it },
            label = "Email Address"
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        )

        MyOutlinedTextField(
            modifier = Modifier.fillMaxWidth(.85f),
            value = password,
            onValueChange = { password = it },
            label = "Password",
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(
                        imageVector = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                        contentDescription = "Toggle password visibility"
                    )
                }
            }
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
        )

        MyText(
            modifier = Modifier
                .fillMaxWidth(.85f),
            text = stringResource(R.string.forgot_password),
            color = OrangeRed,
            style = typography.bodyLarge,
            size = 16f
        )

        Spacer(modifier = Modifier.weight(1f))


        MyButton(
            modifier = Modifier
                .fillMaxWidth(.85f)
                .height(120.dp)
                .padding(bottom = 50.dp),
            click = {

            },
            shape = RoundedCornerShape(30.dp)
        ) {
            MyText(
                text = "Login",
                color = Color.White,
                size = 17f
            )
        }
    }
}

@Composable
@Preview
fun LoginScreenPreview(){
    LoginScreen()
}