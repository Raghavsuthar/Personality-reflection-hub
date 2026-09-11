package com.grsuthar.personalityreflectionhub.ui.components

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.outlined.AutoStories
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Psychology
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.grsuthar.personalityreflectionhub.data.Language
import com.grsuthar.personalityreflectionhub.data.NavDestination
import com.grsuthar.personalityreflectionhub.data.UiText

@Composable
fun AppBottomNavBar(
    currentDestination: NavDestination,
    onNavigate: (NavDestination) -> Unit,
    language: Language,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
        windowInsets = WindowInsets.navigationBars,
        containerColor = MaterialTheme.colorScheme.surface,
        tonalElevation = 2.dp
    ) {
        NavigationBarItem(
            selected = currentDestination == NavDestination.HOME,
            onClick = { onNavigate(NavDestination.HOME) },
            icon = {
                Icon(
                    imageVector = if (currentDestination == NavDestination.HOME) Icons.Filled.Home else Icons.Outlined.Home,
                    contentDescription = UiText.navHome.get(language)
                )
            },
            label = {
                Text(
                    text = UiText.navHome.get(language),
                    style = MaterialTheme.typography.labelSmall
                )
            },
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                selectedIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
                selectedTextColor = MaterialTheme.colorScheme.primary
            )
        )

        NavigationBarItem(
            selected = currentDestination == NavDestination.REFLECT,
            onClick = { onNavigate(NavDestination.REFLECT) },
            icon = {
                Icon(
                    imageVector = if (currentDestination == NavDestination.REFLECT) Icons.Filled.Psychology else Icons.Outlined.Psychology,
                    contentDescription = UiText.navReflect.get(language)
                )
            },
            label = {
                Text(
                    text = UiText.navReflect.get(language),
                    style = MaterialTheme.typography.labelSmall
                )
            },
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                selectedIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
                selectedTextColor = MaterialTheme.colorScheme.primary
            )
        )

        NavigationBarItem(
            selected = currentDestination == NavDestination.PATTERNS,
            onClick = { onNavigate(NavDestination.PATTERNS) },
            icon = {
                Icon(
                    imageVector = if (currentDestination == NavDestination.PATTERNS) Icons.Filled.AutoStories else Icons.Outlined.AutoStories,
                    contentDescription = UiText.navPatterns.get(language)
                )
            },
            label = {
                Text(
                    text = UiText.navPatterns.get(language),
                    style = MaterialTheme.typography.labelSmall
                )
            },
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                selectedIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
                selectedTextColor = MaterialTheme.colorScheme.primary
            )
        )

        NavigationBarItem(
            selected = currentDestination == NavDestination.CAREGIVER,
            onClick = { onNavigate(NavDestination.CAREGIVER) },
            icon = {
                Icon(
                    imageVector = if (currentDestination == NavDestination.CAREGIVER) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = UiText.navCaregiver.get(language)
                )
            },
            label = {
                Text(
                    text = UiText.navCaregiver.get(language),
                    style = MaterialTheme.typography.labelSmall
                )
            },
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                selectedIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
                selectedTextColor = MaterialTheme.colorScheme.primary
            )
        )

        NavigationBarItem(
            selected = currentDestination == NavDestination.HELPLINES,
            onClick = { onNavigate(NavDestination.HELPLINES) },
            icon = {
                Icon(
                    imageVector = if (currentDestination == NavDestination.HELPLINES) Icons.Filled.Call else Icons.Outlined.Call,
                    contentDescription = UiText.navHelplines.get(language)
                )
            },
            label = {
                Text(
                    text = UiText.navHelplines.get(language),
                    style = MaterialTheme.typography.labelSmall
                )
            },
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                selectedIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
                selectedTextColor = MaterialTheme.colorScheme.primary
            )
        )
    }
}
