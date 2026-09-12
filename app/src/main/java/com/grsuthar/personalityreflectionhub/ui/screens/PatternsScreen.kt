package com.grsuthar.personalityreflectionhub.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.LocalHospital
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.OpenInNew
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grsuthar.personalityreflectionhub.data.*
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
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(
                                text = card.title.get(language),
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = card.subtitle.get(language),
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Medium,
                                color = MaterialTheme.colorScheme.primary
                            )
                            Text(
                                text = card.description.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Card(
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = card.example.get(language),
                                    modifier = Modifier.padding(8.dp),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp
                                )
                            }
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
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(
                                text = lvl.title.get(language),
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold,
                                color = TealDark
                            )
                            Text(
                                text = lvl.summary.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = lvl.description.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Card(
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = lvl.everydayImpactExample.get(language),
                                    modifier = Modifier.padding(8.dp),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp
                                )
                            }
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

        // Section 6: Understanding the Causes (Etiology & Development)
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
                        Language.ENGLISH -> "Understanding the Causes"
                        Language.HINDI -> "कारणों को समझना"
                        Language.GUJARATI -> "કારણોને સમજવું"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = when (language) {
                    Language.ENGLISH -> "Personality patterns develop from a natural interplay of biological vulnerability, early caregiving experiences, and stressful life events — not personal weakness."
                    Language.HINDI -> "व्यक्तित्व पैटर्न जैविक संवेदनशीलता, बचपन के माहौल और जीवन के तनावों के आपसी मेल से बनते हैं — यह किसी की कमजोरी या पसंद नहीं है।"
                    Language.GUJARATI -> "વ્યક્તિત્વના વલણો જૈવિક સંવેદનશીલતા, બાળપણના વાતાવરણ અને જીવનના તણાવના સમન્વયથી ઘડાય છે — આ કોઈ અંગત નબળાઈ કે પસંદગી નથી."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            PsychoeducationData.causesSection.forEach { item ->
                EducationalSectionAccordion(item = item, language = language)
            }
        }

        // Section 7: Prognosis, Change & Hope (What Science Shows)
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.TrendingUp,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Prognosis, Change & Hope"
                        Language.HINDI -> "भविष्य, बदलाव एवं आशा"
                        Language.GUJARATI -> "સુધારો, પરિવર્તન અને આશા"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = when (language) {
                    Language.ENGLISH -> "Scientific follow-up studies reveal that personality patterns are not fixed for life. They soften naturally over adulthood, and targeted skills training creates genuine neuroplastic change."
                    Language.HINDI -> "वैज्ञानिक शोध बताते हैं कि व्यक्तित्व के लक्षण जीवन भर एक जैसे नहीं रहते। उम्र के साथ वे स्वाभाविक रूप से शांत होते हैं, और सही कौशल सीखने से मस्तिष्क में सकारात्मक बदलाव आता है।"
                    Language.GUJARATI -> "વૈજ્ઞાનિક સંશોધનો દર્શાવે છે કે વ્યક્તિત્વના લક્ષણો આખી જિંદગી એકસરખા નથી રહેતા. ઉંમર સાથે તેઓ કુદરતી રીતે હળવા બને છે અને સાચા કૌશલ્યો શીખવાથી મગજમાં હકારાત્મક બદલાવ આવે છે."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            PsychoeducationData.prognosisSection.forEach { item ->
                EducationalSectionAccordion(item = item, language = language)
            }
        }

        // Section 8: Common Co-occurring Conditions (Comorbidity)
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
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
                    text = when (language) {
                        Language.ENGLISH -> "Common Co-occurring Patterns"
                        Language.HINDI -> "साथ में होने वाली स्थितियाँ (सह-रुग्णता)"
                        Language.GUJARATI -> "સાથે જોવા મળતી સ્થિતિઓ"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = when (language) {
                    Language.ENGLISH -> "Intense personality friction rarely exists in isolation. It commonly co-occurs with episodes of depression, anxiety, or trauma reactions, which can be treated directly."
                    Language.HINDI -> "व्यक्तित्व की चुनौतियाँ अक्सर अकेले नहीं आतीं। इनके साथ अक्सर अवसाद (डिप्रेशन), घबराहट (चिंता) या तनाव के लक्षण भी जुड़े होते हैं, जिनका सीधे उपचार किया जा सकता है।"
                    Language.GUJARATI -> "વ્યક્તિત્વની મુશ્કેલીઓ ભાગ્યે જ એકલી હોય છે. તેની સાથે ડિપ્રેશન, ચિંતા કે આઘાતની પ્રતિક્રિયાઓ પણ જોવા મળે છે, જેની સીધી સારવાર કરી શકાય છે."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            PsychoeducationData.comorbiditySection.forEach { item ->
                EducationalSectionAccordion(item = item, language = language)
            }
        }

        // Section 9: Glossary of Key Terms
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.MenuBook,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Glossary of Key Terms"
                            Language.HINDI -> "महत्वपूर्ण शब्दों की शब्दावली"
                            Language.GUJARATI -> "મહત્વપૂર્ણ શબ્દોની પરિભાષા"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Plain-language explanations of clinical terms used in modern psychiatric personality assessment."
                        Language.HINDI -> "आधुनिक मनोरोग व्यक्तित्व मूल्यांकन में प्रयुक्त नैदानिक शब्दों की सरल व्याख्या।"
                        Language.GUJARATI -> "આધુનિક માનસિક મૂલ્યાંકનમાં વપરાતા તબીબી શબ્દોની સરળ ભાષામાં સમજૂતી."
                    },
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                PsychoeducationData.glossaryItems.forEach { item ->
                    GlossaryItemCard(item = item, language = language)
                }
            }
        }

        // Section 10: Frequently Asked Questions (FAQ)
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.HelpOutline,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Frequently Asked Questions"
                            Language.HINDI -> "अक्सर पूछे जाने वाले सवाल"
                            Language.GUJARATI -> "વારંવાર પૂછાતા પ્રશ્નો"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                PsychoeducationData.expandedFaqItems.forEach { faq ->
                    FaqAccordionItem(item = faq, language = language)
                }
            }
        }

        // Section 11: Sources & Scientific References
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)),
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
                        imageVector = Icons.Default.Book,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Sources & Clinical References"
                            Language.HINDI -> "स्रोत एवं वैज्ञानिक संदर्भ"
                            Language.GUJARATI -> "સંદર્ભો અને વૈજ્ઞાનિક માહિતી"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = when (language) {
                        Language.ENGLISH -> "All educational content in this hub is synthesized from established international psychiatric and psychological frameworks:"
                        Language.HINDI -> "इस हब की समस्त शैक्षिक सामग्री स्थापित अंतरराष्ट्रीय मनोरोग एवं मनोवैज्ञानिक दिशा-निर्देशों पर आधारित है:"
                        Language.GUJARATI -> "આ હબની તમામ માહિતી આંતરરાષ્ટ્રીય માનસિક સ્વાસ્થ્ય માર્ગદર્શિકાઓ પર આધારિત છે:"
                    },
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                PsychoeducationData.sourcesAndReferences.forEach { sourcePair ->
                    SourceReferenceCard(title = sourcePair.first, citation = sourcePair.second)
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

                    // Everyday Illustrative Example
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        border = BorderStroke(1.dp, item.domain.accentColor.copy(alpha = 0.35f)),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = when (language) {
                                    Language.ENGLISH -> "Illustrative Everyday Example:"
                                    Language.HINDI -> "दैनिक जीवन का उदाहरण:"
                                    Language.GUJARATI -> "દૈનિક જીવનનું ઉદાહરણ:"
                                },
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = item.domain.accentColor
                            )
                            Text(
                                text = item.illustrativeExample.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface
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

@Composable
private fun EducationalSectionAccordion(
    item: EducationalSectionItem,
    language: Language
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded }
                    .padding(14.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = item.title.get(language),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = item.summary.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        lineHeight = 18.sp
                    )
                }
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = if (expanded) "Show less" else "Show more",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }

            AnimatedVisibility(visible = expanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)

                    item.details.forEach { paragraph ->
                        Text(
                            text = paragraph.get(language),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 22.sp
                        )
                    }

                    Surface(
                        color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = when (language) {
                                    Language.ENGLISH -> "Key Takeaway:"
                                    Language.HINDI -> "मुख्य निष्कर्ष:"
                                    Language.GUJARATI -> "મુખ્ય તારણ:"
                                },
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )
                            Text(
                                text = item.takeaway.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 18.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
    }
}

@Composable
private fun GlossaryItemCard(
    item: GlossaryItem,
    language: Language
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                text = item.term.get(language),
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Text(
                text = item.plainDefinition.get(language),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 18.sp
            )

            Surface(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(6.dp),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Row(modifier = Modifier.padding(8.dp)) {
                    Text(
                        text = "Why it matters: ",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.secondary
                    )
                    Text(
                        text = item.whyItMatters.get(language),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun FaqAccordionItem(
    item: FAQItem,
    language: Language
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded }
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = item.question.get(language),
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Icon(
                    imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            AnimatedVisibility(visible = expanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = item.answer.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 20.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                }
            }
        }
    }
}

@Composable
private fun SourceReferenceCard(
    title: String,
    citation: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Text(
                text = citation,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 18.sp
            )
        }
    }
}
