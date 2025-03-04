package com.example.designsystem.theme.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun ThemeTestScreen() {
    var count by remember {
        mutableIntStateOf(0)
    }

    CleaningLabAppTheme {
        Box(
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(CleaningLabTheme.shapes.large))
                .background(CleaningLabTheme.colorScheme.backgroundGray),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "$count", style = CleaningLabTheme.typography.headline1)
                Button(
                    onClick = { count++ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = CleaningLabTheme.colorScheme.primaryNormal
                    )
                ) {
                    Text(text = "count up")
                }
            }
        }
    }
}