package com.example.designsystem.theme.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable

@Immutable
data class CleaningLabShape(
    val small: Int = 9,
    val medium: Int = 12,
    val large: Int = 27,
) {
    val roundedSmall: CornerBasedShape = RoundedCornerShape(small)
    val roundedMedium: CornerBasedShape = RoundedCornerShape(medium)
    val roundedLarge: CornerBasedShape = RoundedCornerShape(large)
}

