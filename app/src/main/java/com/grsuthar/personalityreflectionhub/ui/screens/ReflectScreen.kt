package com.grsuthar.personalityreflectionhub.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grsuthar.personalityreflectionhub.data.*
import com.grsuthar.personalityreflectionhub.ui.components.dialNumber
import com.grsuthar.personalityreflectionhub.ui.theme.*

@Composable
fun ReflectScreen(
    language: Language,
    modifier: Modifier = Modifier
) {
    // State
    var isConsentGiven by remember { mutableStateOf(false) }
    var isAgeConfirmed by remember { mutableStateOf(false) }
    var hasStarted by remember { mutableStateOf(false) }
    var isCompleted by remember { mutableStateOf(false) }

    var currentDomainIndex by remember { mutableIntStateOf(0) }
    val answers = remember { mutableStateMapOf<String, Int>() } // questionId -> 1..5
    val domainImpacts = remember { mutableStateMapOf<TraitDomain, Int>() } // domain -> 0..3
    var safetyAnswer by remember { mutableIntStateOf(0) } // 0..2

    val domains = TraitDomain.entries
    val currentDomain = domains.getOrNull(currentDomainIndex)
    val currentQuestions = currentDomain?.let { d -> AssessmentData.questions.filter { it.domain == d } } ?: emptyList()

    val scrollState = rememberScrollState()

    LaunchedEffect(currentDomainIndex, hasStarted, isCompleted) {
        scrollState.scrollTo(0)
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        if (!hasStarted) {
            // Screen 1: Consent & Age Gate
            ConsentAndAgeGate(
                language = language,
                isAgeConfirmed = isAgeConfirmed,
                onAgeConfirmedChange = { isAgeConfirmed = it },
                isConsentGiven = isConsentGiven,
                onConsentGivenChange = { isConsentGiven = it },
                onStart = { hasStarted = true }
            )
        } else if (!isCompleted) {
            // Screen 2: Questionnaire Domain Steps
            if (currentDomain != null) {
                DomainQuestionnaireStep(
                    domain = currentDomain,
                    stepNumber = currentDomainIndex + 1,
                    totalSteps = domains.size + 1, // 6 domains + safety check
                    questions = currentQuestions,
                    answers = answers,
                    onAnswerSelected = { qId, score -> answers[qId] = score },
                    selectedImpact = domainImpacts[currentDomain] ?: 0,
                    onImpactSelected = { domainImpacts[currentDomain] = it },
                    language = language,
                    canProceed = currentQuestions.all { answers.containsKey(it.id) },
                    onNext = {
                        if (currentDomainIndex < domains.size - 1) {
                            currentDomainIndex++
                        } else {
                            // Move to safety check
                            currentDomainIndex = domains.size
                        }
                    },
                    onBack = {
                        if (currentDomainIndex > 0) {
                            currentDomainIndex--
                        } else {
                            hasStarted = false
                        }
                    }
                )
            } else if (currentDomainIndex == domains.size) {
                // Step 7: Safety Check Step
                SafetyCheckStep(
                    language = language,
                    safetyAnswer = safetyAnswer,
                    onSafetyAnswerSelected = { safetyAnswer = it },
                    onComplete = { isCompleted = true },
                    onBack = { currentDomainIndex = domains.size - 1 }
                )
            }
        } else {
            // Screen 3: Results View
            AssessmentResultsView(
                language = language,
                answers = answers,
                domainImpacts = domainImpacts,
                safetyAnswer = safetyAnswer,
                onReset = {
                    answers.clear()
                    domainImpacts.clear()
                    safetyAnswer = 0
                    currentDomainIndex = 0
                    isCompleted = false
                    hasStarted = false
                }
            )
        }
    }
}

@Composable
private fun ConsentAndAgeGate(
    language: Language,
    isAgeConfirmed: Boolean,
    onAgeConfirmedChange: (Boolean) -> Unit,
    isConsentGiven: Boolean,
    onConsentGivenChange: (Boolean) -> Unit,
    onStart: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.5.dp, MaterialTheme.colorScheme.primary),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = AssessmentData.consentAgeGateTitle.get(language),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Text(
                text = AssessmentData.consentAgeGateBody.get(language),
                style = MaterialTheme.typography.bodyMedium,
                lineHeight = 22.sp
            )

            Card(
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                shape = RoundedCornerShape(8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Why age 18+ matters in ICD-11:",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Personality traits during adolescence undergo rapid neurodevelopmental change. Applying personality reflection to minors can lead to premature labeling.",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }

            Divider(color = MaterialTheme.colorScheme.outline)

            // Checkbox 1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onAgeConfirmedChange(!isAgeConfirmed) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isAgeConfirmed,
                    onCheckedChange = onAgeConfirmedChange
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = AssessmentData.consentCheckbox18Plus.get(language),
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium
                )
            }

            // Checkbox 2
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onConsentGivenChange(!isConsentGiven) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isConsentGiven,
                    onCheckedChange = onConsentGivenChange
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = AssessmentData.consentCheckboxEducational.get(language),
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = onStart,
                enabled = isAgeConfirmed && isConsentGiven,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Text(
                    text = AssessmentData.startAssessmentButton.get(language),
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
private fun DomainQuestionnaireStep(
    domain: TraitDomain,
    stepNumber: Int,
    totalSteps: Int,
    questions: List<ReflectionQuestion>,
    answers: Map<String, Int>,
    onAnswerSelected: (String, Int) -> Unit,
    selectedImpact: Int,
    onImpactSelected: (Int) -> Unit,
    language: Language,
    canProceed: Boolean,
    onNext: () -> Unit,
    onBack: () -> Unit
) {
    if (stepNumber > TraitDomain.entries.size) return

    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        // Step progress header
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Domain $stepNumber of ${TraitDomain.entries.size}",
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = domain.shortCode,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        LinearProgressIndicator(
            progress = { stepNumber.toFloat() / totalSteps.toFloat() },
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
                .clip(RoundedCornerShape(3.dp)),
            color = MaterialTheme.colorScheme.primary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant
        )

        // Domain title & explanation
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.padding(14.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = domain.everydayName.get(language),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "ICD-11 Trait: ${domain.clinicalName.get(language)}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }

        // Reflection Statements
        Text(
            text = when (language) {
                Language.ENGLISH -> "Rate how much each statement describes you in typical situations:"
                Language.HINDI -> "बताएं कि सामान्य परिस्थितियों में प्रत्येक कथन आप पर कितना लागू होता है:"
                Language.GUJARATI -> "સામાન્ય પરિસ્થિતિઓમાં દરેક વિધાન તમારા પર કેટલું લાગુ પડે છે તે જણાવો:"
            },
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )

        questions.forEachIndexed { index, question ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier = Modifier.padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "${index + 1}. ${question.text.get(language)}",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    // 5-point scale buttons
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        for (score in 1..5) {
                            val isSelected = answers[question.id] == score
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .weight(1f)
                                    .clickable { onAnswerSelected(question.id, score) }
                                    .padding(vertical = 4.dp)
                            ) {
                                Surface(
                                    modifier = Modifier.size(36.dp),
                                    shape = CircleShape,
                                    color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant,
                                    border = BorderStroke(
                                        1.dp,
                                        if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline
                                    )
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = score.toString(),
                                            style = MaterialTheme.typography.labelMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = when (score) {
                                        1 -> "Disagree"
                                        3 -> "Neutral"
                                        5 -> "Agree"
                                        else -> ""
                                    },
                                    style = MaterialTheme.typography.labelSmall,
                                    fontSize = 9.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }
                }
            }
        }

        // Domain Impact / Severity Question
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.padding(14.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = AssessmentData.domainImpactQuestions[domain]?.get(language) ?: "",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.primary
                )

                AssessmentData.impactLevels.forEachIndexed { lvlIndex, lvlText ->
                    val isLvlSelected = selectedImpact == lvlIndex
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onImpactSelected(lvlIndex) }
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = isLvlSelected,
                            onClick = { onImpactSelected(lvlIndex) }
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = lvlText.get(language),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }
        }

        // Navigation Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OutlinedButton(
                onClick = onBack,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.height(48.dp)
            ) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text("Back")
            }

            Button(
                onClick = onNext,
                enabled = canProceed,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.height(48.dp)
            ) {
                Text(if (stepNumber == TraitDomain.entries.size) "Next: Safety Check" else "Next Domain")
                Spacer(modifier = Modifier.width(6.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
            }
        }
    }
}

@Composable
private fun SafetyCheckStep(
    language: Language,
    safetyAnswer: Int,
    onSafetyAnswerSelected: (Int) -> Unit,
    onComplete: () -> Unit,
    onBack: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.5.dp, if (safetyAnswer > 0) CrisisRed else MaterialTheme.colorScheme.primary),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null,
                    tint = if (safetyAnswer > 0) CrisisRed else MaterialTheme.colorScheme.primary
                )
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Final Safety Check"
                        Language.HINDI -> "अंतिम सुरक्षा जाँच"
                        Language.GUJARATI -> "અંતિમ સુરક્ષા ચકાસણી"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = if (safetyAnswer > 0) CrisisRed else MaterialTheme.colorScheme.primary
                )
            }

            Text(
                text = AssessmentData.safetyQuestionText.get(language),
                style = MaterialTheme.typography.bodyMedium,
                lineHeight = 22.sp,
                fontWeight = FontWeight.Medium
            )

            AssessmentData.safetyOptions.forEachIndexed { index, option ->
                val isSelected = safetyAnswer == index
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onSafetyAnswerSelected(index) },
                    colors = CardDefaults.cardColors(
                        containerColor = if (isSelected && index > 0) CrisisContainer else if (isSelected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surfaceVariant
                    ),
                    border = BorderStroke(
                        1.dp,
                        if (isSelected && index > 0) CrisisRed else if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { onSafetyAnswerSelected(index) },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = if (index > 0) CrisisRed else MaterialTheme.colorScheme.primary
                            )
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = option.get(language),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            color = if (isSelected && index > 0) CrisisDark else MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            if (safetyAnswer > 0) {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Please note: Submitting a concerning safety response will display immediate crisis support resources at the top of your results."
                        Language.HINDI -> "कृपया ध्यान दें: इस उत्तर के बाद आपके परिणामों के शीर्ष पर तत्काल आपातकालीन सहायता नंबर दिखाए जाएंगे।"
                        Language.GUJARATI -> "કૃપા કરીને નોંધ લો: આ જવાબ પછી તમારા પરિણામોમાં સૌથી ઉપર ત્વરિત કટોકટી સહાય નંબર દર્શાવવામાં આવશે."
                    },
                    style = MaterialTheme.typography.bodySmall,
                    color = CrisisDark
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedButton(
                    onClick = onBack,
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.height(48.dp)
                ) {
                    Text("Back")
                }

                Button(
                    onClick = onComplete,
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.height(48.dp)
                ) {
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "View Reflection Results"
                            Language.HINDI -> "चिंतन परिणाम देखें"
                            Language.GUJARATI -> "ચિંતન પરિણામો જુઓ"
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun AssessmentResultsView(
    language: Language,
    answers: Map<String, Int>,
    domainImpacts: Map<TraitDomain, Int>,
    safetyAnswer: Int,
    onReset: () -> Unit
) {
    val context = LocalContext.current

    // Calculate domain scores
    val domainResults = TraitDomain.entries.map { domain ->
        val qList = AssessmentData.questions.filter { it.domain == domain }
        val sum = qList.sumOf { answers[it.id] ?: 3 }
        val minScore = qList.size * 1 // 6
        val maxScore = qList.size * 5 // 30
        val percentage = (sum - minScore).toFloat() / (maxScore - minScore).toFloat()

        val tier = when {
            percentage < 0.35f -> ResultTier.LESS_THAN_MOST
            percentage <= 0.65f -> ResultTier.ABOUT_TYPICAL
            else -> ResultTier.MORE_THAN_MOST
        }

        DomainResult(
            domain = domain,
            rawScore = sum,
            maxScore = maxScore,
            percentage = percentage,
            tier = tier,
            impactLevel = domainImpacts[domain] ?: 0
        )
    }

    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        // Crisis Banner if safety check was triggered (> 0)
        if (safetyAnswer > 0) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = CrisisContainer),
                border = BorderStroke(1.5.dp, CrisisRed),
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
                            imageVector = Icons.Default.Warning,
                            contentDescription = null,
                            tint = CrisisRed,
                            modifier = Modifier.size(24.dp)
                        )
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Immediate Safety Notice"
                                Language.HINDI -> "तत्काल सुरक्षा सूचना"
                                Language.GUJARATI -> "ત્વરિત સુરક્ષા સૂચના"
                            },
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = CrisisDark
                        )
                    }

                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "You indicated recent thoughts of self-harm or distress. You do not have to carry this alone. Free, confidential support is available 24/7 across India."
                            Language.HINDI -> "आपने हाल ही में खुद को नुकसान पहुँचाने या संकट के विचारों का उल्लेख किया है। आपको यह अकेले नहीं सहना है। पूरे भारत में 24/7 निःशुल्क सहायता उपलब्ध है।"
                            Language.GUJARATI -> "તમે જાતને નુકસાન પહોંચાડવા કે કટોકટીના વિચારો દર્શાવ્યા છે. તમારે આ એકલા સહન કરવાની જરૂર નથી. ભારતમાં 24/7 મફત સહાય ઉપલબ્ધ છે."
                        },
                        style = MaterialTheme.typography.bodyMedium,
                        color = OnCrisisContainer
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
                            Text("Call Tele-MANAS (14416)")
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
        }

        // Results Header
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Your Dimensional Reflection Profile"
                        Language.HINDI -> "आपकी आयामी चिंतन प्रोफ़ाइल"
                        Language.GUJARATI -> "તમારી આયામી ચિંતન પ્રોફાઇલ"
                    },
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = when (language) {
                        Language.ENGLISH -> "This profile reflects continuous tendencies across human personality, not rigid categories or medical disorders. Frequency and everyday impact are shown side-by-side."
                        Language.HINDI -> "यह प्रोफ़ाइल मानव व्यक्तित्व की निरंतर प्रवृत्तियों को दर्शाती है, किसी विकार या बीमारी को नहीं। यहाँ बारंबारता और दैनिक असर दोनों साथ दिखाए गए हैं।"
                        Language.GUJARATI -> "આ પ્રોફાઇલ માનવ વ્યક્તિત્વના વલણો દર્શાવે છે, કોઈ બીમારી કે વિકારને નહીં. અહીં તીવ્રતા અને દૈનિક અસર બંને સાથે દર્શાવવામાં આવ્યા છે."
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        // Domain Result Cards
        domainResults.forEach { result ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = result.domain.containerColor),
                border = BorderStroke(1.dp, result.domain.accentColor.copy(alpha = 0.4f)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = result.domain.everydayName.get(language),
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = result.domain.accentColor
                            )
                            Text(
                                text = "ICD-11: ${result.domain.clinicalName.get(language)}",
                                style = MaterialTheme.typography.bodySmall,
                                color = result.domain.accentColor.copy(alpha = 0.85f),
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }

                    // Descriptive Tier Badge
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = result.domain.accentColor.copy(alpha = 0.15f)
                    ) {
                        Text(
                            text = result.tier.label.get(language),
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = result.domain.accentColor
                        )
                    }

                    // Horizontal Dimensional Bar
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        LinearProgressIndicator(
                            progress = { result.percentage.coerceIn(0.05f, 1f) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(10.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            color = result.domain.accentColor,
                            trackColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.7f)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("Less than most", style = MaterialTheme.typography.labelSmall, fontSize = 10.sp)
                            Text("About typical", style = MaterialTheme.typography.labelSmall, fontSize = 10.sp)
                            Text("More than most", style = MaterialTheme.typography.labelSmall, fontSize = 10.sp)
                        }
                    }

                    // User reported impact
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Everyday Life Impact:",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = AssessmentData.impactLevels[result.impactLevel].get(language),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    // Strengths Reframe
                    val eduItem = PsychoeducationData.traitDomainDetails.find { it.domain == result.domain }
                    if (eduItem != null) {
                        Card(
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                            border = BorderStroke(1.dp, result.domain.accentColor.copy(alpha = 0.25f)),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(10.dp),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Text(
                                    text = "Positive Reframe & Latent Strengths:",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = result.domain.accentColor
                                )
                                Text(
                                    text = eduItem.strengthsReframe.get(language),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                        }
                    }
                }
            }
        }

        // 4. NEW: Why This Reflection Matters (purpose)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary.copy(alpha = 0.35f)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = AssessmentData.purposeStatementTitle.get(language),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                Text(
                    text = AssessmentData.purposeStatementBody.get(language),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 22.sp
                )
            }
        }

        // 5. NEW: Your Next Steps (personalized based on actual results)
        val elevatedDomains = domainResults.filter { it.tier == ResultTier.MORE_THAN_MOST }
        val highestImpact = domainResults.maxOfOrNull { it.impactLevel } ?: 0

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary.copy(alpha = 0.35f)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = AssessmentData.nextStepsTitle.get(language),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                // Step A: Domain callout (only if at least one domain is MORE_THAN_MOST)
                if (elevatedDomains.isNotEmpty()) {
                    val domainNames = elevatedDomains.joinToString(", ") { it.domain.everydayName.get(language) }
                    Surface(
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.08f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = AssessmentData.getDomainCalloutText(domainNames, language),
                            modifier = Modifier.padding(12.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 20.sp
                        )
                    }
                }

                // Step B: Tiered guidance based on highest impact level reported
                val tieredGuidance = AssessmentData.nextStepsTieredGuidance.getOrElse(highestImpact.coerceIn(0, 3)) {
                    AssessmentData.nextStepsTieredGuidance[0]
                }.get(language)

                Text(
                    text = tieredGuidance,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 22.sp
                )
            }
        }

        // 6. Clinical assessment disclaimer & what a real evaluation entails
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = when (language) {
                            Language.ENGLISH -> "This is a reflection tool, NOT a diagnosis."
                            Language.HINDI -> "यह एक चिंतन उपकरण है, कोई चिकित्सीय निदान नहीं।"
                            Language.GUJARATI -> "આ એક ચિંતન સાધન છે, કોઈ તબીબી નિદાન નથી."
                        },
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = when (language) {
                        Language.ENGLISH -> "A real psychiatric evaluation under ICD-11 involves:\n" +
                                "• A comprehensive clinical interview conducted over time by a qualified mental health specialist\n" +
                                "• Gathering developmental history from adolescence into adulthood\n" +
                                "• Ruling out medical conditions, neurological factors, ADHD, or substance effects\n" +
                                "• Evaluating impairment across social, occupational, and personal functioning."
                        Language.HINDI -> "ICD-11 के तहत वास्तविक मनोरोग मूल्यांकन में शामिल हैं:\n" +
                                "• एक योग्य मानसिक स्वास्थ्य विशेषज्ञ द्वारा समय के साथ लिया गया विस्तृत नैदानिक साक्षात्कार\n" +
                                "• किशोरावस्था से वयस्कता तक के विकासात्मक इतिहास की जानकारी\n" +
                                "• शारीरिक बीमारियों, न्यूरोलॉजिकल कारणों, ADHD या नशीले पदार्थों के प्रभावों को अलग करना\n" +
                                "• सामाजिक, व्यावसायिक और व्यक्तिगत जीवन में आने वाली कठिनाइयों का मूल्यांकन।"
                        Language.GUJARATI -> "ICD-11 હેઠળ વાસ્તવિક માનસિક મૂલ્યાંકનમાં સામેલ છે:\n" +
                                "• લાયક માનસિક સ્વાસ્થ્ય નિષ્ણાત દ્વારા વિસ્તૃત તબીબી મુલાકાત\n" +
                                "• કિશોરાવસ્થાથી પુખ્તાવસ્થા સુધીના વિકાસલક્ષી ઇતિહાસની માહિતી\n" +
                                "• શારીરિક બીમારીઓ, ન્યુરોલોજીકલ પરિબળો, ADHD કે નશાની અસરોને અલગ તારવવી\n" +
                                "• સામાજિક, વ્યાવસાયિક અને વ્યક્તિગત જીવનમાં થતા પ્રભાવનું મૂલ્યાંકન."
                    },
                    style = MaterialTheme.typography.bodySmall,
                    lineHeight = 18.sp
                )
            }
        }

        // 7. Reset Assessment Button
        Button(
            onClick = onReset,
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Icon(Icons.Default.Refresh, contentDescription = null, modifier = Modifier.size(18.dp))
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = when (language) {
                    Language.ENGLISH -> "Reset & Take Again"
                    Language.HINDI -> "रीसेट करें और दोबारा शुरू करें"
                    Language.GUJARATI -> "રીસેટ કરો અને ફરીથી શરૂ કરો"
                }
            )
        }
    }
}
