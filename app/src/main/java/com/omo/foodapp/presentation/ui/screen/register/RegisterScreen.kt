package com.omo.foodapp.presentation.ui.screen.register

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omo.foodapp.R
import com.omo.foodapp.presentation.ui.screen.register.login.LoginScreen
import com.omo.foodapp.presentation.ui.theme.Gray

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RegisterScreen() {
    val screenList = listOf(
        Register.LOGIN,
        Register.SIGN_IN
    )
    val cornerRadius = 30
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }

    val pagerState = rememberPagerState {
        screenList.size
    }

    LaunchedEffect(selectedTabIndex) {
        pagerState.animateScrollToPage(selectedTabIndex)
    }

    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {
//        if (!pagerState.isScrollInProgress) { // if many to 2 page
        selectedTabIndex = pagerState.currentPage
//        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Gray)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.35f)
                .background(
                    color = Color.White
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "Icon",
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
            )
        }
        Column(
            modifier = Modifier

        ) {
            TabRow(
                modifier = Modifier
                    .clip(
                        shape = RoundedCornerShape(
                            bottomStart = cornerRadius.dp,
                            bottomEnd = cornerRadius.dp
                        )
                    ),
                containerColor = Color.White,
                selectedTabIndex = selectedTabIndex,
                contentColor = Color.Black,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = Color.Red,
                        height = 2.dp,
                    )
                },
                tabs = {
                    screenList.forEachIndexed { index, item ->
                        Tab(
                            modifier = Modifier
                                .background(Color.White),
                            selected = index == selectedTabIndex,
                            onClick = {
                                selectedTabIndex = index
                            },
                            text = {
                                Text(text = item.text)
                            },
                        )
                    }
                }
            )
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    when (it) {
                        0 -> LoginScreen()
                        1 -> {}
                    }
                }
            }
        }
    }
}

enum class Register(val text: String) {
    LOGIN("Login"),
    SIGN_IN("Sign-up")
}

@Composable
@Preview
fun RegisterScreenPreview() {
    RegisterScreen()
}



