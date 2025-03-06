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
    val typography = CleaningLabTypography(
        display = display(),
        headline1 = headline1(),
        headline2 = headline2(),
        title1 = title1(),
        title2 = title2(),
        title3 = title3(),
        title4 = title4(),
        body1 = body1(),
        body2 = body2(),
        body3 = body3(),
        body4 = body4(),
        body5 = body5(),
        body6 = body6(),
        body7 = body7(),
        body8 = body8(),
        label1 = label1(),
        label2 = label2(),
        label3 = label3(),
        label4 = label4(),
        label5 = label5(),
        label6 = label6(),
    )

    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalTypography provides typography,
        LocalShapes provides CleaningLabShape(),
        LocalRippleTheme provides CleaningLabRipple(),
    ) {
        content()
    }
}
