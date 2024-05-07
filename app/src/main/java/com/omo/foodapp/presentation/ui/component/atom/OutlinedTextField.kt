package com.omo.foodapp.presentation.ui.component.atom

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    singleLine: Boolean = false,
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    trailingIcon: @Composable (() -> Unit)? = null
    ){
    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        enabled = enabled,
        label = {
                if(!label.isNullOrBlank()){
                    Text(text = label)
                }
        },
        leadingIcon = leadingIcon,
        isError = isError,
        singleLine = singleLine,
        colors = colors,
        visualTransformation = visualTransformation,
        trailingIcon = trailingIcon
    )
}

@Composable
@Preview
fun MyOutlinedTextFieldPreview(){
    var test = ""
    MyOutlinedTextField(
        value = test,
        onValueChange = { test = it },
        label = "test label",
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.White,
            unfocusedBorderColor = Color.White,
            unfocusedLabelColor = Color.White,
            unfocusedLeadingIconColor = Color.White
        )
    )
}
