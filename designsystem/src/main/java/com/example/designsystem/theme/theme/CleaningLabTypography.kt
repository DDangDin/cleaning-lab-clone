package com.example.designsystem.theme.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import com.example.designsystem.theme.util.sp

@Immutable
data class CleaningLabTypography (
    val display: TextStyle = TextStyle(),
    val headline1: TextStyle = TextStyle(),
    val headline2: TextStyle = TextStyle(),
    val title1: TextStyle = TextStyle(),
    val title2: TextStyle = TextStyle(),
    val title3: TextStyle = TextStyle(),
    val title4: TextStyle = TextStyle(),
    val body1: TextStyle = TextStyle(),
    val body2: TextStyle = TextStyle(),
    val body3: TextStyle = TextStyle(),
    val body4: TextStyle = TextStyle(),
    val body5: TextStyle = TextStyle(),
    val body6: TextStyle = TextStyle(),
    val body7: TextStyle = TextStyle(),
    val body8: TextStyle = TextStyle(),
    val label1: TextStyle = TextStyle(),
    val label2: TextStyle = TextStyle(),
    val label3: TextStyle = TextStyle(),
    val label4: TextStyle = TextStyle(),
    val label5: TextStyle = TextStyle(),
    val label6: TextStyle = TextStyle(),
)

@Composable
fun display(): TextStyle {
    return TextStyle(
        fontSize = 28.sp(),
        lineHeight = 40.sp(),
        letterSpacing = 0.002.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun headline1(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 28.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.002.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun headline2(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 27.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.01.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun title1(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 24.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun title2(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 21.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.01.em,
        fontWeight = FontWeight.SemiBold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun title3(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 18.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.05.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun title4(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 15.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.03.em,
        fontWeight = FontWeight.SemiBold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body1(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 21.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.01.em,
        fontWeight = FontWeight.SemiBold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body2(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 19.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body3(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 18.sp(),
        lineHeight = 1.5.em,
        letterSpacing = -(0.01).em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body4(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 18.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body5(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 17.sp(),
        lineHeight = 1.5.em,
        letterSpacing = -(0.015).em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body6(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 16.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.03.em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body7(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 16.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.025.em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun body8(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 16.sp(),
        lineHeight = 1.5.em,
        letterSpacing = -(0.01).em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun label1(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 19.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun label2(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 17.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun label3(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 17.sp(),
        lineHeight = 1.5.em,
        letterSpacing = -(0.01).em,
        fontWeight = FontWeight.SemiBold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun label4(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 17.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun label5(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 12.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.em,
        fontWeight = FontWeight.Bold,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}

@Composable
fun label6(modifier: Modifier = Modifier): TextStyle {
    return TextStyle(
        fontSize = 12.sp(),
        lineHeight = 1.5.em,
        letterSpacing = 0.03.em,
        fontWeight = FontWeight.Normal,
        fontFamily = Pretendard,
        lineHeightStyle = lineHeightStyle,
        platformStyle = platformTextStyle,
    )
}