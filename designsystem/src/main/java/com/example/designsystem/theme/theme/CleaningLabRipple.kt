package com.example.designsystem.theme.theme

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class CleaningLabRipple : RippleTheme {
    @Composable
    override fun defaultColor(): Color = Color(0xFF000000)

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(
        focusedAlpha = 0.235f,
        hoveredAlpha = 0.235f,
        draggedAlpha = 0.235f,
        pressedAlpha = 0.235f,
    )
}

class CleaningLabNoRipple : RippleTheme {
    @Composable
    override fun defaultColor(): Color = Color.Unspecified

    @Composable
    override fun rippleAlpha(): RippleAlpha =
        RippleAlpha(0f, 0f, 0f, 0f)
}

