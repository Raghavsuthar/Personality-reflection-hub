package com.grsuthar.personalityreflectionhub.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grsuthar.personalityreflectionhub.data.*
import com.grsuthar.personalityreflectionhub.ui.theme.*

@Composable
fun FindingProfessionalSection(
    language: Language,
    modifier: Modifier = Modifier
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    val tabTitles = listOf(
        LocalizedString("GP / Family Doctor", "फैमिली डॉक्टर (GP)", "ફેમિલી ડૉક્ટર (GP)"),
        LocalizedString("First Visit Guide", "पहली बैठक मार्गदर्शिका", "પ્રથમ મુલાકાત માર્ગદર્શિકા"),
        LocalizedString("Who to See", "किसे दिखाएं?", "કોને મળવું?"),
        LocalizedString("Where to Search", "कहाँ खोजें?", "ક્યાં શોધવું?"),
        LocalizedString("Rights & Stigma", "अधिकार और भ्रांतियां", "અધિકાર અને ગેરમાન્યતાઓ"),
        LocalizedString("Questions to Ask", "पूछने योग्य सवाल", "પૂછવા જેવા સવાલો")
    )

    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Section Header
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(TealContainer),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.MedicalServices,
                        contentDescription = null,
                        tint = TealDark,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Finding a Professional in India"
                            Language.HINDI -> "भारत में मानसिक स्वास्थ्य विशेषज्ञ कैसे खोजें"
                            Language.GUJARATI -> "ભારતમાં માનસિક સ્વાસ્થ્ય નિષ્ણાત કેવી રીતે શોધવા"
                        },
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "Practical, stigma-sensitive guidance on consultations, first visits, and family doctor referrals."
                            Language.HINDI -> "परामर्श, पहली बैठक के अनुभव और फैमिली डॉक्टर (GP) की भूमिका पर व्यावहारिक मार्गदर्शन।"
                            Language.GUJARATI -> "પરામર્શ, પ્રથમ મુલાકાતના અનુભવ અને ફેમિલી ડૉક્ટર (GP) ની ભૂમિકા અંગે વ્યવહારુ માર્ગદર્શન."
                        },
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // Stigma & Confidentiality Reassurance Banner
            Surface(
                color = TealContainer.copy(alpha = 0.55f),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, TealLight)
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Shield,
                        contentDescription = null,
                        tint = TealDark,
                        modifier = Modifier.size(20.dp)
                    )
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Protected by Law • Mental Healthcare Act (MHCA 2017)"
                                Language.HINDI -> "कानून द्वारा संरक्षित • मानसिक स्वास्थ्य देखभाल अधिनियम 2017"
                                Language.GUJARATI -> "કાયદાકીય સુરક્ષા • મેન્ટલ હેલ્થકેર એક્ટ (MHCA 2017)"
                            },
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = TealDark
                        )
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Under Section 23 of the MHCA 2017, all consultations with a psychiatrist or psychologist in India are strictly confidential. Seeking mental health guidance is legitimate medical care, exactly like seeing a physician for cardiovascular or metabolic health."
                                Language.HINDI -> "MHCA 2017 की धारा 23 के तहत भारत में मनोचिकित्सक या मनोवैज्ञानिक के साथ सभी परामर्श पूर्णतः गोपनीय हैं। मानसिक स्वास्थ्य के लिए मदद लेना उतना ही सामान्य है जितना शारीरिक स्वास्थ्य के लिए डॉक्टर के पास जाना।"
                                Language.GUJARATI -> "MHCA 2017 ની કલમ 23 હેઠળ ભારતમાં સાયકિયાટ્રિસ્ટ કે સાયકોલોજિસ્ટ સાથેની તમામ મુલાકાતો કાયદાકીય રીતે ગુપ્ત રહે છે. માનસિક સ્વાસ્થ્ય માટે સલાહ મેળવવી એ શારીરિક સ્વાસ્થ્ય માટે ડૉક્ટર પાસે જવા જેટલું જ સામાન્ય તબીબી પગલું છે."
                            },
                            style = MaterialTheme.typography.bodySmall,
                            color = TextPrimary,
                            lineHeight = 18.sp
                        )
                    }
                }
            }

            // Scrollable Tab Row for Topics
            ScrollableTabRow(
                selectedTabIndex = selectedTabIndex,
                edgePadding = 0.dp,
                divider = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                tabTitles.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = {
                            Text(
                                text = title.get(language),
                                fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal,
                                fontSize = 13.sp
                            )
                        }
                    )
                }
            }

            // Tab Content
            when (selectedTabIndex) {
                0 -> GpReferralTabContent(language = language)
                1 -> FirstAppointmentTabContent(language = language)
                2 -> ProfessionalRolesTabContent(language = language)
                3 -> WhereToLookTabContent(language = language)
                4 -> StigmaAndRightsTabContent(language = language)
                5 -> QuestionsToAskTabContent(language = language)
            }

            // Bottom Navigation Helper between tabs
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (selectedTabIndex > 0) {
                    TextButton(
                        onClick = { selectedTabIndex-- },
                        colors = ButtonDefaults.textButtonColors(contentColor = TealDark)
                    ) {
                        Text("← ${tabTitles[selectedTabIndex - 1].get(language)}")
                    }
                } else {
                    Spacer(modifier = Modifier.width(8.dp))
                }

                if (selectedTabIndex < tabTitles.size - 1) {
                    FilledTonalButton(
                        onClick = { selectedTabIndex++ },
                        colors = ButtonDefaults.filledTonalButtonColors(
                            containerColor = TealContainer,
                            contentColor = TealDark
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "${tabTitles[selectedTabIndex + 1].get(language)} →",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun GpReferralTabContent(language: Language) {
    Column(verticalArrangement = Arrangement.spacedBy(14.dp)) {
        // Highlight Box: Why GP is the Ideal First Step
        Surface(
            color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.4f),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(14.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.LocalHospital,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(18.dp)
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "The Role of Your Family Doctor (GP)"
                            Language.HINDI -> "फैमिली डॉक्टर (GP) की महत्वपूर्ण भूमिका"
                            Language.GUJARATI -> "ફેમિલી ડૉક્ટર (GP) ની મહત્વપૂર્ણ ભૂમિકા"
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "In India, starting with your trusted MBBS family physician is often the most practical, comfortable, and medically sound first step. They rule out physical causes, avoid stigma, and connect you with verified specialists."
                        Language.HINDI -> "भारत में अपने पारिवारिक एमबीबीएस डॉक्टर से शुरुआत करना सबसे व्यावहारिक, सहज और चिकित्सकीय रूप से सुरक्षित कदम है। वे शारीरिक कारणों की जांच करते हैं, झिझक मिटाते हैं और योग्य विशेषज्ञों से जोड़ते हैं।"
                        Language.GUJARATI -> "ભારતમાં તમારા વિશ્વસનીય MBBS ફેમિલી ડૉક્ટર પાસેથી શરૂઆત કરવી એ સૌથી વ્યવહારુ, સહજ અને તબીબી રીતે યોગ્ય પગલું છે. તેઓ શારીરિક કારણો તપાસે છે, સંકોચ દૂર કરે છે અને યોગ્ય નિષ્ણાત સાથે જોડે છે."
                    },
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 18.sp
                )
            }
        }

        // 5 Detailed Points
        HelplineData.gpReferralGuidance.forEach { point ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        text = point.title.get(language),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = point.rationale.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 18.sp
                    )
                    Surface(
                        color = MaterialTheme.colorScheme.surface,
                        shape = RoundedCornerShape(6.dp),
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f))
                    ) {
                        Row(
                            modifier = Modifier.padding(8.dp),
                            verticalAlignment = Alignment.Top,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = null,
                                tint = TealPrimary,
                                modifier = Modifier.size(16.dp)
                            )
                            Column {
                                Text(
                                    text = when (language) {
                                        Language.ENGLISH -> "Practical Tip / What to Say:"
                                        Language.HINDI -> "व्यावहारिक सुझाव / क्या कहें:"
                                        Language.GUJARATI -> "વ્યવહારુ ટીપ / શું કહેવું:"
                                    },
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = TealDark
                                )
                                Text(
                                    text = point.practicalTip.get(language),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun FirstAppointmentTabContent(language: Language) {
    Column(verticalArrangement = Arrangement.spacedBy(14.dp)) {
        Text(
            text = when (language) {
                Language.ENGLISH -> "What to Expect at Your First Appointment (Step-by-Step)"
                Language.HINDI -> "पहली बैठक में क्या अपेक्षा रखें (कदम-दर-कदम मार्गदर्शिका)"
                Language.GUJARATI -> "પ્રથમ મુલાકાતમાં શું અપેક્ષા રાખવી (પગલાવાર માર્ગદર્શિકા)"
            },
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            text = when (language) {
                Language.ENGLISH -> "A first appointment with a psychiatrist or clinical psychologist is an exploratory, confidential conversation. You are in full control of the pace, and there is zero expectation to reveal sensitive trauma immediately."
                Language.HINDI -> "मनोचिकित्सक या मनोवैज्ञानिक के साथ पहली बैठक केवल एक प्रारंभिक, गोपनीय बातचीत होती है। आप अपनी गति से बात कर सकते हैं, और संवेदनशील बातों को तुरंत बताने का कोई दबाव नहीं होता।"
                Language.GUJARATI -> "સાયકિયાટ્રિસ્ટ કે સાયકોલોજિસ્ટ સાથેની પ્રથમ મુલાકાત એ માત્ર એક સંવેદનશીલ અને ખાનગી વાર્તાલાપ છે. તમે તમારી સરળતા મુજબ વાત કરી શકો છો, અને કડવા અનુભવો તરત કહેવાનું કોઈ દબાણ હોતું નથી."
            },
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 18.sp
        )

        HelplineData.firstAppointmentSteps.forEach { step ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                shape = RoundedCornerShape(10.dp)
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .clip(CircleShape)
                            .background(TealPrimary),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${step.stepNumber}",
                            color = Color.White,
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = step.title.get(language),
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = step.summary.get(language),
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = step.details.get(language),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            lineHeight = 17.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ProfessionalRolesTabContent(language: Language) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = when (language) {
                Language.ENGLISH -> "Understanding Mental Health Roles in India"
                Language.HINDI -> "मानसिक स्वास्थ्य विशेषज्ञों की विभिन्न भूमिकाएं"
                Language.GUJARATI -> "માનસિક સ્વાસ્થ્ય નિષ્ણાતોની ભૂમિકાઓ"
            },
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        HelplineData.professionalRoles.forEach { role ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = role.title.get(language),
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary
                        )
                        Surface(
                            color = TealContainer,
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Text(
                                text = role.qualification.get(language),
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.SemiBold,
                                color = TealDark
                            )
                        }
                    }

                    Text(
                        text = role.whatTheyDo.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 18.sp
                    )

                    Surface(
                        color = MaterialTheme.colorScheme.surface,
                        shape = RoundedCornerShape(6.dp),
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
                    ) {
                        Row(
                            modifier = Modifier.padding(8.dp),
                            verticalAlignment = Alignment.Top,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.HelpOutline,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.secondary,
                                modifier = Modifier.size(16.dp)
                            )
                            Column {
                                Text(
                                    text = when (language) {
                                        Language.ENGLISH -> "When to consult them:"
                                        Language.HINDI -> "कब परामर्श लें:"
                                        Language.GUJARATI -> "ક્યારે પરામર્શ લેવો:"
                                    },
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Text(
                                    text = role.whenToSeeThem.get(language),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    lineHeight = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun WhereToLookTabContent(language: Language) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = when (language) {
                Language.ENGLISH -> "Verified Avenues for Care in India"
                Language.HINDI -> "भारत में विश्वसनीय चिकित्सा संस्थान एवं साधन"
                Language.GUJARATI -> "ભારતમાં વિશ્વાસપાત્ર આરોગ્ય સંસ્થાઓ અને માર્ગો"
            },
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        HelplineData.whereToLookInIndia.forEach { avenue ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = avenue.first.get(language),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = avenue.second.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 18.sp
                    )
                }
            }
        }
    }
}

@Composable
private fun StigmaAndRightsTabContent(language: Language) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = when (language) {
                Language.ENGLISH -> "Stigma-Sensitive Insights & Patient Rights"
                Language.HINDI -> "संवेदनशील दृष्टिकोण और मरीज के कानूनी अधिकार"
                Language.GUJARATI -> "સંવેદનશીલ દ્રષ્ટિકોણ અને દર્દીના કાયદાકીય અધિકારો"
            },
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        HelplineData.stigmaPrinciples.forEach { principle ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = principle.first.get(language),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = TealDark
                    )
                    Text(
                        text = principle.second.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = principle.third.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        lineHeight = 18.sp
                    )
                }
            }
        }
    }
}

@Composable
private fun QuestionsToAskTabContent(language: Language) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = when (language) {
                Language.ENGLISH -> "Questions to Empower Your First Session"
                Language.HINDI -> "पहली बैठक में डॉक्टर या थेरेपिस्ट से पूछने योग्य सवाल"
                Language.GUJARATI -> "પ્રથમ મુલાકાતમાં ડૉક્ટર કે થેરાપિસ્ટને પૂછવા જેવા સવાલો"
            },
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            text = when (language) {
                Language.ENGLISH -> "You are an active partner in your health. Asking these questions helps establish whether a clinician's training, style, and approach align with your needs."
                Language.HINDI -> "आप अपने स्वास्थ्य के सक्रिय भागीदार हैं। ये प्रश्न पूछने से यह समझने में मदद मिलती है कि विशेषज्ञ की पद्धति आपकी आवश्यकताओं के अनुकूल है या नहीं।"
                Language.GUJARATI -> "તમે તમારા સ્વાસ્થ્યના સક્રિય ભાગીદાર છો. આ પ્રશ્નો પૂછવાથી એ સમજવામાં મદદ મળે છે કે નિષ્ણાતની પદ્ધતિ તમારી જરૂરિયાતો સાથે સુસંગત છે કે નહીં."
            },
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 18.sp
        )

        HelplineData.questionsToAskTherapist.forEach { item ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = item.first.get(language),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = item.second.get(language),
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 18.sp
                    )
                }
            }
        }
    }
}
