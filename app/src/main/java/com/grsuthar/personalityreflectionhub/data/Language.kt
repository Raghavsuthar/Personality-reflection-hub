package com.grsuthar.personalityreflectionhub.data

enum class Language(val code: String, val label: String, val nativeName: String) {
    ENGLISH("en", "English", "English"),
    HINDI("hi", "Hindi", "हिंदी"),
    GUJARATI("gu", "Gujarati", "ગુજરાતી")
}

data class LocalizedString(
    val en: String,
    val hi: String,
    val gu: String
) {
    fun get(language: Language): String = when (language) {
        Language.ENGLISH -> en
        Language.HINDI -> hi
        Language.GUJARATI -> gu
    }
}

object UiText {
    val appTitle = LocalizedString(
        en = "Personality Reflection Hub",
        hi = "व्यक्तित्व चिंतन हब",
        gu = "વ્યક્તિત્વ ચિંતન હબ"
    )

    val drAttribution = LocalizedString(
        en = "Dr. Vidhi Pareekh, MD Psychiatry • Dr. Raghav Suthar, DNB Psychiatry",
        hi = "डॉ. विधी पारेख, MD मनोचिकित्सा • डॉ. राघव सुथार, DNB मनोचिकित्सा",
        gu = "ડૉ. વિધિ પારેખ, MD સાયકિયાટ્રી • ડૉ. રાઘવ સુથાર, DNB સાયકિયાટ્રી"
    )

    val reviewPendingNote = LocalizedString(
        en = "[Review pending by Dr. Pareekh & Dr. Suthar]",
        hi = "[डॉ. पारेख एवं डॉ. सुथार द्वारा समीक्षा लंबित]",
        gu = "[ડૉ. પારેખ અને ડૉ. સુથાર દ્વારા સમીક્ષા બાકી]"
    )

    val crisisButton = LocalizedString(
        en = "Crisis Call",
        hi = "आपातकालीन कॉल",
        gu = "ઇમરજન્સી કૉલ"
    )

    val navHome = LocalizedString(
        en = "Home",
        hi = "होम",
        gu = "હોમ"
    )

    val navReflect = LocalizedString(
        en = "Reflect",
        hi = "चिंतन",
        gu = "ચિંતન"
    )

    val navPatterns = LocalizedString(
        en = "Patterns",
        hi = "पैटर्न",
        gu = "પેટર્ન"
    )

    val navCaregiver = LocalizedString(
        en = "Caregiver",
        hi = "देखभालकर्ता",
        gu = "સંભાળકર્તા"
    )

    val navHelplines = LocalizedString(
        en = "Helplines",
        hi = "हेल्पलाइन",
        gu = "હેલ્પલાઇન"
    )

    val crisisStripTitle = LocalizedString(
        en = "Need immediate support? Free, 24/7 in India",
        hi = "तत्काल सहायता चाहिए? भारत में निःशुल्क, 24/7",
        gu = "ત્વરિત મદદની જરૂર છે? ભારતમાં મફત, 24/7"
    )

    val callTeleManas = LocalizedString(
        en = "Call Tele-MANAS (14416)",
        hi = "टेली-मानस कॉल करें (14416)",
        gu = "ટેલી-માનસ કૉલ કરો (14416)"
    )

    val call112 = LocalizedString(
        en = "Emergency (112)",
        hi = "आपातकालीन (112)",
        gu = "ઇમરજન્સી (112)"
    )
}
