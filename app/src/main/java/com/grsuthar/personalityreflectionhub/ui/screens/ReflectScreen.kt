package com.grsuthar.personalityreflectionhub.ui.screens

import android.content.Intent
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
import androidx.compose.material.icons.filled.Share
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
    val functioningResults = remember { mutableStateMapOf<String, Int>() } // func_1..func_8 -> 1..5
    val functioningAnswers = functioningResults // convenient reference
    var functioningImpact by remember { mutableIntStateOf(0) } // 0..3
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
            // Screen 2: Questionnaire Steps (6 Domains + Functioning + Safety Check = 8 Steps)
            val totalSteps = domains.size + 2

            if (currentDomain != null) {
                DomainQuestionnaireStep(
                    domain = currentDomain,
                    stepNumber = currentDomainIndex + 1,
                    totalSteps = totalSteps,
                    questions = currentQuestions,
                    answers = answers,
                    onAnswerSelected = { qId, score -> answers[qId] = score },
                    selectedImpact = domainImpacts[currentDomain] ?: 0,
                    onImpactSelected = { domainImpacts[currentDomain] = it },
                    language = language,
                    canProceed = currentQuestions.all { answers.containsKey(it.id) },
                    onNext = {
                        currentDomainIndex++
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
                // Step 7: Self & Interpersonal Functioning Module
                FunctioningQuestionnaireStep(
                    stepNumber = domains.size + 1,
                    totalSteps = totalSteps,
                    questions = AssessmentData.functioningQuestions,
                    answers = functioningAnswers,
                    onAnswerSelected = { qId, score -> functioningAnswers[qId] = score },
                    selectedImpact = functioningImpact,
                    onImpactSelected = { functioningImpact = it },
                    language = language,
                    canProceed = AssessmentData.functioningQuestions.all { functioningAnswers.containsKey(it.id) },
                    onNext = { currentDomainIndex = domains.size + 1 },
                    onBack = { currentDomainIndex = domains.size - 1 }
                )
            } else if (currentDomainIndex == domains.size + 1) {
                // Step 8: Safety Check Step
                SafetyCheckStep(
                    stepNumber = domains.size + 2,
                    totalSteps = totalSteps,
                    language = language,
                    safetyAnswer = safetyAnswer,
                    onSafetyAnswerSelected = { safetyAnswer = it },
                    onComplete = { isCompleted = true },
                    onBack = { currentDomainIndex = domains.size }
                )
            }
        } else {
            // Screen 3: Results View
            AssessmentResultsView(
                language = language,
                answers = answers,
                functioningResults = functioningResults,
                functioningAnswers = functioningAnswers,
                functioningImpact = functioningImpact,
                domainImpacts = domainImpacts,
                safetyAnswer = safetyAnswer,
                onReset = {
                    answers.clear()
                    functioningResults.clear()
                    functioningImpact = 0
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
                Text(if (stepNumber == TraitDomain.entries.size) "Next: Self & Relationships" else "Next Domain")
                Spacer(modifier = Modifier.width(6.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
            }
        }
    }
}

@Composable
private fun FunctioningQuestionnaireStep(
    stepNumber: Int,
    totalSteps: Int,
    questions: List<FunctioningQuestion>,
    answers: Map<String, Int>,
    onAnswerSelected: (String, Int) -> Unit,
    selectedImpact: Int,
    onImpactSelected: (Int) -> Unit,
    language: Language,
    canProceed: Boolean,
    onNext: () -> Unit,
    onBack: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                    Text(
                        text = "Step $stepNumber of $totalSteps",
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = MaterialTheme.colorScheme.secondaryContainer
                ) {
                    Text(
                        text = "ICD-11 Core Dimensions",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.secondary
                    )
                }
            }

            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    text = AssessmentData.functioningSectionTitle.get(language),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = AssessmentData.functioningSectionSubtitle.get(language),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 20.sp
                )
            }

            // Self-Functioning Section
            val selfQuestions = questions.filter { it.category == FunctioningCategory.SELF }
            Surface(
                color = MaterialTheme.colorScheme.surfaceVariant,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Part A: Self-Functioning (Identity, Goals & Emotional Stability)"
                        Language.HINDI -> "भाग क: आत्म-कार्यप्रणाली (पहचान, लक्ष्य और भावनात्मक स्थिरता)"
                        Language.GUJARATI -> "ભાગ અ: સ્વ-કાર્યપ્રણાલી (ઓળખ, લક્ષ્યો અને લાગણીશીલ સ્થિરતા)"
                    },
                    modifier = Modifier.padding(10.dp),
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            selfQuestions.forEachIndexed { index, question ->
                FunctioningQuestionItem(
                    index = index + 1,
                    question = question,
                    selectedScore = answers[question.id],
                    onScoreSelected = { score -> onAnswerSelected(question.id, score) },
                    language = language
                )
            }

            // Interpersonal Functioning Section
            val interQuestions = questions.filter { it.category == FunctioningCategory.INTERPERSONAL }
            Surface(
                color = MaterialTheme.colorScheme.surfaceVariant,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Part B: Interpersonal Functioning (Empathy, Trust & Relational Stability)"
                        Language.HINDI -> "भाग ख: पारस्परिक कार्यप्रणाली (सहानुभूति, विश्वास और संबंध स्थिरता)"
                        Language.GUJARATI -> "ભાગ બ: પરસ્પર કાર્યપ્રણાલી (સહાનુભૂતિ, વિશ્વાસ અને સંબંધ સ્થિરતા)"
                    },
                    modifier = Modifier.padding(10.dp),
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            interQuestions.forEachIndexed { index, question ->
                FunctioningQuestionItem(
                    index = selfQuestions.size + index + 1,
                    question = question,
                    selectedScore = answers[question.id],
                    onScoreSelected = { score -> onAnswerSelected(question.id, score) },
                    language = language
                )
            }

            // Functioning Impact Rating
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Column(
                    modifier = Modifier.padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = AssessmentData.functioningImpactQuestion.get(language),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )

                    AssessmentData.functioningImpactOptions.forEachIndexed { optIndex, optText ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onImpactSelected(optIndex) }
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = selectedImpact == optIndex,
                                onClick = { onImpactSelected(optIndex) }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = optText.get(language),
                                style = MaterialTheme.typography.bodyMedium
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
                    Text("Next: Safety Check")
                    Spacer(modifier = Modifier.width(6.dp))
                    Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
                }
            }
        }
    }
}

@Composable
private fun FunctioningQuestionItem(
    index: Int,
    question: FunctioningQuestion,
    selectedScore: Int?,
    onScoreSelected: (Int) -> Unit,
    language: Language
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "$index. ${question.text.get(language)}",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurface
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                for (score in 1..5) {
                    val isSelected = selectedScore == score
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(1f)
                            .clickable { onScoreSelected(score) }
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

@Composable
private fun SafetyCheckStep(
    stepNumber: Int,
    totalSteps: Int,
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
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                    Text(
                        text = "Step $stepNumber of $totalSteps",
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = if (safetyAnswer > 0) CrisisContainer else MaterialTheme.colorScheme.surfaceVariant
                ) {
                    Text(
                        text = "Safety Protocol",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = if (safetyAnswer > 0) CrisisRed else MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

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
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(6.dp))
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
    functioningResults: Map<String, Int> = emptyMap(),
    functioningAnswers: Map<String, Int> = functioningResults,
    functioningImpact: Int = 0,
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

    // Calculate functioning scores using AssessmentData logic
    val effectiveFuncMap = if (functioningResults.isNotEmpty()) functioningResults else functioningAnswers
    val functioningResult = AssessmentData.calculateFunctioningResult(effectiveFuncMap, functioningImpact)
    val selfSum = functioningResult.selfScore
    val selfMax = functioningResult.maxSelfScore
    val selfPct = (selfSum - 4).toFloat() / (selfMax - 4).toFloat()

    val interSum = functioningResult.interpersonalScore
    val interMax = functioningResult.maxInterpersonalScore
    val interPct = (interSum - 4).toFloat() / (interMax - 4).toFloat()

    val totalFuncSum = functioningResult.rawScore
    val totalFuncMax = functioningResult.maxScore
    val functioningTier = functioningResult.tier

    // Calculate aggregate impact level using the same logic as domain assessments
    val traitHighestImpact = domainResults.maxOfOrNull { it.impactLevel } ?: 0
    val aggregateImpact = AssessmentData.calculateAggregateImpact(domainResults, functioningResult.impactLevel)

    // Share summary handler
    fun shareResults() {
        val sb = StringBuilder()
        sb.append("=== ").append(when(language) {
            Language.ENGLISH -> "Personality Reflection Hub — Profile Summary"
            Language.HINDI -> "व्यक्तित्व चिंतन हब — प्रोफ़ाइल सारांश"
            Language.GUJARATI -> "વ્યક્તિત્વ ચિંતન હબ — પ્રોફાઇલ સારાંશ"
        }).append(" ===\n\n")

        sb.append(when(language) {
            Language.ENGLISH -> "TRAIT DOMAIN REFLECTION (ICD-11 Continuous Model):\n"
            Language.HINDI -> "लक्षण आयामी चिंतन (ICD-11 निरंतर मॉडल):\n"
            Language.GUJARATI -> "લક્ષણ આયામી ચિંતન (ICD-11 સતત મોડેલ):\n"
        })
        domainResults.forEach { r ->
            sb.append("• ").append(r.domain.everydayName.get(language))
                .append(" (").append(r.tier.label.get(language)).append(")")
                .append(" — Impact: ").append(AssessmentData.impactLevels[r.impactLevel].get(language))
                .append("\n")
        }

        sb.append("\n").append(when(language) {
            Language.ENGLISH -> "SELF & INTERPERSONAL FUNCTIONING (ICD-11 Core Dimensions):\n"
            Language.HINDI -> "आत्म एवं पारस्परिक कार्यप्रणाली (ICD-11 मूल आयाम):\n"
            Language.GUJARATI -> "સ્વ અને પરસ્પર કાર્યપ્રણાલી (ICD-11 મૂળ આયામ):\n"
        })
        sb.append("• Overall: ").append(functioningTier.label.get(language)).append(" (").append(totalFuncSum).append("/").append(totalFuncMax).append(")\n")
        sb.append("• Self-Functioning: ").append(selfSum).append("/").append(selfMax).append(" (Identity, Self-Worth, Goals)\n")
        sb.append("• Interpersonal Skills: ").append(interSum).append("/").append(interMax).append(" (Empathy, Trust, Relational Stability)\n")
        sb.append("• Everyday Impact: ").append(AssessmentData.functioningImpactOptions[functioningResult.impactLevel].get(language)).append("\n")
        AssessmentData.functioningTierSummaries[functioningTier]?.let {
            sb.append(it.get(language)).append("\n")
        }

        sb.append("\n").append(when(language) {
            Language.ENGLISH -> "IMPORTANT NOTICE: This is an educational self-reflection summary, NOT a psychiatric or medical diagnosis. A true evaluation requires clinical consultation with a licensed professional.\n\nSupport in India:\n• Tele-MANAS (24/7): 14416\n• National Emergency: 112"
            Language.HINDI -> "महत्वपूर्ण सूचना: यह केवल एक शैक्षिक आत्म-चिंतन सारांश है, कोई चिकित्सीय निदान नहीं। वास्तविक मूल्यांकन के लिए विशेषज्ञ से परामर्श आवश्यक है।\n\nभारत में सहायता:\n• टेली-मानस (24/7): 14416\n• आपातकालीन: 112"
            Language.GUJARATI -> "મહત્વપૂર્ણ સૂચના: આ માત્ર શૈક્ષણિક સ્વ-ચિંતન સારાંશ છે, કોઈ તબીબી નિદાન નથી. વાસ્તવિક મૂલ્યાંકન માટે નિષ્ણાતની સલાહ જરૂરી છે.\n\nભારતમાં સહાય:\n• ટેલી-માનસ (24/7): 14416\n• કટોકટી: 112"
        })

        val sendIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "Personality Reflection Summary")
            putExtra(Intent.EXTRA_TEXT, sb.toString())
        }
        context.startActivity(Intent.createChooser(sendIntent, "Share Summary"))
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

        // Trait Domain Result Cards
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

        // Dedicated Card: Self & Interpersonal Functioning (ICD-11 Core Dimensions)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.5.dp, MaterialTheme.colorScheme.secondary.copy(alpha = 0.5f)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = AssessmentData.functioningSectionTitle.get(language),
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.secondary
                        )
                        Text(
                            text = "ICD-11 Severity Core: Self & Relational Functioning",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = MaterialTheme.colorScheme.secondaryContainer
                    ) {
                        Text(
                            text = functioningTier.label.get(language),
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }

                // Sub-dimension 1: Self-Functioning
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Self-Functioning (Identity, Goals, Self-Worth):"
                                Language.HINDI -> "आत्म-कार्यप्रणाली (पहचान, लक्ष्य, आत्म-मूल्य):"
                                Language.GUJARATI -> "સ્વ-કાર્યપ્રણાલી (ઓળખ, લક્ષ્યો, આત્મસન્માન):"
                            },
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "$selfSum / $selfMax",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    LinearProgressIndicator(
                        progress = { selfPct.coerceIn(0.05f, 1f) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .clip(RoundedCornerShape(4.dp)),
                        color = MaterialTheme.colorScheme.secondary,
                        trackColor = MaterialTheme.colorScheme.surfaceVariant
                    )
                }

                // Sub-dimension 2: Interpersonal Functioning
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Interpersonal Skills (Empathy, Trust, Stability):"
                                Language.HINDI -> "पारस्परिक कौशल (सहानुभूति, विश्वास, स्थिरता):"
                                Language.GUJARATI -> "પરસ્પર કૌશલ્ય (સહાનુભૂતિ, વિશ્વાસ, સ્થિરતા):"
                            },
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "$interSum / $interMax",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    LinearProgressIndicator(
                        progress = { interPct.coerceIn(0.05f, 1f) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .clip(RoundedCornerShape(4.dp)),
                        color = MaterialTheme.colorScheme.secondary,
                        trackColor = MaterialTheme.colorScheme.surfaceVariant
                    )
                }

                // Functioning Everyday Impact Chip
                Surface(
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp),
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Everyday Life Impact: "
                                Language.HINDI -> "दैनिक जीवन पर प्रभाव: "
                                Language.GUJARATI -> "દૈનિક જીવન પર પ્રભાવ: "
                            } + AssessmentData.functioningImpactOptions[functioningResult.impactLevel].get(language),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }

                // Tier Summary interpretation
                AssessmentData.functioningTierSummaries[functioningTier]?.let { summary ->
                    Surface(
                        color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.35f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = summary.get(language),
                            modifier = Modifier.padding(12.dp),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }

        // 4. Why This Reflection Matters (purpose statement)
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

        // 5. Your Next Steps (personalized based on trait domains, functioning module, and everyday impact)
        val elevatedDomains = domainResults.filter { it.tier == ResultTier.MORE_THAN_MOST }
        val highestImpact = aggregateImpact

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

                // Step A: Domain callout (if any domain is MORE_THAN_MOST)
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

                // Step B: Functioning callout if functioning indicates strain or moderate/severe impact
                if (functioningTier == ResultTier.MORE_THAN_MOST || functioningResult.impactLevel >= 2) {
                    Surface(
                        color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.08f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = when (language) {
                                Language.ENGLISH -> "Self & Relational Note: Your responses indicate noticeable strain in your internal sense of stability or in maintaining smooth relationships. Under modern psychiatric practice, building skills for self-soothing and interpersonal effectiveness (such as through DBT or Schema Therapy) can provide substantial relief."
                                Language.HINDI -> "आत्म एवं संबंध टिप्पणी: आपके उत्तर आत्म-स्थिरता या रिश्तों को सुचारू रखने में उल्लेखनीय खिंचाव दर्शाते हैं। आधुनिक मनोचिकित्सा में, स्वयं को शांत करने और रिश्तों को संभालने के कौशल (जैसे DBT या स्कीमा थेरेपी) सीखने से काफी राहत मिल सकती है।"
                                Language.GUJARATI -> "સ્વ અને સંબંધ નોંધ: તમારા જવાબો આત્મ-સ્થિરતા અથવા સંબંધો જાળવવામાં નોંધપાત્ર તણાવ દર્શાવે છે. આધુનિક મનોચિકિત્સામાં, જાતને શાંત કરવા અને સંબંધો સંભાળવાના કૌશલ્યો (જેમ કે DBT કે સ્કીમા થેરાપી) શીખવાથી નોંધપાત્ર રાહત મળી શકે છે."
                            },
                            modifier = Modifier.padding(12.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 20.sp
                        )
                    }
                }

                // Step C: Specific Functioning Impact Guidance
                AssessmentData.functioningImpactGuidance[functioningResult.impactLevel]?.let { funcGuidance ->
                    Surface(
                        color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.35f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = when (language) {
                                    Language.ENGLISH -> "Functioning Recommendation (${AssessmentData.functioningImpactOptions[functioningResult.impactLevel].get(language)}):"
                                    Language.HINDI -> "कार्यप्रणाली अनुशंसा (${AssessmentData.functioningImpactOptions[functioningResult.impactLevel].get(language)}):"
                                    Language.GUJARATI -> "કાર્યપ્રણાલી ભલામણ (${AssessmentData.functioningImpactOptions[functioningResult.impactLevel].get(language)}):"
                                },
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.secondary
                            )
                            Text(
                                text = funcGuidance.get(language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }

                // Step D: Tiered guidance based on highest combined impact level reported
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

        // 7. Actions: Share Summary & Reset Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            OutlinedButton(
                onClick = { shareResults() },
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(Icons.Default.Share, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Share Summary"
                        Language.HINDI -> "सारांश साझा करें"
                        Language.GUJARATI -> "સારાંશ શેર કરો"
                    }
                )
            }

            Button(
                onClick = onReset,
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Icon(Icons.Default.Refresh, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Reset"
                        Language.HINDI -> "रीसेट करें"
                        Language.GUJARATI -> "રીસેટ કરો"
                    }
                )
            }
        }
    }
}
