package com.example.designsystem.theme.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalColorScheme = staticCompositionLocalOf { CleaningLabLightColor }
private val LocalTypography = staticCompositionLocalOf { CleaningLabTypography() }
private val LocalShapes = staticCompositionLocalOf { CleaningLabShape() }

@Stable
object CleaningLabTheme {

    val colorScheme: CleaningLabColor
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    val typography: CleaningLabTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: CleaningLabShape
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}

@Composable
fun CleaningLabAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) CleaningLabLightColor else CleaningLabLightColor

    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalTypography provides CleaningLabTypography(),
        LocalShapes provides CleaningLabShape(),
        LocalRippleTheme provides CleaningLabRipple(),
    ) {
        content()
    }
}
