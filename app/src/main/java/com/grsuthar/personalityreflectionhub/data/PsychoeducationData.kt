package com.grsuthar.personalityreflectionhub.data

object PsychoeducationData {

    val conceptDifferenceTitle = LocalizedString(
        en = "Pattern vs. Difficulty vs. Disorder: What is the Difference?",
        hi = "पैटर्न बनाम कठिनाई बनाम विकार: क्या अंतर है?",
        gu = "પેટર્ન વિરુદ્ધ મુશ્કેલી વિરુદ્ધ વિકાર: શું તફાવત છે?"
    )

    val conceptDifferenceIntro = LocalizedString(
        en = "In modern psychiatry (WHO ICD-11), personality is understood on a scale, not as a yes-or-no label. Everyone has unique personality traits.",
        hi = "आधुनिक मनोचिकित्सा (WHO ICD-11) में व्यक्तित्व को हाँ-या-ना के लेबल के बजाय एक पैमाने पर समझा जाता है। हर व्यक्ति के विशिष्ट लक्षण होते हैं।",
        gu = "આધુનિક મનોચિકિત્સા (WHO ICD-11) માં વ્યક્તિત્વને હા-કે-ના લેબલને બદલે માપદંડ પર જોવામાં આવે છે. દરેક વ્યક્તિમાં અનન્ય લક્ષણો હોય છે."
    )

    val conceptCards: List<ConceptCardInfo> = listOf(
        ConceptCardInfo(
            title = LocalizedString("1. Personality Pattern", "1. व्यक्तित्व पैटर्न", "1. વ્યક્તિત્વ પેટર્ન"),
            subtitle = LocalizedString(
                "Our natural, everyday ways of thinking, feeling, and interacting with the world.",
                "सोचने, महसूस करने और दुनिया से जुड़ने का हमारा स्वाभाविक रोजमर्रा का तरीका।",
                "વિચારવાની, લાગણી અનુભવવાની અને દુનિયા સાથે જોડાવાની આપણી સ્વાભાવિક દૈનિક રીત."
            ),
            description = LocalizedString(
                "These are normal human differences. They include being talkative, careful, sensitive, or calm.",
                "यह सामान्य मानवीय विविधताएँ हैं। जैसे बातूनी होना, सतर्क रहना, भावुक होना या शांत रहना।",
                "આ સામાન્ય માનવીય વિવિધતાઓ છે. જેમ કે વાતોડિયા હોવું, સાવધ રહેવું, લાગણીશીલ હોવું કે શાંત રહેવું."
            ),
            example = LocalizedString(
                en = "Example: Meera is naturally careful and double-checks her work, while her brother is spontaneous and loves last-minute plans.",
                hi = "उदाहरण: मीरा स्वभाव से सतर्क है और अपने काम की दोबारा जाँच करती है, जबकि उसका भाई सहज है और बिना पूर्व योजना के काम करना पसंद करता है।",
                gu = "ઉદાહરણ: મીરા સ્વભાવથી સાવધ છે અને પોતાના કામની બે વાર ચકાસણી કરે છે, જ્યારે તેનો ભાઈ સહજ છે અને તાત્કાલિક આયોજન પસંદ કરે છે."
            )
        ),
        ConceptCardInfo(
            title = LocalizedString("2. Personality Difficulty", "2. व्यक्तित्व कठिनाई", "2. વ્યક્તિત્વ મુશ્કેલી"),
            subtitle = LocalizedString(
                "A subthreshold state (not quite at the level of a disorder) that causes friction in stressful times.",
                "यह ऐसी स्थिति है जो विकार के स्तर पर नहीं है, लेकिन तनाव में रिश्ते या काम उलझाती है।",
                "આ એવી સ્થિતિ છે જે વિકારના સ્તર સુધી નથી પહોંચતી, પરંતુ તણાવમાં ઘર્ષણ ઊભું કરે છે."
            ),
            description = LocalizedString(
                "Often appears only in specific relationships or jobs. Many areas of life still function well.",
                "यह अक्सर केवल कुछ खास रिश्तों या कामों में दिखती है। जीवन के कई क्षेत्र सामान्य चलते रहते हैं।",
                "તે ઘણીવાર અમુક ચોક્કસ સંબંધોમાં જ દેખાય છે. જીવનના ઘણા ક્ષેત્રો સામાન્ય રીતે ચાલતા હોય છે."
            ),
            example = LocalizedString(
                en = "Example: Rohan manages his job and friendships well, but during high workplace stress he becomes unusually stubborn and irritable with his team for a few weeks.",
                hi = "उदाहरण: रोहन अपनी नौकरी और दोस्ती अच्छे से निभाता है, लेकिन काम के भारी तनाव के दौरान कुछ हफ्तों के लिए वह अपनी टीम के साथ बहुत ज़िद्दी और चिड़चिड़ा हो जाता है।",
                gu = "ઉદાહરણ: રોહન પોતાની નોકરી અને મિત્રતા સરસ રીતે નિભાવે છે, પરંતુ કામના ભારે તણાવ વખતે થોડા અઠવાડિયા માટે તે પોતાની ટીમ સાથે ખૂબ જીદ્દી અને ચીડચીડો બની જાય છે."
            )
        ),
        ConceptCardInfo(
            title = LocalizedString("3. Personality Disorder (ICD-11)", "3. व्यक्तित्व विकार (ICD-11)", "3. વ્યક્તિત્વ વિકાર (ICD-11)"),
            subtitle = LocalizedString(
                "An enduring, pervasive disturbance in self-identity and interpersonal relationships.",
                "आत्म-पहचान और आपसी रिश्तों में लंबे समय से चली आ रही व्यापक और गहरी परेशानी।",
                "આત્મ-ઓળખ અને આપસી સંબંધોમાં લાંબા સમયથી ચાલતી વ્યાપક અને ઊંડી સમસ્યા."
            ),
            description = LocalizedString(
                "Must be present across many situations, traceable back to youth, and causing significant distress.",
                "यह कई अलग-अलग परिस्थितियों में दिखे, किशोरावस्था से जुड़ा हो, और गंभीर पीड़ा पैदा करे।",
                "તે વિવિધ પરિસ્થિતિઓમાં દેખાય, યુવાનીથી જોડાયેલ હોય, અને ગંભીર માનસિક પીડા ઊભી કરે."
            ),
            example = LocalizedString(
                en = "Example: For many years across multiple jobs and relationships, deep feelings of emptiness, sudden rage, or fear of abandonment cause severe emotional suffering and disrupt daily life.",
                hi = "उदाहरण: कई वर्षों से विभिन्न नौकरियों और रिश्तों में गहरा खालीपन, अचानक तीव्र गुस्सा या बिछड़ने का भय लगातार गंभीर मानसिक कष्ट देता है और जीवन को अस्त-व्यस्त करता है।",
                gu = "ઉદાહરણ: ઘણા વર્ષોથી નોકરીઓ અને સંબંધોમાં સતત ઊંડો ખાલીપો, અચાનક તીવ્ર ગુસ્સો કે વિખૂટા પડવાનો ડર સતત ગંભીર માનસિક પીડા આપે છે અને દૈનિક જીવન ખોરવે છે."
            )
        )
    )

    val severityTitle = LocalizedString(
        en = "Understanding Severity (ICD-11)",
        hi = "गंभीरता को समझना (ICD-11)",
        gu = "ગંભીરતાને સમજવી (ICD-11)"
    )

    val severityIntro = LocalizedString(
        en = "In ICD-11, how much a pattern impairs daily life matters more than any label. Doctors evaluate severity first.",
        hi = "ICD-11 में किसी भी नाम से ज्यादा यह महत्वपूर्ण है कि जीवन कितना प्रभावित हो रहा है। चिकित्सक पहले गंभीरता देखते हैं।",
        gu = "ICD-11 માં કોઈ પણ નામ કરતાં એ વધુ મહત્વનું છે કે જીવન કેટલું પ્રભાવિત થાય છે. ડૉક્ટરો પહેલાં ગંભીરતા તપાસે છે."
    )

    val severityLevels: List<SeverityLevelInfo> = listOf(
        SeverityLevelInfo(
            title = LocalizedString("Personality Difficulty (Subthreshold)", "व्यक्तित्व कठिनाई (सबथ्रेशोल्ड)", "વ્યક્તિત્વ મુશ્કેલી (સબથ્રેશોલ્ડ)"),
            summary = LocalizedString("Friction in some situations; does not meet full criteria for a disorder.", "कुछ स्थितियों में अनबन होती है; विकार के पूर्ण मानदंडों को पूरा नहीं करता।", "અમુક પરિસ્થિતિઓમાં ઘર્ષણ થાય છે; વિકારના સંપૂર્ણ માપદંડો પૂર્ણ થતા નથી."),
            description = LocalizedString("Self-identity remains steady. Strong support and reflection usually help resolve friction.", "आत्म-पहचान स्थिर रहती है। अपनों का सहयोग और आत्म-चिंतन अक्सर मदद करते हैं।", "આત્મ-ઓળખ સ્થિર રહે છે. સ્વજનોનો સાથ અને સ્વ-ચિંતન મદદરૂપ બને છે."),
            everydayImpactExample = LocalizedString(
                en = "Everyday Impact: Friction flares up mainly when deadlines or conflicts hit, but home life and basic work routines continue without breaking down.",
                hi = "दैनिक प्रभाव: परेशानी मुख्य रूप से केवल समय-सीमा या टकराव के दौरान उभरती है, लेकिन पारिवारिक जीवन और सामान्य कामकाज सुचारू रूप से चलते रहते हैं।",
                gu = "દૈનિક પ્રભાવ: મુશ્કેલી મુખ્યત્વે સમયમર્યાદા કે મતભેદ વખતે જ બહાર આવે છે, પરંતુ કૌટુંબિક જીવન અને સામાન્ય કામકાજ અટક્યા વગર ચાલુ રહે છે."
            )
        ),
        SeverityLevelInfo(
            title = LocalizedString("Mild Severity", "हल्की गंभीरता (Mild)", "હળવી ગંભીરતા (Mild)"),
            summary = LocalizedString("Affects some areas of life, but not all. Often depends on context or high stress.", "जीवन के कुछ क्षेत्रों को प्रभावित करता है। अक्सर तनाव या खास परिस्थितियों पर निर्भर होता है।", "જીવનના કેટલાક ક્ષેત્રોને પ્રભાવિત કરે છે. મોટાભાગે તણાવ કે ચોક્કસ સંજોગો પર આધારિત હોય છે."),
            description = LocalizedString("Many close relationships remain intact. Serious harm to self or others is uncommon.", "कई करीबी रिश्ते सही सलामत रहते हैं। खुद को या दूसरों को गंभीर नुकसान बहुत कम होता है।", "ઘણા સંબંધો સામાન્ય રહે છે. પોતાની જાતને કે અન્યને ગંભીર નુકસાન ભાગ્યે જ થાય છે."),
            everydayImpactExample = LocalizedString(
                en = "Everyday Impact: Tension spills into specific areas—such as frequent friction with one close friend or supervisor—yet they hold down their job and maintain other supportive ties.",
                hi = "दैनिक प्रभाव: तनाव कुछ खास क्षेत्रों में दिखता है—जैसे किसी करीबी दोस्त या बॉस के साथ बार-बार अनबन—फिर भी वे नौकरी संभालते हैं और अन्य रिश्ते बनाए रखते हैं।",
                gu = "દૈનિક પ્રભાવ: તણાવ અમુક ચોક્કસ ક્ષેત્રોમાં દેખાય છે—જેમ કે કોઈ ખાસ મિત્ર કે ઉપરી અધિકારી સાથે વારંવાર ઘર્ષણ—છતાં તેઓ નોકરી સંભાળે છે અને અન્ય સંબંધો સાચવે છે."
            )
        ),
        SeverityLevelInfo(
            title = LocalizedString("Moderate Severity", "मध्यम गंभीरता (Moderate)", "મધ્યમ ગંભીરતા (Moderate)"),
            summary = LocalizedString("Noticeably affects multiple areas of life. Most close relationships experience marked strain.", "जीवन के कई क्षेत्रों में स्पष्ट असर दिखता है। अधिकांश करीबी रिश्तों में भारी तनाव रहता है।", "જીવનના ઘણા ક્ષેત્રોમાં સ્પષ્ટ અસર દેખાય છે. મોટાભાગના નજીકના સંબંધોમાં સતત તણાવ રહે છે."),
            description = LocalizedString("Questions about self-worth and direction are frequent. Occasional risk of harm may arise.", "आत्म-मूल्य और जीवन की दिशा पर बार-बार सवाल उठते हैं। कभी-कभार जोखिम की संभावना हो सकती है।", "આત્મ-સન્માન અને જીવનની દિશા પર વારંવાર પ્રશ્નો ઊભા થાય છે. ક્યારેક જોખમની શક્યતા બની શકે છે."),
            everydayImpactExample = LocalizedString(
                en = "Everyday Impact: Strain reaches across several areas: difficulty staying at a job for long, frequent breakups, and emotional storms that regularly make family life tense.",
                hi = "दैनिक प्रभाव: तनाव कई क्षेत्रों को प्रभावित करता है: लंबे समय तक एक काम में टिकने में कठिनाई, बार-बार रिश्ते टूटना, और ऐसे भावनात्मक तूफान जो पूरे परिवार को तनाव में रखते हैं।",
                gu = "દૈનિક પ્રભાવ: તણાવ ઘણા ક્ષેત્રોમાં વ્યાપી જાય છે: લાંબો સમય એક કામમાં ટકવામાં મુશ્કેલી, વારંવાર સંબંધો તૂટવા, અને એવા લાગણીશીલ ઉતાર-ચઢાવ જે પરિવારને સતત ચિંતામાં રાખે છે."
            )
        ),
        SeverityLevelInfo(
            title = LocalizedString("Severe Severity", "गंभीर स्थिति (Severe)", "ગંભીર સ્થિતિ (Severe)"),
            summary = LocalizedString("Pervades almost all areas of life, self-experience, and interpersonal relationships.", "जीवन के लगभग हर क्षेत्र, आत्म-अनुभव और आपसी रिश्तों को गंभीर रूप से घेर लेता है।", "જીવનના લગભગ દરેક ક્ષેત્ર, આત્મ-અનુભવ અને સંબંધોને વ્યાપક રીતે ઘેરી લે છે."),
            description = LocalizedString("Sense of self may feel chronically empty. Risk of self-harm or crisis is significantly higher.", "अंदर से लगातार असहनीय खालीपन लग सकता है। खुद को नुकसान पहुँचाने का जोखिम अधिक रहता है।", "અંદરથી સતત અસહ્ય ખાલીપો લાગી શકે છે. પોતાની જાતને નુકસાન પહોંચાડવાનું જોખમ વધુ રહે છે."),
            everydayImpactExample = LocalizedString(
                en = "Everyday Impact: Overwhelming pain and chaos affect almost every relationship, workplace, and personal routine; safe professional support and consistent crisis resources are essential.",
                hi = "दैनिक प्रभाव: असहनीय मानसिक पीड़ा और अस्थिरता लगभग हर रिश्ते, काम और दैनिक दिनचर्या को घेर लेती है; ऐसे में सुरक्षित पेशेवर मदद और निरंतर सहायता आवश्यक होती है।",
                gu = "દૈનિક પ્રભાવ: અસહ્ય માનસિક પીડા અને અસ્થિરતા લગભગ દરેક સંબંધ, કામકાજ અને દૈનિક ક્રિયાઓને ઘેરી લે છે; આવા સમયે સુરક્ષિત વ્યવસાયિક સહાય અને સતત માર્ગદર્શન અનિવાર્ય બને છે."
            )
        )
    )

    val traitDomainDetails = listOf(
        PatternEducationItem(
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            everydayDescription = LocalizedString(
                en = "A tendency to experience frequent, intense, and easily triggered negative emotions.",
                hi = "अक्सर, अत्यधिक और बहुत जल्दी परेशान करने वाली नकारात्मक भावनाएं महसूस करने की प्रवृत्ति।",
                gu = "વારંવાર, અતિશય અને ખૂબ ઝડપથી પરેશાન કરતી નકારાત્મક લાગણીઓ અનુભવવાની ટેવ."
            ),
            dayToDayLook = listOf(
                LocalizedString(
                    en = "Sudden mood swings from sadness to anxiety or anger.",
                    hi = "उदास, चिंतित या क्रोधित होने के बीच अचानक मूड बदलना।",
                    gu = "ઉદાસ, ચિંતિત કે ગુસ્સા વચ્ચે અચાનક મૂડ બદલાવો."
                ),
                LocalizedString(
                    en = "Strong worry about being abandoned or judged harshly.",
                    hi = "अकेले छोड़ दिए जाने या कठोर आलोचना का निरंतर डर।",
                    gu = "એકલા છોડી દેવાનો કે સખત ટીકા થવાનો સતત ડર."
                ),
                LocalizedString(
                    en = "Difficulty calming down after emotional distress.",
                    hi = "भावनात्मक ठेस लगने के बाद खुद को शांत करने में लंबा समय लगना।",
                    gu = "ભાવનાત્મક આઘાત પછી શાંત થવામાં લાંબો સમય લાગવો."
                )
            ),
            illustrativeExample = LocalizedString(
                en = "Pooja feels things with great depth and cares intensely about the people around her. When plans change unexpectedly or a text message is answered slowly, her mind quickly assumes something terrible has happened or that she did something wrong. Her heart races and she feels a rush of sadness or panic that takes hours to settle. With time and grounding practice, she is learning to harness her deep emotional sensitivity without letting panic take the steering wheel.",
                hi = "पूजा हर बात को गहराई से महसूस करती है और अपनों की दिल से परवाह करती है। जब योजनाएँ अचानक बदलती हैं या किसी संदेश का देर से जवाब आता है, तो उसका मन तुरंत सोचने लगता है कि कुछ बहुत बुरा हो गया है या उससे कोई गलती हुई है। उसकी धड़कनें तेज हो जाती हैं और घबराहट शांत होने में कई घंटे लग जाते हैं। अभ्यास और धैर्य से, वह अपनी गहरी संवेदनशीलता को ताकत बनाना सीख रही है ताकि घबराहट उस पर हावी न हो।",
                gu = "પૂજા દરેક વાતને ખૂબ ઊંડાણથી અનુભવે છે અને સ્વજનોની દિલથી કાળજી રાખે છે. જ્યારે આયોજન અચાનક બદલાય અથવા કોઈ મેસેજનો મોડો જવાબ આપે, ત્યારે તેનું મન તરત વિચારે છે કે કંઈક અશુભ બન્યું છે કે તેનાથી કોઈ ભૂલ થઈ ગઈ છે. તેની ધબકારા વધી જાય છે અને શાંત થવામાં કલાકો લાગે છે. ધીરજ અને માર્ગદર્શનથી, તે પોતાની ઊંડી સંવેદનશીલતાને પોતાની શક્તિ બનાવતા શીખી રહી છે જેથી ગભરાટ તેના પર હાવી ન થાય."
            ),
            strengthsReframe = LocalizedString(
                en = "Deep empathy, acute emotional attunement, capacity for intense loyalty and passion.",
                hi = "गहरी संवेदनशीलता, दूसरों के दर्द को गहराई से महसूस करने की क्षमता, और सच्चा समर्पण।",
                gu = "ઊંડી સંવેદનશીલતા, બીજાના દર્દને દિલથી સમજવાની ક્ષમતા અને અતૂટ સમર્પણ."
            ),
            oldTermsBridge = LocalizedString(
                en = "Previously linked with terms like 'Neuroticism', 'Anxious (Avoidant)' or emotional instability.",
                hi = "पुराने वर्गीकरणों में इसे 'न्यूरोटिसिज्म' या 'चिंताग्रस्त/भावनात्मक अस्थिरता' कहा जाता था।",
                gu = "જૂના વર્ગીકરણમાં તેને 'ન્યુરોટિસિઝમ' કે 'ચિંતાગ્રસ્ત/ભાવનાત્મક અસ્થિરતા' તરીકે ઓળખવામાં આવતું હતું."
            )
        ),
        PatternEducationItem(
            domain = TraitDomain.DETACHMENT,
            everydayDescription = LocalizedString(
                en = "Emotional and social distance from both people and external activities.",
                hi = "लोगों और बाहरी गतिविधियों दोनों से भावनात्मक और सामाजिक दूरी बनाए रखना।",
                gu = "લોકો અને બાહ્ય પ્રવૃત્તિઓ બંનેથી ભાવનાત્મક અને સામાજિક અંતર જાળવવું."
            ),
            dayToDayLook = listOf(
                LocalizedString(
                    en = "Comfort with solitude and preference for solitary work.",
                    hi = "अकेले रहने में शांति पाना और अकेले काम करने को प्राथमिकता देना।",
                    gu = "એકાંતમાં શાંતિ અનુભવવી અને એકલા કામ કરવાનું પસંદ કરવું."
                ),
                LocalizedString(
                    en = "Keeping a guard up, rarely sharing intimate thoughts.",
                    hi = "दूरी बनाए रखना और अपनी गहरी बातें किसी से साझा न करना।",
                    gu = "અંતર રાખવું અને પોતાના અંગત વિચારો કોઈ સાથે ન વહેંચવા."
                ),
                LocalizedString(
                    en = "Limited outward emotional expression, even during big events.",
                    hi = "बड़ी घटनाओं में भी बाहरी तौर पर बहुत कम भाव दिखाना।",
                    gu = "મોટા પ્રસંગોમાં પણ બહારથી ખૂબ ઓછી લાગણીઓ વ્યક્ત કરવી."
                )
            ),
            illustrativeExample = LocalizedString(
                en = "Arun is remarkably self-sufficient and does his best creative work when working quietly alone in his room. In group celebrations or team lunches, however, he feels deeply drained and stands near the exit, unsure how to join small talk. Others sometimes misread his silence as coldness, even though he simply needs quiet to feel balanced. He finds that scheduling one-on-one walks helps him build meaningful bonds without the exhaustion of loud gatherings.",
                hi = "अरुण पूरी तरह आत्मनिर्भर है और अपने कमरे में अकेले रहकर सबसे बेहतरीन रचनात्मक काम करता है। लेकिन पारिवारिक समारोहों या सामूहिक बैठकों में वह बहुत जल्दी थक जाता है और किनारे खड़ा रहता है, यह न समझ पाते हुए कि बातचीत कैसे शुरू करे। लोग कभी-कभी उसकी खामोशी को बेरुखी समझ लेते हैं, जबकि उसे सिर्फ शांति की जरूरत होती है। अब वह बड़ी महफिलों के बजाय एक-एक व्यक्ति से शांत बातचीत करके रिश्ते निभाना सीख रहा है।",
                gu = "અરુણ સંપૂર્ણપણે આત્મનિર્ભર છે અને પોતાના રૂમમાં એકલા બેસીને સૌથી ઉત્તમ સર્જનાત્મક કાર્ય કરે છે. પરંતુ મેળાવડાઓમાં કે સમૂહ ભોજન વખતે તે ઝડપથી થાકી જાય છે અને છેવાડે ઊભો રહે છે, કારણ કે વાતો કેવી રીતે શરૂ કરવી તે સમજાતું નથી. લોકો ઘણીવાર તેના મૌનને અહંકાર સમજી બેસે છે, જ્યારે તેને માત્ર શાંતિની જરૂર હોય છે. હવે તે મોટા ટોળાને બદલે એક-એક વ્યક્તિ સાથે શાંતિથી જોડાઈને સંબંધો સાચવવાનું શીખી રહ્યો છે."
            ),
            strengthsReframe = LocalizedString(
                en = "Self-reliance, calm focus during social chaos, independence, low need for validation.",
                hi = "आत्मनिर्भरता, सामाजिक हंगामे के बीच शांत एकाग्रता, और दूसरों की मंज़ूरी की कम चाह।",
                gu = "આત્મનિર્ભરતા, સામાજિક ઘોંઘાટ વચ્ચે શાંત એકાગ્રતા અને બીજાના અભિપ્રાયથી મુક્ત સ્વતંત્રતા."
            ),
            oldTermsBridge = LocalizedString(
                en = "Overlaps with former categories like 'Schizoid' or 'Introverted/Avoidant' patterns.",
                hi = "यह पहले की 'स्कीज़ॉइड' (Schizoid) या अंतर्मुखी शैलियों के करीब आता है।",
                gu = "આ અગાઉના 'સ્કિઝોઇડ' (Schizoid) કે અંતર્મુખી વલણ સાથે મેળ ખાય છે."
            )
        ),
        PatternEducationItem(
            domain = TraitDomain.DISSOCIALITY,
            everydayDescription = LocalizedString(
                en = "Disregard for the rights, feelings, and boundaries of others.",
                hi = "दूसरों के अधिकारों, भावनाओं और सीमाओं की अनदेखी करना।",
                gu = "અન્ય લોકોના અધિકારો, લાગણીઓ અને મર્યાદાઓની ઉપેક્ષા કરવી."
            ),
            dayToDayLook = listOf(
                LocalizedString(
                    en = "Putting self-interest first regardless of impact on peers.",
                    hi = "दूसरों पर क्या असर पड़ेगा, इसकी परवाह किए बिना अपना फायदा देखना।",
                    gu = "અન્ય પર શું અસર થશે તેની ચિંતા કર્યા વગર માત્ર પોતાનો સ્વાર્થ જોવો."
                ),
                LocalizedString(
                    en = "Low empathy or impatience with others' emotional pain.",
                    hi = "दूसरों के दुख के प्रति कम सहानुभूति या अधीरता।",
                    gu = "બીજાના દુઃખ પ્રત્યે ઓછી સહાનુભૂતિ કે અધીરાઈ દાખવવી."
                ),
                LocalizedString(
                    en = "Comfort with deception, superiority, or hostility in conflict.",
                    hi = "विवादों में खुद को श्रेष्ठ समझना, कठोर होना या सच छिपाना।",
                    gu = "વિવાદોમાં પોતાની જાતને શ્રેષ્ઠ ગણવી, કઠોર બનવું કે સત્ય છુપાવવું."
                )
            ),
            illustrativeExample = LocalizedString(
                en = "Vikram is ambitious, bold, and never afraid to make tough, decisive calls in high-pressure projects. But when working on shared tasks, he often cuts in front of teammates, dismisses their fatigue, and bends rules to finish first. When colleagues express hurt, he brushes it off as weakness rather than taking their feelings seriously. He is gradually learning that enduring success requires mutual fairness and respecting the boundaries of those around him.",
                hi = "विक्रम महत्वाकांक्षी और साहसी है, और दबाव में कड़े व निर्णायक फैसले लेने से कभी नहीं डरता। लेकिन मिलकर काम करते समय, वह अक्सर साथियों की अनदेखी करता है, उनकी थकान को नजरअंदाज करता है और आगे निकलने के लिए नियमों को मोड़ देता है। जब साथी अपनी परेशानी बताते हैं, तो वह इसे कमजोरी मानकर टाल देता है। वह धीरे-धीरे समझ रहा है कि स्थायी सफलता के लिए निष्पक्षता और दूसरों की सीमाओं का सम्मान करना अनिवार्य है।",
                gu = "વિક્રમ મહત્ત્વાકાંક્ષી અને સાહસિક છે, અને દબાણ હેઠળ કઠિન નિર્ણયો લેવામાં ક્યારેય અચકાતો નથી. પરંતુ સાથે મળીને કામ કરતી વખતે, તે સાથીઓની લાગણીઓને નજરઅંદાજ કરે છે, તેમની થાકની ઉપેક્ષા કરે છે અને આગળ નીકળવા નિયમો તોડે છે. જ્યારે સાથીઓ દુઃખ વ્યક્ત કરે, ત્યારે તે તેને નબળાઈ ગણી ઉડાવી દે છે. તે ધીમે ધીમે શીખી રહ્યો છે કે લાંબા ગાળાની સફળતા માટે પરસ્પર ન્યાય અને અન્યોની મર્યાદાઓનું સન્માન કરવું અનિવાર્ય છે."
            ),
            strengthsReframe = LocalizedString(
                en = "Assertiveness, ability to make tough objective decisions, resilience under resistance.",
                hi = "मजबूत आत्मविश्वास, दबाव में कठोर निर्णय लेने की क्षमता, और आत्म-रक्षा।",
                gu = "મજબૂત આત્મવિશ્વાસ, દબાણ વચ્ચે કઠિન નિર્ણયો લેવાની ક્ષમતા અને નિર્ભયતા."
            ),
            oldTermsBridge = LocalizedString(
                en = "Encompasses traits previously discussed under 'Antisocial' or 'Narcissistic' descriptions.",
                hi = "इसमें वे लक्षण शामिल हैं जिन्हें पहले 'असामाजिक' (Antisocial) या 'नार्सिसिस्टिक' कहा जाता था।",
                gu = "આમાં એ લક્ષણો આવે છે જેને અગાઉ 'અસામાજિક' (Antisocial) કે 'નાર્સિસિસ્ટિક' કહેવાતા હતા."
            )
        ),
        PatternEducationItem(
            domain = TraitDomain.DISINHIBITION,
            everydayDescription = LocalizedString(
                en = "A tendency to act on impulse without anticipating long-term consequences.",
                hi = "दीर्घकालिक परिणामों की सोचे बिना तत्काल आवेग में कदम उठाना।",
                gu = "લાંબા ગાળાના પરિણામોનો વિચાર કર્યા વગર તત્કાળ આવેગમાં પગલું ભરવું."
            ),
            dayToDayLook = listOf(
                LocalizedString(
                    en = "Quick decisions driven by present feelings or instant thrills.",
                    hi = "वर्तमान रोमांच या तात्कालिक भावनाओं से प्रेरित होकर जल्दबाजी में फैसले।",
                    gu = "તાત્કાલિક રોમાંચ કે આવેગથી દોરવાઈને ઉતાવળા નિર્ણયો લેવા."
                ),
                LocalizedString(
                    en = "Difficulty delaying gratification or following structured schedules.",
                    hi = "इंतज़ार करने या तय कार्यक्रम का पालन करने में भारी कठिनाई।",
                    gu = "રાહ જોવામાં કે નક્કી કરેલા સમયપત્રકનું પાલન કરવામાં અતિ મુશ્કેલી."
                ),
                LocalizedString(
                    en = "Frequent distraction and abandoning unfinished projects.",
                    hi = "जल्दी ध्यान भटकना और शुरू किए गए कामों को अधूरा छोड़ देना।",
                    gu = "ધ્યાન ભટકવું અને શરૂ કરેલા કામ અધૂરા છોડી દેવા."
                )
            ),
            illustrativeExample = LocalizedString(
                en = "Kavita brings fun energy, enthusiasm, and spontaneous excitement wherever she goes. However, she frequently commits to big ideas on a whim, spends her monthly rent on an impulsive weekend sale, and drops ongoing commitments halfway through. When bills arrive or deadlines loom, the sudden consequences leave her overwhelmed and distressed. She is practicing using a 24-hour waiting rule and visual checklists to keep her spontaneity safe and grounded.",
                hi = "कविता जहाँ भी जाती है, अपने साथ ऊर्जा, उत्साह और नया रोमांच लेकर आती है। लेकिन वह अक्सर बिना सोचे-समझे बड़े वादे कर बैठती है, अचानक सेल में जरूरी पैसे खर्च कर देती है, और शुरू किए गए काम अधूरे छोड़ देती है। जब समय-सीमा सिर पर आती है, तो अचानक सामने आए परिणामों से वह घबरा जाती है। अब वह अपने फैसलों से पहले 24 घंटे का समय लेने और चेकलिस्ट बनाने का अभ्यास कर रही है ताकि उसकी ऊर्जा सही दिशा में लगे।",
                gu = "કવિતા જ્યાં પણ જાય છે, ત્યાં ઉત્સાહ, ઊર્જા અને નવી રોમાંચકતા લાવે છે. પરંતુ તે ઘણીવાર આવેગમાં આવીને મોટા વચનો આપી દે છે, અચાનક સેલમાં જરૂરી પૈસા વાપરી નાખે છે અને શરૂ કરેલા કામ અધૂરા છોડી દે છે. જ્યારે છેલ્લી ઘડી આવે ત્યારે અચાનક પરિણામોથી તે ગભરાઈ જાય છે. હવે તે નિર્ણયો લેતા પહેલાં ૨૪ કલાક રાહ જોવાનો અને ચેકલિસ્ટ બનાવવાનો અભ્યાસ કરી રહી છે જેથી તેનો ઉત્સાહ સુરક્ષિત રહે."
            ),
            strengthsReframe = LocalizedString(
                en = "Spontaneity, adaptability, willingness to take bold initiatives and embrace new paths.",
                hi = "सहजता, बदलाव के साथ जल्दी ढलना, और नए रास्तों पर साहसिक कदम उठाना।",
                gu = "સહજતા, બદલાવ સ્વીકારવાની ક્ષમતા અને નવા રસ્તાઓ પર સાહસિક પહેલ કરવી."
            ),
            oldTermsBridge = LocalizedString(
                en = "Previously referred to as 'Impulsive type' or high sensation seeking.",
                hi = "इसे पहले 'आवेगी प्रकार' (Impulsive type) या जोखिम लेने की प्रवृत्ति कहा जाता था।",
                gu = "અગાઉ તેને 'આવેગી પ્રકાર' (Impulsive type) કે જોખમ લેવાની વૃત્તિ તરીકે ઓળખવામાં આવતી."
            )
        ),
        PatternEducationItem(
            domain = TraitDomain.ANANKASTIA,
            everydayDescription = LocalizedString(
                en = "A narrow focus on rigid perfectionism, control, and strict rules.",
                hi = "कठोर पूर्णतावाद, अत्यधिक नियंत्रण और सख्त नियमों पर भारी ध्यान।",
                gu = "કડક પૂર્ણતાવાદ, અતિશય નિયંત્રણ અને ચુસ્ત નિયમો પર ઊંડું ધ્યાન."
            ),
            dayToDayLook = listOf(
                LocalizedString(
                    en = "Intense distress if routines or environments are altered.",
                    hi = "दिनचर्या या वातावरण में थोड़ा भी बदलाव होने पर भारी घबराहट।",
                    gu = "દિનચર્યા કે વાતાવરણમાં સહેજ પણ ફેરફાર થાય તો ભારે અસ્વસ્થતા."
                ),
                LocalizedString(
                    en = "Reluctance to delegate due to fear of errors or imperfections.",
                    hi = "गलती के डर से दूसरों को काम सौंपने में भारी हिचकिचाहट।",
                    gu = "ભૂલ થવાના ડરથી અન્ય લોકોને કામ સોંપવામાં ભારે ખચકાટ."
                ),
                LocalizedString(
                    en = "Excessive conscientiousness and guilt over taking breaks.",
                    hi = "काम को लेकर अत्यधिक कर्तव्यनिष्ठा और आराम करने पर अपराधबोध।",
                    gu = "કામ પ્રત્યે અતિશય વળગણ અને આરામ કરતી વખતે ગુનાહિત લાગણી."
                )
            ),
            illustrativeExample = LocalizedString(
                en = "Suresh takes immense pride in his spotless accuracy, thoroughness, and dependability at work. If a colleague submits a report with a single font misalignment, however, Suresh feels intense internal distress and spends his entire evening rewriting it himself. He struggles to relax on weekends because unfinished chores feel like personal failures. He is working on accepting that 'good enough' is healthy, and that flexibility can be just as valuable as perfection.",
                hi = "सुरेश को काम में अपनी बेदाग सटीकता, अनुशासन और विश्वसनीयता पर बहुत गर्व है। लेकिन अगर कोई सहकर्मी थोड़ी भी अलग लिखावट वाली रिपोर्ट देता है, तो सुरेश को अंदर से भारी बेचैनी होती है और वह पूरी शाम उसे खुद ठीक करने में बिता देता है। काम अधूरे होने के अहसास के कारण वह छुट्टियों में भी आराम नहीं कर पाता। वह यह स्वीकार करने का अभ्यास कर रहा है कि हर चीज़ का एकदम सही होना जरूरी नहीं है, और कभी-कभी लचीलापन भी उतना ही कीमती होता है।",
                gu = "સુરેશને કામમાં પોતાની અદ્ભુત ચોકસાઈ, શિસ્ત અને વિશ્વસનીયતા પર ભારે ગર્વ છે. પરંતુ જો કોઈ સાથીદાર રિપોર્ટમાં નાની સરખી પણ ભૂલ રાખે, તો સુરેશને અંદરથી ભારે અસ્વસ્થતા થાય છે અને તે આખી સાંજ પોતે તેને સુધારવામાં વિતાવે છે. અધૂરું કામ હોવાના ડરથી તે રજાઓમાં પણ આરામ કરી શકતો નથી. તે હવે સ્વીકારવાનો પ્રયાસ કરી રહ્યો છે કે બધું હંમેશાં સંપૂર્ણ હોવું જરૂરી નથી, અને ક્યારેક લચીલાપણું પણ એટલું જ મૂલ્યવાન છે."
            ),
            strengthsReframe = LocalizedString(
                en = "Exceptional precision, thoroughness, high ethical standards, reliability, organization.",
                hi = "उत्कृष्ट सटीकता, अनुशासन, उच्च नैतिक मानक, विश्वसनीयता और कर्तव्यपरायणता।",
                gu = "અદ્ભુત ચોકસાઈ, શિસ્ત, ઉચ્ચ નૈતિક મૂલ્યો, વિશ્વસનીયતા અને વ્યવસ્થાશક્તિ."
            ),
            oldTermsBridge = LocalizedString(
                en = "Directly replaces the older diagnosis of 'Obsessive-Compulsive Personality Disorder' (OCPD).",
                hi = "यह पुराने 'ऑब्सेसिव-कंपल्सिव पर्सनालिटी डिसऑर्डर' (OCPD) का आधुनिक रूप है।",
                gu = "આ જૂના 'ઓબ્સેસિવ-કમ્પલ્સિવ પર્સનાલિટી ડિસઓર્ડર' (OCPD) નું આધુનિક વૈજ્ઞાનિક સ્વરૂપ છે."
            )
        ),
        PatternEducationItem(
            domain = TraitDomain.BORDERLINE_PATTERN,
            everydayDescription = LocalizedString(
                en = "Pervasive instability in relationships, identity, and emotions, often with intense fear of abandonment.",
                hi = "रिश्तों, आत्म-छवि और भावनाओं में गहरी अस्थिरता, जिसके साथ अक्सर अकेले छूट जाने का तीव्र डर होता है।",
                gu = "સંબંધો, આત્મ-છબી અને લાગણીઓમાં ઊંડી અસ્થિરતા, જેની સાથે એકલા પડી જવાનો તીવ્ર ડર જોડાયેલ હોય છે."
            ),
            dayToDayLook = listOf(
                LocalizedString(
                    en = "Frantic efforts to avoid real or perceived separation from loved ones.",
                    hi = "अपनों से बिछड़ने या अलग होने के छोटे-से संकेत पर भी भारी बेचैनी।",
                    gu = "સ્વજનોથી વિખૂટા પડવાના સહેજ સંકેત પર પણ ભારે ગભરાટ અને બેચેની."
                ),
                LocalizedString(
                    en = "Relationships swinging between idealization and sudden disappointment.",
                    hi = "रिश्तों में कभी अत्यधिक लगाव तो कभी अचानक भारी मोहभंग।",
                    gu = "સંબંધોમાં ક્યારેક અતિશય આદર તો ક્યારેક અચાનક ભારે નિરાશા."
                ),
                LocalizedString(
                    en = "Chronic inner emptiness, stress-related detachment, or risk of self-injury.",
                    hi = "अंदर लगातार गहरा खालीपन, तनाव में अलगाव, या खुद को नुकसान पहुँचाने का जोखिम।",
                    gu = "અંદર સતત ખાલીપો, તણાવમાં અળગાપણું કે જાતને ઈજા પહોંચાડવાનું જોખમ."
                )
            ),
            illustrativeExample = LocalizedString(
                en = "Neha is a deeply devoted friend with an immense capacity for love and loyalty. But if her partner arrives thirty minutes late without texting, she experiences a wave of agonizing panic, feeling convinced she is completely unloved and about to be abandoned. In that flood of emotional pain, she may send frantic messages or feel like life is unbearable, only to feel profound relief and exhaustion once contact is restored. Through DBT therapy, Neha is learning distress-tolerance skills to navigate these intense storms safely, knowing professional care and trusted helplines are there when feelings become overwhelming.",
                hi = "नेहा एक बेहद निष्ठावान मित्र है जिसमें असीम प्यार और समर्पण की क्षमता है। लेकिन अगर उसका साथी बिना बताए तीस मिनट देर से आता है, तो वह असहनीय घबराहट से घिर जाती है, और उसे लगता है कि कोई उससे प्यार नहीं करता और वह अकेली छोड़ दी जाएगी। इस तीव्र भावनात्मक दर्द में वह व्यथित संदेश भेज सकती है या खुद को असहाय महसूस कर सकती है, और बातचीत होने पर भारी राहत व थकावट महसूस करती है। DBT थेरेपी के माध्यम से, नेहा इन तूफानों को सुरक्षित रूप से संभालना सीख रही है, यह जानते हुए कि संकट के समय पेशेवर डॉक्टर और हेल्पलाइन हमेशा साथ हैं।",
                gu = "નેહા અત્યંત વફાદાર મિત્ર છે જેમાં પ્રેમ અને સ્નેહની અપરંપાર ક્ષમતા છે. પરંતુ જો તેનો સાથીદાર જાણ કર્યા વિના અડધો કલાક મોડો પડે, તો તે અસહ્ય ગભરાટ અનુભવે છે અને તેને લાગે છે કે કોઈ તેને ચાહતું નથી અને તે સાવ એકલી પડી જશે. આ તીવ્ર ભાવનાત્મક દર્દમાં તે વ્યાકુળ મેસેજ મોકલી શકે છે કે અસહાયતા અનુભવી શકે છે, અને વાતચીત થયા પછી ઊંડી રાહત અને થાક અનુભવે છે. DBT થેરાપી દ્વારા, નેહા આ લાગણીશીલ તોફાનોને સલામત રીતે સંભાળતા શીખી રહી છે, એ વિશ્વાસ સાથે કે જરૂર પડ્યે ડૉક્ટરો અને હેલ્પલાઇન હંમેશાં મદદ માટે હાજર છે."
            ),
            strengthsReframe = LocalizedString(
                en = "Deep emotional richness, intense loyalty, profound intuition, capacity for immense growth through DBT.",
                hi = "गहरी भावनात्मक गहराई, सच्चा समर्पण, तीव्र संवेदनशीलता और थेरेपी द्वारा अद्भुत बदलाव की क्षमता।",
                gu = "ઊંડી લાગણીશીલતા, સાચો સ્નેહ, તીવ્ર સંવેદનશીલતા અને થેરાપી દ્વારા અદ્ભુત પરિવર્તનની ક્ષમતા."
            ),
            oldTermsBridge = LocalizedString(
                en = "Retained specifically as an ICD-11 specifier to maintain continuity with proven therapies like DBT.",
                hi = "ICD-11 में इसे विशेष रूप से रखा गया है ताकि DBT जैसी सिद्ध थेरेपी का लाभ मिलता रहे।",
                gu = "ICD-11 માં આને ખાસ સ્પેસિફાયર તરીકે રાખવામાં આવ્યું છે જેથી DBT જેવી સાબિત થેરાપીઓ સુસંગત રહે."
            )
        )
    )

    val mythsVsFacts = listOf(
        Pair(
            LocalizedString(
                "Myth: People with personality difficulties can never change.",
                "मिथक: व्यक्तित्व की कठिनाइयों वाले लोग कभी नहीं बदल सकते।",
                "માન્યતા: વ્યક્તિત્વની મુશ્કેલીઓ ધરાવતી વ્યક્તિઓ ક્યારેય બદલાઈ શકતી નથી."
            ),
            LocalizedString(
                "Fact: Science proves traits naturally soften with age, and targeted therapy like DBT produces lasting recovery.",
                "तथ्य: शोध बताते हैं कि उम्र और सही थेरेपी (जैसे DBT) से व्यक्तित्व के लक्षण स्थिर और शांत हो जाते हैं।",
                "હકીકત: સંશોધન દર્શાવે છે કે યોગ્ય થેરાપી (જેમ કે DBT) અને સમય સાથે લક્ષણો હળવા અને સ્થિર બને છે."
            )
        ),
        Pair(
            LocalizedString(
                "Myth: A personality disorder means someone is simply 'toxic' or 'bad'.",
                "मिथक: व्यक्तित्व विकार का मतलब है कि व्यक्ति बस 'खराब' या 'बुरा' है।",
                "માન્યતા: વ્યક્તિત્વ વિકારનો અર્થ એવો છે કે વ્યક્તિ માત્ર 'ખરાબ' કે દૂષિત છે."
            ),
            LocalizedString(
                "Fact: These are deep vulnerabilities in self-soothing and safety rooted in biology and early trauma.",
                "तथ्य: ये भावना नियंत्रण और सुरक्षा की गहरी कमजोरियाँ हैं, जो अक्सर शुरुआती आघात और जैविक कारणों से जुड़ी होती हैं।",
                "હકીકત: આ લાગણી નિયંત્રણ અને સુરક્ષાની ઊંડી લાચારી છે, જે મોટાભાગે બાળપણના આઘાત અને જૈવિક કારણો સાથે જોડાયેલ હોય છે."
            )
        ),
        Pair(
            LocalizedString(
                "Myth: Medications can cure personality difficulties.",
                "मिथक: दवाएं व्यक्तित्व संबंधी समस्याओं को जड़ से ठीक कर सकती हैं।",
                "માન્યતા: દવાઓ વ્યક્તિત્વની સમસ્યાઓને મૂળમાંથી મટાડી શકે છે."
            ),
            LocalizedString(
                "Fact: Pills cannot teach relationship skills. Medications only ease severe anxiety or mood swings while therapy builds skills.",
                "तथ्य: दवाएं रिश्ते संभालना नहीं सिखा सकतीं। वे केवल तीव्र घबराहट या मूड को संभालती हैं, जबकि थेरेपी नए कौशल सिखाती है।",
                "હકીકત: દવાઓ સંબંધો સાચવતા શીખવી શકતી નથી. દવા માત્ર તીવ્ર ચિંતા કે મૂડ સંભાળે છે, જ્યારે થેરાપી જીવન કૌશલ્ય શીખવે છે."
            )
        )
    )
}
