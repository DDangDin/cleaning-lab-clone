package com.example.presentation.util

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

fun Int.toScaledDp(density: Float): Dp = ((this * 2.5) / density).dp

fun Double.toScaledDp(density: Float): Dp = ((this * 2.5) / density).dp

fun Double.toScaledSp(density: Float): TextUnit = ((this * 2.5) / density).sp
