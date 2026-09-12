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

    // --- Finding a Mental Health Professional (India-Specific Guide) ---
    val professionalRoles: List<ProfessionalRoleInfo> = listOf(
        ProfessionalRoleInfo(
            title = LocalizedString("Psychiatrist", "मनोचिकित्सक (Psychiatrist)", "સાયકિયાટ્રિસ્ટ (Psychiatrist)"),
            qualification = LocalizedString(
                "MBBS + MD in Psychiatry or DPM",
                "एमबीबीएस + एमडी (साइकियाट्री) या डी.पी.एम.",
                "MBBS + MD (સાયકિયાટ્રી) અથવા D.P.M."
            ),
            whatTheyDo = LocalizedString(
                "Medical doctor specializing in mental health. Evaluates medical causes, diagnoses clinical disorders, and prescribes medications for severe mood volatility, depression, sleep, or psychosis.",
                "चिकित्सक जो मानसिक स्वास्थ्य में विशेषज्ञ हैं। शारीरिक जांच करते हैं, बीमारियों का निदान करते हैं और गंभीर अवसाद, अनिद्रा या मूड के लिए दवाएं लिखते हैं।",
                "તબીબી ડૉક્ટર જે માનસિક સ્વાસ્થ્યમાં નિષ્ણાત છે. શારીરિક તપાસ કરે છે, રોગનું નિદાન કરે છે અને ગંભીર ડિપ્રેશન, અનિદ્રા કે મૂડ માટે દવાઓ લખે છે."
            ),
            whenToSeeThem = LocalizedString(
                "When distress is severe, when self-harm or suicidal thoughts arise, or when mood swings disable daily functioning.",
                "जब मानसिक पीड़ा बहुत गंभीर हो, आत्महत्या या खुद को नुकसान पहुँचाने के विचार आएं, या दैनिक जीवन रुक जाए।",
                "જ્યારે માનસિક વેદના ખૂબ ગંભીર હોય, આત્મહત્યા કે જાતને નુકસાન પહોંચાડવાના વિચારો આવે, કે દૈનિક જીવન અટકી પડે."
            )
        ),
        ProfessionalRoleInfo(
            title = LocalizedString("Clinical Psychologist", "क्लिनिकल मनोवैज्ञानिक (Clinical Psychologist)", "ક્લિનિકલ સાયકોલોજિસ્ટ (Clinical Psychologist)"),
            qualification = LocalizedString(
                "M.Phil in Clinical Psychology or Psy.D + RCI License",
                "एम.फिल (क्लिनिकल साइकोलॉजी) या साइ.डी. + RCI पंजीकरण",
                "M.Phil (ક્લિનિકલ સાયકોલોજી) અથવા Psy.D. + RCI લાયસન્સ"
            ),
            whatTheyDo = LocalizedString(
                "Licensed mental health professional registered with the Rehabilitation Council of India (RCI). Administers standardized psychological testing, assesses personality functioning, and conducts in-depth psychotherapies (DBT, CBT, Schema Therapy). Does NOT prescribe medication.",
                "पुनर्वास परिषद (RCI) द्वारा पंजीकृत विशेषज्ञ। व्यक्तित्व का विस्तृत मनोवैज्ञानिक परीक्षण करते हैं और गहरी साइकोथेरेपी (DBT, CBT, स्कीमा) कराते हैं। दवाएं नहीं लिखते।",
                "રિહેબિલિટેશન કાઉન્સિલ ઓફ ઈન્ડિયા (RCI) રજિસ્ટર્ડ નિષ્ણાત. વ્યક્તિત્વનું ઊંડાણપૂર્વક મનોવૈજ્ઞાનિક પરીક્ષણ કરે છે અને થેરાપી (DBT, CBT) કરાવે છે. દવાઓ લખતા નથી."
            ),
            whenToSeeThem = LocalizedString(
                "For comprehensive personality evaluation and learning long-term emotional regulation and relational skills.",
                "व्यक्तित्व के समग्र मूल्यांकन और भावना नियंत्रण व रिश्ते सुधारने के दीर्घकालिक कौशल सीखने के लिए।",
                "વ્યક્તિત્વના વિસ્તૃત મૂલ્યાંકન અને લાગણી નિયંત્રણ તેમજ સંબંધો સુધારવાના કૌશલ્યો શીખવા માટે."
            )
        ),
        ProfessionalRoleInfo(
            title = LocalizedString("Counseling Psychologist / Counselor", "परामर्शदाता (Counseling Psychologist)", "કાઉન્સેલિંગ સાયકોલોજિસ્ટ (Counselor)"),
            qualification = LocalizedString(
                "M.A. or M.Sc in Psychology / Counseling",
                "एम.ए. या एम.एससी (मनोविज्ञान / परामर्श)",
                "M.A. અથવા M.Sc (મનોવિજ્ઞાન / કાઉન્સેલિંગ)"
            ),
            whatTheyDo = LocalizedString(
                "Provides talk therapy, coping strategies for mild-to-moderate emotional stress, relationship communication, and life transitions.",
                "हल्के से मध्यम तनाव, पारिवारिक संवाद और जीवन के बदलावों में बातचीत के जरिए मार्गदर्शन और भावनात्मक सहारा देते हैं।",
                "હળવા કે મધ્યમ તણાવ, પારિવારિક વાતચીત અને જીવનના પડકારોમાં વાર્તાલાપ દ્વારા માર્ગદર્શન અને ટેકો આપે છે."
            ),
            whenToSeeThem = LocalizedString(
                "For mild friction, relationship disputes, workplace stress, or initial guidance.",
                "हल्के तनाव, वैवाहिक या पारिवारिक अनबन, और करियर या जीवन की उलझनों के लिए।",
                "હળવા તણાવ, દાંપત્ય કે પારિવારિક વિવાદો અને જીવનની સામાન્ય મૂંઝવણો માટે."
            )
        ),
        ProfessionalRoleInfo(
            title = LocalizedString("Psychiatric Social Worker (PSW)", "मानसिक स्वास्थ्य सामाजिक कार्यकर्ता (PSW)", "સાયકિયાટ્રિક સોશિયલ વર્કર (PSW)"),
            qualification = LocalizedString(
                "M.Phil in Psychiatric Social Work + RCI License",
                "एम.फिल (साइकियाट्रिक सोशल वर्क) + RCI पंजीकरण",
                "M.Phil (સાયકિયાટ્રિક સોશિયલ વર્ક) + RCI લાયસન્સ"
            ),
            whatTheyDo = LocalizedString(
                "Specializes in family dynamics, caregiver support groups, community rehabilitation, and navigating socio-economic support systems.",
                "पारिवारिक माहौल को सुधारने, देखभालकर्ताओं की सहायता, और सामाजिक पुनर्वास में विशेषज्ञता रखते हैं।",
                "પારિવારિક વાતાવરણ સુધારવા, સંભાળકર્તાઓને ટેકો આપવા અને સામાજિક પુનર્વસનમાં વિશેષતા ધરાવે છે."
            ),
            whenToSeeThem = LocalizedString(
                "For family-wide psychoeducation, crisis management at home, and caregiver burnout relief.",
                "पूरे परिवार की काउंसलिंग, घर पर संकट प्रबंधन और देखभालकर्ताओं के मानसिक तनाव के लिए।",
                "સમગ્ર કુટુંબના કાઉન્સેલિંગ, ઘરમાં કટોકટી વ્યવસ્થાપન અને સંભાળકર્તાઓના થાક નિવારણ માટે."
            )
        )
    )

    val whereToLookInIndia: List<Pair<LocalizedString, LocalizedString>> = listOf(
        Pair(
            LocalizedString("1. Tele-MANAS (Dial 14416)", "1. टेली-मानस (डायल करें 14416)", "1. ટેલી-માનસ (ડાયલ કરો 14416)"),
            LocalizedString(
                "Government of India's 24/7 free mental health helpline. Available in Gujarati, Hindi, English, and 20+ regional languages. Triage counselors can refer you to district clinics.",
                "भारत सरकार की 24/7 निःशुल्क हेल्पलाइन। गुजराती, हिंदी, अंग्रेजी और 20+ भाषाओं में उपलब्ध। वे आपको पास के सरकारी जिला क्लिनिक से भी जोड़ते हैं।",
                "ભારત સરકારની 24/7 મફત હેલ્પલાઇન. ગુજરાતી, હિન્દી, અંગ્રેજી અને 20+ ભાષાઓમાં ઉપલબ્ધ. તેઓ તમને નજીકના સરકારી જિલ્લા ક્લિનિક સાથે પણ જોડે છે."
            )
        ),
        Pair(
            LocalizedString("2. National & State Institutes (NIMHANS, CIP, AIIMS)", "2. राष्ट्रीय एवं राज्य मानसिक संस्थान (NIMHANS, CIP, AIIMS)", "2. રાષ્ટ્રીય તેમજ રાજ્ય માનસિક સંસ્થાનો (NIMHANS, CIP, AIIMS)"),
            LocalizedString(
                "Apex medical centers such as NIMHANS (Bengaluru), CIP (Ranchi), LGBRIMH (Tezpur), and Psychiatry departments of all AIIMS institutions offer top-tier multidisciplinary evaluation at nominal government rates.",
                "NIMHANS (बेंगलुरु), CIP (राँची), और सभी AIIMS के मनोरोग विभाग अत्यंत कम खर्च में देश के सर्वश्रेष्ठ विशेषज्ञों द्वारा जांच और उपचार प्रदान करते हैं।",
                "NIMHANS (બેંગલુરુ), CIP (રાંચી), અને તમામ AIIMS ના મનોરોગ વિભાગો નજીવા ખર્ચે દેશના સર્વશ્રેષ્ઠ નિષ્ણાતો દ્વારા તપાસ અને સારવાર આપે છે."
            )
        ),
        Pair(
            LocalizedString("3. District Mental Health Programme (DMHP)", "3. जिला मानसिक स्वास्थ्य कार्यक्रम (DMHP)", "3. જિલ્લા માનસિક સ્વાસ્થ્ય કાર્યક્રમ (DMHP)"),
            LocalizedString(
                "Present at District Civil Hospitals across most states in India. Provides free psychiatrist consultation, basic medications, and clinical social work support.",
                "भारत के लगभग सभी जिलों के सरकारी सिविल अस्पतालों में उपलब्ध। यहाँ निःशुल्क डॉक्टर परामर्श और बुनियादी दवाएं मिलती हैं।",
                "ભારતના મોટાભાગના જિલ્લાઓની સરકારી સિવિલ હોસ્પિટલોમાં ઉપલબ્ધ. અહીં મફત ડૉક્ટર પરામર્શ અને પ્રાથમિક દવાઓ મળે છે."
            )
        ),
        Pair(
            LocalizedString("4. Licensed Private Practice (Verify RCI Registration)", "4. निजी क्लिनिक (RCI पंजीकरण अवश्य जांचें)", "4. ખાનગી ક્લિનિક્સ (RCI રજિસ્ટ્રેશન જરૂર ચકાસો)"),
            LocalizedString(
                "When seeing a private psychologist, always verify they possess an RCI registration number (CRRA No.) if they claim to be a Clinical Psychologist.",
                "निजी मनोवैज्ञानिक से मिलते समय हमेशा सुनिश्चित करें कि उनके पास भारतीय पुनर्वास परिषद (RCI) का पंजीकरण नंबर अवश्य हो।",
                "ખાનગી સાયકોલોજિસ્ટ પાસે જતી વખતે હંમેશા ખાતરી કરો કે તેમની પાસે રિહેબિલિટેશન કાઉન્સિલ ઓફ ઈન્ડિયા (RCI) નું રજિસ્ટ્રેશન નંબર હોય."
            )
        )
    )

    val stigmaPrinciples: List<Triple<LocalizedString, LocalizedString, LocalizedString>> = listOf(
        Triple(
            LocalizedString(
                "1. Healthcare Normalization",
                "1. सामान्य स्वास्थ्य सेवा का हिस्सा",
                "1. સામાન્ય સ્વાસ્થ્ય સેવાનો ભાગ"
            ),
            LocalizedString(
                "Mental health care is identical to seeking medical care for diabetes or cardiovascular health.",
                "मानसिक स्वास्थ्य परामर्श लेना उतना ही सामान्य है जितना मधुमेह या हृदय स्वास्थ्य के लिए डॉक्टर के पास जाना।",
                "માનસિક સ્વાસ્થ્ય માટે પરામર્શ લેવો એ ડાયાબિટીસ કે હૃદયરોગ માટે ડૉક્ટર પાસે જવા જેટલું જ સામાન્ય છે."
            ),
            LocalizedString(
                "Consulting a psychiatrist or clinical psychologist indicates emotional maturity, self-awareness, and proactive self-care. It is never a moral failure, character flaw, or lack of willpower.",
                "मनोचिकित्सक या मनोवैज्ञानिक से परामर्श करना भावनात्मक परिपक्वता और आत्म-जागरूकता का संकेत है। यह कोई व्यक्तिगत कमजोरी या इच्छाशक्ति की कमी नहीं है।",
                "સાયકિયાટ્રિસ્ટ કે સાયકોલોજિસ્ટની સલાહ લેવી એ માનસિક પરિપક્વતા અને આંતરિક સભાનતાની નિશાની છે. તે કોઈ ચારિત્ર્યની નબળાઈ કે મનોબળનો અભાવ નથી."
            )
        ),
        Triple(
            LocalizedString(
                "2. Legal Right to Confidentiality (MHCA 2017)",
                "2. गोपनीयता का कानूनी अधिकार (MHCA 2017)",
                "2. ગોપનીયતાનો કાયદાકીય અધિકાર (MHCA 2017)"
            ),
            LocalizedString(
                "Under Section 23 of the Mental Healthcare Act 2017, all consultations are legally protected and confidential.",
                "मानसिक स्वास्थ्य देखभाल अधिनियम 2017 की धारा 23 के तहत सभी परामर्श कानूनी रूप से पूरी तरह गोपनीय हैं।",
                "મેન્ટલ હેલ્થકેર એક્ટ 2017 ની કલમ 23 હેઠળ તમામ પરામર્શ કાયદાકીય રીતે સંપૂર્ણપણે ખાનગી અને ગુપ્ત રહે છે."
            ),
            LocalizedString(
                "Your medical records, diagnosis, and psychotherapy discussions cannot be disclosed to your employer, colleagues, insurance providers, or even family members without your explicit written consent.",
                "आपकी स्पष्ट लिखित सहमति के बिना आपके नियोक्ता, बीमा कंपनी या परिजनों को भी आपका रिकॉर्ड या केस नोट्स नहीं दिए जा सकते।",
                "તમારી સ્પષ્ટ લેખિત સંમતિ વિના તમારા એમ્પ્લોયર, વીમા કંપની કે પરિવારના સભ્યોને પણ તમારા રેકોર્ડ્સ કે કેસ નોટ્સ આપી શકાતા નથી."
            )
        ),
        Triple(
            LocalizedString(
                "3. Demystifying Diagnoses & Medication",
                "3. निदान और दवाओं का भ्रम दूर करना",
                "3. નિદાન અને દવાઓનો ડર દૂર કરવો"
            ),
            LocalizedString(
                "An evaluation is a structured conversation, not a lifetime label or hospital sentence.",
                "परामर्श केवल एक व्यवस्थित बातचीत है, कोई जीवन भर का ठप्पा या अस्पताल में भर्ती होना नहीं।",
                "પરીક્ષણ એ માત્ર એક વ્યવસ્થિત ચર્ચા છે, કોઈ આજીવન લેબલ કે હોસ્પિટલમાં દાખલ થવાની બાબત નથી."
            ),
            LocalizedString(
                "Psychiatrists use conservative medications only if acute insomnia, severe panic, or disabling mood swings obstruct therapy. Medication is not an addictive sedative; it stabilizes neurochemistry so evidence-based therapy can work.",
                "दवाएं केवल तभी सुझाई जाती हैं जब गंभीर अनिद्रा या घबराहट सामान्य दिनचर्या रोक दे। ये नशे की गोलियां नहीं हैं; ये मस्तिष्क को स्थिर करती हैं ताकि थेरेपी असरदार हो सके।",
                "દવાઓ ફક્ત ત્યારે જ આપવામાં આવે છે જ્યારે અતિશય અનિદ્રા કે ગભરાટ રોજિંદા કામ અટકાવી દે. આ ઊંઘની કે નશાની ગોળીઓ નથી; તે મગજને શાંત કરે છે જેથી થેરાપી અસરકારક બની શકે."
            )
        )
    )

    val firstAppointmentSteps: List<AppointmentStep> = listOf(
        AppointmentStep(
            stepNumber = 1,
            title = LocalizedString(
                "Quiet, Confidential Intake (45–60 mins)",
                "शांत एवं गोपनीय प्रारंभिक बैठक (45-60 मिनट)",
                "શાંત અને ખાનગી પ્રારંભિક મુલાકાત (45-60 મિનિટ)"
            ),
            summary = LocalizedString(
                "A dedicated, private session centered entirely on hearing your perspective.",
                "एक समर्पित, निजी सत्र जो केवल आपकी बात और अनुभव को सुनने के लिए होता है।",
                "એક સમર્પિત, ખાનગી સત્ર જે માત્ર તમારી વાત અને અનુભવ સાંભળવા માટે હોય છે."
            ),
            details = LocalizedString(
                "The doctor or psychologist invites you into a quiet, closed-door room. They establish boundaries, explain confidentiality, and listen with empathy. There is zero moral judgment, scolding, or lecturing.",
                "विशेषज्ञ आपको एक शांत, सुरक्षित कमरे में आमंत्रित करते हैं। वे गोपनीयता के नियम समझाते हैं और सहानुभूति के साथ आपकी बात सुनते हैं। यहाँ कोई पूर्वाग्रह, डांट या उपदेश नहीं होता।",
                "નિષ્ણાત તમને એક શાંત, સુરક્ષિત ચેમ્બરમાં આવકારે છે. તેઓ ગોપનીયતાના નિયમો સમજાવે છે અને સહાનુભૂતિથી સાંભળે છે. અહીં કોઈ ટીકા, ઠપકો કે ઉપદેશ હોતો નથી."
            )
        ),
        AppointmentStep(
            stepNumber = 2,
            title = LocalizedString(
                "Sharing What Brought You In (At Your Own Pace)",
                "अपनी परेशानी बताना (अपनी गति और सुविधा अनुसार)",
                "તમારી મુશ્કેલી રજૂ કરવી (તમારી સરળતા અને ગતિ મુજબ)"
            ),
            summary = LocalizedString(
                "You describe what has felt challenging lately. You are never forced to discuss traumatic memories.",
                "आप बताते हैं कि हाल के समय में क्या मुश्किल रहा है। किसी भी दर्दनाक बात को बताने के लिए कोई दबाव नहीं होता।",
                "તમે જણાવો છો કે તાજેતરમાં શું મુશ્કેલ રહ્યું છે. જૂના કડવા અનુભવો કહેવા માટે કોઈ દબાણ કરવામાં આવતું નથી."
            ),
            details = LocalizedString(
                "You will be asked open-ended questions: 'What prompted your visit today?', 'How have your moods or relationships felt?' You control what you share; if something feels too sensitive for session one, you can simply say 'I'd rather talk about that later.'",
                "आपसे सरल प्रश्न पूछे जाएंगे: 'आज आप क्या महसूस कर रहे हैं?', 'हाल ही में आपके रिश्तों या मूड में क्या बदलाव आए हैं?' आप जो चाहें उतना ही साझा करें; जो असहज लगे उसके लिए आप कह सकते हैं कि 'इस पर हम बाद में बात करेंगे।'",
                "તમને સરળ પ્રશ્નો પૂછવામાં આવશે: 'આજે તમને કઈ બાબત અહીં લાવી?', 'છેલ્લા કેટલાક સમયથી સંબંધો કે મૂડ કેવો રહ્યો છે?' તમે ઈચ્છો તેટલું જ કહો; જે વાત અઘરી લાગે તે પછીના સત્ર માટે રાખી શકો છો."
            )
        ),
        AppointmentStep(
            stepNumber = 3,
            title = LocalizedString(
                "Holistic Physical & Daily Routine Review",
                "समग्र शारीरिक स्वास्थ्य और दिनचर्या की जांच",
                "સમગ્ર શારીરિક સ્વાસ્થ્ય અને દિનચર્યાની તપાસ"
            ),
            summary = LocalizedString(
                "Reviewing biological rhythms, sleep, appetite, stressors, and medical background.",
                "जैविक तालमेल, नींद की गुणवत्ता, भूख, तनाव के कारण और पूर्व मेडिकल इतिहास की समीक्षा।",
                "ઊંઘ, ભૂખ, દૈનિક તણાવના કારણો અને અગાઉના મેડિકલ ઇતિહાસની વિગતવાર સમીક્ષા."
            ),
            details = LocalizedString(
                "Mental health is deeply intertwined with physical health. The clinician will ask about your sleep quality, appetite changes, energy fluctuations, caffeine/substance use, and previous medical illnesses to ensure nothing physiological is missed.",
                "मानसिक स्वास्थ्य शारीरिक स्वास्थ्य से गहराई से जुड़ा है। डॉक्टर आपकी नींद, भूख, ऊर्जा के स्तर, चाय/कॉफी की मात्रा और पहले की बीमारियों के बारे में पूछते हैं ताकि कोई शारीरिक कारण छूट न जाए।",
                "માનસિક સ્વાસ્થ્ય શારીરિક સ્વાસ્થ્ય સાથે જોડાયેલું છે. ડૉક્ટર તમારી ઊંઘ, ભૂખ, ઊર્જાના સ્તર, ચા/કોફીનું પ્રમાણ અને જૂની બીમારીઓ વિશે પૂછે છે જેથી કોઈ શારીરિક કારણ ચૂકી ન જવાય."
            )
        ),
        AppointmentStep(
            stepNumber = 4,
            title = LocalizedString(
                "Collaborative Formulation (No Cold Labels)",
                "पारदर्शी समझ और चर्चा (कोई डरावना लेबल नहीं)",
                "પારદર્શક સંયુક્ત સમજ (કોઈ ડરામણું લેબલ નહીં)"
            ),
            summary = LocalizedString(
                "The professional shares their clinical understanding in plain, transparent language.",
                "विशेषज्ञ अपनी समझ को सरल और पारदर्शी भाषा में आपके सामने रखते हैं।",
                "નિષ્ણાત પોતાની તબીબી સમજને અત્યંત સરળ અને પારદર્શક ભાષામાં તમારી સમક્ષ રજૂ કરે છે."
            ),
            details = LocalizedString(
                "A trustworthy provider summarizes what they have heard, linking your symptoms to underlying stress sensitivity, attachment styles, or emotional regulation habits. They actively invite your feedback: 'Does this summary resonate with your experience?'",
                "एक जिम्मेदार डॉक्टर समझाई गई बातों का सार प्रस्तुत करते हैं और बताते हैं कि लक्षण तनाव या भावनात्मक आदतों से कैसे जुड़े हैं। वे आपसे पूछते हैं: 'क्या यह विवरण आपके अनुभव से मेल खाता है?'",
                "એક સારા ડૉક્ટર તમારી મુશ્કેલીઓને તણાવ કે લાગણીશીલ આદતો સાથે જોડીને સમજાવે છે. તેઓ પૂછે છે: 'શું આ વિગત તમારા વાસ્તવિક અનુભવ સાથે બંધબેસે છે?'"
            )
        ),
        AppointmentStep(
            stepNumber = 5,
            title = LocalizedString(
                "Co-Designing Your Care Plan & Goals",
                "मिलकर उपचार योजना और लक्ष्य तय करना",
                "સાથે મળીને સારવાર આયોજન અને લક્ષ્યો નક્કી કરવા"
            ),
            summary = LocalizedString(
                "Deciding together whether psychotherapy, routine adjustments, or medical reviews are appropriate.",
                "साथ मिलकर तय करना कि साइकोथेरेपी, दिनचर्या में बदलाव या मेडिकल जांच में से क्या उपयुक्त है।",
                "સાથે નક્કી કરવું કે સાયકોથેરાપી, દિનચર્યામાં ફેરફાર કે મેડિકલ તપાસમાંથી શું વધુ અનુકૂળ છે."
            ),
            details = LocalizedString(
                "Treatment is a joint agreement, not a command. You will discuss frequency of visits (e.g., weekly psychotherapy sessions), therapeutic modalities (such as DBT or CBT skills), and baseline blood work. You can ask questions about costs, schedule, and expectations.",
                "उपचार दोनों पक्षों की सहमति से होता है, कोई हुक्म नहीं। आप बैठकों की आवृत्ति (जैसे साप्ताहिक थेरेपी), थेरेपी के प्रकार (जैसे DBT या CBT) और फीस व समय पर खुलकर बात करते हैं।",
                "સારવાર એ બંને પક્ષોની સહમતિથી બને છે, કોઈ હુકમ નથી. તમે સત્રોની આવૃત્તિ (જેમ કે સાપ્તાહિક થેરાપી), પદ્ધતિ (જેમ કે DBT કે CBT) તેમજ ફી અને સમય વિશે ખુલીને ચર્ચા કરો છો."
            )
        )
    )

    val gpReferralGuidance: List<GpReferralPoint> = listOf(
        GpReferralPoint(
            title = LocalizedString(
                "1. Ruling Out Organic / Biological Causes First",
                "1. पहले शारीरिक कारणों (थायराइड, विटामिन्स) की जांच",
                "1. પ્રથમ શારીરિક કારણો (થાઇરોઇડ, વિટામિન્સ) ની તપાસ"
            ),
            rationale = LocalizedString(
                "Physical conditions frequently mimic or exacerbate psychiatric symptoms. Hypothyroidism causes fatigue and depressive slowness; hyperthyroidism triggers intense panic and tremors; Vitamin B12 and Vitamin D deficiencies induce brain fog, mood volatility, and weakness.",
                "कई शारीरिक बीमारियाँ मानसिक लक्षणों जैसी दिखती हैं। थायराइड की कमी से सुस्ती और उदासी होती है; थायराइड बढ़ने से घबराहट और कंपकंपी होती है; विटामिन B12 व D की कमी से मूड में तेज बदलाव और थकान होती है।",
                "શારીરિક ખામીઓ માનસિક લક્ષણો જેવી દેખાઈ શકે છે. હાઇપોથાઇરોઇડિઝમથી સુસ્તી અને ઉદાસી આવે છે; હાઇપરથાઇરોઇડિઝમથી ગભરાટ અને ધ્રૂજારી થાય છે; વિટામિન B12 અને D ની ઊણપથી મૂડના ફેરફારો અને થાક લાગે છે."
            ),
            practicalTip = LocalizedString(
                "Ask your GP for a basic workup: Complete Blood Count (CBC), Thyroid Profile (TSH), Vitamin B12, Serum 25-OH Vitamin D, and fasting blood glucose before or alongside mental health visits.",
                "अपने फैमिली डॉक्टर से सामान्य जांच कराने का अनुरोध करें: सीबीसी (हीमोग्लोबिन), थायराइड (TSH), विटामिन B12, विटामिन D और ब्लड शुगर।",
                "તમારા ફેમિલી ડૉક્ટર પાસે પ્રાથમિક તપાસ કરાવો: સીબીસી (હિમોગ્લોબિન), થાઇરોઇડ (TSH), વિટામિન B12, વિટામિન D અને બ્લડ શુગર."
            )
        ),
        GpReferralPoint(
            title = LocalizedString(
                "2. A Stigma-Free, Comfortable Gateway",
                "2. बिना किसी झिझक या हिचकिचाहट के शुरुआत",
                "2. કોઈપણ સંકોચ વિના સરળ શરૂઆત"
            ),
            rationale = LocalizedString(
                "Visiting your familiar neighbourhood MBBS doctor feels routine and comfortable. It avoids the apprehension, shame, or family resistance that can sometimes accompany visiting a psychiatric hospital directly.",
                "अपने पारिवारिक डॉक्टर के पास जाना बहुत सामान्य और सहज लगता है। यह उस डर, हिचकिचाहट या पारिवारिक विरोध से बचाता है जो सीधे मनोरोग अस्पताल जाने पर हो सकता है।",
                "ફેમિલી ડૉક્ટરના ક્લિનિકમાં જવું અત્યંત સામાન્ય અને સહજ બાબત છે. તે એવા ભય કે પારિવારિક સંકોચથી બચાવે છે જે સીધા મનોરોગ દવાખાને જવાથી અનુભવાય છે."
            ),
            practicalTip = LocalizedString(
                "Tell your GP openly: 'Doctor, along with feeling tired/having sleep issues, I've been struggling with intense emotional ups and downs and anxiety. Could you evaluate me and recommend a trusted specialist?'",
                "अपने डॉक्टर से खुलकर कहें: 'डॉक्टर साहब, थकान और अनिद्रा के साथ-साथ मैं लगातार तीव्र तनाव और घबराहट से जूझ रहा हूँ। क्या आप मुझे किसी अच्छे विशेषज्ञ से मिलने की सलाह दे सकते हैं?'",
                "તમારા ડૉક્ટરને મોકળા મને કહો: 'ડૉક્ટર, ઊંઘ અને થાકની તકલીફ સાથે મને ભારે માનસિક તણાવ અને મૂડની અસ્થિરતા રહે છે. શું તમે પ્રાથમિક તપાસ કરી કોઈ સારા નિષ્ણાતનું સરનામું આપી શકો?'"
            )
        ),
        GpReferralPoint(
            title = LocalizedString(
                "3. Trusted Referrals to Verified Specialists",
                "3. योग्य एवं विश्वसनीय विशेषज्ञ का मार्गदर्शन",
                "3. યોગ્ય અને ભરોસાપાત્ર નિષ્ણાતની ભલામણ"
            ),
            rationale = LocalizedString(
                "The mental healthcare landscape in India includes many unqualified commercial 'life coaches' or counselors. Family physicians maintain verified clinical networks and know which psychiatrists and RCI-registered psychologists have high clinical ethics.",
                "भारत में कई अयोग्य और अप्रमाणित 'काउंसलर' सक्रिय हैं। फैमिली डॉक्टर स्थानीय स्तर पर जानते हैं कि कौन से मनोचिकित्सक और RCI-पंजीकृत मनोवैज्ञानिक पूरी ईमानदारी और योग्यता से इलाज करते हैं।",
                "આજે ઘણા બિનઅધિકૃત 'લાઇફ કોચ' સક્રિય છે. ફેમિલી ડૉક્ટર્સ જાણે છે કે કયા સાયકિયાટ્રિસ્ટ અને RCI-રજિસ્ટર્ડ સાયકોલોજિસ્ટ પૂરતી તબીબી યોગ્યતા અને પ્રમાણિકતાથી પ્રેક્ટિસ કરે છે."
            ),
            practicalTip = LocalizedString(
                "Your GP can write a brief referral note summarizing your physical history, current medications, and primary emotional symptoms, making your first specialist intake smoother.",
                "फैमिली डॉक्टर एक संक्षिप्त रेफरल पर्ची लिख सकते हैं जिसमें आपकी शारीरिक जांच, दवाएं और मुख्य लक्षण लिखे हों, जिससे विशेषज्ञ के पास आपका पहला सत्र बहुत आसान हो जाता है।",
                "ફેમિલી ડૉક્ટર એક ટૂંકી રેફરલ ચિઠ્ઠી લખી શકે છે જેમાં તમારો શારીરિક ઇતિહાસ અને લક્ષણો હોય, જેથી નિષ્ણાત પાસે તમારી પ્રથમ મુલાકાત વધુ સરળ બને છે."
            )
        ),
        GpReferralPoint(
            title = LocalizedString(
                "4. Bridge with Skeptical or Concerned Family Members",
                "4. परिजनों को समझाने में सबसे बड़ा सहारा",
                "4. કુટુંબીજનોને સમજાવવામાં સૌથી મોટો ટેકો"
            ),
            rationale = LocalizedString(
                "In many Indian households, elders may dismiss emotional struggles as 'you just need to go for a walk', 'overthinking', or 'lack of faith'. Because families deeply revere their trusted family physician, the GP's clinical validation often breaks through familial denial.",
                "भारतीय परिवारों में अक्सर परिजन मानसिक पीड़ा को 'ज्यादा सोचना' या 'कमजोरी' समझ लेते हैं। चूंकि परिवार फैमिली डॉक्टर पर गहरा भरोसा करता है, इसलिए डॉक्टर की समझाइश परिजनों की शंकाओं को दूर कर देती है।",
                "ઘણીવાર પરિવારના વડીલો માનસિક તકલીફને 'વધારે વિચાર કરવો' કે 'મનની નબળાઈ' ગણે છે. પરિવાર ફેમિલી ડૉક્ટરની વાત ખૂબ આદરથી સાંભળે છે, તેથી તેમની સલાહ પરિવારનો સહકાર મેળવી આપે છે."
            ),
            practicalTip = LocalizedString(
                "Bring a supportive relative along to your GP appointment. Let the doctor explain the mind-body connection directly to them.",
                "अपने फैमिली डॉक्टर के पास किसी भरोसेमंद परिजन को साथ ले जाएं। डॉक्टर को खुद उन्हें शारीरिक और मानसिक स्वास्थ्य का संबंध समझाने दें।",
                "ફેમિલી ડૉક્ટર પાસે પરિવારના કોઈ વિશ્વાસુ સભ્યને સાથે લઈ જાઓ. ડૉક્ટરને જાતે જ શારીરિક અને માનસિક સ્વાસ્થ્યનો સંબંધ સમજાવવા દો."
            )
        ),
        GpReferralPoint(
            title = LocalizedString(
                "5. Whole-Person Continuity of Care",
                "5. संपूर्ण स्वास्थ्य की निरंतर देखरेख",
                "5. સમગ્ર આરોગ્યની સતત જાળવણી"
            ),
            rationale = LocalizedString(
                "Mental healthcare works best when integrated with overall medical well-being. Your GP continues monitoring your blood pressure, metabolic health, and ensures no harmful drug interactions occur if psychiatric medications are prescribed.",
                "मानसिक स्वास्थ्य उपचार तभी सबसे बेहतर काम करता है जब समग्र स्वास्थ्य का भी ध्यान रखा जाए। फैमिली डॉक्टर यह सुनिश्चित करते हैं कि किसी दवा का दुष्प्रभाव न हो और सामान्य स्वास्थ्य सुरक्षित रहे।",
                "માનસિક સારવાર ત્યારે શ્રેષ્ઠ પરિણામ આપે છે જ્યારે સમગ્ર શારીરિક સ્વાસ્થ્યનું ધ્યાન રખાય. ફેમિલી ડૉક્ટર સુનિશ્ચિત કરે છે કે કોઈ આડઅસર ન થાય અને નિયમિત શારીરિક સ્વાસ્થ્ય જળવાઈ રહે."
            ),
            practicalTip = LocalizedString(
                "Keep your GP informed of any ongoing therapy or psychiatric medications. Bring your specialist prescription slips to your regular GP checkups.",
                "अपनी थेरेपी और मनोचिकित्सक द्वारा लिखी गई दवाओं की जानकारी अपने फैमिली डॉक्टर को अवश्य दें और अपनी पर्चियां उनके साथ साझा करें।",
                "તમારા ફેમિલી ડૉક્ટરને સાયકિયાટ્રિસ્ટની દવાઓ અને થેરાપી વિશે અવગત રાખો અને તમારી પ્રિસ્ક્રિપ્શન સ્લિપ નિયમિત બતાવો."
            )
        )
    )

    val questionsToAskTherapist: List<Pair<LocalizedString, LocalizedString>> = listOf(

        Pair(
            LocalizedString("1. Experience with Personality Traits", "1. व्यक्तित्व लक्षणों में अनुभव", "1. વ્યક્તિત્વ લક્ષણોમાં અનુભવ"),
            LocalizedString(
                "\"Do you have experience working with persistent personality trait difficulties or intense emotional dysregulation?\"",
                "\"क्या आपके पास लगातार भावनात्मक अस्थिरता या व्यक्तित्व संबंधी कठिनाइयों का इलाज करने का अनुभव है?\"",
                "\"શું તમારી પાસે સતત લાગણીશીલ અસ્થિરતા કે વ્યક્તિત્વ સંબંધિત મુશ્કેલીઓનો ઇલાજ કરવાનો અનુભવ છે?\""
            )
        ),
        Pair(
            LocalizedString("2. Therapy Modality", "2. उपचार की पद्धति", "2. સારવારની પદ્ધતિ"),
            LocalizedString(
                "\"What specific evidence-based therapeutic approach do you practice (e.g., DBT, Schema Therapy, CBT)?\"",
                "\"आप मुख्य रूप से किस वैज्ञानिक थेरेपी पद्धति का उपयोग करते हैं (जैसे DBT, स्कीमा थेरेपी, या CBT)?\"",
                "\"તમે મુખ્યત્વે કઈ વૈજ્ઞાનિક થેરાપી પદ્ધતિનો ઉપયોગ કરો છો (જેમ કે DBT, સ્કીમા થેરાપી, કે CBT)?\""
            )
        ),
        Pair(
            LocalizedString("3. Structure & Goals", "3. सत्र की रूपरेखा और लक्ष्य", "3. સત્રોનું માળખું અને લક્ષ્યો"),
            LocalizedString(
                "\"How do we define goals, track skill acquisition, and measure progress over our sessions?\"",
                "\"हम अपने लक्ष्यों को कैसे तय करेंगे और समय के साथ प्रगति को कैसे मापेंगे?\"",
                "\"આપણે આપણા લક્ષ્યો કેવી રીતે નક્કી કરીશું અને સમય સાથે પ્રગતિનું માપન કેવી રીતે થશે?\""
            )
        ),
        Pair(
            LocalizedString("4. Crisis Handling", "4. संकट के समय की व्यवस्था", "4. કટોકટી વખતે વ્યવસ્થા"),
            LocalizedString(
                "\"What is your protocol or recommendation if acute emotional distress spikes between scheduled appointments?\"",
                "\"यदि दो मुलाकातों के बीच अचानक कोई गंभीर मानसिक संकट आता है, तो उसके लिए क्या प्रोटोकॉल है?\"",
                "\"જો બે મુલાકાતો વચ્ચે અચાનક કોઈ ગંભીર માનસિક કટોકટી આવે, તો તેના માટે શું વ્યવસ્થા છે?\""
            )
        )
    )
}

