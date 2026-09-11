package com.grsuthar.personalityreflectionhub.data

object AssessmentData {

    val consentAgeGateTitle = LocalizedString(
        en = "Self-Reflection Consent & Age Verification",
        hi = "आत्म-चिंतन सहमति और आयु सत्यापन",
        gu = "સ્વ-ચિંતન સંમતિ અને ઉંમર ચકાસણી"
    )

    val consentAgeGateBody = LocalizedString(
        en = "This reflection tool is designed strictly for adults aged 18 and older. In medical science (ICD-11), personality traits are still developing throughout childhood and adolescence. If you are under 18, or concerned about a teenager, please explore our Caregiver Hub or consult a qualified doctor.",
        hi = "यह चिंतन उपकरण केवल 18 वर्ष या उससे अधिक आयु के वयस्कों के लिए है। चिकित्सा विज्ञान (ICD-11) के अनुसार बचपन और किशोरावस्था में व्यक्तित्व विकसित हो रहा होता है। यदि आपकी आयु 18 वर्ष से कम है, तो कृपया हमारे देखभालकर्ता हब को देखें या चिकित्सक से परामर्श लें।",
        gu = "આ ચિંતન સાધન માત્ર 18 વર્ષ કે તેથી વધુ ઉંમરના પુખ્ત વયના લોકો માટે છે. તબીબી વિજ્ઞાન (ICD-11) મુજબ બાળપણ અને કિશોરાવસ્થામાં વ્યક્તિત્વ વિકાસશીલ હોય છે. જો તમારી ઉંમર 18 વર્ષથી ઓછી હોય, તો કૃપા કરીને સંભાળકર્તા હબ જુઓ અથવા ડૉક્ટરની સલાહ લો."
    )

    val consentCheckbox18Plus = LocalizedString(
        en = "I confirm that I am 18 years of age or older.",
        hi = "मैं पुष्टि करता/करती हूँ कि मेरी आयु 18 वर्ष या उससे अधिक है।",
        gu = "હું ખાતરી કરું છું કે મારી ઉંમર 18 વર્ષ કે તેથી વધુ છે."
    )

    val consentCheckboxEducational = LocalizedString(
        en = "I understand this is an educational self-reflection tool, NOT a psychiatric diagnosis.",
        hi = "मैं समझता/समझती हूँ कि यह एक शैक्षिक आत्म-चिंतन उपकरण है, कोई चिकित्सीय निदान नहीं।",
        gu = "હું સમજું છું કે આ એક શૈક્ષણિક સ્વ-ચિંતન સાધન છે, કોઈ તબીબી નિદાન નથી."
    )

    val startAssessmentButton = LocalizedString(
        en = "Begin Self-Reflection",
        hi = "आत्म-चिंतन शुरू करें",
        gu = "સ્વ-ચિંતન શરૂ કરો"
    )

    // 5-point scale labels
    val scaleOptions = listOf(
        LocalizedString("Strongly Disagree", "दृढ़ता से असहमत", "સંપૂર્ણપણે અસંમત"),
        LocalizedString("Disagree", "असहमत", "અસંમત"),
        LocalizedString("Neutral", "तटस्थ / कभी-कभी", "તટસ્થ / ક્યારેક"),
        LocalizedString("Agree", "सहममत", "સંમત"),
        LocalizedString("Strongly Agree", "दृढ़ता से सहमत", "સંપૂર્ણપણે સંમત")
    )

    // Original items for the 5 trait domains + Borderline pattern (ICD-11 inspired)
    val questions: List<ReflectionQuestion> = listOf(
        // Negative Affectivity (6 items)
        ReflectionQuestion(
            id = "na_1",
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            text = LocalizedString(
                en = "My emotions shift very quickly throughout the day.",
                hi = "दिन भर में मेरी भावनाएँ बहुत तेज़ी से बदलती रहती हैं।",
                gu = "દિવસ દરમિયાન મારી લાગણીઓ ખૂબ ઝડપથી બદલાતી રહે છે."
            )
        ),
        ReflectionQuestion(
            id = "na_2",
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            text = LocalizedString(
                en = "Minor criticism or disagreements stay on my mind for days.",
                hi = "छोटी-सी आलोचना या असहमति मेरे दिमाग में कई दिनों तक घूमती रहती है।",
                gu = "નાની ટીકા કે અસંમતિ મારા મગજમાં દિવસો સુધી ચાલ્યા કરે છે."
            )
        ),
        ReflectionQuestion(
            id = "na_3",
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            text = LocalizedString(
                en = "I frequently feel an intense knot of worry or dread inside.",
                hi = "मुझे अक्सर अंदर से गहरी चिंता या घबराहट महसूस होती है।",
                gu = "મને અવારનવાર અંદરથી ઊંડી ચિંતા કે ગભરાટ અનુભવાય છે."
            )
        ),
        ReflectionQuestion(
            id = "na_4",
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            text = LocalizedString(
                en = "Small daily disappointments often make me feel completely defeated.",
                hi = "छोटी-छोटी निराशाएँ भी मुझे पूरी तरह से हताश महसूस कराती हैं।",
                gu = "નાની દૈનિક નિરાશાઓ પણ મને સંપૂર્ણપણે હતાશ કરી દે છે."
            )
        ),
        ReflectionQuestion(
            id = "na_5",
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            text = LocalizedString(
                en = "I constantly worry that people close to me will reject or abandon me.",
                hi = "मुझे हमेशा डर रहता है कि करीबी लोग मुझे छोड़ देंगे या अस्वीकार करेंगे।",
                gu = "મને હંમેશાં ડર રહે છે કે નજીકના લોકો મને છોડી દેશે અથવા નકારશે."
            )
        ),
        ReflectionQuestion(
            id = "na_6",
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            text = LocalizedString(
                en = "When my feelings are hurt, it takes a long time to calm down.",
                hi = "जब मुझे ठेस पहुँचती है, तो शांत होने में बहुत समय लगता है।",
                gu = "જ્યારે મારી લાગણી દુભાય છે, ત્યારે શાંત થવામાં ઘણો સમય લાગે છે."
            )
        ),

        // Detachment (6 items)
        ReflectionQuestion(
            id = "det_1",
            domain = TraitDomain.DETACHMENT,
            text = LocalizedString(
                en = "I feel far more comfortable keeping completely to myself.",
                hi = "मुझे दूसरों के साथ रहने की तुलना में अकेले रहना बहुत बेहतर लगता है।",
                gu = "મને અન્ય લોકો સાથે રહેવા કરતાં એકલા રહેવું ઘણું વધારે ગમે છે."
            )
        ),
        ReflectionQuestion(
            id = "det_2",
            domain = TraitDomain.DETACHMENT,
            text = LocalizedString(
                en = "Sharing my inner feelings with friends or family feels unnatural.",
                hi = "अपनों के साथ अपनी भावनाएँ साझा करना मुझे बहुत असहज लगता है।",
                gu = "નજીકના લોકો સાથે મારી લાગણીઓ વહેંચવી મને ખૂબ અસ્વાભાવિક લાગે છે."
            )
        ),
        ReflectionQuestion(
            id = "det_3",
            domain = TraitDomain.DETACHMENT,
            text = LocalizedString(
                en = "I rarely feel strong joy or excitement about celebrations or activities.",
                hi = "उत्सवों या गतिविधियों में मुझे शायद ही कभी गहरा उत्साह या खुशी होती है।",
                gu = "ઉત્સવો કે પ્રવૃત્તિઓમાં મને ભાગ્યે જ કોઈ ઊંડો ઉત્સાહ કે આનંદ થાય છે."
            )
        ),
        ReflectionQuestion(
            id = "det_4",
            domain = TraitDomain.DETACHMENT,
            text = LocalizedString(
                en = "I deliberately keep an emotional wall between myself and others.",
                hi = "मैं जानबूझकर अपने और दूसरों के बीच एक भावनात्मक दीवार बनाए रखता/रखती हूँ।",
                gu = "હું જાણીજોઈને મારી અને અન્ય લોકો વચ્ચે એક ભાવનાત્મક દીવાલ રાખું છું."
            )
        ),
        ReflectionQuestion(
            id = "det_5",
            domain = TraitDomain.DETACHMENT,
            text = LocalizedString(
                en = "Others often describe me as distant, reserved, or aloof.",
                hi = "लोग अक्सर मुझे अलग-थलग, शांत या दूर रहने वाला व्यक्ति बताते हैं।",
                gu = "લોકો મને અવારનવાર અળગા, શાંત અથવા દૂર રહેનાર વ્યક્તિ ગણે છે."
            )
        ),
        ReflectionQuestion(
            id = "det_6",
            domain = TraitDomain.DETACHMENT,
            text = LocalizedString(
                en = "I feel little desire for close friendships or romantic bonds.",
                hi = "मुझे गहरी दोस्ती या करीबी रिश्तों की बहुत कम चाहत महसूस होती है।",
                gu = "મને ગાઢ મિત્રતા કે અંગત સંબંધોની બહુ ઓછી ઈચ્છા થાય છે."
            )
        ),

        // Dissociality (6 items)
        ReflectionQuestion(
            id = "dis_1",
            domain = TraitDomain.DISSOCIALITY,
            text = LocalizedString(
                en = "I put my personal interests first, even if others feel hurt.",
                hi = "मैं अपने हितों को सबसे आगे रखता/रखती हूँ, चाहे दूसरों को ठेस पहुँचे।",
                gu = "હું મારા હિતોને સૌથી આગળ રાખું છું, ભલે અન્યને દુઃખ પહોંચે."
            )
        ),
        ReflectionQuestion(
            id = "dis_2",
            domain = TraitDomain.DISSOCIALITY,
            text = LocalizedString(
                en = "I do not mind bending the truth or rules to get what I need.",
                hi = "अपनी ज़रूरत पूरी करने के लिए नियम या सच को मोड़ने में मुझे कोई हर्ज़ नहीं लगता।",
                gu = "મારી જરૂરિયાત પૂરી કરવા માટે નિયમો કે સત્ય સાથે સમાધાન કરવામાં મને વાંધો નથી."
            )
        ),
        ReflectionQuestion(
            id = "dis_3",
            domain = TraitDomain.DISSOCIALITY,
            text = LocalizedString(
                en = "I find it hard to feel genuine sympathy when people complain about distress.",
                hi = "जब लोग अपनी परेशानियाँ बताते हैं, तो मुझे सहानुभूति महसूस करना मुश्किल लगता है।",
                gu = "જ્યારે લોકો પોતાની મુશ્કેલીઓ કહે છે, ત્યારે મને સહાનુભૂતિ અનુભવવી અઘરી લાગે છે."
            )
        ),
        ReflectionQuestion(
            id = "dis_4",
            domain = TraitDomain.DISSOCIALITY,
            text = LocalizedString(
                en = "I often feel that most people around me are naive or easily outsmarted.",
                hi = "मुझे अक्सर लगता है कि मेरे आस-पास के लोग सीधे-सादे और आसानी से चकमा खाने वाले हैं।",
                gu = "મને ઘણીવાર લાગે છે કે મારી આસપાસના લોકો સરળ અને આસાનીથી છેતરાઈ જાય તેવા છે."
            )
        ),
        ReflectionQuestion(
            id = "dis_5",
            domain = TraitDomain.DISSOCIALITY,
            text = LocalizedString(
                en = "I can detach from long relationships quickly without feeling remorse.",
                hi = "मैं बिना किसी पछतावे के पुराने रिश्तों से आसानी से नाता तोड़ सकता/सकती हूँ।",
                gu = "હું કોઈ પણ પસ્તાવા વગર જૂના સંબંધો આસાનીથી તોડી શકું છું."
            )
        ),
        ReflectionQuestion(
            id = "dis_6",
            domain = TraitDomain.DISSOCIALITY,
            text = LocalizedString(
                en = "I get very irritated when people ask me for patience or consideration.",
                hi = "जब लोग मुझसे धैर्य या विचारशीलता की उम्मीद करते हैं, तो मुझे गुस्सा आता है।",
                gu = "જ્યારે લોકો મારી પાસેથી ધીરજ અથવા વિચારશીલતાની અપેક્ષા રાખે છે, ત્યારે મને ચીડ ચડે છે."
            )
        ),

        // Disinhibition (6 items)
        ReflectionQuestion(
            id = "dib_1",
            domain = TraitDomain.DISINHIBITION,
            text = LocalizedString(
                en = "I frequently act on immediate impulses and regret it later.",
                hi = "मैं अक्सर बिना सोचे तुरंत कदम उठा लेता/लेती हूँ और बाद में पछताता/पछताती हूँ।",
                gu = "હું ઘણીવાર વિચાર્યા વગર પગલું ભરી લઉં છું અને પછી પસ્તાવો કરું છું."
            )
        ),
        ReflectionQuestion(
            id = "dib_2",
            domain = TraitDomain.DISINHIBITION,
            text = LocalizedString(
                en = "Sticking to careful, long-term plans feels almost impossible to me.",
                hi = "लंबी योजना बनाकर उस पर टिके रहना मेरे लिए बहुत मुश्किल होता है।",
                gu = "લાંબા ગાળાની યોજના બનાવીને તેના પર વળગી રહેવું મારા માટે અતિ મુશ્કેલ છે."
            )
        ),
        ReflectionQuestion(
            id = "dib_3",
            domain = TraitDomain.DISINHIBITION,
            text = LocalizedString(
                en = "I get bored very quickly if a task requires slow, steady concentration.",
                hi = "यदि किसी काम में लगातार धीमे ध्यान की ज़रूरत हो, तो मैं जल्दी ऊब जाता/जाती हूँ।",
                gu = "જો કોઈ કામમાં ધીરજપૂર્વક ધ્યાન આપવાની જરૂર હોય, તો હું ઝડપથી કંટાળી જાઉં છું."
            )
        ),
        ReflectionQuestion(
            id = "dib_4",
            domain = TraitDomain.DISINHIBITION,
            text = LocalizedString(
                en = "I seek quick excitement even when it might cause problems later.",
                hi = "मैं तत्काल रोमांच चाहता/चाहती हूँ, भले ही बाद में कोई परेशानी हो जाए।",
                gu = "હું તાત્કાલિક રોમાંચ શોધતો રહું છું, ભલે પાછળથી મુશ્કેલી ઊભી થાય."
            )
        ),
        ReflectionQuestion(
            id = "dib_5",
            domain = TraitDomain.DISINHIBITION,
            text = LocalizedString(
                en = "I find it hard to delay gratification when I want something now.",
                hi = "जब मुझे कोई चीज़ चाहिए होती है, तो इंतज़ार करना मेरे लिए बहुत कठिन होता है।",
                gu = "જ્યારે મને કોઈ વસ્તુ જોઈએ, ત્યારે રાહ જોવી મારા માટે ખૂબ કઠિન બની જાય છે."
            )
        ),
        ReflectionQuestion(
            id = "dib_6",
            domain = TraitDomain.DISINHIBITION,
            text = LocalizedString(
                en = "I frequently put off important life duties until the very last hour.",
                hi = "मैं अपने महत्वपूर्ण कर्तव्यों को बिल्कुल आखिरी समय तक टालता/टालती रहता हूँ।",
                gu = "હું મારી મહત્વની જવાબદારીઓને છેલ્લી ઘડી સુધી પાછી ઠેલતો રહું છું."
            )
        ),

        // Anankastia (6 items)
        ReflectionQuestion(
            id = "ank_1",
            domain = TraitDomain.ANANKASTIA,
            text = LocalizedString(
                en = "I feel stressed when my daily routine or space is slightly disrupted.",
                hi = "मेरी दिनचर्या या जगह में थोड़ा-सा भी बदलाव होने पर मुझे तनाव होता है।",
                gu = "મારી દિનચર્યા કે જગ્યામાં સહેજ પણ ફેરફાર થાય ત્યારે મને તણાવ થાય છે."
            )
        ),
        ReflectionQuestion(
            id = "ank_2",
            domain = TraitDomain.ANANKASTIA,
            text = LocalizedString(
                en = "I insist on doing things the exact right way to prevent any mistakes.",
                hi = "गलतियों से बचने के लिए मैं काम को बिल्कुल तय तरीके से ही करने पर अड़ा रहता हूँ।",
                gu = "ભૂલો ટાળવા માટે હું કામને ચોક્કસ નિયત પદ્ધતિથી જ કરવાનો આગ્રહ રાખું છું."
            )
        ),
        ReflectionQuestion(
            id = "ank_3",
            domain = TraitDomain.ANANKASTIA,
            text = LocalizedString(
                en = "I find it difficult to delegate work because others might do it wrong.",
                hi = "दूसरों को काम सौंपना मुझे मुश्किल लगता है क्योंकि वे गलती कर सकते हैं।",
                gu = "અન્ય લોકોને કામ સોંપવું મને અઘરું લાગે છે કારણ કે તેઓ ભૂલ કરી શકે છે."
            )
        ),
        ReflectionQuestion(
            id = "ank_4",
            domain = TraitDomain.ANANKASTIA,
            text = LocalizedString(
                en = "I hold myself and others to very strict standards that cannot be bent.",
                hi = "मैं अपने और दूसरों के लिए बहुत सख्त नियम रखता हूँ जिन्हें बदला नहीं जा सकता।",
                gu = "હું મારા અને અન્ય લોકો માટે અત્યંત કડક ધોરણો રાખું છું જેમાં બાંધછોડ નથી થઈ શકતી."
            )
        ),
        ReflectionQuestion(
            id = "ank_5",
            domain = TraitDomain.ANANKASTIA,
            text = LocalizedString(
                en = "I frequently double-check details because I worry about potential flaws.",
                hi = "मैं बार-बार विवरण जाँचता हूँ क्योंकि मुझे गलतियों का डर सताता रहता है।",
                gu = "હું વારંવાર વિગતો તપાસું છું કારણ કે મને ક્ષતિઓનો ડર સતાવ્યા કરે છે."
            )
        ),
        ReflectionQuestion(
            id = "ank_6",
            domain = TraitDomain.ANANKASTIA,
            text = LocalizedString(
                en = "Relaxing without feeling unproductive or guilty is very difficult for me.",
                hi = "बिना अपराधबोध या खुद को बेकार समझे आराम करना मेरे लिए बहुत कठिन है।",
                gu = "ગુનાહિત ભાવ વગર કે સમય બગાડ્યાના અહેસાસ વગર આરામ કરવો મારા માટે અઘરો છે."
            )
        ),

        // Borderline Pattern Specifier (6 items)
        ReflectionQuestion(
            id = "bpd_1",
            domain = TraitDomain.BORDERLINE_PATTERN,
            text = LocalizedString(
                en = "My view of who I am changes heavily depending on who I am with.",
                hi = "मैं वास्तव में कौन हूँ, यह विचार इस बात पर बदलता है कि मैं किसके साथ हूँ।",
                gu = "હું વાસ્તવમાં કોણ છું, તે વિચાર હું કોની સાથે છું તેના આધારે બદલાતો રહે છે."
            )
        ),
        ReflectionQuestion(
            id = "bpd_2",
            domain = TraitDomain.BORDERLINE_PATTERN,
            text = LocalizedString(
                en = "If a loved one seems distant, I panic that they will leave forever.",
                hi = "अगर कोई अपना थोड़ा दूर लगे, तो मुझे डर सताता है कि वह हमेशा के लिए छोड़ देगा।",
                gu = "જો કોઈ સ્વજન સહેજ દૂર લાગે, તો મને ડર લાગે છે કે તેઓ કાયમ માટે છોડી દેશે."
            )
        ),
        ReflectionQuestion(
            id = "bpd_3",
            domain = TraitDomain.BORDERLINE_PATTERN,
            text = LocalizedString(
                en = "My feelings about close people flip between deep admiration and intense hurt.",
                hi = "अपनों के प्रति मेरी भावनाएँ अत्यधिक प्यार और गहरी नाराजगी के बीच झूलती हैं।",
                gu = "નજીકના લોકો પ્રત્યે મારી લાગણીઓ ખૂબ પ્રેમ અને ઊંડી નારાજગી વચ્ચે ઝૂલ્યા કરે છે."
            )
        ),
        ReflectionQuestion(
            id = "bpd_4",
            domain = TraitDomain.BORDERLINE_PATTERN,
            text = LocalizedString(
                en = "I frequently struggle with an unbearable feeling of emptiness inside.",
                hi = "मुझे अक्सर अपने अंदर एक असहनीय खालीपन का अहसास होता है।",
                gu = "મને અવારનવાર મારી અંદર એક અસહ્ય ખાલીપો અનુભવાય છે."
            )
        ),
        ReflectionQuestion(
            id = "bpd_5",
            domain = TraitDomain.BORDERLINE_PATTERN,
            text = LocalizedString(
                en = "During peak stress, I feel strangely disconnected from my body or surroundings.",
                hi = "अत्यधिक तनाव में मुझे अपने शरीर या आस-पास की दुनिया से अजीब अलगाव महसूस होता है।",
                gu = "અતિશય તણાવમાં મને મારા શરીર કે આસપાસની દુનિયાથી વિચિત્ર અળગાપણું લાગે છે."
            )
        ),
        ReflectionQuestion(
            id = "bpd_6",
            domain = TraitDomain.BORDERLINE_PATTERN,
            text = LocalizedString(
                en = "I experience sudden, intense anger when I feel ignored or misunderstood.",
                hi = "जब मुझे लगता है कि मुझे नज़रअंदाज़ किया गया, तो अचानक तीव्र गुस्सा भड़क उठता है।",
                gu = "જ્યારે મને લાગે કે મારી ઉપેક્ષા થઈ છે, ત્યારે અચાનક તીવ્ર ક્રોધ ભભૂકી ઊઠે છે."
            )
        )
    )

    // Severity / Everyday Impact question for each domain
    val domainImpactQuestions = mapOf(
        TraitDomain.NEGATIVE_AFFECTIVITY to LocalizedString(
            en = "How much do these intense emotions affect your relationships, work, or peace of mind?",
            hi = "ये तीव्र भावनाएँ आपके रिश्तों, काम या मानसिक शांति को कितना प्रभावित करती हैं?",
            gu = "આ તીવ્ર લાગણીઓ તમારા સંબંધો, કામ કે માનસિક શાંતિને કેટલું પ્રભાવિત કરે છે?"
        ),
        TraitDomain.DETACHMENT to LocalizedString(
            en = "How much does staying socially or emotionally distant affect your life or connection with others?",
            hi = "सामाजिक या भावनात्मक रूप से दूर रहना आपके जीवन या दूसरों से जुड़ाव को कितना प्रभावित करता है?",
            gu = "સામાજિક કે ભાવનાત્મક રીતે દૂર રહેવું તમારા જીવન કે સંબંધોને કેટલું પ્રભાવિત કરે છે?"
        ),
        TraitDomain.DISSOCIALITY to LocalizedString(
            en = "How much do these interpersonal clashes affect your trust and harmony with people?",
            hi = "ये आपसी टकराव लोगों के साथ आपके विश्वास और सद्भाव को कितना प्रभावित करते हैं?",
            gu = "આ આપસી ઘર્ષણ લોકો સાથે તમારા વિશ્વાસ અને સુમેળને કેટલું પ્રભાવિત કરે છે?"
        ),
        TraitDomain.DISINHIBITION to LocalizedString(
            en = "How much has impulsive decision-making created problems in your finances, health, or plans?",
            hi = "बिना सोचे लिए गए फैसलों ने आपके पैसों, स्वास्थ्य या भविष्य की योजनाओं में कितनी बाधा डाली है?",
            gu = "વિચાર્યા વગર લીધેલા નિર્ણયોએ તમારા આર્થિક, સ્વાસ્થ્ય કે ભવિષ્યના આયોજનોમાં કેટલી સમસ્યાઓ ઊભી કરી છે?"
        ),
        TraitDomain.ANANKASTIA to LocalizedString(
            en = "How much does the need for rigid order and perfectionism cause exhaustion or friction?",
            hi = "कठोर व्यवस्था और पूर्णतावाद की यह आदत आपको कितनी थकान या अपनों से अनबन देती है?",
            gu = "કડક વ્યવસ્થા અને પૂર્ણતાવાદની આ ટેવ તમને કેટલો થાક કે આપસી ઘર્ષણ આપે છે?"
        ),
        TraitDomain.BORDERLINE_PATTERN to LocalizedString(
            en = "How much do sudden shifts in identity and fear of abandonment disrupt your daily stability?",
            hi = "आत्म-छवि में बदलाव और अकेले छूट जाने का डर आपकी दैनिक स्थिरता को कितना प्रभावित करता है?",
            gu = "આત્મ-છબીમાં બદલાવ અને એકલા પડી જવાનો ડર તમારી દૈનિક સ્થિરતાને કેટલું ખલેલ પહોંચાડે છે?"
        )
    )

    val impactLevels = listOf(
        LocalizedString("Minimal or no noticeable impact", "न्यूनतम या कोई खास असर नहीं", "નહિવત્ કે કોઈ ખાસ અસર નહીં"),
        LocalizedString("Mild friction in some specific situations", "कुछ खास स्थितियों में हल्का तनाव", "કેટલીક ચોક્કસ પરિસ્થિતિઓમાં હળવો તણાવ"),
        LocalizedString("Moderate strain across multiple relationships or duties", "कई रिश्तों या कामकाज में मध्यम स्तर का तनाव", "ઘણા સંબંધો કે કામકાજમાં મધ્યમ સ્તરનો તણાવ"),
        LocalizedString("Significant ongoing distress and day-to-day disruption", "गंभीर निरंतर परेशानी और दैनिक जीवन में रुकावट", "ગંભીર સતત મુશ્કેલી અને દૈનિક જીવનમાં મોટી ખલેલ")
    )

    // Current Safety / Crisis Check
    val safetyQuestionText = LocalizedString(
        en = "Current Safety Check: In the past month, have you had thoughts of hurting yourself, ending your life, or harming anyone else?",
        hi = "वर्तमान सुरक्षा जाँच: क्या पिछले एक महीने में आपके मन में खुद को नुकसान पहुँचाने, जीवन समाप्त करने या किसी अन्य को चोट पहुँचाने के विचार आए हैं?",
        gu = "વર્તમાન સુરક્ષા ચકાસણી: શું છેલ્લા એક મહિનામાં તમારા મનમાં તમારી જાતને ઈજા પહોંચાડવાના, જીવન ટૂંકાવવાના કે અન્ય કોઈને નુકસાન પહોંચાડવાના વિચારો આવ્યા છે?"
    )

    val safetyOptions = listOf(
        LocalizedString("No, not at all", "नहीं, बिल्कुल नहीं", "ના, બિલકુલ નહીં"),
        LocalizedString("Occasionally had fleeting thoughts", "कभी-कभार ऐसे विचार आए", "ક્યારેક આવા વિચારો આવ્યા હતા"),
        LocalizedString("Yes, actively experiencing these thoughts", "हाँ, वर्तमान में ऐसे विचार आ रहे हैं", "હા, હાલમાં આવા વિચારો આવી રહ્યા છે")
    )
}
