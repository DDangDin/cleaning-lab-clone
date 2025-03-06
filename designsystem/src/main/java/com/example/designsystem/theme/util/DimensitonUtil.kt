package com.example.designsystem.theme.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private fun Number.scaledDpValue(density: Float): Dp {
    return ((this.toFloat() * DensityFactor) / density).dp
}

private fun Number.scaledSpValue(density: Float): TextUnit {
    return ((this.toFloat() * DensityFactor) / density).sp
}

/** 보정 수치가 적용된 dp */
@Composable
fun Int.dp(): Dp {
    val density = LocalDensity.current.density
    return this.scaledDpValue(density)
}

/** 보정 수치가 적용된 dp */
@Composable
fun Double.dp(): Dp {
    val density = LocalDensity.current.density
    return this.scaledDpValue(density)
}

/** 보정 수치가 적용된 sp */
@Composable
fun Int.sp(): TextUnit {
    val density = LocalDensity.current.density
    return this.scaledSpValue(density)
}

/** 보정 수치가 적용된 sp */
@Composable
fun Double.sp(): TextUnit {
    val density = LocalDensity.current.density
    return this.scaledSpValue(density)
}

/** 보정 수치가 적용된 dp */
fun Int.dp(density: Float): Dp {
    return this.scaledDpValue(density)
}

/** 보정 수치가 적용된 dp */
fun Double.dp(density: Float): Dp {
    return this.scaledDpValue(density)
}

/** 보정 수치가 적용된 sp */
fun Int.sp(density: Float): TextUnit {
    return this.scaledSpValue(density)
}

/** 보정 수치가 적용된 sp */
fun Double.sp(density: Float): TextUnit {
    return this.scaledSpValue(density)
}

/** 보정 수치 */
private const val DensityFactor = 2.5
