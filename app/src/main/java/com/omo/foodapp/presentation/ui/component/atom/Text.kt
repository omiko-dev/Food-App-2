package com.omo.foodapp.presentation.ui.component.atom

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

@Composable
fun MyText(
    modifier: Modifier = Modifier,
    text: String = "",
    color: Color = Color.Black,
    size: Float = 16f,
    style: TextStyle = LocalTextStyle.current,
    weight: FontWeight = FontWeight.Medium
){
    Text(
        modifier  = modifier,
        style = style,
        text = text,
        color = color,
        fontSize = TextUnit(size, TextUnitType.Sp),
        fontWeight = weight
    )
}