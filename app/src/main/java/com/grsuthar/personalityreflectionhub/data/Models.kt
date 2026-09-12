package com.grsuthar.personalityreflectionhub.data

import androidx.compose.ui.graphics.Color
import com.grsuthar.personalityreflectionhub.ui.theme.*

enum class NavDestination {
    HOME,
    REFLECT,
    PATTERNS,
    CAREGIVER,
    HELPLINES
}

enum class TraitDomain(
    val clinicalName: LocalizedString,
    val everydayName: LocalizedString,
    val shortCode: String,
    val containerColor: Color,
    val accentColor: Color
) {
    NEGATIVE_AFFECTIVITY(
        clinicalName = LocalizedString(
            en = "Negative Affectivity",
            hi = "ऋणात्मक भावुकता (Negative Affectivity)",
            gu = "નકારાત્મક ભાવનાશીલતા (Negative Affectivity)"
        ),
        everydayName = LocalizedString(
            en = "Intense & Frequent Emotional Storms",
            hi = "तीव्र और बार-बार होने वाले भावनात्मक उतार-चढ़ाव",
            gu = "તીવ્ર અને વારંવાર થતા લાગણીશીલ ઉતાર-ચઢાવ"
        ),
        shortCode = "NA",
        containerColor = DomainNegativeAffectivityContainer,
        accentColor = DomainNegativeAffectivityAccent
    ),
    DETACHMENT(
        clinicalName = LocalizedString(
            en = "Detachment",
            hi = "अलगाव (Detachment)",
            gu = "અળગાપણું (Detachment)"
        ),
        everydayName = LocalizedString(
            en = "Social & Emotional Distance",
            hi = "सामाजिक और भावनात्मक दूरी",
            gu = "સામાજિક અને ભાવનાત્મક અંતર"
        ),
        shortCode = "DET",
        containerColor = DomainDetachmentContainer,
        accentColor = DomainDetachmentAccent
    ),
    DISSOCIALITY(
        clinicalName = LocalizedString(
            en = "Dissociality",
            hi = "असामाजिक प्रवृत्तियाँ (Dissociality)",
            gu = "અસામાજિક વલણ (Dissociality)"
        ),
        everydayName = LocalizedString(
            en = "Friction in Empathy & Fairness",
            hi = "सहानुभूति और दूसरों के अधिकारों में टकराव",
            gu = "સહાનુભૂતિ અને અન્યના અધિકારોમાં ઘર્ષણ"
        ),
        shortCode = "DIS",
        containerColor = DomainDissocialityContainer,
        accentColor = DomainDissocialityAccent
    ),
    DISINHIBITION(
        clinicalName = LocalizedString(
            en = "Disinhibition",
            hi = "असंयम / अनियंत्रण (Disinhibition)",
            gu = "અસંયમ / આવેગશીલતા (Disinhibition)"
        ),
        everydayName = LocalizedString(
            en = "Acting on Impulse Without Planning",
            hi = "बिना सोचे-समझे तुरंत निर्णय लेना",
            gu = "વિચાર્યા વગર તાત્કાલિક નિર્ણય લેવા"
        ),
        shortCode = "DIB",
        containerColor = DomainDisinhibitionContainer,
        accentColor = DomainDisinhibitionAccent
    ),
    ANANKASTIA(
        clinicalName = LocalizedString(
            en = "Anankastia",
            hi = "कठोर पूर्णतावाद (Anankastia)",
            gu = "કડક પૂર્ણતાવાદ (Anankastia)"
        ),
        everydayName = LocalizedString(
            en = "Rigid Order, Rules & Control",
            hi = "कठोर नियम, व्यवस्था और नियंत्रण",
            gu = "કડક નિયમો, વ્યવસ્થા અને નિયંત્રણ"
        ),
        shortCode = "ANK",
        containerColor = DomainAnankastiaContainer,
        accentColor = DomainAnankastiaAccent
    ),
    BORDERLINE_PATTERN(
        clinicalName = LocalizedString(
            en = "Borderline Pattern Specifier",
            hi = "सीमावर्ती पैटर्न (Borderline Pattern)",
            gu = "બોર્ડરલાઇન પેટર્ન (Borderline Pattern)"
        ),
        everydayName = LocalizedString(
            en = "Relational & Identity Turbulence",
            hi = "संबंधों और आत्म-छवि में अस्थिरता",
            gu = "સંબંધો અને આત્મ-છબીમાં અસ્થિરતા"
        ),
        shortCode = "BPD",
        containerColor = DomainBorderlinePatternContainer,
        accentColor = DomainBorderlinePatternAccent
    )
}

enum class ResultTier(
    val label: LocalizedString,
    val description: LocalizedString
) {
    LESS_THAN_MOST(
        label = LocalizedString(
            en = "Less than most people",
            hi = "औसत से कम",
            gu = "મોટાભાગના લોકો કરતાં ઓછું"
        ),
        description = LocalizedString(
            en = "You report experiencing these traits less frequently than average.",
            hi = "आप इन लक्षणों को सामान्य से कम बार अनुभव करते हैं।",
            gu = "તમે આ લક્ષણો સામાન્ય કરતાં ઓછી વાર અનુભવો છો."
        )
    ),
    ABOUT_TYPICAL(
        label = LocalizedString(
            en = "About typical",
            hi = "सामान्य स्तर",
            gu = "સામાન્ય સ્તર"
        ),
        description = LocalizedString(
            en = "Your responses match typical human variations across life contexts.",
            hi = "आपके अनुभव अधिकांश लोगों के सामान्य जीवन के समान हैं।",
            gu = "તમારા અનુભવો મોટાભાગના લોકોની સામાન્ય પરિસ્થિતિઓ જેવા છે."
        )
    ),
    MORE_THAN_MOST(
        label = LocalizedString(
            en = "More than most people",
            hi = "औसत से अधिक",
            gu = "મોટાભાગના લોકો કરતાં વધુ"
        ),
        description = LocalizedString(
            en = "These tendencies may play a prominent role in how you experience life.",
            hi = "ये प्रवृत्तियाँ आपके जीवन के अनुभवों में प्रमुख भूमिका निभा सकती हैं।",
            gu = "આ વલણ તમારા જીવનના અનુભવોમાં મુખ્ય ભાગ ભજવી શકે છે."
        )
    )
}

data class ReflectionQuestion(
    val id: String,
    val domain: TraitDomain,
    val text: LocalizedString
)

data class DomainResult(
    val domain: TraitDomain,
    val rawScore: Int,
    val maxScore: Int,
    val percentage: Float,
    val tier: ResultTier,
    val impactLevel: Int // 0: minimal, 1: mild, 2: moderate, 3: severe
)

data class ConceptCardInfo(
    val title: LocalizedString,
    val subtitle: LocalizedString,
    val description: LocalizedString,
    val example: LocalizedString
)

data class SeverityLevelInfo(
    val title: LocalizedString,
    val summary: LocalizedString,
    val description: LocalizedString,
    val everydayImpactExample: LocalizedString
)

data class PatternEducationItem(
    val domain: TraitDomain,
    val everydayDescription: LocalizedString,
    val dayToDayLook: List<LocalizedString>,
    val illustrativeExample: LocalizedString,
    val strengthsReframe: LocalizedString,
    val oldTermsBridge: LocalizedString
)

data class CaregiverPatternGuide(
    val domain: TraitDomain,
    val whatYouSee: List<LocalizedString>,
    val whatUnderneath: List<LocalizedString>,
    val whatHelps: List<LocalizedString>,
    val whatBackfires: List<LocalizedString>,
    val whenToWorry: List<LocalizedString>,
    val illustrativeExample: LocalizedString? = null
)

data class CrisisHelpline(
    val name: LocalizedString,
    val number: String,
    val hours: LocalizedString,
    val isFree: Boolean,
    val description: LocalizedString
)

data class FAQItem(
    val question: LocalizedString,
    val answer: LocalizedString
)

data class BoundaryScriptItem(
    val title: LocalizedString,
    val scenario: LocalizedString,
    val script: LocalizedString,
    val whyItWorks: LocalizedString
)

enum class FunctioningCategory(val displayName: LocalizedString) {
    SELF(
        LocalizedString(
            en = "Self-Functioning (Identity & Goals)",
            hi = "आत्म-कार्यप्रणाली (पहचान और लक्ष्य)",
            gu = "સ્વ-કાર્યપ્રણાલી (ઓળખ અને લક્ષ્યો)"
        )
    ),
    INTERPERSONAL(
        LocalizedString(
            en = "Interpersonal Functioning (Relationships & Empathy)",
            hi = "पारस्परिक कार्यप्रणाली (संबंध और सहानुभूति)",
            gu = "પરસ્પર કાર્યપ્રણાલી (સંબંધો અને સહાનુભૂતિ)"
        )
    )
}

data class FunctioningQuestion(
    val id: String,
    val category: FunctioningCategory,
    val text: LocalizedString
)

data class FunctioningResult(
    val rawScore: Int,
    val maxScore: Int = 40,
    val percentage: Float,
    val selfScore: Int = 0,
    val maxSelfScore: Int = 20,
    val interpersonalScore: Int = 0,
    val maxInterpersonalScore: Int = 20,
    val impactLevel: Int = 0,
    val tier: ResultTier,
    val summary: LocalizedString
)

data class GlossaryItem(
    val term: LocalizedString,
    val plainDefinition: LocalizedString,
    val whyItMatters: LocalizedString
)

data class EducationalSectionItem(
    val title: LocalizedString,
    val summary: LocalizedString,
    val details: List<LocalizedString>,
    val takeaway: LocalizedString
)

data class ProfessionalRoleInfo(
    val title: LocalizedString,
    val qualification: LocalizedString,
    val whatTheyDo: LocalizedString,
    val whenToSeeThem: LocalizedString
)

data class AppointmentStep(
    val stepNumber: Int,
    val title: LocalizedString,
    val summary: LocalizedString,
    val details: LocalizedString
)

data class GpReferralPoint(
    val title: LocalizedString,
    val rationale: LocalizedString,
    val practicalTip: LocalizedString
)

