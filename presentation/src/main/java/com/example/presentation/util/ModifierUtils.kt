package com.example.presentation.util

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import com.example.designsystem.theme.util.dp

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.clickableNoRipple(
    enabled: Boolean = true,
    onClickLabel: String? = null,
    role: Role? = null,
    onClick: () -> Unit,
) = composed {
    clickable(
        interactionSource = remember { MutableInteractionSource() },
        indication = null,
        enabled = enabled,
        onClickLabel = onClickLabel,
        role = role,
        onClick = onClick
    )
}

/**
 * 터치 타겟이 필요한 아이콘에 적용한다.
 *
 * @param iconSize 아이콘 사이즈 (`dp` 단위)
 * @param touchTargetSize 터치 타겟 사이즈 (기본 `44`)
 */
@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.touchTargetIcon(
    iconSize: Int,
    ripple: Boolean = true,
    touchTargetSize: Int = 44,
    onClick: () -> Unit,
) = composed {
    val paddingSize = (touchTargetSize - iconSize) / 2
    val rippleModifier = if (ripple) {
        clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = rememberRipple(),
            onClick = onClick
        )
    } else {
        clickableNoRipple(onClick = onClick)
    }

    clip(CircleShape)
        .then(rippleModifier)
        .padding(paddingSize.dp())
        .size(iconSize.dp())
}