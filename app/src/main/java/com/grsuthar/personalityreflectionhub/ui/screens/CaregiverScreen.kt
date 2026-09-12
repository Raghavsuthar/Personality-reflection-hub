package com.grsuthar.personalityreflectionhub.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grsuthar.personalityreflectionhub.data.*
import com.grsuthar.personalityreflectionhub.ui.components.dialNumber
import com.grsuthar.personalityreflectionhub.ui.theme.*

@Composable
fun CaregiverScreen(
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
                    Language.ENGLISH -> "Caregiver & Family Support Hub"
                    Language.HINDI -> "देखभालकर्ता एवं परिवार सहायता हब"
                    Language.GUJARATI -> "સંભાળકર્તા અને પરિવાર સહાયતા હબ"
                },
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = when (language) {
                    Language.ENGLISH -> "Compassionate, practical guidance for supporting someone you love without losing yourself in the process."
                    Language.HINDI -> "प्रियजनों की सहायता के लिए व्यावहारिक और संवेदनशील मार्गदर्शन, बिना खुद को थकाए।"
                    Language.GUJARATI -> "સ્વજનોને સાથ આપવા માટે વ્યવહારુ અને સંવેદનશીલ માર્ગદર્શન, તમારી પોતાની શાંતિ ગુમાવ્યા વગર."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Section 1: Domain-by-Domain Caregiver Guides
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text(
                text = when (language) {
                    Language.ENGLISH -> "Pattern-Specific Caregiver Guides"
                    Language.HINDI -> "पैटर्न-विशिष्ट देखभालकर्ता मार्गदर्शिका"
                    Language.GUJARATI -> "પેટર્ન-આધારિત સંભાળકર્તા માર્ગદર્શિકા"
                },
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )

            CaregiverData.caregiverGuides.forEach { guide ->
                CaregiverGuideAccordion(guide = guide, language = language)
            }
        }

        // Section 2: Communication Skills (Validation & 4-step script)
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
                    text = when (language) {
                        Language.ENGLISH -> "De-escalation & Communication Skills"
                        Language.HINDI -> "तनाव कम करने एवं बातचीत के कौशल"
                        Language.GUJARATI -> "તણાવ ઘટાડવા અને વાતચીતના કૌશલ્યો"
                    },
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )

                Card(
                    colors = CardDefaults.cardColors(containerColor = TealContainer),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "Golden Rule: Validation Before Problem-Solving",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = TealDark
                        )
                        Text(
                            text = "When someone's emotional brain is flooded, logic sounds like rejection. Acknowledge their feeling first ('I hear how frightening this feels') before offering solutions or boundaries.",
                            style = MaterialTheme.typography.bodySmall,
                            color = TealDark
                        )
                    }
                }

                Text(
                    text = "The 4-Step Assertive Communication Script:",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )

                CaregiverData.assertiveScript4Steps.forEach { step ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = step.first.get(language),
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )
                            Text(
                                text = step.second.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
            }
        }

        // Section 3: Setting Boundaries Without Guilt
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Security,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Setting Boundaries Without Guilt"
                            Language.HINDI -> "बिना अपराधबोध सीमाएं तय करना"
                            Language.GUJARATI -> "અપરાધભાવ વગર મર્યાદાઓ નક્કી કરવી"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = "Boundaries are not walls to shut people out. They are fences that keep you safe so you can stay in relationship long-term. Without boundaries, resentment and caregiver burnout destroy the bond.",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                CaregiverData.boundaryScripts.forEach { scriptItem ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(
                                text = scriptItem.title.get(language),
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )
                            Text(
                                text = "Scenario: ${scriptItem.scenario.get(language)}",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Card(
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = scriptItem.script.get(language),
                                    modifier = Modifier.padding(10.dp),
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Medium,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                            Text(
                                text = "Why this works: ${scriptItem.whyItWorks.get(language)}",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
        }

        // Section 4: Expressed Emotion (EE): What Evidence Shows Families
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
                        Language.ENGLISH -> "Expressed Emotion (EE): What Science Shows"
                        Language.HINDI -> "अभिव्यक्त भावना (EE): वैज्ञानिक साक्ष्य"
                        Language.GUJARATI -> "અભિવ્યક્ત લાગણી (EE): વૈજ્ઞાનિક સંશોધનો"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = when (language) {
                    Language.ENGLISH -> "Decades of psychiatric studies prove that family emotional atmosphere profoundly affects recovery. Reducing critical remarks and over-involvement cut relapse rates in half."
                    Language.HINDI -> "दशकों के मनोरोग शोध बताते हैं कि घर का माहौल सुधार को गहराई से प्रभावित करता है। आलोचना और अत्यधिक दखल कम करने से संकट की संभावना आधी हो जाती है।"
                    Language.GUJARATI -> "દાયકાઓના તબીબી સંશોધનો દર્શાવે છે કે ઘરનું વાતાવરણ સુધારાને ઊંડી અસર કરે છે. ટીકા અને વધુ પડતી દખલ ઘટાડવાથી કટોકટીની શક્યતા અડધી થઈ જાય છે."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            CaregiverData.expressedEmotionSection.forEach { item ->
                CaregiverEducationAccordion(item = item, language = language)
            }
        }

        // Section 5: Evidence-Based Family Psychological Management
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Security,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Evidence-Based Family Management"
                        Language.HINDI -> "पारिवारिक प्रबंधन के 5 प्रमाण-आधारित कदम"
                        Language.GUJARATI -> "પારિવારિક વ્યવસ્થાપનના ૫ વૈજ્ઞાનિક પગલાં"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = when (language) {
                    Language.ENGLISH -> "Foundational practices recommended by clinical guidelines to stabilize the home environment and protect both patient and family wellbeing."
                    Language.HINDI -> "घर के माहौल को शांत रखने और मरीज व परिवार दोनों की मानसिक सुरक्षा के लिए नैदानिक दिशा-निर्देशों द्वारा समर्थित 5 मुख्य अभ्यास।"
                    Language.GUJARATI -> "ઘરના વાતાવરણને શાંત રાખવા અને સ્વજન તેમજ કુટુંબ બંનેની સુખાકારી જાળવવા માટે પ્રમાણિત ૫ મહત્વપૂર્ણ વ્યવહારો."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            CaregiverData.familyManagementSteps.forEach { stepItem ->
                CaregiverEducationAccordion(item = stepItem, language = language)
            }
        }

        // Section 6: Safety Planning Walkthrough
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = CrisisContainer),
            border = BorderStroke(1.dp, CrisisRed),
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
                        imageVector = Icons.Default.Warning,
                        contentDescription = null,
                        tint = CrisisRed
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Crisis Safety Planning: 112 vs. 14416"
                            Language.HINDI -> "संकट सुरक्षा योजना: 112 बनाम 14416"
                            Language.GUJARATI -> "કટોકટી સુરક્ષા આયોજન: 112 વિરુદ્ધ 14416"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = CrisisDark
                    )
                }

                Text(
                    text = "When your loved one is in crisis, knowing who to call saves lives:\n\n" +
                            "• Call 14416 (Tele-MANAS, Free 24/7): When your loved one is in deep emotional distress, weeping, or having suicidal thoughts but is willing to talk with a counselor.\n\n" +
                            "• Call 112 (National Emergency): When there is an acute, imminent physical threat — pills in hand, weapon, or active violence.",
                    style = MaterialTheme.typography.bodySmall,
                    color = OnCrisisContainer,
                    lineHeight = 18.sp
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { dialNumber(context, "14416") },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = CrisisRed,
                            contentColor = MaterialTheme.colorScheme.onError
                        ),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.Default.Call, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Tele-MANAS (14416)")
                    }

                    OutlinedButton(
                        onClick = { dialNumber(context, "112") },
                        border = BorderStroke(1.dp, CrisisRed),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text("112", color = CrisisRed, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        // Section 5: Caregiver Burnout & Self-Care
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
                        imageVector = Icons.Default.Favorite,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Caregiver Burnout & Permission for Self-Care"
                            Language.HINDI -> "देखभालकर्ता की थकान और स्वयं की देखभाल"
                            Language.GUJARATI -> "સંભાળકર્તાનો થાક અને સ્વ-સંભાળની પરવાનગી"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = "Caregiver burnout is not failure — it is what happens when a caring human runs out of emotional fuel. You cannot pour from an empty cup.\n\n" +
                            "• Give yourself permission to have your own therapist or support circle.\n" +
                            "• Take predictable breaks where you are completely off duty.\n" +
                            "• Remember that their feelings are their feelings; you are responsible for your reactions, not their happiness.",
                    style = MaterialTheme.typography.bodySmall,
                    lineHeight = 18.sp
                )
            }
        }

        // Section 6: Caregiver FAQs
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
                        imageVector = Icons.Default.Help,
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
                        fontWeight = FontWeight.Bold
                    )
                }

                CaregiverData.faqItems.forEach { faq ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = faq.question.get(language),
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = faq.answer.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CaregiverGuideAccordion(
    guide: CaregiverPatternGuide,
    language: Language
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = guide.domain.containerColor),
        border = BorderStroke(1.dp, guide.domain.accentColor.copy(alpha = if (expanded) 0.6f else 0.3f)),
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
                        text = guide.domain.everydayName.get(language),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = guide.domain.accentColor
                    )
                    Text(
                        text = "ICD-11: ${guide.domain.clinicalName.get(language)}",
                        style = MaterialTheme.typography.bodySmall,
                        color = guide.domain.accentColor.copy(alpha = 0.85f),
                        fontWeight = FontWeight.Medium
                    )
                }
                Icon(
                    imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                    contentDescription = null,
                    tint = guide.domain.accentColor
                )
            }

            AnimatedVisibility(visible = expanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Divider(color = guide.domain.accentColor.copy(alpha = 0.2f))

                    // What you see
                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "What You Might See:"
                                Language.HINDI -> "आप क्या देख सकते हैं:"
                                Language.GUJARATI -> "તમે શું જોઈ શકો છો:"
                            },
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = guide.domain.accentColor
                        )
                        guide.whatYouSee.forEach { text ->
                            Text("• ${text.get(language)}", style = MaterialTheme.typography.bodySmall)
                        }
                    }

                    // What this can look like (Illustrative example)
                    guide.illustrativeExample?.let { example ->
                        Card(
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                            border = BorderStroke(1.dp, guide.domain.accentColor.copy(alpha = 0.35f)),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(10.dp),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Text(
                                    text = when (language) {
                                        Language.ENGLISH -> "What this can look like (Example):"
                                        Language.HINDI -> "यह कैसा दिख सकता है (उदाहरण):"
                                        Language.GUJARATI -> "આ કેવું દેખાઈ શકે (ઉદાહરણ):"
                                    },
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = guide.domain.accentColor
                                )
                                Text(
                                    text = example.get(language),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                        }
                    }

                    // What's underneath
                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(
                            text = "What's Happening Underneath:",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = guide.domain.accentColor
                        )
                        guide.whatUnderneath.forEach { text ->
                            Text("• ${text.get(language)}", style = MaterialTheme.typography.bodySmall)
                        }
                    }

                    // What tends to help
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        border = BorderStroke(1.dp, guide.domain.accentColor.copy(alpha = 0.25f)),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "What Tends to Help:",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = guide.domain.accentColor
                            )
                            guide.whatHelps.forEach { text ->
                                Text("✓ ${text.get(language)}", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurface)
                            }
                        }
                    }

                    // What tends to backfire
                    Card(
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "What Tends to Backfire:",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.error
                            )
                            guide.whatBackfires.forEach { text ->
                                Text("✗ ${text.get(language)}", style = MaterialTheme.typography.bodySmall)
                            }
                        }
                    }

                    // When to worry
                    Card(
                        colors = CardDefaults.cardColors(containerColor = CrisisContainer),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "When to Worry (Seek Immediate Medical Help):",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = CrisisDark
                            )
                            guide.whenToWorry.forEach { text ->
                                Text("! ${text.get(language)}", style = MaterialTheme.typography.bodySmall, color = OnCrisisContainer)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
    }
}

@Composable
private fun CaregiverEducationAccordion(
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
                        color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.4f),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = when (language) {
                                    Language.ENGLISH -> "Key Takeaway for Families:"
                                    Language.HINDI -> "परिवार के लिए मुख्य सीख:"
                                    Language.GUJARATI -> "પરિવાર માટે મુખ્ય શીખ:"
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
