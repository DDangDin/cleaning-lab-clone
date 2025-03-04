package com.example.designsystem.theme.theme

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class CleaningLabRipple : RippleTheme {
    @Composable
    override fun defaultColor(): Color = Color(0xFFFFFFFF)

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(
        focusedAlpha = 0.43f,
        hoveredAlpha = 0.43f,
        draggedAlpha = 0.43f,
        pressedAlpha = 0.43f,
    )
}

class CleaningLabNoRipple : RippleTheme {
    @Composable
    override fun defaultColor(): Color = Color.Unspecified

    @Composable
    override fun rippleAlpha(): RippleAlpha =
        RippleAlpha(0f, 0f, 0f, 0f)
}

