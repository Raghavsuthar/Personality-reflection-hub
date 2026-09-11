package com.grsuthar.personalityreflectionhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.grsuthar.personalityreflectionhub.data.Language
import com.grsuthar.personalityreflectionhub.data.NavDestination
import com.grsuthar.personalityreflectionhub.ui.components.AppBottomNavBar
import com.grsuthar.personalityreflectionhub.ui.components.AppTopBar
import com.grsuthar.personalityreflectionhub.ui.components.CrisisDialog
import com.grsuthar.personalityreflectionhub.ui.screens.*
import com.grsuthar.personalityreflectionhub.ui.theme.PersonalityReflectionHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PersonalityReflectionHubTheme {
                var currentLanguage by rememberSaveable { mutableStateOf(Language.ENGLISH) }
                var currentDestination by rememberSaveable { mutableStateOf(NavDestination.HOME) }
                var showCrisisDialog by remember { mutableStateOf(false) }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        contentWindowInsets = WindowInsets.safeDrawing,
                        topBar = {
                            AppTopBar(
                                currentLanguage = currentLanguage,
                                onLanguageChange = { currentLanguage = it },
                                onCrisisClick = { showCrisisDialog = true }
                            )
                        },
                        bottomBar = {
                            AppBottomNavBar(
                                currentDestination = currentDestination,
                                onNavigate = { currentDestination = it },
                                language = currentLanguage
                            )
                        }
                    ) { innerPadding ->
                        val screenModifier = Modifier.padding(innerPadding)

                        when (currentDestination) {
                            NavDestination.HOME -> HomeScreen(
                                language = currentLanguage,
                                onNavigate = { currentDestination = it },
                                modifier = screenModifier
                            )
                            NavDestination.REFLECT -> ReflectScreen(
                                language = currentLanguage,
                                modifier = screenModifier
                            )
                            NavDestination.PATTERNS -> PatternsScreen(
                                language = currentLanguage,
                                modifier = screenModifier
                            )
                            NavDestination.CAREGIVER -> CaregiverScreen(
                                language = currentLanguage,
                                modifier = screenModifier
                            )
                            NavDestination.HELPLINES -> HelplinesScreen(
                                language = currentLanguage,
                                modifier = screenModifier
                            )
                        }

                        if (showCrisisDialog) {
                            CrisisDialog(
                                language = currentLanguage,
                                onDismiss = { showCrisisDialog = false }
                            )
                        }
                    }
                }
            }
        }
    }
}
