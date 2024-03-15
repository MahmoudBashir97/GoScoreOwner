package com.mahmoudbashir.goscoreowner.ui.theme.presentation.ui.splash.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudbashir.goscoreowner.R
import com.mahmoudbashir.goscoreowner.ui.theme.*

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreenContent() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {},
        bottomBar = {},
        contentColor = PrimaryColor
    ) {
        it.calculateTopPadding()
        SplashScreenBody()
    }
}

@Composable
fun SplashScreenBody() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor),
    ) {
        Text(
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)
                .shadow(3.dp),
            text = stringResource(id = R.string.app_name),
            style = TextStyle(
                color = WhiteColor,
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            ),
            textAlign = TextAlign.Center
        )
    }

}
