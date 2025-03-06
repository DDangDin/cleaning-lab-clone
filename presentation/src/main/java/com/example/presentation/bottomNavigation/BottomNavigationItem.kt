package com.example.presentation.bottomNavigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.presentation.R

/** BottomNavigation 라우트명  */
private enum class BottomNavigationRoute {
    Home,
    MyReservation,
    PlusShop,
    More,
}

/**
 * [BottomNavigationBar] 에서 사용하는 항목 클래스
 *
 * @param route 경로명
 * @param title 표시 이름
 * @param outlinedIcon 기본 상태 아이콘
 * @param filledIcon 클릭 상태 아이콘
 */
sealed class BottomNavigationItem(
    val route: String,
    @StringRes val title: Int,
    @DrawableRes val outlinedIcon: Int,
    @DrawableRes val filledIcon: Int,
) {
    data object Home : BottomNavigationItem(
        route = BottomNavigationRoute.Home.name,
        title = R.string.bottom_navigation_title_home,
        outlinedIcon = R.drawable.ic_outlined_home,
        filledIcon = R.drawable.ic_filled_home,
    )

    data object MyReservation : BottomNavigationItem(
        route = BottomNavigationRoute.MyReservation.name,
        title = R.string.bottom_navigation_title_my_reservation,
        outlinedIcon = R.drawable.ic_outlined_my_reservation,
        filledIcon = R.drawable.ic_filled_my_reservation,
    )

    data object PlusShop : BottomNavigationItem(
        route = BottomNavigationRoute.PlusShop.name,
        title = R.string.bottom_navigation_title_plus_shop,
        outlinedIcon = R.drawable.ic_outlined_plusshop,
        filledIcon = R.drawable.ic_filled_plusshop,
    )

    data object More : BottomNavigationItem(
        route = BottomNavigationRoute.More.name,
        title = R.string.bottom_navigation_title_more,
        outlinedIcon = R.drawable.ic_outlined_more,
        filledIcon = R.drawable.ic_filled_more,
    )

    companion object {
        val items = listOf(Home, MyReservation, PlusShop, More)
    }
}