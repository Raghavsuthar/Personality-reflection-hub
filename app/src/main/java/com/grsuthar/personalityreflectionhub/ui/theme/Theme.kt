package com.grsuthar.personalityreflectionhub.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = TealPrimary,
    onPrimary = Color.White,
    primaryContainer = TealContainer,
    onPrimaryContainer = OnTealContainer,
    secondary = TealDark,
    onSecondary = Color.White,
    background = CanvasBackground,
    onBackground = TextPrimary,
    surface = SurfaceCard,
    onSurface = TextPrimary,
    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = TextSecondary,
    error = CrisisRed,
    onError = Color.White,
    errorContainer = CrisisContainer,
    onErrorContainer = OnCrisisContainer,
    outline = CardBorder
)

private val DarkColorScheme = darkColorScheme(
    primary = TealLight,
    onPrimary = TealDark,
    primaryContainer = TealDark,
    onPrimaryContainer = TealContainer,
    secondary = TealLight,
    onSecondary = TealDark,
    background = Color(0xFF101414),
    onBackground = Color(0xFFE1E3E3),
    surface = Color(0xFF181C1D),
    onSurface = Color(0xFFE1E3E3),
    surfaceVariant = Color(0xFF262C2C),
    onSurfaceVariant = Color(0xFFC0C8C8),
    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),
    outline = Color(0xFF3F4848)
)

@Composable
fun PersonalityReflectionHubTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // Unconditional light mode lock as per design specifications
    val colorScheme = LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
