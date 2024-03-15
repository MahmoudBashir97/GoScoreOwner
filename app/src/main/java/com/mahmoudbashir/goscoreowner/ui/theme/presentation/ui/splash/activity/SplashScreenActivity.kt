package com.mahmoudbashir.goscoreowner.ui.theme.presentation.ui.splash.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mahmoudbashir.goscoreowner.ui.theme.presentation.ui.splash.screen.SplashScreenContent

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenContent()
        }
    }
}