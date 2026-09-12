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

    // --- Understanding the Causes (Etiology) ---
    val causesSection: List<EducationalSectionItem> = listOf(
        EducationalSectionItem(
            title = LocalizedString("1. Innate Temperament & Biology", "1. जन्मजात स्वभाव और जैविक संवेदनशीलता", "1. જન્મજાત સ્વભાવ અને જૈવિક સંવેદનશીલતા"),
            summary = LocalizedString(
                "Babies are born with different biological nervous system sensitivity levels.",
                "बच्चे तंत्रिका तंत्र की अलग-अलग जन्मजात संवेदनशीलता के साथ पैदा होते हैं।",
                "બાળકો જન્મથી જ અલગ-અલગ જૈવિક સંવેદનશીલતા ધરાવતી નર્વસ સિસ્ટમ સાથે જન્મે છે."
            ),
            details = listOf(
                LocalizedString(
                    "Some individuals naturally inherit a nervous system that reacts faster, fires more intensely, and takes longer to return to baseline calm.",
                    "कुछ लोगों को स्वाभाविक रूप से ऐसा तंत्रिका तंत्र मिलता है जो तेज़ी से सक्रिय होता है, अधिक तीव्रता से प्रतिक्रिया करता है और शांत होने में समय लेता है।",
                    "કેટલાક લોકોને કુદરતી રીતે એવી નર્વસ સિસ્ટમ મળે છે જે ઝડપથી પ્રતિક્રિયા આપે છે અને શાંત થવામાં વધુ સમય લે છે."
                ),
                LocalizedString(
                    "This high biological sensitivity is not a flaw or a choice; it is simply innate biological wiring, similar to being born with sensitive hearing or skin.",
                    "यह संवेदनशीलता कोई दोष या पसंद नहीं है; यह जन्मजात बनावट है, ठीक वैसे ही जैसे किसी की सुनने या त्वचा की संवेदनशीलता अधिक होती है।",
                    "આ ઉચ્ચ સંવેદનશીલતા કોઈ ખામી કે પસંદગી નથી; તે જન્મજાત કુદરતી રચના છે, જેમ કે કોઈની સાંભળવાની કે ચામડીની વધુ સંવેદનશીલતા."
                )
            ),
            takeaway = LocalizedString(
                "Biology sets the initial emotional thermostat, but environment shapes how that thermostat is managed.",
                "जीव विज्ञान भावनात्मक संवेदनशीलता तय करता है, लेकिन माहौल सिखाता है कि उसे कैसे संभालना है।",
                "બાયોલોજી લાગણીશીલ સંવેદનશીલતા નક્કી કરે છે, પરંતુ આસપાસનું વાતાવરણ તેને સંભાળતા શીખવે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("2. Early Environment & Attachment", "2. प्रारंभिक परिवेश और भावनात्मक सुरक्षा", "2. પ્રારંભિક વાતાવરણ અને ભાવનાત્મક સુરક્ષા"),
            summary = LocalizedString(
                "How our early emotional expressions were responded to by caregivers.",
                "बचपन में हमारी भावनाओं पर माता-पिता या संरक्षकों की क्या प्रतिक्रिया रही।",
                "બાળપણમાં આપણી લાગણીઓ પર માતાપિતા કે સંભાળકર્તાઓની શું પ્રતિક્રિયા રહી."
            ),
            details = listOf(
                LocalizedString(
                    "When a highly sensitive child grows up in an invalidating environment — where feelings are regularly dismissed as 'drama' or punished — the child learns that their internal experiences cannot be trusted.",
                    "जब संवेदनशील बच्चा ऐसे माहौल में बड़ा होता है जहाँ उसकी भावनाओं को 'नाटक' कहकर नकारा या डांटा जाए, तो वह सीखता है कि अपनी भावनाओं पर भरोसा नहीं किया जा सकता।",
                    "જ્યારે સંવેદનશીલ બાળક એવા વાતાવરણમાં મોટું થાય જ્યાં તેની લાગણીઓને 'નાટક' ગણીને નકારી દેવાય, ત્યારે તે પોતાની લાગણીઓ પર શંકા કરતા શીખે છે."
                ),
                LocalizedString(
                    "This is not about blaming parents — parenting a temperamentally vulnerable child is intensely difficult. It reflects a mismatch between child sensitivity and environmental attunement.",
                    "यह माता-पिता को दोष देने के लिए नहीं है; संवेदनशील बच्चे का पालन-पोषण बेहद चुनौतीपूर्ण होता है। यह बच्चे की ज़रूरत और माहौल के बीच असंतुलન दर्शाता है।",
                    "આ માતાપિતાને દોષ દેવા માટે નથી; સંવેદનશીલ બાળકનો ઉછેર ખૂબ અઘરો હોય છે. આ બાળકની જરૂરિયાત અને વાતાવરણ વચ્ચેના અસંતુલનને દર્શાવે છે."
                )
            ),
            takeaway = LocalizedString(
                "Safe, predictable validation helps sensitive nervous systems learn healthy self-soothing over time.",
                "सुरक्षित और समझदारी भरा माहौल संवेदनशील तंत्रिका तंत्र को खुद को शांत करना सीखने में मदद करता है।",
                "સુરક્ષિત અને સમજણભર્યું વાતાવરણ સંવેદનશીલ મગજને પોતાની જાતને શાંત રાખતા શીખવામાં મદદ કરે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("3. Life Experiences & Chronic Stress", "3. जीवन के अनुभव और गंभीर तनाव", "3. જીવનના અનુભવો અને ગંભીર તણાવ"),
            summary = LocalizedString(
                "Adversity, bullying, sudden loss, or trauma throughout adolescence and young adulthood.",
                "किशोरावस्था या युवावस्था में लगातार तनाव, बदमाशी (bullying), अचानक नुकसान या मानसिक आघात।",
                "કિશોરાવસ્થા કે યુવાવસ્થામાં સતત તણાવ, ગુંડાગીરી (બુલીઇંગ), સ્વજનની ખોટ કે માનસિક આઘાત."
            ),
            details = listOf(
                LocalizedString(
                    "Chronic relational stress or repeated betrayal forces the developing brain to adopt emergency defense strategies — such as hypervigilance, emotional shutdown, or intense control.",
                    "लगातार तनाव या विश्वासघात बढ़ते हुए मस्तिष्क को सुरक्षा कवच अपनाने पर मजबूर करता है — जैसे अत्यधिक सतर्क रहना, पूरी तरह अलग-थलग होना, या हर चीज़ नियंत्रित करना।",
                    "સતત તણાવ કે વિશ્વાસઘાત મગજને કટોકટીના સંરક્ષણાત્મક રસ્તા અપનાવવા મજબૂર કરે છે — જેમ કે અતિશય સાવધાન રહેવું, સાવ અળગા થઈ જવું, કે વધુ પડતું નિયંત્રણ રાખવું."
                ),
                LocalizedString(
                    "These protective survival habits help someone endure painful environments, but become rigid and disruptive once the immediate threat is gone.",
                    "ये आदतें कठिन समय में रक्षा करती हैं, लेकिन बाद में जब खतरा टल जाता है, तब भी यह कठोर व्यवहार सामान्य रिश्तों में अड़चन पैदा करता है।",
                    "આ આદતો મુશ્કેલ સમયમાં રક્ષણ આપે છે, પરંતુ સંજોગો બદલાયા પછી પણ સામાન્ય સંબંધોમાં મુશ્કેલી ઊભી કરે છે."
                )
            ),
            takeaway = LocalizedString(
                "Rigid personality patterns often begin as understandable survival adaptations to difficult circumstances.",
                "कठोर व्यक्तित्व पैटर्न अक्सर कठिन परिस्थितियों में खुद को बचाने के लिए शुरू की गई सुरक्षा प्रणालियाँ होती हैं।",
                "જક્કી વ્યક્તિત્વના વલણો મોટાભાગે મુશ્કેલ પરિસ્થિતિઓમાં જાતને બચાવવા માટે શરૂ થયેલા રક્ષણાત્મક ઉપાયો હોય છે."
            )
        )
    )

    // --- Does It Get Better? Prognosis and Hope ---
    val prognosisSection: List<EducationalSectionItem> = listOf(
        EducationalSectionItem(
            title = LocalizedString("Natural Softening Over Adulthood", "उम्र के साथ स्वाभाविक स्थिरता", "ઉંમર સાથે કુદરતી સ્થિરતા"),
            summary = LocalizedString(
                "Long-term psychiatric studies confirm that personality traits naturally mellow over time.",
                "दीर्घकालिक चिकित्सा शोध पुष्टि करते हैं कि व्यक्तित्व की तीव्रता समय के साथ स्वाभाविक रूप से कम होती है।",
                "લાંબા ગાળાના તબીબી સંશોધનો પુષ્ટિ કરે છે કે વ્યક્તિત્વની તીવ્રતા ઉંમર સાથે કુદરતી રીતે હળવી બને છે."
            ),
            details = listOf(
                LocalizedString(
                    "Longitudinal follow-up studies spanning 10 to 25 years reveal that intense emotional turbulence and impulsive behaviors reach their peak in late teens/twenties and soften substantially in subsequent decades.",
                    "10 से 25 वर्षों के शोध दर्शाते हैं कि तीव्र भावनात्मक तूफ़ान और अनियंत्रित आवेग बीस के दशक में चरम पर होते हैं और आगे चलकर धीरे-धीरे शांत होने लगते हैं।",
                    "10 થી 25 વર્ષના સંશોધનો દર્શાવે છે કે તીવ્ર લાગણીશીલ તોફાન અને આવેગશીલતા વીસીના દાયકામાં ટોચ પર હોય છે અને સમય સાથે ધીમે ધીમે શાંત થાય છે."
                ),
                LocalizedString(
                    "As people accumulate life experience and establish predictable routines, biological reactivity naturally stabilizes.",
                    "जैसे-जैसे जीवन का अनुभव बढ़ता है और दिनचर्या व्यवस्थित होती है, जैविक संवेदनशीलता स्वाभाविक रूप से स्थिर होने लगती है।",
                    "જેમ જેમ જીવનનો અનુભવ વધે છે અને દિનચર્યા વ્યવસ્થિત બને છે, તેમ જૈવિક સંવેદનશીલતા કુદરતી રીતે સ્થિર થવા લાગે છે."
                )
            ),
            takeaway = LocalizedString(
                "You are not trapped in today's emotional intensity forever; time and maturity work in your favor.",
                "आप आज की भावनात्मक तीव्रता में हमेशा के लिए फंसे नहीं हैं; समय और अनुभव आपके पक्ष में काम करते हैं।",
                "તમે આજની લાગણીશીલ તીવ્રતામાં કાયમ માટે અટવાયેલા નથી; સમય અને પરિપક્વતા તમારા પક્ષમાં કામ કરે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("Neuroplasticity & Active Skill Learning", "मस्तिष्क का लचीलापन और नए कौशल", "મગજની લવચીકતા અને નવા કૌશલ્યો"),
            summary = LocalizedString(
                "The adult brain can rewire neural circuits through repeated practice of emotional regulation.",
                "वयस्क मस्तिष्क भी लगातार अभ्यास से नई आदतें और भावनात्मक संतुलन की प्रक्रियाएं सीख सकता है।",
                "પુખ્ત મગજ પણ સતત અભ્યાસ દ્વારા નવી આદતો અને લાગણીશીલ સંતુલન શીખી શકે છે."
            ),
            details = listOf(
                LocalizedString(
                    "Evidence-based treatments like Dialectical Behavior Therapy (DBT) and Schema Therapy do not try to 'cure' personality; they train concrete skills for tolerating distress and checking automatic thoughts.",
                    "डीबीटी (DBT) और स्कीमा थेरेपी जैसे वैज्ञानिक उपचार व्यक्तित्व को 'मिटाने' की कोशिश नहीं करते; वे संकट सहन करने और विचारों को संतुलित करने के व्यावहारिक कौशल सिखाते हैं।",
                    "DBT અને સ્કીમા થેરાપી જેવા વૈજ્ઞાનિક ઉપચારો વ્યક્તિત્વને 'બદલી' નાખવાનો પ્રયાસ નથી કરતા; તેઓ તણાવ સહન કરવાના અને વિચારોને સંતુલિત કરવાના વ્યવહારુ કૌશલ્યો શીખવે છે."
                ),
                LocalizedString(
                    "With consistent practice, the brain builds stronger inhibitory neural pathways from the prefrontal cortex to the amygdala, making self-calming easier and more automatic.",
                    "लगातार अभ्यास से मस्तिष्क का तार्किक हिस्सा (Prefrontal Cortex) भावनात्मक हिस्से (Amygdala) को शांत करने में अधिक सक्षम बन जाता है।",
                    "નિયમિત અભ્યાસથી મગજનો વિચારશીલ ભાગ લાગણીશીલ ભાગને શાંત કરવામાં વધુ સક્ષમ બને છે, જેથી જાતને શાંત કરવી સરળ બને છે."
                )
            ),
            takeaway = LocalizedString(
                "Emotional stability is a learned skill set, not an unchangeable character fate.",
                "भावनात्मक स्थिरता एक सीखा जा सकने वाला कौशल है, कोई अटल भाग्य नहीं।",
                "લાગણીશીલ સ્થિરતા એ શીખી શકાય તેવું કૌશલ્ય છે, કોઈ ન બદલાય તેવું નસીબ નથી."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("What Realistic Recovery Looks Like", "वास्तविक सुधार का सही अर्थ", "વાસ્તવિક સુધારાનો સાચો અર્થ"),
            summary = LocalizedString(
                "Recovery does not mean becoming emotionless; it means regaining control over your life.",
                "सुधार का मतलब भावनाहीन होना नहीं, बल्कि अपने जीवन और प्राथमिकताओं पर दोबारा नियंत्रण पाना है।",
                "સુધારાનો અર્થ લાગણી વગરના થવું નથી, પરંતુ તમારા જીવન અને નિર્ણયો પર ફરીથી નિયંત્રણ મેળવવું છે."
            ),
            details = listOf(
                LocalizedString(
                    "Clinical recovery means emotional storms become shorter, less destructive, and occur less frequently. You recover your center in minutes or hours instead of days.",
                    "सच्चे सुधार का अर्थ है कि भावनात्मक तूफ़ान छोटे, कम नुकसानदेह और कम बार होते हैं। आप दिनों के बजाय कुछ घंटों या मिनटों में संभल जाते हैं।",
                    "સાચા સુધારાનો અર્થ એ છે કે લાગણીશીલ તોફાનો ટૂંકા, ઓછા નુકસાનકારક અને ઓછી વાર બને છે. તમે દિવસોને બદલે કલાકો કે મિનિટોમાં સ્વસ્થ થઈ જાઓ છો."
                ),
                LocalizedString(
                    "People with deep sensitivities often discover that their underlying traits — deep empathy, passion, perceptiveness, and meticulousness — become extraordinary strengths once managed.",
                    "संवेदनशील लोग पाते हैं कि उनके मूल गुण — गहरी सहानुभूति, निष्ठा, संवेदनशीलता और बारीकी पर ध्यान — संतुलन सीखने के बाद उनकी सबसे बड़ी ताकत बन जाते हैं।",
                    "સંવેદનશીલ લોકો અનુભવે છે કે તેમના મૂળ ગુણો — ઊંડી સહાનુભૂતિ, ઉત્સાહ અને ઝીણવટભરી દ્રષ્ટિ — સંતુલન શીખ્યા પછી તેમની સૌથી મોટી શક્તિ બની જાય છે."
                )
            ),
            takeaway = LocalizedString(
                "A deeply meaningful, stable life with rich connections is entirely achievable.",
                "गहरे रिश्तों और संतुष्टि से भरा एक स्थिर, अर्थपूर्ण जीवन पूरी तरह संभव है।",
                "ઊંડા સંબંધો અને સંતોષથી ભરેલું સ્થિર, અર્થપૂર્ણ જીવન સંપૂર્ણપણે શક્ય છે."
            )
        )
    )

    // --- What Else Often Comes Along With This (Comorbidity) ---
    val comorbiditySection: List<EducationalSectionItem> = listOf(
        EducationalSectionItem(
            title = LocalizedString("Depression & Mood Episodes", "अवसाद (Depression) और मूड विकार", "ડિપ્રેશન અને મૂડની સમસ્યાઓ"),
            summary = LocalizedString(
                "Chronic emotional struggle frequently triggers secondary episodes of low mood.",
                "लगातार भावनात्मक तनाव अक्सर उदासी और हताशा के गंभीर दौर को जन्म देता है।",
                "સતત લાગણીશીલ ખેંચતાણ ઘણીવાર ઊંડી ઉદાસી અને હતાશાના તબક્કા ઊભા કરે છે."
            ),
            details = listOf(
                LocalizedString(
                    "When daily relationships feel painful or exhaustion sets in from hypervigilance, the brain's reward centers tire, leading to loss of interest, fatigue, and hopelessness.",
                    "जब रिश्ते बोझिल लगने लगते हैं या लगातार सतर्क रहने से मानसिक थकावट आती है, तो मस्तिष्क में रुचि की कमी, निराशा और गहरी उदासी छा जाती है।",
                    "જ્યારે સંબંધો બોજારૂપ લાગે કે સતત સાવચેત રહેવાથી થાક લાગે, ત્યારે મગજમાં રસ ઓછો થવો, નિરાશા અને ઊંડી ઉદાસી ઘર કરી જાય છે."
                ),
                LocalizedString(
                    "Treating the depressive episode through medical care or therapy often provides the mental breathing room needed to work on underlying personality patterns.",
                    "दवा या परामर्श से अवसाद को नियंत्रित करने से वह मानसिक राहत मिलती है जो व्यक्तित्व की आदतों पर काम करने के लिए ज़रूरी है।",
                    "દવા કે કાઉન્સેલિંગ દ્વારા ડિપ્રેશનને નિયંત્રિત કરવાથી તે માનસિક શાંતિ મળે છે જે વ્યક્તિત્વના વલણો પર કામ કરવા જરૂરી છે."
                )
            ),
            takeaway = LocalizedString(
                "Depression is often the visible symptom that brings people to seek help for deeper vulnerabilities.",
                "अवसाद अक्सर वह संकेत होता है जो लोगों को अपनी गहरी समस्याओं के लिए सहायता लेने की प्रेरणा देता है।",
                "ડિપ્રેશન ઘણીવાર એ પહેલો સંકેત હોય છે જે લોકોને પોતાની ઊંડી સમસ્યાઓ માટે મદદ લેવા પ્રેરિત કરે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("Anxiety & Panic Disorders", "चिंता (Anxiety) और घबराहट", "ચિંતા (Anxiety) અને ગભરાટ"),
            summary = LocalizedString(
                "An over-reactive threat system generates frequent physical panic and racing worry.",
                "अति-संवेदनशील सुरक्षा प्रणाली बार-बार शारीरिक घबराहट और तेज चिंता पैदा करती है।",
                "અતિ-સંવેદનશીલ ચેતાતંત્ર વારંવાર શારીરિક ગભરાટ અને તીવ્ર ચિંતા પેદા કરે છે."
            ),
            details = listOf(
                LocalizedString(
                    "Social anxiety, fear of abandonment, and panic attacks frequently co-occur with Negative Affectivity and Borderline patterns.",
                    "सामाजिक चिंता, अकेले छूट जाने का खौफ और पैनिक अटैक अक्सर भावनात्मक अस्थिरता के साथ जुड़े होते हैं।",
                    "સામાજિક ચિંતા, એકલા પડી જવાનો ભય અને ગભરાટના હુમલા (પેનિક એટેક) ઘણીવાર લાગણીશીલ અસ્થિરતા સાથે સંકળાયેલા હોય છે."
                ),
                LocalizedString(
                    "Somatic anxiety symptoms (rapid heartbeat, knot in the stomach, shortness of breath) reflect nervous system mobilization rather than genuine external danger.",
                    "शारीरिक लक्षण (तेज़ धड़कन, पेट में मरोड़, सांस फूलना) तंत्रिका तंत्र की तात्कालिक हलचल दर्शाते हैं, कोई वास्तविक खतरा नहीं।",
                    "શારીરિક લક્ષણો (ધબકારા વધવા, પેટમાં ગભરાટ, શ્વાસ ચઢવો) નર્વસ સિસ્ટમની તત્કાલ પ્રતિક્રિયા દર્શાવે છે, કોઈ વાસ્તવિક જોખમ નથી."
                )
            ),
            takeaway = LocalizedString(
                "Calming physical physiology through paced breathing and grounding creates safety for psychological healing.",
                "धीमी सांस और शरीर को स्थिर करने के व्यायाम मानसिक शांति के लिए सुरक्षित आधार तैयार करते हैं।",
                "ધીમા શ્વાસ અને માઇન્ડફુલનેસ દ્વારા શરીરને શાંત કરવું માનસિક સ્વાસ્થ્ય માટે ઉત્તમ પાયો પૂરો પાડે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("Substance Use & Impulsive Coping", "नशा एवं अस्वस्थ आदतें", "નશો અને આવેગજન્ય આદતો"),
            summary = LocalizedString(
                "Using alcohol, nicotine, or impulsive behaviors as a temporary chemical escape from pain.",
                "तीव्र भावनात्मक दर्द से बचने के लिए शराब, धूम्रपान या जोखिम भरे कार्यों का अस्थायी सहारा लेना।",
                "તીવ્ર ભાવનાત્મક દર્દથી બચવા માટે દારૂ, ધૂમ્રપાન કે જોખમી પગલાંઓનો અસ્થાયી સહારો લેવો."
            ),
            details = listOf(
                LocalizedString(
                    "When internal agony becomes unbearable and healthy self-soothing skills are missing, substances offer quick artificial relief. However, they ultimately amplify emotional dysregulation.",
                    "जब आंतरिक बेचैनी असहनीय हो जाती है और खुद को शांत करने के तरीके नहीं होते, तो नशा तुरंत राहत देता है। लेकिन आगे चलकर यह भावनात्मक अस्थिरता को कई गुना बढ़ा देता है।",
                    "જ્યારે અંદરની બેચેની અસહ્ય બને અને શાંત થવાના રસ્તા ન હોય, ત્યારે નશો તત્કાલ રાહત આપે છે. પરંતુ આગળ જતાં તે માનસિક અસ્થિરતાને ઘણી વધારી દે છે."
                ),
                LocalizedString(
                    "Addressing emotional dysregulation directly reduces the overwhelming urge to rely on numbing substances or destructive self-harm.",
                    "भावनात्मक संतुलन के सीधे उपाय सीखने से नशे या खुद को नुकसान पहुँचाने की तीव्र इच्छा स्वाभाविक रूप से कम हो जाती है।",
                    "લાગણીઓને સંતુલિત કરતા શીખવાથી નશો કરવા કે જાતને નુકસાન પહોંચાડવાની તીવ્ર ઈચ્છા આપોઆપ ઓછી થઈ જાય છે."
                )
            ),
            takeaway = LocalizedString(
                "Impulsive coping is an attempt to solve intense suffering; replacing it with effective emotional tools brings lasting safety.",
                "अस्वस्थ आदतें दर्द को दबाने का प्रयास होती हैं; उनके स्थान पर सही मानसिक कौशल सीखने से स्थायी सुरक्षा मिलती है।",
                "આવેગજન્ય આદતો દર્દને દબાવવાનો પ્રયાસ છે; તેની જગ્યાએ સાચા માનસિક કૌશલ્યો શીખવાથી કાયમી રાહત મળે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("Trauma & Complex PTSD", "मानसिक आघात (Trauma) और PTSD", "માનસિક આઘાત (Trauma) અને PTSD"),
            summary = LocalizedString(
                "Unresolved traumatic experiences continually trigger survival fight-or-flight responses.",
                "अतीत के अनसुलझे आघात वर्तमान में भी लगातार खतरे और असुरक्षा का अहसास कराते रहते हैं।",
                "ભૂતકાળના અણઉકેલાયેલા આઘાતો વર્તમાનમાં પણ સતત જોખમ અને અસુરક્ષાનો અહેસાસ કરાવ્યા કરે છે."
            ),
            details = listOf(
                LocalizedString(
                    "Many individuals with pronounced Borderline or Negative Affectivity patterns have histories of interpersonal neglect, trauma, or chaotic family environments.",
                    "गंभीर भावनात्मक अस्थिरता वाले कई लोगों के इतिहास में पारिवारिक उपेक्षा, मानसिक आघात या अशांत माहौल रहा होता है।",
                    "ગંભીર લાગણીશીલ અસ્થિરતા ધરાવતા ઘણા લોકોના ભૂતકાળમાં પારિવારિક ઉપેક્ષા, માનસિક આઘાત કે અશાંત વાતાવરણ રહેલું હોય છે."
                ),
                LocalizedString(
                    "Trauma-informed psychotherapies help process past memories so the brain stops mistaking current neutral situations for past threats.",
                    "ट्रॉमा-विशिष्ट थेरेपी पुरानी कड़वी यादों को सुलझाने में मदद करती है, जिससे दिमाग वर्तमान की सामान्य बातों को पुराना खतरा न समझे।",
                    "ટ્રોમા-આધારિત થેરાપી જૂની પીડાદાયક યાદોને થાળે પાડવામાં મદદ કરે છે, જેથી મગજ વર્તમાનની સામાન્ય બાબતોને ભૂતકાળનું જોખમ ન માને."
                )
            ),
            takeaway = LocalizedString(
                "Healing trauma resolves the alarm system at its root, allowing genuine peace in relationships.",
                "आघात से उबरना खतरे की झूठी घंटी को जड़ से शांत करता है और रिश्तों में वास्तविक सुकून लाता है।",
                "આઘાતમાંથી મુક્તિ મેળવવી એ મગજની ખોટી ચેતવણીઓને મૂળમાંથી શાંત કરે છે અને સંબંધોમાં સાચો વિશ્વાસ લાવે છે."
            )
        )
    )

    // --- Glossary of Key Concepts (Alphabetical, Plain Language) ---
    val glossaryItems: List<GlossaryItem> = listOf(
        GlossaryItem(
            term = LocalizedString("Anankastia", "अनंकास्टिया (Anankastia)", "અનંકાસ્ટિયા (Anankastia)"),
            plainDefinition = LocalizedString(
                "An intense focus on perfection, rigid rules, controlling details, and strict order.",
                "पूर्णतावाद, सख्त नियमों, हर बारीकी को नियंत्रित करने और अटूट व्यवस्था पर अत्यधिक जोर।",
                "સંપૂર્ણતાવાદ, કડક નિયમો, દરેક વિગતને નિયંત્રિત કરવા અને ચોક્કસ વ્યવસ્થા પર અતિશય આગ્રહ."
            ),
            whyItMatters = LocalizedString(
                "Knowing this helps you notice when high standards switch from helpful excellence to exhausting rigidity.",
                "यह समझने से पता चलता है कि कब उच्च मानक उपयोगी उत्कृष्टता से बदलकर थकाऊ कठोरता बन जाते हैं।",
                "આ સમજવાથી ખ્યાલ આવે છે કે ક્યારે ઊંચા ધોરણો ઉપયોગી કાર્યક્ષમતામાંથી થકવી નાખતી જક્કી મનોવૃત્તિ બની જાય છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Borderline Pattern Specifier", "सीमावर्ती पैटर्न (Borderline Pattern)", "બોર્ડરલાઇન પેટર્ન (Borderline Pattern)"),
            plainDefinition = LocalizedString(
                "An ICD-11 qualifier describing rapid swings in mood, unstable self-image, and intense dread of abandonment.",
                "ICD-11 की एक पहचान जिसमें मूड में तीव्र उतार-चढ़ाव, अस्थिर आत्म-छवि और अकेले छूट जाने का गहरा डर शामिल है।",
                "ICD-11 નું એક લક્ષણ જેમાં મૂડમાં તીવ્ર ફેરફારો, અસ્થિર આત્મ-ઓળખ અને એકલા પડી જવાનો ઊંડો ડર સામેલ છે."
            ),
            whyItMatters = LocalizedString(
                "Recognizing this pattern points toward highly effective targeted therapies like DBT.",
                "इस पैटर्न को पहचानने से DBT जैसी अत्यधिक प्रभावी और केंद्रित थेरेपी की राह मिलती है।",
                "આ પેટર્નને ઓળખવાથી DBT જેવી અત્યંત અસરકારક લક્ષિત સારવાર મેળવવામાં મદદ મળે છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Comorbidity", "सह-रुग्णता (Comorbidity)", "સહ-રોગાવસ્થા (Comorbidity)"),
            plainDefinition = LocalizedString(
                "The presence of two or more mental health conditions occurring together at the same time (e.g., anxiety alongside personality distress).",
                "एक ही समय में दो या अधिक मानसिक स्वास्थ्य समस्याओं का एक साथ होना (जैसे व्यक्तित्व तनाव के साथ चिंता या अवसाद)।",
                "એક જ સમયે બે કે તેથી વધુ માનસિક સ્વાસ્થ્ય સ્થિતિઓનું એકસાથે હોવું (જેમ કે વ્યક્તિત્વ તણાવ સાથે ચિંતા કે ડિપ્રેશન)."
            ),
            whyItMatters = LocalizedString(
                "Treating co-occurring anxiety or depression makes it much easier to build healthy emotional regulation habits.",
                "साथ में मौजूद चिंता या अवसाद का इलाज करने से व्यक्तित्व की आदतों को सुधारना बहुत आसान हो जाता है।",
                "સાથે રહેલી ચિંતા કે ડિપ્રેશનનો ઇલાજ કરવાથી વ્યક્તિત્વની આદતો સુધારવી ઘણી સરળ બને છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Detachment", "अलगाव (Detachment)", "અળગાપણું (Detachment)"),
            plainDefinition = LocalizedString(
                "A tendency to keep emotional distance from others and withdraw from social closeness.",
                "दूसरों से भावनात्मक दूरी बनाए रखने और सामाजिक मेलजोल से खुद को अलग रखने की प्रवृत्ति।",
                "અન્ય લોકોથી ભાવનાત્મક અંતર રાખવા અને સામાજિક નિકટતાથી દૂર રહેવાનું વલણ."
            ),
            whyItMatters = LocalizedString(
                "Helps families realize that solitude is often a self-protection shield rather than cold rejection.",
                "परिवारों को यह समझने में मदद मिलती है कि अकेलापन अक्सर खुद को बचाने की ढाल है, कोई नाराजगी नहीं।",
                "પરિવારોને સમજાય છે કે એકાંત એ મોટાભાગે રક્ષણાત્મક ઢાલ છે, કોઈ નારાજગી કે તિરસ્કાર નથી."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Dialectical Behavior Therapy (DBT)", "द्वंद્વાत्मक व्यवहार थेरेपी (DBT)", "ડાયલેક્ટિકલ બિહેવિયર થેરાપી (DBT)"),
            plainDefinition = LocalizedString(
                "A specialized psychotherapy that teaches mindfulness, distress tolerance, emotion regulation, and interpersonal effectiveness.",
                "एक विशेष मनोवैज्ञानिक चिकित्सा जो माइंडफुलनेस, संकट सहन करने, भावनाएं संभालने और बेहतर बातचीत के कौशल सिखाती है।",
                "એક ખાસ મનોવૈજ્ઞાનિક સારવાર જે માઇન્ડફુલનેસ, તણાવ સહન કરવાની ક્ષમતા, લાગણી નિયંત્રણ અને સંવાદ કૌશલ્યો શીખવે છે."
            ),
            whyItMatters = LocalizedString(
                "It is the gold-standard, scientifically proven treatment for intense emotional volatility and Borderline patterns.",
                "यह तीव्र भावनात्मक तूफानों और बॉर्डरलाइन पैटर्न के लिए सबसे प्रामाणिक एवं वैज्ञानिक उपचार पद्धति है।",
                "તીવ્ર લાગણીશીલ તોફાનો અને બોર્ડરલાઇન પેટર્ન માટે આ સૌથી શ્રેષ્ઠ અને વૈજ્ઞાનિક રીતે સાબિત થયેલ સારવાર છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Dimensional Model", "आयामी मॉडल (Dimensional Model)", "આયામી મોડેલ (Dimensional Model)"),
            plainDefinition = LocalizedString(
                "A scientific view of personality as continuous spectra (like height or blood pressure) rather than rigid all-or-nothing disorder boxes.",
                "व्यक्तित्व को एक पैमाने (जैसे ऊंचाई या रक्तचाप) के रूप में देखने का वैज्ञानिक तरीका, न कि किसी कठोर बीमारी के डिब्बे के रूप में।",
                "વ્યક્તિત્વને એક માપદંડ (જેમ કે ઊંચાઈ કે બ્લડ પ્રેશર) તરીકે જોવાની વૈજ્ઞાનિક રીત, કોઈ જક્કી બીમારીના ખાનામાં પૂરવાને બદલે."
            ),
            whyItMatters = LocalizedString(
                "Removes shame and stigma by recognizing that everyone has these traits to varying degrees.",
                "यह शर्म और कलंक को मिटाता है क्योंकि यह मानता है कि ये सभी गुण हर इंसान में कम या ज्यादा मात्रा में होते हैं।",
                "આ શરમ અને સામાજિક કલંક દૂર કરે છે કારણ કે આ વલણ દરેક વ્યક્તિમાં વધતા-ઓછા પ્રમાણમાં હોય છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Disinhibition", "असंयम / अनियंत्रण (Disinhibition)", "અસંયમ / આવેગશીલતા (Disinhibition)"),
            plainDefinition = LocalizedString(
                "Acting rapidly on sudden urges without thinking through future consequences or delaying gratification.",
                "भविष्य के परिणामों की परवाह किए बिना तात्कालिक इच्छाओं पर तुरंत कदम उठाना और सब्र न रख पाना।",
                "ભવિષ્યના પરિણામોનો વિચાર કર્યા વગર તત્કાલ ઇચ્છાઓ પર વર્તવું અને ધીરજ ન રાખી શકવી."
            ),
            whyItMatters = LocalizedString(
                "Understanding this trait allows individuals to create environment safeguards (like spending limits) to protect themselves.",
                "इसे समझने से लोग अपने इर्द-गिर्द ऐसी व्यवस्थाएँ बना सकते हैं जो उन्हें जल्दबाजी के नुकसान से बचाएँ।",
                "આને સમજવાથી લોકો પોતાની આસપાસ એવી વ્યવસ્થાઓ ગોઠવી શકે છે જે તેમને ઉતાવળિયા નુકસાનથી બચાવે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Dissociality", "असामाजिक प्रवृत्तियाँ (Dissociality)", "અસામાજિક વલણ (Dissociality)"),
            plainDefinition = LocalizedString(
                "A disregard for the feelings, rights, and boundaries of others, often resulting in conflict or manipulative interactions.",
                "दूसरों की भावनाओं, अधिकारों और सीमाओं की अनदेखी, जिससे अक्सर रिश्तों में टकराव या जोड़-तोड़ पैदा होती है।",
                "અન્ય લોકોની લાગણીઓ, હક્કો અને મર્યાદાઓની ઉપેક્ષા, જેનાથી સંબંધોમાં ઘર્ષણ કે સ્વાર્થ સાધવાની વૃત્તિ જન્મે છે."
            ),
            whyItMatters = LocalizedString(
                "Helps establish firm, calm boundaries so relationships stay safe and mutually respectful.",
                "स्पष्ट और शांत सीमाएँ तय करने में मदद मिलती है ताकि रिश्ते सुरक्षित और सम्मानजनक बने रहें।",
                "સ્પષ્ટ અને શાંત મર્યાદાઓ નક્કી કરવામાં મદદ મળે છે જેથી સંબંધો સુરક્ષિત અને પરસ્પર સન્માનજનક રહે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Emotional Dysregulation", "भावनात्मक असंतुलन (Emotional Dysregulation)", "ભાવનાત્મક અસંતુલન (Emotional Dysregulation)"),
            plainDefinition = LocalizedString(
                "Difficulty in soothing or modulating one's emotional state once it is triggered into high distress.",
                "तीव्र गुस्सा, डर या दुख पैदा होने के बाद अपनी मानसिक स्थिति को शांत या नियंत्रित करने में भारी कठिनाई।",
                "તીવ્ર ગુસ્સો, ડર કે ઉદાસી ઊભી થયા પછી પોતાની માનસિક સ્થિતિને શાંત કે સંતુલિત કરવામાં ભારે મુશ્કેલી."
            ),
            whyItMatters = LocalizedString(
                "Clarifies that outbursts are not voluntary misbehavior, but a temporary breakdown in self-soothing ability.",
                "यह स्पष्ट करता है कि गुस्सा कोई जानबूझकर किया गया नाटक नहीं, बल्कि खुद को शांत करने की क्षमता का अस्थायी अभाव है।",
                "આ સ્પષ્ટ કરે છે કે આવેશ એ કોઈ જાણીજોઈને કરેલું ગેરવર્તન નથી, પણ જાતને શાંત કરવાની ક્ષમતાની અસ્થાયી કમી છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Expressed Emotion (EE)", "अभिव्यक्त भावना (Expressed Emotion)", "અભિવ્યક્ત લાગણી (Expressed Emotion)"),
            plainDefinition = LocalizedString(
                "A family communication climate characterized by frequent criticism, hostility, or emotional over-involvement.",
                "पारिवारिक बातचीत का ऐसा माहौल जिसमें बार-बार आलोचना, गुस्सा या अत्यधिक दखलअंदाज़ी शामिल हो।",
                "પારિવારિક વાતચીતનું એવું વાતાવરણ જેમાં વારંવાર ટીકા, ગુસ્સો કે વધુ પડતી દખલગીરી સામેલ હોય."
            ),
            whyItMatters = LocalizedString(
                "Research proves that lowering Expressed Emotion at home dramatically reduces crises and prevents relapses.",
                "शोध साबित करते हैं कि घर में आलोचना कम करने से तनाव घटता है और व्यक्ति जल्दी स्थिर होता है।",
                "સંશોધન સાબિત કરે છે કે ઘરમાં ટીકા અને ગુસ્સો ઘટાડવાથી કટોકટી ઘટે છે અને સ્થિરતા જળવાય છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("ICD-11", "आईसीडी-11 (ICD-11)", "આઈસીડી-11 (ICD-11)"),
            plainDefinition = LocalizedString(
                "The World Health Organization's global clinical standard for classifying mental, behavioral, and neurodevelopmental conditions.",
                "विश्व स्वास्थ्य संगठन (WHO) द्वारा मानसिक और शारीरिक स्वास्थ्य स्थितियों के वर्गीकरण का अंतरराष्ट्रीय मानक।",
                "વિશ્વ સ્વાસ્થ્ય સંસ્થા (WHO) દ્વારા માનસિક અને શારીરિક સ્વાસ્થ્ય સ્થિતિઓના વર્ગીકરણનું વૈશ્વિક ધોરણ."
            ),
            whyItMatters = LocalizedString(
                "It represents modern, stigma-reducing psychiatric medicine that replaced outdated 10-category personality labels.",
                "यह आधुनिक चिकित्सा का प्रतीक है जिसने पुराने, अपमानजनक 10 लेबलों को हटाकर वैज्ञानिक पद्धति अपनाई।",
                "આ આધુનિક તબીબી વિજ્ઞાનનું પ્રતીક છે જેણે જૂના, કલંકરૂપ લેબલોને બદલે વૈજ્ઞાનિક પદ્ધતિ અપનાવી છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Negative Affectivity", "ऋणात्मक भावुकता (Negative Affectivity)", "નકારાત્મક ભાવનાશીલતા (Negative Affectivity)"),
            plainDefinition = LocalizedString(
                "A biological tendency to frequently experience intense negative emotions like anxiety, anger, worry, and sadness.",
                "चिंता, क्रोध, भय और उदासी जैसी तीव्र नकारात्मक भावनाओं को बार-बार और गहरे रूप में अनुभव करने की जैविक प्रवृत्ति।",
                "ચિંતા, ક્રોધ, ડર અને ઉદાસી જેવી તીવ્ર લાગણીઓને વારંવાર અને ઊંડાણપૂર્વક અનુભવવાની જૈવિક વૃત્તિ."
            ),
            whyItMatters = LocalizedString(
                "Helps a person understand their nervous system and seek proactive tools before distress peaks.",
                "व्यक्ति को अपने तंत्रिका तंत्र को समझने और संकट गहराने से पहले सही कदम उठाने में मदद मिलती है।",
                "વ્યક્તિને પોતાની નર્વસ સિસ્ટમ સમજવામાં અને સંકટ વધે તે પહેલાં યોગ્ય પગલાં ભરવામાં મદદ મળે છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Neuroplasticity", "मस्तिष्क का लचीलापन (Neuroplasticity)", "ન્યુરોપ્લાસ્ટીસિટી (Neuroplasticity)"),
            plainDefinition = LocalizedString(
                "The brain's lifelong ability to grow, adapt, and form new neural pathways through experience and practice.",
                "अनुभव और निरंतर अभ्यास के माध्यम से जीवन भर नए न्यूरल रास्ते बनाने और बदलने की मस्तिष्क की जन्मजात क्षमता।",
                "અનુભવ અને સતત અભ્યાસ દ્વારા જીવનભર નવા ચેતાતંતુકીય માર્ગો બનાવવાની અને બદલાવાની મગજની ક્ષમતા."
            ),
            whyItMatters = LocalizedString(
                "Proves scientifically that personality habits can be modified with targeted skills at any age.",
                "यह वैज्ञानिक रूप से साबित करता है कि किसी भी उम्र में सही अभ्यास से सोच और आदતો को बदला जा सकता है।",
                "આ વૈજ્ઞાનિક રીતે સાબિત કરે છે કે કોઈપણ ઉંમરે યોગ્ય અભ્યાસથી વિચારસરણી અને ટેવો બદલી શકાય છે."
            )
        ),
        GlossaryItem(
            term = LocalizedString("Validation", "भावना की पुष्टि / स्वीकार्यता (Validation)", "લાગણીનો સ્વીકાર (Validation)"),
            plainDefinition = LocalizedString(
                "Communicating that someone's internal emotional experience makes sense and is understandable, even if you don't agree with their actions.",
                "यह जताना कि दूसरे व्यक्ति का दर्द या भावना स्वाभाविक और समझने योग्य है, भले ही आप उसके व्यवहार से सहमत न हों।",
                "સામેની વ્યક્તિની પીડા કે લાગણી સમજી શકાય તેવી છે તેવો સ્વીકાર કરવો, ભલે તમે તેના વર્તન સાથે સંમત ન હો."
            ),
            whyItMatters = LocalizedString(
                "It is the single most powerful verbal de-escalation tool for calming emotional storms.",
                "यह भावनात्मक तूफानों को तुरंत शांत करने का सबसे शक्तिशाली बातचीत का तरीका है।",
                "લાગણીશીલ તોફાનોને તત્કાલ શાંત કરવા માટે આ વાતચીતનું સૌથી શક્તિશાળી સાધન છે."
            )
        )
    )

    // --- Expanded FAQ Items ---
    val expandedFaqItems: List<FAQItem> = listOf(
        FAQItem(
            question = LocalizedString(
                en = "What is the difference between everyday moodiness and a personality trait pattern?",
                hi = "रोज़मर्रा के मूड में बदलाव और व्यक्तित्व पैटर्न में क्या अंतर है?",
                gu = "રોજિંદા મૂડમાં ફેરફાર અને વ્યક્તિત્વની પેટર્નમાં શું તફાવત છે?"
            ),
            answer = LocalizedString(
                en = "Everyone has bad days, shifts in mood, or moments of irritation when tired. A personality pattern is pervasive (shows up across work, family, and friendships) and persistent (lasts for years across adulthood rather than coming and going with daily events).",
                hi = "हर किसी का मूड कभी-कभार खराब होता है या थकान में चिड़चिड़ाहट होती है। जबकि व्यक्तित्व पैटर्न व्यापक होता है (यह काम, घर और दोस्तों हर जगह दिखता है) और लंबे समय तक (वर्षों तक) लगातार बना रहता है।",
                gu = "દરેક વ્યક્તિનો મૂડ ક્યારેક ખરાબ થાય છે અથવા થાકને લીધે ચીડ ચઢે છે. જ્યારે વ્યક્તિત્વની પેટર્ન વ્યાપક હોય છે (કામ, ઘર અને મિત્રો દરેક જગ્યાએ દેખાય છે) અને વર્ષો સુધી સતત જળવાઈ રહે છે."
            )
        ),
        FAQItem(
            question = LocalizedString(
                en = "Can someone have traits from more than one domain?",
                hi = "क्या किसी व्यक्ति में एक से अधिक क्षेत्रों के लक्षण हो सकते हैं?",
                gu = "શું કોઈ વ્યક્તિમાં એક કરતાં વધુ ક્ષેત્રોના લક્ષણો હોઈ શકે છે?"
            ),
            answer = LocalizedString(
                en = "Yes, absolutely. In fact, most people have a blend. For example, someone might experience high Negative Affectivity alongside Anankastia (perfectionism as a way to control anxiety), or Negative Affectivity paired with Disinhibition (impulsive reactions to distress).",
                hi = "हाँ, बिल्कुल। वास्तव में, अधिकांश लोगों में इनका मिश्रण होता है। उदाहरण के लिए, किसी में चिंता (Negative Affectivity) के साथ पूर्णतावाद (Anankastia) हो सकता है, या भावनात्मक तनाव के समय अचानक जल्दबाजी करने की आदत (Disinhibition)।",
                gu = "હા, ચોક્કસ. મોટાભાગના લોકોમાં આનું મિશ્રણ હોય છે. જેમ કે, કોઈમાં તીવ્ર લાગણીશીલતા સાથે સંપૂર્ણતાવાદ હોઈ શકે છે, અથવા લાગણીશીલ તણાવ વખતે આવેગમાં નિર્ણયો લેવાની આદત હોઈ શકે છે."
            )
        ),
        FAQItem(
            question = LocalizedString(
                en = "Does reflecting high on a domain mean I have a personality disorder?",
                hi = "क्या किसी क्षेत्र में उच्च स्कोर आने का मतलब है कि मुझे व्यक्तित्व विकार है?",
                gu = "શું કોઈ ક્ષેત્રમાં વધુ સ્કોર આવવાનો અર્થ એ છે કે મને વ્યક્તિત્વ વિકાર છે?"
            ),
            answer = LocalizedString(
                en = "No. A trait domain simply describes a tendency. Under ICD-11, a diagnosis is made only if these patterns cause chronic, significant impairment in self-functioning (identity, goals) or interpersonal relationships across multiple areas of life.",
                hi = "नहीं। यह केवल आपकी एक प्रवृत्ति दर्शाता है। ICD-11 के तहत विकार का निर्णय तभी माना जाता है जब ये आदतें आपके दैनिक जीवन, काम या रिश्तों में गंभीर और निरंतर बाधा पैदा कर रही हों।",
                gu = "ના. આ માત્ર તમારું એક વલણ દર્શાવે છે. ICD-11 મુજબ વિકાર ત્યારે જ ગણાય જ્યારે આ આદતો તમારા આત્મ-સન્માન, કામ કે અંગત સંબંધોમાં ગંભીર અને સતત મુશ્કેલી ઊભી કરતી હોય."
            )
        ),
        FAQItem(
            question = LocalizedString(
                en = "Why does ICD-11 move away from labels like 'narcissist' or 'borderline' as primary boxes?",
                hi = "ICD-11 पुराने लेबलों (जैसे 'नार्सिसिस्ट') को मुख्य श्रेणियों के रूप में क्यों नहीं इस्तेमाल करता?",
                gu = "ICD-11 જૂના લેબલો (જેમ કે 'નાર્સિસિસ્ટ') ને મુખ્ય શ્રેણી તરીકે કેમ નથી વાપરતું?"
            ),
            answer = LocalizedString(
                en = "Traditional labels created heavy stigma and rarely fit real patients, who often met criteria for 3 or 4 disorders simultaneously. Dimensional traits describe each human uniquely, reduce shame, and pinpoint exact therapeutic skills needed.",
                hi = "पुराने लेबल लोगों पर कलंक लगाते थे और असल मरीजों पर सटीक नहीं बैठते थे, क्योंकि एक ही व्यक्ति कई श्रेणियों में फिट हो जाता था। आयामी मॉडल हर व्यक्ति को विशिष्ट रूप से समझता है और सीधे आवश्यक कौशल सिखाने पर ध्यान देता है।",
                gu = "જૂના લેબલો સામાજિક કલંક ઊભું કરતા હતા અને દર્દીઓ પર બંધબેસતા નહોતા. આયામી મોડેલ દરેક વ્યક્તિને અનન્ય રીતે સમજે છે, શરમ દૂર કરે છે અને કયા ચોક્કસ કૌશલ્યો શીખવાની જરૂર છે તે સ્પષ્ટ કરે છે."
            )
        ),
        FAQItem(
            question = LocalizedString(
                en = "Can medication change my personality?",
                hi = "क्या दवाएं मेरे व्यक्तित्व को बदल सकती हैं?",
                gu = "શું દવાઓ મારા વ્યક્તિત્વને બદલી શકે છે?"
            ),
            answer = LocalizedString(
                en = "Medications do not alter core personality traits or teach communication skills. However, psychiatrists can prescribe medications to manage co-occurring conditions like depression, severe anxiety, or impulsive aggression so you have the clarity to engage in therapy.",
                hi = "दवाएं आपके मूल व्यक्तित्व को नहीं बदलतीं और न ही रिश्ते संभालना सिखाती हैं। लेकिन वे साथ में मौजूद गंभीर अवसाद, घबराहट या अनियंत्रित गुस्से को शांत कर सकती हैं, जिससे थेरेपी में सीखना आसान हो जाता है।",
                gu = "દવાઓ તમારા મૂળ વ્યક્તિત્વને બદલતી નથી કે વાતચીતના કૌશલ્યો શીખવતી નથી. પરંતુ તે ગંભીર ડિપ્રેશન, ચિંતા કે ગુસ્સાને શાંત કરી શકે છે, જેથી થેરાપી દ્વારા નવા કૌશલ્યો શીખવા સરળ બને."
            )
        )
    )

    // --- Sources & Further Reading ---
    val sourcesAndReferences: List<Pair<String, String>> = listOf(
        Pair(
            "World Health Organization (WHO) ICD-11",
            "Clinical Descriptions and Diagnostic Guidelines for Personality Disorder and Related Traits (Geneva, 2018/2022)."
        ),
        Pair(
            "National Institute of Mental Health and Neurosciences (NIMHANS)",
            "Clinical Practice Guidelines for the Assessment and Management of Personality Disorders (Bengaluru, India)."
        ),
        Pair(
            "Linehan, Marsha M.",
            "Cognitive-Behavioral Treatment of Borderline Personality Disorder & DBT Skills Training Manual (Guilford Press)."
        ),
        Pair(
            "Tyrer, P., Mulder, R., et al.",
            "The reclassification of personality disorders in ICD-11: test of fit in clinical practice. The Lancet Psychiatry."
        ),
        Pair(
            "Leff, J., & Vaughn, C.",
            "Expressed Emotion in Families: Its Significance for Mental Illness. Guilford Press."
        )
    )
}

