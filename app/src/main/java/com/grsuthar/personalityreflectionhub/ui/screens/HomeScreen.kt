package com.grsuthar.personalityreflectionhub.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.PhoneInTalk
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grsuthar.personalityreflectionhub.data.Language
import com.grsuthar.personalityreflectionhub.data.NavDestination
import com.grsuthar.personalityreflectionhub.ui.components.dialNumber
import com.grsuthar.personalityreflectionhub.ui.theme.*

@Composable
fun HomeScreen(
    language: Language,
    onNavigate: (NavDestination) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var showCrisisSupportDialog by remember { mutableStateOf(false) }

    // Single-section layout (no scroll) with floating emergency support in lower-left corner
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 64.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Reflect and Educate — Never Diagnose Context Header
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                shape = RoundedCornerShape(12.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Shield,
                        contentDescription = null,
                        tint = TealPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Reflect & Educate — Never Diagnose"
                                Language.HINDI -> "चिंतन और शिक्षा — कभी निदान नहीं"
                                Language.GUJARATI -> "ચિંતન અને શિક્ષણ — ક્યારેય નિદાન નહીં"
                            },
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Continuous trait dimensions and compassionate family guidance without labels."
                                Language.HINDI -> "बिना किसी बीमारी के ठप्पे के, निरंतर व्यक्तित्व आयामों और परिवार मार्गदर्शन की समझ।"
                                Language.GUJARATI -> "કોઈ રોગના લેબલ વગર, વ્યક્તિત્વના સતત આયામો અને કૌટુંબિક માર્ગદર્શનનું ચિંતન."
                            },
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }

            // 2-Column Tile Grid: 4 Core Sections (Filling central height dynamically)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(vertical = 6.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Explore Pathways"
                        Language.HINDI -> "मुख्य मार्ग चुनें"
                        Language.GUJARATI -> "મુખ્ય માર્ગો"
                    },
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                // Row 1: Self-Reflection & Understand Patterns
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    HomeSectionTile(
                        title = when (language) {
                            Language.ENGLISH -> "Self-Reflection"
                            Language.HINDI -> "आत्म-चिंतन"
                            Language.GUJARATI -> "આત્મ-ચિંતન"
                        },
                        description = when (language) {
                            Language.ENGLISH -> "5 ICD-11 trait domains"
                            Language.HINDI -> "5 ICD-11 लक्षण क्षेत्र"
                            Language.GUJARATI -> "૫ ICD-11 લક્ષણ ક્ષેત્રો"
                        },
                        icon = Icons.Default.Psychology,
                        containerColor = SectionReflectContainer,
                        accentColor = SectionReflectAccent,
                        onClick = { onNavigate(NavDestination.REFLECT) },
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                    )

                    HomeSectionTile(
                        title = when (language) {
                            Language.ENGLISH -> "Understand Patterns"
                            Language.HINDI -> "पैटर्न समझें"
                            Language.GUJARATI -> "પેટર્ન સમજો"
                        },
                        description = when (language) {
                            Language.ENGLISH -> "Domains, severity & myths"
                            Language.HINDI -> "लक्षण, गंभीरता और मिथक"
                            Language.GUJARATI -> "ક્ષેત્રો, ગંભીરતા અને માન્યતાઓ"
                        },
                        icon = Icons.Default.MenuBook,
                        containerColor = SectionPatternsContainer,
                        accentColor = SectionPatternsAccent,
                        onClick = { onNavigate(NavDestination.PATTERNS) },
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                    )
                }

                // Row 2: Caregiver Hub & Crisis Helplines
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    HomeSectionTile(
                        title = when (language) {
                            Language.ENGLISH -> "Caregiver Hub"
                            Language.HINDI -> "देखभालकर्ता हब"
                            Language.GUJARATI -> "સંભાળકર્તા હબ"
                        },
                        description = when (language) {
                            Language.ENGLISH -> "Scripts & family support"
                            Language.HINDI -> "संवाद और परिवार सहायता"
                            Language.GUJARATI -> "વાતચીત અને કુટુંબ સહાય"
                        },
                        icon = Icons.Default.Favorite,
                        containerColor = SectionCaregiverContainer,
                        accentColor = SectionCaregiverAccent,
                        onClick = { onNavigate(NavDestination.CAREGIVER) },
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                    )

                    HomeSectionTile(
                        title = when (language) {
                            Language.ENGLISH -> "Crisis & Helplines"
                            Language.HINDI -> "संकट एवं हेल्पलाइन"
                            Language.GUJARATI -> "કટોકટી અને હેલ્પલાઇન"
                        },
                        description = when (language) {
                            Language.ENGLISH -> "24/7 verified care & GIMH"
                            Language.HINDI -> "24/7 निःशुल्क सहायता व GIMH"
                            Language.GUJARATI -> "24/7 મફત સહાય અને GIMH"
                        },
                        icon = Icons.Default.PhoneInTalk,
                        containerColor = SectionHelplinesContainer,
                        accentColor = SectionHelplinesAccent,
                        onClick = { onNavigate(NavDestination.HELPLINES) },
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                    )
                }
            }

            // Clinical Direction & Foundation (Dr. Vidhi Pareekh 1st & Dr. Raghav Suthar 2nd)
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalArrangement = Arrangement.spacedBy(1.dp)
                ) {
                    Text(
                        text = "Clinical Direction & Foundation",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "1. Dr. Vidhi Pareekh, MD Psychiatry\n2. Dr. Raghav Suthar, DNB Psychiatry",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Gujarat Institute of Mental Health (GIMH), Ahmedabad • On-device psychoeducation only",
                        style = MaterialTheme.typography.bodySmall,
                        fontSize = 10.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }

        // Immediate Support Red Highlighted Section — Floating in Left Lower Corner
        Surface(
            onClick = { showCrisisSupportDialog = true },
            shape = RoundedCornerShape(20.dp),
            color = CrisisRed,
            shadowElevation = 8.dp,
            border = BorderStroke(1.5.dp, Color.White.copy(alpha = 0.8f)),
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 16.dp, bottom = 12.dp)
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Crisis Call",
                    tint = Color.White,
                    modifier = Modifier.size(16.dp)
                )
                Column {
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Immediate Help"
                            Language.HINDI -> "तत्काल सहायता"
                            Language.GUJARATI -> "તાત્કાલિક સહાય"
                        },
                        style = MaterialTheme.typography.labelSmall,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                    Text(
                        text = "14416 / 112",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }

    // Immediate Crisis Support Dialog (Triggered from Floating Button)
    if (showCrisisSupportDialog) {
        AlertDialog(
            onDismissRequest = { showCrisisSupportDialog = false },
            icon = {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null,
                    tint = CrisisRed,
                    modifier = Modifier.size(28.dp)
                )
            },
            title = {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Immediate Crisis Support"
                        Language.HINDI -> "तत्काल संकट सहायता"
                        Language.GUJARATI -> "તાત્કાલિક કટોકટી સહાય"
                    },
                    fontWeight = FontWeight.Bold,
                    color = CrisisDark
                )
            },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "If you or someone you care about is experiencing overwhelming distress, thoughts of self-harm, or danger, free confidential help is available 24/7."
                            Language.HINDI -> "यदि आप या आपका कोई प्रियजन अत्यधिक तनाव, खुद को नुकसान पहुँचाने के विचार या खतरे में हैं, तो 24/7 निःशुल्क सहायता उपलब्ध है।"
                            Language.GUJARATI -> "જો તમે કે તમારા સ્વજન અતિશય તણાવ, જાતને નુકસાન પહોંચાડવાના વિચારો કે સંકટમાં છો, તો 24/7 મફત સહાય ઉપલબ્ધ છે."
                        },
                        style = MaterialTheme.typography.bodyMedium
                    )

                    Button(
                        onClick = {
                            showCrisisSupportDialog = false
                            dialNumber(context, "14416")
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = CrisisRed),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Default.Call, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Call Tele-MANAS (14416)", fontWeight = FontWeight.Bold)
                    }

                    OutlinedButton(
                        onClick = {
                            showCrisisSupportDialog = false
                            dialNumber(context, "112")
                        },
                        border = BorderStroke(1.dp, CrisisRed),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Call National Emergency (112)", fontWeight = FontWeight.Bold, color = CrisisRed)
                    }
                }
            },
            confirmButton = {},
            dismissButton = {
                TextButton(onClick = { showCrisisSupportDialog = false }) {
                    Text("Dismiss")
                }
            }
        )
    }
}

/**
 * Clean, flat, solid-fill rounded tile following the pastel-container and deep-accent system.
 * Designed with a single corner radius (16.dp), consistent internal padding (14.dp),
 * one icon, one title, and one short description.
 */
@Composable
private fun HomeSectionTile(
    title: String,
    description: String,
    icon: ImageVector,
    containerColor: Color,
    accentColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clickable(onClick = onClick),
        colors = CardDefaults.cardColors(containerColor = containerColor),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(14.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = accentColor,
                modifier = Modifier.size(28.dp)
            )
            Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = accentColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
