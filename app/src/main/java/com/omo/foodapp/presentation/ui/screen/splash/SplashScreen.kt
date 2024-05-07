package com.omo.foodapp.presentation.ui.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omo.foodapp.R
import com.omo.foodapp.presentation.ui.component.atom.MyButton
import com.omo.foodapp.presentation.ui.component.atom.MyText
import com.omo.foodapp.presentation.ui.theme.OrangeRed
import com.omo.foodapp.presentation.ui.theme.typography

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(OrangeRed)
            .padding(vertical = 40.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 49.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(73.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(100.dp)
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon),
                    contentDescription = "app icon",
                    modifier = Modifier
                        .size(60.dp)
                        .align(Alignment.Center)
                        .padding(start = 7.dp)
                )
            }

            MyText(
                modifier = Modifier.padding(top = 20.dp),
                text = "Food For Everyone",
                color = Color.White,
                style = typography.bodyLarge
            )
        }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painterResource(R.drawable.boy),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(width = 200.1f.dp)
                    .align(Alignment.CenterEnd)
                    .alpha(.6f)
            )
            Image(  // shadow
                painter = painterResource(id = R.drawable.red_2),
                contentDescription = "d",
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 40.dp)
                    .size(width = 150.dp, height = 180.dp)
            )
            Image(
                painterResource(R.drawable.girl),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(width = 290.1f.dp)
                    .align(Alignment.CenterStart)
            )
            Image( // shadow
                painter = painterResource(id = R.drawable.red_1),
                contentDescription = "d",
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .size(width = 293f.dp, height = 210f.dp)
            )
            MyButton(
                click = {  },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(horizontal = 51.dp)
                    .height(60.dp),
                color = Color.White,
                shape = RoundedCornerShape(20.dp)
            ) {
                MyText(
                    text = stringResource(R.string.get_started),
                    color = OrangeRed,
                    size = 17f,
                    style = typography.bodyMedium
                )
            }
        }
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}