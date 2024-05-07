package com.omo.foodapp.presentation.ui.component.atom

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omo.foodapp.presentation.ui.theme.OrangeRed

@Composable
fun<T> MyButton(
    modifier: Modifier = Modifier,
    click: () -> T,
    color: Color = OrangeRed,
    enabled: Boolean = true,
    border: BorderStroke? = null,
    shape: Shape = ButtonDefaults.shape,
    composable: @Composable () -> Unit
) {
    Button(
        onClick = { click() },
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(containerColor = color),
        border = border,
        shape = shape
    ) {
        composable()
    }
}

@Composable
@Preview
fun Test(){
    MyButton(
        click = { /*TODO*/ },
        modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)
    ){}
}
