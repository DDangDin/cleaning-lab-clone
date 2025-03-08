package com.example.cleaninglab

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.designsystem.theme.theme.CleaningLabAppTheme
import com.example.presentation.bottomNavigation.BottomNavigationBar
import com.example.presentation.bottomNavigation.BottomNavigationGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            CleaningLabAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
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