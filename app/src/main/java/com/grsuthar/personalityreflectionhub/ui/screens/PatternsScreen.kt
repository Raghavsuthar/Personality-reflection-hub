package com.grsuthar.personalityreflectionhub.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grsuthar.personalityreflectionhub.data.Language
import com.grsuthar.personalityreflectionhub.data.PsychoeducationData
import com.grsuthar.personalityreflectionhub.data.TraitDomain
import com.grsuthar.personalityreflectionhub.ui.theme.TealContainer
import com.grsuthar.personalityreflectionhub.ui.theme.TealDark
import com.grsuthar.personalityreflectionhub.ui.theme.TealPrimary

@Composable
fun PatternsScreen(
    language: Language,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

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
                    Language.ENGLISH -> "Understanding Personality (ICD-11)"
                    Language.HINDI -> "व्यक्तित्व को समझना (ICD-11)"
                    Language.GUJARATI -> "વ્યક્તિત્વને સમજવું (ICD-11)"
                },
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = PsychoeducationData.conceptDifferenceIntro.get(language),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Section 1: Concept Difference (Pattern vs Difficulty vs Disorder)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                Text(
                    text = PsychoeducationData.conceptDifferenceTitle.get(language),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )

                PsychoeducationData.conceptCards.forEach { card ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = card.first.get(language),
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = card.second.get(language),
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Medium,
                                color = MaterialTheme.colorScheme.primary
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
        }

        // Section 2: Severity Spectrum (ICD-11)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = PsychoeducationData.severityTitle.get(language),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )

                Text(
                    text = PsychoeducationData.severityIntro.get(language),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                PsychoeducationData.severityLevels.forEach { lvl ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = lvl.first.get(language),
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold,
                                color = TealDark
                            )
                            Text(
                                text = lvl.second.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = lvl.third.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }

        // Section 3: The 5 Trait Domains + Borderline Pattern Specifier
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text(
                text = when (language) {
                    Language.ENGLISH -> "The 5 Trait Domains & Borderline Specifier"
                    Language.HINDI -> "5 लक्षण क्षेत्र एवं बॉर्डरलाइन पैटर्न"
                    Language.GUJARATI -> "૫ લક્ષણ ક્ષેત્રો અને બોર્ડરલાઇન પેટર્ન"
                },
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )

            PsychoeducationData.traitDomainDetails.forEach { item ->
                DomainDetailAccordion(item = item, language = language)
            }
        }

        // Section 4: Bridging Guide (Where did old DSM terms go?)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.School,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Where Did Older Terms Go?"
                            Language.HINDI -> "पुराने शब्द कहाँ गए? (DSM vs ICD-11)"
                            Language.GUJARATI -> "જૂના શબ્દો ક્યાં ગયા? (DSM vs ICD-11)"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Older psychiatric manuals divided personalities into 10 rigid boxes (like 'Borderline', 'Narcissistic', 'Avoidant', 'Schizoid').\n\n" +
                                "In real life, people rarely fit neatly into single boxes. Most individuals have complex mixes.\n\n" +
                                "WHO ICD-11 retired these rigid categories in favor of continuous trait dimensions plus severity. The only retained specific label is 'Borderline Pattern' — kept as an optional specifier because proven treatments (like DBT) were designed for it."
                        Language.HINDI -> "पुराने वर्गीकरण में व्यक्तित्व को 10 कठोर डिब्बों में बाँटा जाता था (जैसे बॉर्डरलाइन, नार्सिसिस्टिक, अवॉइडेंट आदि)।\n\n" +
                                "वास्तविक जीवन में लोग किसी एक डिब्बे में सीमित नहीं होते।\n\n" +
                                "इसलिए WHO ICD-11 ने इन लेबलों को हटाकर निरंतर लक्षणों और गंभीरता का मॉडल अपनाया है। केवल 'बॉर्डरलाइन पैटर्न' को एक वैकल्पिक पहचान के रूप में रखा गया है क्योंकि DBT जैसी सिद्ध थेरेपी इसके लिए बनी है।"
                        Language.GUJARATI -> "જૂના વર્ગીકરણમાં વ્યક્તિત્વને ૧૦ જક્કી ખાનાઓમાં વહેંચવામાં આવતું હતું.\n\n" +
                                "વાસ્તવિક જીવનમાં લોકો કોઈ એક ખાનામાં બંધબેસતા નથી.\n\n" +
                                "આથી WHO ICD-11 એ લેબલો દૂર કરીને સતત લક્ષણો અને ગંભીરતાનું મોડલ અપનાવ્યું છે. માત્ર 'બોર્ડરલાઇન પેટર્ન'ને વૈકલ્પિક ઓળખ તરીકે રાખવામાં આવ્યું છે કારણ કે DBT જેવી સાબિત થેરાપીઓ તેના માટે ખાસ બનેલી છે."
                    },
                    style = MaterialTheme.typography.bodySmall,
                    lineHeight = 20.sp
                )
            }
        }

        // Section 5: Common Myths vs Facts
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Myths vs. Evidence-Based Facts"
                        Language.HINDI -> "मिथक बनाम वैज्ञानिक तथ्य"
                        Language.GUJARATI -> "માન્યતાઓ વિરુદ્ધ વૈજ્ઞાનિક હકીકતો"
                    },
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )

                PsychoeducationData.mythsVsFacts.forEach { pair ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = pair.first.get(language),
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.error
                            )
                            Text(
                                text = pair.second.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun DomainDetailAccordion(
    item: com.grsuthar.personalityreflectionhub.data.PatternEducationItem,
    language: Language
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = item.domain.containerColor),
        border = BorderStroke(1.dp, item.domain.accentColor.copy(alpha = if (expanded) 0.6f else 0.3f)),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded }
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = item.domain.everydayName.get(language),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = item.domain.accentColor
                    )
                    Text(
                        text = "ICD-11: ${item.domain.clinicalName.get(language)}",
                        style = MaterialTheme.typography.bodySmall,
                        color = item.domain.accentColor.copy(alpha = 0.85f),
                        fontWeight = FontWeight.Medium
                    )
                }
                Icon(
                    imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                    contentDescription = null,
                    tint = item.domain.accentColor
                )
            }

            AnimatedVisibility(visible = expanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Divider(color = item.domain.accentColor.copy(alpha = 0.2f))

                    Text(
                        text = item.everydayDescription.get(language),
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )

                    // Day to day look
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Text(
                            text = "What it can look like day-to-day:",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = item.domain.accentColor
                        )
                        item.dayToDayLook.forEach { look ->
                            Text(
                                text = "• ${look.get(language)}",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    // Strengths Reframe
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        border = BorderStroke(1.dp, item.domain.accentColor.copy(alpha = 0.25f)),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "Strengths & Positive Reframe:",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = item.domain.accentColor
                            )
                            Text(
                                text = item.strengthsReframe.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }

                    // Older terms bridge
                    Text(
                        text = "Older nomenclature: ${item.oldTermsBridge.get(language)}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.outline,
                        fontSize = 11.sp
                    )

                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
    }
}
