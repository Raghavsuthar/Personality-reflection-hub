package com.grsuthar.personalityreflectionhub.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Warning
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
import com.grsuthar.personalityreflectionhub.ui.theme.CrisisContainer
import com.grsuthar.personalityreflectionhub.ui.theme.CrisisDark
import com.grsuthar.personalityreflectionhub.ui.theme.CrisisRed
import com.grsuthar.personalityreflectionhub.ui.theme.OnCrisisContainer

fun dialNumber(context: Context, number: String) {
    try {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
        context.startActivity(intent)
    } catch (_: Exception) {
        // Fallback gracefully if dialer is not present
    }
}

@Composable
fun CrisisDialog(
    language: Language,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
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
                        Language.ENGLISH -> "Immediate Crisis Resources"
                        Language.HINDI -> "आपातकालीन संकट संसाधन"
                        Language.GUJARATI -> "ત્વરિત કટોકટી સહાય"
                    },
                    style = MaterialTheme.typography.titleLarge,
                    color = CrisisDark
                )
            }
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "If you or someone you know is in acute danger of self-harm, suicide, or violence, free professional help is available 24/7 across India. Tap any helpline to dial immediately:"
                        Language.HINDI -> "यदि आप या आपका कोई परिचित खुद को नुकसान पहुँचाने या संकट में है, तो पूरे भारत में निःशुल्क पेशेवर मदद उपलब्ध है। तुरंत कॉल करने के लिए किसी भी हेल्पलाइन पर टैप करें:"
                        Language.GUJARATI -> "જો તમે કે તમારા કોઈ પરિચિત તાત્કાલિક સંકટમાં છો, તો સમગ્ર ભારતમાં મફત વ્યાવસાયિક સહાય ઉપલબ્ધ છે. તરત જ કૉલ કરવા માટે કોઈપણ હેલ્પલાઇન પર ટેપ કરો:"
                    },
                    style = MaterialTheme.typography.bodyMedium
                )

                HelplineData.helplines.forEach { helpline ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { dialNumber(context, helpline.number) },
                        colors = CardDefaults.cardColors(
                            containerColor = if (helpline.number == "112" || helpline.number == "14416") CrisisContainer else MaterialTheme.colorScheme.surfaceVariant
                        ),
                        border = BorderStroke(
                            1.dp,
                            if (helpline.number == "112" || helpline.number == "14416") CrisisRed else MaterialTheme.colorScheme.outline
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = helpline.name.get(language),
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.SemiBold,
                                    color = if (helpline.number == "112" || helpline.number == "14416") OnCrisisContainer else MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    text = helpline.hours.get(language),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "Tel: ${helpline.number}",
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = CrisisRed,
                                    fontSize = 15.sp
                                )
                            }
                            IconButton(
                                onClick = { dialNumber(context, helpline.number) },
                                colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = CrisisRed,
                                    contentColor = MaterialTheme.colorScheme.onError
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Call,
                                    contentDescription = "Call ${helpline.number}"
                                )
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            TextButton(
                onClick = onDismiss,
                colors = ButtonDefaults.textButtonColors(contentColor = MaterialTheme.colorScheme.primary)
            ) {
                Icon(imageVector = Icons.Default.Close, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = when (language) {
                        Language.ENGLISH -> "Close"
                        Language.HINDI -> "बंद करें"
                        Language.GUJARATI -> "બંધ કરો"
                    }
                )
            }
        }
    )
}
