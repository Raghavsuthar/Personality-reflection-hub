package com.grsuthar.personalityreflectionhub.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.LocalHospital
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material.icons.filled.PhoneInTalk
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grsuthar.personalityreflectionhub.data.HelplineData
import com.grsuthar.personalityreflectionhub.data.Language
import com.grsuthar.personalityreflectionhub.ui.components.dialNumber
import com.grsuthar.personalityreflectionhub.ui.theme.CrisisContainer
import com.grsuthar.personalityreflectionhub.ui.theme.CrisisDark
import com.grsuthar.personalityreflectionhub.ui.theme.CrisisRed
import com.grsuthar.personalityreflectionhub.ui.theme.TealContainer
import com.grsuthar.personalityreflectionhub.ui.theme.TealDark

@Composable
fun HelplinesScreen(
    language: Language,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Header
        Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text(
                text = when (language) {
                    Language.ENGLISH -> "Crisis Helplines & Evidence-Based Care"
                    Language.HINDI -> "संकट हेल्पलाइन एवं वैज्ञानिक उपचार"
                    Language.GUJARATI -> "કટોકટી હેલ્પલાઇન અને વૈજ્ઞાનિક સારવાર"
                },
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = when (language) {
                    Language.ENGLISH -> "Free, confidential 24/7 crisis support across India, and clear explanations of proven psychotherapy treatments."
                    Language.HINDI -> "पूरे भारत में 24/7 निःशुल्क, गोपनीय संकट सहायता और प्रमाणित मनोवैज्ञानिक उपचारों की स्पष्ट जानकारी।"
                    Language.GUJARATI -> "સમગ્ર ભારતમાં 24/7 મફત, ગોપનીય સહાય અને સાબિત થયેલ સાયકોથેરાપી સારવારની સ્પષ્ટ સમજણ."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Section 1: Verified National Helplines (India)
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.PhoneInTalk,
                    contentDescription = null,
                    tint = CrisisRed
                )
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Verified Crisis Helplines (India)"
                        Language.HINDI -> "सत्यापित संकट हेल्पलाइन (भारत)"
                        Language.GUJARATI -> "ચકાસાયેલ કટોકટી હેલ્પલાઇન (ભારત)"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            HelplineData.helplines.forEach { helpline ->
                val isUrgent = helpline.number == "14416" || helpline.number == "112"
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { dialNumber(context, helpline.number) },
                    colors = CardDefaults.cardColors(
                        containerColor = if (isUrgent) CrisisContainer else MaterialTheme.colorScheme.surface
                    ),
                    border = BorderStroke(
                        1.dp,
                        if (isUrgent) CrisisRed else MaterialTheme.colorScheme.outline
                    ),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = helpline.name.get(language),
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isUrgent) CrisisDark else MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    text = helpline.hours.get(language),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }

                            Button(
                                onClick = { dialNumber(context, helpline.number) },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (isUrgent) CrisisRed else MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Icon(Icons.Default.Call, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Call", fontWeight = FontWeight.Bold)
                            }
                        }

                        Text(
                            text = helpline.description.get(language),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        Text(
                            text = "Direct Number: ${helpline.number}",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = if (isUrgent) CrisisRed else MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }

        // Section 2: Ahmedabad & GIMH Verification Notice
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.LocalHospital,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "Gujarat Institute of Mental Health (GIMH) / Ahmedabad",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                Text(
                    text = HelplineData.ahmedabadLocalPlaceholder.get(language),
                    style = MaterialTheme.typography.bodySmall,
                    lineHeight = 18.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        // Section 3: Finding a Professional (India Practical & Stigma-Sensitive Guide)
        FindingProfessionalSection(language = language)

        // Section 4: Evidence-Based Treatment Demystified
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Psychology,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "What Real Treatment Looks Like"
                        Language.HINDI -> "वास्तविक उपचार कैसा होता है?"
                        Language.GUJARATI -> "વાસ્તવિક સારવાર કેવી હોય છે?"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            HelplineData.treatmentModalityCards.forEach { card ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = card.first.get(language),
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = card.second.get(language),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = card.third.get(language),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }

        // Section 4: Tele-MANAS Details
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = TealContainer),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "About Tele-MANAS (Government of India)",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = TealDark
                )
                Text(
                    text = "Tele-MANAS was launched by the Ministry of Health and Family Welfare to provide universal access to equitable, affordable, and quality mental health care through 24/7 tele-counseling across 36 states and union territories in over 20 regional languages including Gujarati, Hindi, and English.",
                    style = MaterialTheme.typography.bodySmall,
                    color = TealDark,
                    lineHeight = 18.sp
                )
            }
        }
    }
}
