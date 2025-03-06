package com.example.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.theme.theme.CleaningLabTheme
import com.example.designsystem.theme.util.dp
import com.example.presentation.R
import com.example.presentation.util.touchTargetIcon

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    // Top Bar (O)
    //TODO Header
    //TODO Content
    //TODO Cleaning Category
    //TODO Notice
    //TODO AD Banner
    //TODO WebView

    Scaffold(
        modifier = modifier,
        topBar = {
            TopBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp()),
                onNoticeClick = { }
            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(it)
        )
    }
}

/**
 * HomeScreen TopBar
 *
 * @param onNoticeClick 알림 클릭 시
 */
@Composable
private fun TopBar(
    modifier: Modifier = Modifier,
    onNoticeClick: () -> Unit,
) {
    Box(
        modifier = modifier.background(CleaningLabTheme.colorScheme.primaryNormal),
        contentAlignment = Alignment.BottomEnd
    ) {
        Icon(
            modifier = Modifier
                .padding(end = 25.dp(), bottom = 11.dp())
                .touchTargetIcon(
                    iconSize = 25,
                    ripple = false,
                    onClick = onNoticeClick
                ),
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_filled_bell),
            contentDescription = stringResource(id = R.string.home_screen_notice),
            tint = CleaningLabTheme.colorScheme.iconWhite,
        )
    }
}

@Preview
@Composable
private fun TopBarPreview() {
    TopBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp()),
        onNoticeClick = { }
    )
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(Modifier.fillMaxSize())
}