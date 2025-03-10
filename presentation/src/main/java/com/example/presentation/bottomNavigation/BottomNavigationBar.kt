package com.example.presentation.bottomNavigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.designsystem.theme.theme.CleaningLabAppTheme
import com.example.designsystem.theme.theme.CleaningLabTheme
import com.example.designsystem.theme.util.dp
import com.example.presentation.R
import com.example.presentation.util.clickableNoRipple

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val density = LocalDensity.current.density

    Box {
        NavigationBar(
            modifier = modifier
                .fillMaxWidth()
                .heightIn(min = 63.dp),
            containerColor = CleaningLabTheme.colorScheme.backgroundWhite,
            contentColor = CleaningLabTheme.colorScheme.iconBlack2
        ) {
            Content(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(contentPadding(density)),
                navController = navController,
                currentRoute = currentRoute
            )
        }
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    currentRoute: String?,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        BottomNavigationItem.items.forEach { item ->
            val icon = if (currentRoute == item.route) item.filledIcon else item.outlinedIcon
            Item(
                modifier = Modifier.size(43.dp()),
                icon = icon,
                title = item.title,
                onClick = {
                    onItemClickWithOptions(navController = navController, route = item.route)
                }
            )
        }
    }
}

@Composable
private fun Item(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    @StringRes title: Int,
    onClick: () -> Unit,
) {
    Column(
        modifier = modifier.clickableNoRipple { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            modifier = Modifier.size(35.dp(), 25.dp()),
            imageVector = ImageVector.vectorResource(id = icon),
            contentDescription = stringResource(id = title),
            tint = CleaningLabTheme.colorScheme.iconBlack2
        )
        Text(
            text = stringResource(id = title),
            style = CleaningLabTheme.typography.label6,
            color = CleaningLabTheme.colorScheme.iconBlack2
        )
    }
}

/**
 * 추가 옵션과 함께 선택한 화면으로 이동시켜주는 함수
 * 1. popUpTo(it) { saveState = true }: 첫 번째 화면만 스택에 쌓이게 하고 백버튼 클릭 시 첫 번째 화면으로 이동한다.
 * 2. launchSingleTop: true 일 때 화면 인스턴스가 하나만 만들어진다.
 * 3. restoreState: true 일 때 버튼을 재 클릭 했을 때 이전 상태가 남아있게 한다.
 *
 * @param route 이동할 경로
 */
private fun onItemClickWithOptions(
    navController: NavHostController,
    route: String,
) {
    navController.navigate(route) {
        navController.graph.startDestinationRoute?.let {
            popUpTo(it) { saveState = true }
        }
        launchSingleTop = true
        restoreState = true
    }
}

private val contentPadding = { density: Float ->
    PaddingValues(
        start = 32.dp(density),
        end = 32.5.dp(density),
        top = 14.dp(density),
        bottom = 6.dp(density)
    )
}

@Preview(showBackground = true)
@Composable
private fun ItemPreview() {
    Item(
        icon = R.drawable.ic_outlined_home,
        title = R.string.bottom_navigation_title_home,
        onClick = { }
    )
}

@Preview(showBackground = true)
@Composable
private fun BottomNavigationBarPreview() {
    val navController = rememberNavController()

    CleaningLabAppTheme {
        Scaffold(
            bottomBar = {
                BottomNavigationBar(
                    modifier = Modifier.fillMaxWidth(),
                    navController = navController
                )
            }
        ) {
            Box(modifier = Modifier.padding(it))
        }
    }
}
