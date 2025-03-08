package com.example.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.theme.theme.CleaningLabAppTheme
import com.example.designsystem.theme.theme.CleaningLabTheme
import com.example.designsystem.theme.util.dp
import com.example.presentation.R
import com.example.presentation.util.touchTargetIcon

@OptIn(ExperimentalFoundationApi::class)
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(it),
        ) {
            item {
                //TODO 멘트 3개 랜덤 데이터 필요
                CollapsableHeader(
                    modifier = Modifier.fillMaxWidth(),
                    text = "청연 고객님은 월 평균\n" +
                            "22시간의 여유를 누립니다."
                )
            }

            stickyHeader {
                // Sticky Header (with button)
            }

            items(100) { nestedIdx ->
                // Home Content
                Text(text = "Sample Item $nestedIdx")
            }
        }
    }
}

@Composable
private fun CollapsableHeader(
    modifier: Modifier = Modifier,
    text: String,
) {
    Box(modifier = modifier.background(CleaningLabTheme.colorScheme.primaryNormal)) {
        Text(
            modifier = Modifier
                .padding(start = 27.dp(), end = 27.dp(), top = 16.dp(), bottom = 10.dp()),
            text = text,
            style = CleaningLabTheme.typography.display,
            color = CleaningLabTheme.colorScheme.labelNormal4
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
    CleaningLabAppTheme {
        TopBar(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp()),
            onNoticeClick = { }
        )
    }
}

@Preview
@Composable
private fun CollapsableHeaderPreview() {
    CleaningLabAppTheme {
        CollapsableHeader(
            modifier = Modifier.fillMaxWidth(),
            text = "청연 고객님은 월 평균\n" +
                    "22시간의 여유를 누립니다."
        )
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    CleaningLabAppTheme {
        HomeScreen(Modifier.fillMaxSize())
    }
}