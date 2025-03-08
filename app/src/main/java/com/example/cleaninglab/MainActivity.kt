package com.example.cleaninglab

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.designsystem.theme.theme.CleaningLabAppTheme
import com.example.designsystem.theme.theme.CleaningLabTheme
import com.example.presentation.bottomNavigation.BottomNavigationBar
import com.example.presentation.bottomNavigation.BottomNavigationGraph
import com.example.presentation.bottomNavigation.BottomNavigationItem

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
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
                    BottomNavigationGraph(
                        modifier = Modifier.fillMaxSize(),
                        navController = navController
                    )
                }
            }
        }
    }
}