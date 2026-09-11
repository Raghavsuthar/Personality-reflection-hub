package com.grsuthar.personalityreflectionhub.data

object HelplineData {

    val helplines: List<CrisisHelpline> = listOf(
        CrisisHelpline(
            name = LocalizedString(
                en = "Tele-MANAS (Govt. of India)",
                hi = "टेली-मानस (भारत सरकार)",
                gu = "ટેલી-માનસ (ભારત સરકાર)"
            ),
            number = "14416",
            hours = LocalizedString(
                en = "24/7 • Toll-Free • Multi-language",
                hi = "24/7 • निःशुल्क • बहुभाषी",
                gu = "24/7 • મફત • બહુભાષી"
            ),
            isFree = true,
            description = LocalizedString(
                en = "National tele-mental health programme providing immediate free psychological support in all Indian languages (or dial 1800-891-4416).",
                hi = "राष्ट्रीय मानसिक स्वास्थ्य हेल्पलाइन जो सभी भारतीय भाषाओं में तुरंत निःशुल्क सहायता प्रदान करती है (या 1800-891-4416 डायल करें)।",
                gu = "રાષ્ટ્રીય માનસિક સ્વાસ્થ્ય હેલ્પલાઇન જે તમામ ભારતીય ભાષાઓમાં ત્વરિત મફત સહાય પૂરી પાડે છે (અથવા 1800-891-4416 ડાયલ કરો)."
            )
        ),
        CrisisHelpline(
            name = LocalizedString(
                en = "KIRAN Helpline (Dept. of Empowerment of PwD)",
                hi = "किरण हेल्पलाइन (दिव्यांगजन सशक्तिकरण विभाग)",
                gu = "કિરણ હેલ્પલાઇન (દિવ્યાંગજન સશક્તિકરણ વિભાગ)"
            ),
            number = "18005990019",
            hours = LocalizedString(
                en = "24/7 • Toll-Free • Govt. of India",
                hi = "24/7 • निःशुल्क • भारत सरकार",
                gu = "24/7 • મફત • ભારત સરકાર"
            ),
            isFree = true,
            description = LocalizedString(
                en = "Dedicated 24/7 helpline by the Ministry of Social Justice and Empowerment offering mental health first-aid and counseling.",
                hi = "सामाजिक न्याय एवं अधिकारिता मंत्रालय द्वारा मानसिक प्राथमिक उपचार और संकट प्रबंधन के लिए समर्पित हेल्पलाइन।",
                gu = "સામાજિક ન્યાય અને અધિકારીતા મંત્રાલય દ્વારા માનસિક પ્રાથમિક સારવાર માટે સમર્પિત હેલ્પલાઇન."
            )
        ),
        CrisisHelpline(
            name = LocalizedString(
                en = "iCall Psychosocial Helpline (TISS)",
                hi = "iCall हेल्पलाइन (टाटा सामाजिक विज्ञान संस्थान)",
                gu = "iCall હેલ્પલાઇન (ટાટા ઇન્સ્ટિટ્યૂટ ઑફ સોશિયલ સાયન્સિસ)"
            ),
            number = "02225521111",
            hours = LocalizedString(
                en = "Mon–Sat: 10:00 AM – 8:00 PM",
                hi = "सोमवार–शनिवार: सुबह 10 से रात 8 बजे",
                gu = "સોમવાર–શનિવાર: સવારે 10 થી રાત્રે 8 વાગ્યા"
            ),
            isFree = false,
            description = LocalizedString(
                en = "Professional telephone and email counseling service run by the Tata Institute of Social Sciences (TISS). Standard call charges apply.",
                hi = "टाटा सामाजिक विज्ञान संस्थान (TISS) द्वारा संचालित पेशेवर परामर्श सेवा। सामान्य कॉल शुल्क लागू हो सकते हैं।",
                gu = "ટાટા ઇન્સ્ટિટ્યૂટ ઑફ સોશિયલ સાયન્સિસ (TISS) દ્વારા સંચાલિત વ્યાવસાયિક કાઉન્સેલિંગ સેવા."
            )
        ),
        CrisisHelpline(
            name = LocalizedString(
                en = "National Emergency Response Support (India)",
                hi = "राष्ट्रीय आपातकालीन सेवा (भारत)",
                gu = "રાષ્ટ્રીય કટોકટી સેવા (ભારત)"
            ),
            number = "112",
            hours = LocalizedString(
                en = "24/7 • Police, Ambulance & Fire",
                hi = "24/7 • पुलिस, एम्बुलेंस और अग्निशमन",
                gu = "24/7 • પોલીસ, એમ્બ્યુલન્સ અને ફાયર"
            ),
            isFree = true,
            description = LocalizedString(
                en = "Call immediately if there is acute, immediate danger of suicide, physical violence, or severe medical crisis.",
                hi = "यदि आत्महत्या, शारीरिक हिंसा या गंभीर चिकित्सीय संकट का तत्काल खतरा हो तो तुरंत कॉल करें।",
                gu = "જો આત્મહત્યા, શારીરિક હિંસા કે ગંભીર તબીબી કટોકટીનું તાત્કાલિક જોખમ હોય તો તરત જ કૉલ કરો."
            )
        )
    )

    val ahmedabadLocalPlaceholder = LocalizedString(
        en = "[Local Ahmedabad & GIMH Emergency Placeholder]: This contact section is reserved for Dr. Vidhi Pareekh (MD) & Dr. Raghav Suthar (DNB) to confirm and publish verified Ahmedabad and Gujarat Institute of Mental Health (GIMH) emergency psychiatry services upon official deployment. In acute crises, please visit the emergency psychiatry desk at Civil Hospital / GIMH Ahmedabad or call 112 / 14416.",
        hi = "[अहमदाबाद एवं GIMH स्थानीय आपातकालीन स्थान]: यह अनुभाग डॉ. विधी पारेख (MD) एवं डॉ. राघव सुथार (DNB) द्वारा आधिकारिक रूप से सत्यापित अहमदाबाद एवं गुजरात मानसिक स्वास्थ्य संस्थान (GIMH) की सेवाओं को जोड़ने के लिए आरक्षित है। किसी भी गंभीर संकट में सिविल अस्पताल / GIMH अहमदाबाद के आपातकालीन मनोचिकित्सा विभाग जाएँ या 112 / 14416 पर संपर्क करें।",
        gu = "[અમદાવાદ અને GIMH સ્થાનિક ઇમરજન્સી સ્થાન]: આ વિભાગ ડૉ. વિધિ પારેખ (MD) અને ડૉ. રાઘવ સુથાર (DNB) દ્વારા અમદાવાદ અને ગુજરાત ઇન્સ્ટિટ્યૂટ ઑફ મેન્ટલ હેલ્થ (GIMH) ની સત્તાવાર ચકાસાયેલ કટોકટી સેવાઓ ઉમેરવા માટે રાખવામાં આવ્યો છે. ગંભીર સ્થિતિમાં સિવિલ હોસ્પિટલ / GIMH અમદાવાદના ઇમરજન્સી સાયકિયાટ્રી વિભાગમાં પહોંચો અથવા 112 / 14416 પર કૉલ કરો."
    )

    val treatmentModalityCards = listOf(
        Triple(
            LocalizedString("Dialectical Behavior Therapy (DBT)", "डायलेक्टिकल बिहेवियर थेरेपी (DBT)", "ડાયલેક્ટિકલ બિહેવિયર થેરાપી (DBT)"),
            LocalizedString(
                "A gold-standard therapy for intense emotions, relationship instability, and self-harm urges.",
                "तीव्र भावनाओं, अस्थिर रिश्तों और खुद को चोट पहुँचाने के आवेगों के लिए सबसे प्रमाणिक थेरेपी।",
                "તીવ્ર લાગણીઓ, અસ્થિર સંબંધો અને જાતને ઈજા પહોંચાડવાના આવેગ માટે સર્વશ્રેષ્ઠ સાબિત થયેલ થેરાપી."
            ),
            LocalizedString(
                "Teaches four concrete skill modules: Mindfulness, Distress Tolerance, Emotion Regulation, and Interpersonal Effectiveness.",
                "चार व्यावहारिक कौशल सिखाती है: माइंडफुलनेस (सचेतनता), संकट सहनशीलता, भावना नियंत्रण और संबंध प्रभावशीलता।",
                "ચાર વ્યવહારુ કૌશલ્યો શીખવે છે: માઇન્ડફુલનેસ (સભાનતા), સંકટ સહનશક્તિ, લાગણી નિયંત્રણ અને સંબંધ કુશળતા."
            )
        ),
        Triple(
            LocalizedString("Mentalization-Based Therapy (MBT)", "मेंटलाइजेशन-बेस्ड थेरेपी (MBT)", "મેન્ટલાઇઝેશન-બેસ્ડ થેરાપી (MBT)"),
            LocalizedString(
                "Focuses on 'mentalizing' — plainly defined as understanding what is happening in someone else's mind and in your own mind.",
                "इसका मुख्य उद्देश्य यह समझना है कि दूसरों के मन में और आपके खुद के मन में वास्तव में क्या चल रहा है।",
                "આનો મુખ્ય હેતુ એ સમજવાનો છે કે અન્ય વ્યક્તિના મનમાં અને તમારા પોતાના મનમાં વાસ્તવમાં શું ચાલી રહ્યું છે."
            ),
            LocalizedString(
                "Helps pause before reacting, preventing misunderstandings from blowing up into catastrophic relationship fractures.",
                "प्रतिक्रिया देने से पहले रुकना सिखाती है, ताकि गलतफहमियाँ रिश्तों को तोड़ने वाले तूफानों में न बदलें।",
                "પ્રતિક્રિયા આપતા પહેલાં થોભવાનું શીખવે છે, જેથી ગેરસમજ સંબંધો તોડી નાખતા વિવાદોમાં ન ફેરવાય."
            )
        ),
        Triple(
            LocalizedString("Schema Therapy", "स्कीमा थेरेपी (Schema Therapy)", "સ્કીમા થેરાપી (Schema Therapy)"),
            LocalizedString(
                "Identifies deeply ingrained childhood emotional patterns ('schemas') such as fear of defectiveness or abandonment.",
                "बचपन के गहरे भावनात्मक ढांचों (schemas) की पहचान करती है, जैसे खुद को कमतर समझना या अकेले छूटने का डर।",
                "બાળપણના ઊંડા લાગણીશીલ માળખાઓ (schemas) ઓળખે છે, જેમ કે પોતાની જાતને ઊતરતી ગણવી કે ત્યજી દેવાનો ડર."
            ),
            LocalizedString(
                "Integrates cognitive and experiential techniques to heal emotional wounds and build a stable, healthy adult self.",
                "पुरानी मानसिक चोटों को भरने और एक स्थिर, स्वस्थ और परिपक्व व्यक्तित्व का निर्माण करने में मदद करती है।",
                "જૂના માનસિક ઘા રૂઝવવા અને એક સ્થિર, સ્વસ્થ અને પરિપક્વ વ્યક્તિત્વના નિર્માણમાં મદદ કરે છે."
            )
        ),
        Triple(
            LocalizedString("The Role of Medication", "दवाओं की वास्तविक भूमिका", "દવાઓની વાસ્તવિક ભૂમિકા"),
            LocalizedString(
                "No pill changes personality traits or teaches communication skills.",
                "कोई भी गोली व्यक्तित्व को नहीं बदल सकती और न ही रिश्ते निभाना सिखा सकती है।",
                "કોઈ પણ ગોળી વ્યક્તિત્વને બદલી શકતી નથી કે સંબંધો સાચવતા શીખવી શકતી નથી."
            ),
            LocalizedString(
                "Psychiatrists use medications thoughtfully to reduce overwhelming anxiety, stabilize sharp mood swings, or restore sleep, making psychotherapy possible.",
                "मनोचिकित्सक तीव्र घबराहट, गंभीर मूड के झूलों या नींद की समस्या को शांत करने के लिए दवाएं देते हैं, ताकि थेरेपी प्रभावी हो सके।",
                "સાયકિયાટ્રિસ્ટ તીવ્ર ગભરાટ, મૂડના મોટા ઉતાર-ચઢાવ કે ઊંઘની સમસ્યા હળવી કરવા દવા આપે છે, જેથી દર્દી થેરાપી પર ધ્યાન કેન્દ્રિત કરી શકે."
            )
        )
    )
}
