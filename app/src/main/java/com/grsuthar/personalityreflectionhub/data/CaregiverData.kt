package com.grsuthar.personalityreflectionhub.data

object CaregiverData {

    val caregiverGuides: List<CaregiverPatternGuide> = listOf(
        CaregiverPatternGuide(
            domain = TraitDomain.NEGATIVE_AFFECTIVITY,
            whatYouSee = listOf(
                LocalizedString(
                    en = "Sudden, tearful overwhelm, intense anger, or recurring catastrophic worry over small changes.",
                    hi = "अचानक रो पड़ना, अत्यधिक गुस्सा या छोटे बदलावों पर भी गंभीर संकट की आशंका।",
                    gu = "અચાનક રડી પડવું, ભારે ગુસ્સો અથવા નાના ફેરફારો પર પણ મોટી આપત્તિનો ડર."
                ),
                LocalizedString(
                    en = "Demanding constant reassurance that you are not angry with them or planning to leave.",
                    hi = "बार-बार यह भरोसा मांगना कि आप उनसे नाराज नहीं हैं या उन्हें छोड़ेंगे नहीं।",
                    gu = "વારંવાર ખાતરી માંગવી કે તમે તેમનાથી નારાજ નથી કે તેમને છોડી નહીં દો."
                )
            ),
            whatUnderneath = listOf(
                LocalizedString(
                    en = "Severe internal emotional burning; their nervous system reacts as if under immediate threat.",
                    hi = "अंदर अत्यधिक भावनात्मक तड़प; उनका तंत्रिका तंत्र किसी बड़े खतरे की तरह प्रतिक्रिया करता है।",
                    gu = "અંદર અતિશય ભાવનાત્મક પીડા; તેમની નર્વસ સિસ્ટમ જાણે કોઈ મોટા જોખમમાં હોય તેમ પ્રતિક્રિયા આપે છે."
                ),
                LocalizedString(
                    en = "Deep fear of unworthiness and dread of being abandoned alone.",
                    hi = "खुद को अयोग्य समझने का गहरा अहसास और अकेले छूट जाने का भारी डर।",
                    gu = "પોતાને અયોગ્ય માનવાની ઊંડી લાગણી અને એકલા પડી જવાનો ભારે ભય."
                )
            ),
            whatHelps = listOf(
                LocalizedString(
                    en = "Acknowledge the pain first before giving advice ('I can see how upsetting this is for you').",
                    hi = "सलाह देने से पहले उनके दर्द को स्वीकारें ('मैं समझ सकता हूँ कि यह आपके लिए कितना दुखद है')।",
                    gu = "સલાહ આપતા પહેલાં તેમની પીડાને સ્વીકારો ('હું સમજી શકું છું કે આ તમારા માટે કેટલું દુઃખદ છે')."
                ),
                LocalizedString(
                    en = "Keep your voice calm, steady, and lower in volume than theirs.",
                    hi = "अपनी आवाज़ शांत, स्थिर और उनके मुकाबले धीमी रखें।",
                    gu = "તમારો અવાજ શાંત, સ્થિર અને તેમના અવાજ કરતાં ધીમો રાખો."
                )
            ),
            whatBackfires = listOf(
                LocalizedString(
                    en = "Saying 'You are overreacting' or 'Stop making drama' — this escalates panic.",
                    hi = "'तुम बात का बतंगड़ बना रहे हो' कहना — इससे घबराहट और बढ़ जाती है।",
                    gu = "'તમે વાતનું વતેસર કરો છો' કહેવું — આનાથી ગભરાટ અને રોષ વધે છે."
                ),
                LocalizedString(
                    en = "Getting into an argument about who is logically right during high distress.",
                    hi = "तीव्र संकट के समय तर्क-वितर्क में उलझना कि कौन सही है।",
                    gu = "તીવ્ર આવેગ સમયે કોણ સાચું છે તેની દલીલોમાં ઉતરવું."
                )
            ),
            whenToWorry = listOf(
                LocalizedString(
                    en = "Talk of ending life, giving away possessions, or self-harm gestures.",
                    hi = "जीवन समाप्त करने की बातें, चीजें बाँटना, या खुद को चोट पहुँचाना।",
                    gu = "જીવન ટૂંકાવવાની વાતો, ચીજો વહેંચી દેવી કે જાતને નુકસાન પહોંચાડવું."
                )
            ),
            illustrativeExample = PsychoeducationData.traitDomainDetails.first { it.domain == TraitDomain.NEGATIVE_AFFECTIVITY }.illustrativeExample
        ),
        CaregiverPatternGuide(
            domain = TraitDomain.DETACHMENT,
            whatYouSee = listOf(
                LocalizedString(
                    en = "Extended withdrawal, silence, closed doors, answering only with one-word responses.",
                    hi = "लंबे समय तक दूरी, चुप्पी, बंद कमरे, और केवल एक-दो शब्दों में जवाब देना।",
                    gu = "લાંબા સમય સુધી અળગા રહેવું, મૌન, બંધ રૂમ અને ફક્ત એક-બે શબ્દોમાં જવાબો આપવા."
                ),
                LocalizedString(
                    en = "Apparent indifference to family celebrations, warmth, or achievements.",
                    hi = "पारिवारिक आयोजनों, स्नेह या उपलब्धियों के प्रति पूरी उदासीनता।",
                    gu = "પારિવારિક પ્રસંગો, સ્નેહ કે સિદ્ધિઓ પ્રત્યે સંપૂર્ણ ઉદાસીનતા."
                )
            ),
            whatUnderneath = listOf(
                LocalizedString(
                    en = "Social closeness feels exhausting and overwhelming, like a threat to autonomy.",
                    hi = "सामाजिक निकटता अत्यधिक थकाऊ और असहनीय लगती है, मानो स्वतंत्रता छिन रही हो।",
                    gu = "સામાજિક નિકટતા અતિશય થકવી નાખનારી અને સ્વતંત્રતા પર જોખમ જેવી લાગે છે."
                ),
                LocalizedString(
                    en = "Solitude is not punishment; it is their primary self-soothing shield.",
                    hi = "अकेलापन कोई सज़ा नहीं, बल्कि खुद को शांत रखने की उनकी मुख्य ढाल है।",
                    gu = "એકાંત એ કોઈ સજા નથી, પરંતુ પોતાની જાતને શાંત રાખવાની તેમની મુખ્ય ઢાલ છે."
                )
            ),
            whatHelps = listOf(
                LocalizedString(
                    en = "Give generous physical space without taking withdrawal personally.",
                    hi = "उनकी दूरी को व्यक्तिगत दिल पर लिए बिना उन्हें पर्याप्त जगह (space) दें।",
                    gu = "તેમની દૂરીને અંગત રીતે મન પર લીધા વગર તેમને પૂરતો સ્પેસ આપો."
                ),
                LocalizedString(
                    en = "Connect through parallel, low-demand activities (walks, cooking, watching a show).",
                    hi = "कम बातचीत वाली गतिविधियों के जरिए साथ रहें (जैसे टहलना, शांत टीवी देखना)।",
                    gu = "ઓછી વાતચીતવાળી પ્રવૃત્તિઓ દ્વારા સાથે રહો (જેમ કે ચાલવું, શાંતિથી શો જોવો)."
                )
            ),
            whatBackfires = listOf(
                LocalizedString(
                    en = "Forcing emotional confessions or guilt-tripping ('Don't you love this family?').",
                    hi = "भावनाएं उगलवाने के लिए दबाव डालना या ताने मारना ('क्या तुम्हें परिवार से प्यार नहीं?').",
                    gu = "લાગણીઓ વ્યક્ત કરવા દબાણ કરવું કે મહેણાં મારવા ('શું તમને પરિવારની કદર નથી?')."
                ),
                LocalizedString(
                    en = "Ambushing them with surprise crowded family gatherings.",
                    hi = "अचानक बिना बताए लोगों से भरी महफिलों में उन्हें ले जाना।",
                    gu = "અચાનક જણાવ્યા વગર ભીડભાડવાળા મેળાવડાઓમાં તેમને લઈ જવા."
                )
            ),
            whenToWorry = listOf(
                LocalizedString(
                    en = "Total cessation of eating, neglecting hygiene, or complete non-communication for weeks.",
                    hi = "खाना-पीना पूरी तरह छोड़ देना, सफाई की अनदेखी, या हफ्तों तक बिल्कुल बात न करना।",
                    gu = "ખાવા-પીવાનું સાવ છોડી દેવું, સ્વચ્છતાની ઉપેક્ષા કે અઠવાડિયાઓ સુધી સાવ સંપર્ક કાપી નાખવો."
                )
            ),
            illustrativeExample = PsychoeducationData.traitDomainDetails.first { it.domain == TraitDomain.DETACHMENT }.illustrativeExample
        ),
        CaregiverPatternGuide(
            domain = TraitDomain.DISSOCIALITY,
            whatYouSee = listOf(
                LocalizedString(
                    en = "Dismissive remarks, blaming everyone else for mistakes, breaking agreed family rules.",
                    hi = "दूसरों को नीचा दिखाना, हर गलती का दोष अपनों पर मढ़ना, और पारिवारिक नियम तोड़ना।",
                    gu = "અન્યને નીચા ગણવા, દરેક ભૂલનો દોષ બીજા પર નાખવો અને પારિવારિક નિયમો તોડવા."
                ),
                LocalizedString(
                    en = "Financial exploitation, deceit, or hostility when challenged on fairness.",
                    hi = "आर्थिक फायदा उठाना, झूठ बोलना, या हिसाब मांगने पर आक्रामक हो जाना।",
                    gu = "આર્થિક ફાયદો ઉઠાવવો, જૂઠું બોલવું અથવા હિસાબ માંગવા પર આક્રમક થઈ જવું."
                )
            ),
            whatUnderneath = listOf(
                LocalizedString(
                    en = "Deep belief that the world is dog-eat-dog and showing vulnerability invites harm.",
                    hi = "यह गहरा विश्वास कि दुनिया स्वार्थी है और कमजोरी दिखाने पर लोग फायदा उठाएंगे।",
                    gu = "એવો ઊંડો અહેસાસ કે દુનિયા સ્વાર્થી છે અને નરમાશ બતાવવાથી લોકો નુકસાન પહોંચાડશે."
                ),
                LocalizedString(
                    en = "Low natural capacity for affective empathy (feeling what another person feels).",
                    hi = "दूसरों का दर्द महसूस करने की प्राकृतिक क्षमता का कम होना।",
                    gu = "બીજાનું દર્દ અનુભવવાની સ્વાભાવિક સંવેદનશીલતા ઓછી હોવી."
                )
            ),
            whatHelps = listOf(
                LocalizedString(
                    en = "Set firm, practical boundaries backed by immediate, consistent consequences.",
                    hi = "स्पष्ट और व्यावहारिक सीमाएं तय करें और उनका सख्ती से पालन सुनिश्चित करें।",
                    gu = "સ્પષ્ટ અને વ્યવહારુ મર્યાદાઓ નક્કી કરો અને તેનું દૃઢતાપૂર્વક પાલન કરાવો."
                ),
                LocalizedString(
                    en = "Appeal to their own direct self-interest rather than asking for moral remorse.",
                    hi = "भावुक उपदेश देने के बजाय यह समझाएं कि सहयोग करने में उनका क्या निजी फायदा है।",
                    gu = "ભાવુક ભાષણ આપવા કરતાં એ સમજાવો કે નિયમ પાળવામાં તેમનો પોતાનો શું સીધો ફાયદો છે."
                )
            ),
            whatBackfires = listOf(
                LocalizedString(
                    en = "Bailing them out repeatedly from financial or legal trouble without accountability.",
                    hi = "बिना किसी जवाबदेही के उन्हें बार-बार आर्थिक या कानूनी संकट से बचाना।",
                    gu = "કોઈ પણ જવાબદારી વગર તેમને વારંવાર આર્થિક કે કાયદાકીય મુશ્કેલીમાંથી બચાવતા રહેવું."
                ),
                LocalizedString(
                    en = "Shouting moral lectures or crying to evoke guilt.",
                    hi = "शर्मिंदा करने के लिए रोना या नैतिकता के लंबे भाषण देना।",
                    gu = "શરમાવવા માટે રડવું કે નૈતિકતાના લાંબા ઉપદેશો આપવા."
                )
            ),
            whenToWorry = listOf(
                LocalizedString(
                    en = "Physical aggression, threats of violence to family members, or illegal activities.",
                    hi = "शारीरिक हमला, परिवार वालों को हिंसा की धमकी, या गैर-कानूनी गतिविधियाँ।",
                    gu = "શારીરિક હુમલો, પરિવારના સભ્યોને હિંસાની ધમકી કે ગેરકાયદેસર પ્રવૃત્તિઓ."
                )
            ),
            illustrativeExample = PsychoeducationData.traitDomainDetails.first { it.domain == TraitDomain.DISSOCIALITY }.illustrativeExample
        ),
        CaregiverPatternGuide(
            domain = TraitDomain.DISINHIBITION,
            whatYouSee = listOf(
                LocalizedString(
                    en = "Reckless spending, sudden risky trips, dangerous driving, substance use, or abandoned jobs.",
                    hi = "अंधाधुंध खर्च, बिना सोचे यात्राएं, खतरनाक ड्राइविंग, नशा, या अचानक काम छोड़ना।",
                    gu = "અંધાધૂંધ ખર્ચ, અચાનક જોખમી પ્રવાસો, જોખમી ડ્રાઇવિંગ, નશો કે અચાનક નોકરી છોડી દેવી."
                ),
                LocalizedString(
                    en = "Chaotic daily schedules and broken promises made with sincere intentions.",
                    hi = "अव्यवस्थित दिनचर्या और सच्चे इरादे से किए गए वादों का बार-बार टूटना।",
                    gu = "અસ્તવ્યસ્ત દિનચર્યા અને સાચા દિલથી કરેલા વચનોનું વારંવાર તૂટવું."
                )
            ),
            whatUnderneath = listOf(
                LocalizedString(
                    en = "Difficulty holding future consequences in active awareness against immediate urges.",
                    hi = "तात्कालिक तलब के सामने भविष्य के नुकसान को ध्यान में रखने में असमर्थता।",
                    gu = "તાત્કાલિક આવેગ સામે ભવિષ્યના ગંભીર પરિણામોને ધ્યાનમાં રાખવાની અસમર્થતા."
                ),
                LocalizedString(
                    en = "Sincere remorse often follows, but the impulse-control circuitry remains weak.",
                    hi = "बाद में सच्चा पछतावा होता है, लेकिन आवेग रोकने की क्षमता कमजोर रहती है।",
                    gu = "પાછળથી સાચો પસ્તાવો થાય છે, પરંતુ આવેગ પર કાબૂ રાખવાની ક્ષમતા નબળી હોય છે."
                )
            ),
            whatHelps = listOf(
                LocalizedString(
                    en = "Help build external structures: auto-debit bills, locked savings, clear schedules.",
                    hi = "बाहरी व्यवस्थाएं बनाएं: जैसे ऑटो-पे बिल, सुरक्षित बचत और स्पष्ट दिनचर्या।",
                    gu = "બાહ્ય વ્યવસ્થાઓ ગોઠવો: ઓટો-પે બિલ, સુરક્ષિત બચત ખાતા અને સ્પષ્ટ દિનચર્યા."
                ),
                LocalizedString(
                    en = "Reward small milestones of restraint immediately with warm appreciation.",
                    hi = "संयम और योजना के छोटे-छोटे प्रयासों की भी तुरंत खुलकर सराहना करें।",
                    gu = "સંયમ અને આયોજનના નાના-નાના પ્રયાસોની પણ તાત્કાલિક દિલથી પ્રશંસા કરો."
                )
            ),
            whatBackfires = listOf(
                LocalizedString(
                    en = "Leaving large amounts of unsupervised cash or credit accessible.",
                    hi = "बिना निगरानी के बड़ी नकदी या क्रेडिट कार्ड खुला छोड़ देना।",
                    gu = "કોઈ દેખરેખ વગર મોટી રકમ કે ક્રેડિટ કાર્ડ ખુલ્લા મૂકી રાખવા."
                ),
                LocalizedString(
                    en = "Assuming they broke a promise out of malice or deliberate disrespect.",
                    hi = "यह मान लेना कि उन्होंने जानबूझकर या अपमान करने के लिए वादा तोड़ा है।",
                    gu = "એવું માની લેવું કે તેમણે અપમાન કરવા કે જાણીજોઈને વચન તોડ્યું છે."
                )
            ),
            whenToWorry = listOf(
                LocalizedString(
                    en = "Rapid accumulation of unpayable debts, intoxication while driving, or severe bingeing.",
                    hi = "असहनीय कर्ज में डूबना, नशे की हालत में गाड़ी चलाना, या अत्यधिक नशा।",
                    gu = "દેવામાં ડૂબી જવું, નશાની હાલતમાં વાહન ચલાવવું કે ગંભીર નશો કરવો."
                )
            ),
            illustrativeExample = PsychoeducationData.traitDomainDetails.first { it.domain == TraitDomain.DISINHIBITION }.illustrativeExample
        ),
        CaregiverPatternGuide(
            domain = TraitDomain.ANANKASTIA,
            whatYouSee = listOf(
                LocalizedString(
                    en = "Severe anger over minor misplacements, rewriting others' work, inability to rest.",
                    hi = "चीजें इधर-उधर होने पर भारी गुस्सा, दूसरों के काम में नुक्स निकालना, आराम न कर पाना।",
                    gu = "વસ્તુઓ આડીઅવળી થવા પર ભારે ગુસ્સો, બીજાના કામમાં ખામી કાઢવી, આરામ ન કરી શકવો."
                ),
                LocalizedString(
                    en = "Rigid adherence to moral codes, budgets, or hygiene beyond practical necessity.",
                    hi = "नियमों, बजट या साफ-सफाई को लेकर जरूरत से ज्यादा अड़ियल रवैया।",
                    gu = "નિયમો, બજેટ કે સ્વચ્છતા બાબતે જરૂરિયાત કરતાં વધુ જક્કી વલણ."
                )
            ),
            whatUnderneath = listOf(
                LocalizedString(
                    en = "Tremendous underlying dread of chaos, mistake-making, or severe moral failure.",
                    hi = "गलती होने, अव्यवस्था फैलने या किसी बड़ी चूक का गहरा आंतरिक भय।",
                    gu = "ભૂલ થવાનો, અંધાધૂંધી ફેલાવાનો કે મોટી ક્ષતિ થવાનો ઊંડો આંતરિક ડર."
                ),
                LocalizedString(
                    en = "Controlling the outside world is their only method to calm internal anxiety.",
                    hi = "बाहरी दुनिया को नियंत्रित करना ही उनके लिए आंतरिक घबराहट को शांत करने का एकमात्र तरीका है।",
                    gu = "બાહ્ય દુનિયા પર કાબૂ રાખવો એ જ તેમના માટે આંતરિક ગભરાટ શાંત કરવાનો એકમાત્ર રસ્તો છે."
                )
            ),
            whatHelps = listOf(
                LocalizedString(
                    en = "Provide predictability, give advance notice before schedule changes, respect their order.",
                    hi = "दिनचर्या में बदलाव की पहले से सूचना दें और व्यवस्था के प्रति उनके सम्मान को समझें।",
                    gu = "દિનચર્યામાં ફેરફારની અગાઉથી જાણ કરો અને વ્યવસ્થા પ્રત્યેના તેમના આદરને સમજો."
                ),
                LocalizedString(
                    en = "Encourage relaxing activities that have no scoring or perfection metric.",
                    hi = "ऐसी हल्की गतिविधियों को बढ़ावा दें जिनमें कोई सही या गलत का पैमाना न हो।",
                    gu = "એવી હળવી પ્રવૃત્તિઓને પ્રોત્સાહન આપો જેમાં ભૂલ કે પરફેક્શનનું કોઈ માપદંડ ન હોય."
                )
            ),
            whatBackfires = listOf(
                LocalizedString(
                    en = "Mocking their neatness as 'crazy' or intentionally making a mess to tease them.",
                    hi = "उनकी सफाई का मज़ाक उड़ाना या चिढ़ाने के लिए जानबूझकर गंदगी फैलाना।",
                    gu = "તેમની ચોકસાઈની મજાક ઉડાવવી કે ચીડવવા માટે જાણીજોઈને વસ્તુઓ અસ્તવ્યસ્ત કરવી."
                ),
                LocalizedString(
                    en = "Entering a power struggle over minor household procedures.",
                    hi = "घर के छोटे-मोटे तरीकों को लेकर अहं की लड़ाई में उलझना।",
                    gu = "ઘરની નાની-મોટી બાબતોને લઈને અહંકારના સંઘર્ષમાં ઉતરવું."
                )
            ),
            whenToWorry = listOf(
                LocalizedString(
                    en = "Extreme sleep deprivation due to overwork, or starvation due to rigid rituals.",
                    hi = "काम के दबाव में नींद पूरी तरह उड़ जाना, या नियमों के चलते भोजन छोड़ना।",
                    gu = "કામના બોજ હેઠળ ઊંઘ સાવ ગાયબ થઈ જવી કે કડક નિયમોને લીધે ભૂખ્યા રહેવું."
                )
            ),
            illustrativeExample = PsychoeducationData.traitDomainDetails.first { it.domain == TraitDomain.ANANKASTIA }.illustrativeExample
        ),
        CaregiverPatternGuide(
            domain = TraitDomain.BORDERLINE_PATTERN,
            whatYouSee = listOf(
                LocalizedString(
                    en = "Intense panic over minor delays in replying, accusing you of not caring, sudden rage.",
                    hi = "संदेश का देर से जवाब मिलने पर घबराहट, प्यार न करने के आरोप, और अचानक तेज गुस्सा।",
                    gu = "જવાબમાં મોડું થવા પર ગભરાટ, પ્રેમ ન કરવાના આરોપો અને અચાનક ભારે ક્રોધ."
                ),
                LocalizedString(
                    en = "Shifts between treating you as their only savior and viewing you as their enemy.",
                    hi = "कभी आपको अपना एकमात्र सहारा मानना तो कभी अचानक सबसे बड़ा दुश्मन समझ लेना।",
                    gu = "ક્યારેક તમને પોતાના એકમાત્ર તારણહાર ગણવા તો ક્યારેક અચાનક દુશ્મન સમજી લેવા."
                )
            ),
            whatUnderneath = listOf(
                LocalizedString(
                    en = "Emotional third-degree burns: feeling feelings ten times more acutely than average.",
                    hi = "अत्यधिक भावनात्मक संवेदनशीलता: औसत व्यक्ति से कहीं अधिक तीव्र दर्द महसूस होना।",
                    gu = "અતિશય ભાવનાત્મક સંવેદનશીલતા: સામાન્ય વ્યક્તિ કરતાં ઘણી વધારે તીવ્ર પીડા અનુભવવી."
                ),
                LocalizedString(
                    en = "Terror of being unlovable and abandoned forever in a void.",
                    hi = "यह भयानक डर कि वे प्यार के काबिल नहीं हैं और हमेशा के लिए अकेले छूट जाएंगे।",
                    gu = "એવો ભયાનક ડર કે તેઓ સ્નેહને પાત્ર નથી અને હંમેશ માટે શૂન્યાવકાશમાં એકલા રહી જશે."
                )
            ),
            whatHelps = listOf(
                LocalizedString(
                    en = "Validate the underlying emotion first ('I hear you feel hurt and scared right now').",
                    hi = "पहले उनकी भावना को स्वीकारें ('मैं समझता हूँ कि आप इस समय बहुत दुखी और डरे हुए हैं')।",
                    gu = "પહેલાં તેમની લાગણીને સ્વીકારો ('હું સમજું છું કે તમે આ સમયે ખૂબ દુઃખી અને ડરેલા છો')."
                ),
                LocalizedString(
                    en = "Be an emotional anchor: calm, predictable, and refusing to match their screaming volume.",
                    hi = "एक शांत लंगर की तरह बनें: स्थिर रहें और उनके गुस्से के जवाब में चिल्लाएं नहीं।",
                    gu = "એક શાંત લંગર જેવા બનો: સ્થિર રહો અને તેમના ક્રોધ સામે ચીસાચીસ ન કરો."
                )
            ),
            whatBackfires = listOf(
                LocalizedString(
                    en = "Threatening to leave or hang up abruptly during an emotional storm.",
                    hi = "भावनात्मक तूफान के दौरान अचानक फोन काट देना या छोड़कर चले जाने की धमकी देना।",
                    gu = "ભાવનાત્મક તોફાન સમયે અચાનક ફોન કાપી નાખવો કે છોડીને ચાલ્યા જવાની ધમકી આપવી."
                ),
                LocalizedString(
                    en = "Invalidating their experience by saying 'You are exaggerating as usual'.",
                    hi = "'तुम हमेशा की तरह नाटक कर रहे हो' कहकर उनकी बात को खारिज करना।",
                    gu = "'તમે હંમેશાં નાટક કરો છો' કહીને તેમની લાગણીને નકારી કાઢવી."
                )
            ),
            whenToWorry = listOf(
                LocalizedString(
                    en = "Any explicit mention of suicide, self-cutting, hoarding pills, or farewell texts.",
                    hi = "आत्महत्या की सीधी बात, खुद को काटना, दवाएं जमा करना, या अलविदा संदेश भेजना।",
                    gu = "આત્મહત્યાનો સીધો ઉલ્લેખ, જાતને ઈજા પહોંચાડવી, દવાઓ ભેગી કરવી કે વિદાયના સંદેશા મોકલવા."
                )
            ),
            illustrativeExample = PsychoeducationData.traitDomainDetails.first { it.domain == TraitDomain.BORDERLINE_PATTERN }.illustrativeExample
        )
    )

    val boundaryScripts = listOf(
        BoundaryScriptItem(
            title = LocalizedString("Late-Night Panicked Calls", "देर रात घबराहट भरे कॉल", "મોડી રાત્રે ગભરાટભર્યા કૉલ"),
            scenario = LocalizedString(
                "Your loved one calls repeatedly after midnight demanding hours of emotional venting.",
                "आपके प्रियजन आधी रात के बाद बार-बार कॉल करके घंटों बात करने का दबाव बनाते हैं।",
                "તમારા સ્વજન મધ્યરાત્રિ પછી વારંવાર કૉલ કરીને કલાકો સુધી વાત કરવાનું દબાણ કરે છે."
            ),
            script = LocalizedString(
                "\"I love you and care deeply about you. Right now it is 1 AM, and I need to sleep to function tomorrow. I will call you tomorrow morning at 9 AM so we can talk properly with a clear mind.\"",
                "\"मैं आपसे बहुत प्यार करता हूँ। अभी रात का 1 बज रहा है और काम के लिए मुझे सोना होगा। मैं कल सुबह 9 बजे आपको कॉल करूँगा ताकि हम शांत मन से बात कर सकें।\"",
                "\"હું તમને ખૂબ પ્રેમ કરું છું. અત્યારે રાતના 1 વાગ્યા છે અને કાલે કામ માટે મારે ઊંઘવું જરૂરી છે. હું આવતીકાલે સવારે 9 વાગ્યે તમને કૉલ કરીશ જેથી આપણે શાંતિથી વાત કરી શકીએ.\""
            ),
            whyItWorks = LocalizedString(
                "Reassures connection first, states a firm sleep limit, and offers a specific dependable reconnect time.",
                "पहले प्यार का भरोसा देता है, सोने की स्पष्ट सीमा रखता है, और बात करने का निश्चित समय देता है।",
                "પહેલાં સ્નેહની ખાતરી આપે છે, ઊંઘની સ્પષ્ટ મર્યાદા રાખે છે અને ફરી વાત કરવાનો ચોક્કસ સમય આપે છે."
            )
        ),
        BoundaryScriptItem(
            title = LocalizedString("Verbal Yelling or Insults", "चीखना या अपमानजनक बातें", "ચીસાચીસ કે અપમાનજનક શબ્દો"),
            scenario = LocalizedString(
                "A disagreement escalates into shouting, swearing, or personal insults.",
                "कोई छोटी बहस अचानक चिल्लाने, अपशब्द कहने या अपमान करने में बदल जाती है।",
                "કોઈ નાની ચર્ચા અચાનક બૂમાબૂમ, અપશબ્દો કે અપમાનજનક વાતોમાં ફેરવાઈ જાય છે."
            ),
            script = LocalizedString(
                "\"I want to hear what you are experiencing, but I cannot communicate while being shouted at. I am going to step out into the other room for 20 minutes so our nervous systems can settle down. I will be back then.\"",
                "\"मैं आपकी बात सुनना चाहता हूँ, लेकिन चिल्लाने पर मैं बात नहीं कर सकता। मैं 20 मिनट के लिए दूसरे कमरे में जा रहा हूँ ताकि हम दोनों शांत हो सकें। मैं 20 मिनट बाद आऊंगा।\"",
                "\"હું તમારી વાત સાંભળવા માંગું છું, પરંતુ બૂમો પાડવા પર હું વાત નહીં કરી શકું. હું 20 મિનિટ માટે બીજા રૂમમાં જાઉં છું જેથી આપણું મગજ શાંત થાય. હું 20 મિનિટ પછી પાછો આવીશ.\""
            ),
            whyItWorks = LocalizedString(
                "Does not lecture or insult back. Removes the audience, defines a clear pause duration, and promises return.",
                "पलटकर बहस नहीं करता। माहौल से हटता है, समय तय करता है, और वापस आने का भरोसा देता है।",
                "સામે દલીલ કે અપમાન કરતું નથી. સ્થળ છોડે છે, સમય નક્કી કરે છે અને પાછા આવવાની ખાતરી આપે છે."
            )
        ),
        BoundaryScriptItem(
            title = LocalizedString("Guilt-Tripping & 'You Never Help'", "दोषारोपण और 'तुम कभी मदद नहीं करते'", "દોષારોપણ અને 'તમે ક્યારેય મદદ નથી કરતા'"),
            scenario = LocalizedString(
                "Accusing you of being selfish because you cannot drop work to solve their immediate crisis.",
                "आपको स्वार्थी ठहराना क्योंकि आप अपना काम छोड़कर तुरंत उनकी समस्या हल नहीं कर पा रहे।",
                "તમને સ્વાર્થી ગણાવવા કારણ કે તમે તમારું કામ છોડીને તાત્કાલિક તેમની મુશ્કેલી ઉકેલી નથી શકતા."
            ),
            script = LocalizedString(
                "\"I hear that you are feeling completely alone with this problem right now. I cannot drop my work today, but I am ready to sit down with you for 30 minutes this evening at 7 PM to brainstorm steps.\"",
                "\"मैं समझता हूँ कि आप इस समय बहुत अकेला महसूस कर रहे हैं। आज मैं काम नहीं छोड़ सकता, लेकिन शाम 7 बजे आपके साथ 30 मिनट बैठकर समाधान खोजने को तैयार हूँ।\"",
                "\"હું સમજી શકું છું કે તમે અત્યારે ખૂબ એકલતા અનુભવી રહ્યા છો. આજે હું કામ નથી છોડી શકતો, પરંતુ સાંજે 7 વાગ્યે તમારી સાથે 30 મિનિટ બેસીને રસ્તો શોધવા તૈયાર છું.\""
            ),
            whyItWorks = LocalizedString(
                "Validates their feeling of isolation without submitting to immediate guilt or boundary invasion.",
                "उनकी भावना को समझता है, लेकिन बिना अपराधबोध के अपनी कार्य-सीमा बनाए रखता है।",
                "તેમની લાગણી સ્વીકારે છે, પરંતુ અપરાધભાવ વગર પોતાની કાર્યમર્યાદા જાળવી રાખે છે."
            )
        )
    )

    val assertiveScript4Steps = listOf(
        Pair(
            LocalizedString("1. Observation (Neutral Fact)", "1. अवलोकन (तटस्थ तथ्य)", "1. અવલોકન (તટસ્થ હકીકત)"),
            LocalizedString(
                "State what happened objectively without judgment. Example: 'When you raised your voice and slammed the door...'",
                "बिना किसी आरोप के केवल तथ्य कहें। जैसे: 'जब आपने तेज आवाज़ में बात की और दरवाजा पटका...'",
                "કોઈ પણ આક્ષેપ વગર માત્ર હકીકત કહો. જેમ કે: 'જ્યારે તમે ઊંચા અવાજે વાત કરી અને બારણું પછાડ્યું...'"
            )
        ),
        Pair(
            LocalizedString("2. Feeling (I-Statement)", "2. भावना ('मैं' से शुरू करें)", "2. લાગણી ('હું' થી શરૂ કરો)"),
            LocalizedString(
                "Share your personal emotional state. Example: '...I felt overwhelmed and scared.'",
                "अपनी भावना साझा करें। जैसे: '...मुझे बहुत घबराहट और डर महसूस हुआ।'",
                "તમારી ભાવના વ્યક્ત કરો. જેમ કે: '...મને ખૂબ ગભરાટ અને ડર લાગ્યો.'"
            )
        ),
        Pair(
            LocalizedString("3. Need (Shared Value)", "3. आवश्यकता (साझा जरूरत)", "3. જરૂરિયાત (સામાન્ય મૂલ્ય)"),
            LocalizedString(
                "Explain the need. Example: '...Because I need safety and calm to listen to you properly.'",
                "अपनी जरूरत बताएं। जैसे: '...क्योंकि आपकी बात ध्यान से सुनने के लिए मुझे शांति की जरूरत है।'",
                "તમારી જરૂરિયાત સમજાવો. જેમ કે: '...કારણ કે તમારી વાત ધ્યાનથી સાંભળવા માટે મને શાંતિની જરૂર છે.'"
            )
        ),
        Pair(
            LocalizedString("4. Request (Concrete & Doable)", "4. अनुरोध (स्पष्ट और व्यावहारिक)", "4. વિનંતી (સ્પષ્ટ અને વ્યવહારુ)"),
            LocalizedString(
                "Make a specific request. Example: '...Could we take a 10-minute tea break and speak in a gentle tone?'",
                "स्पष्ट निवेदन करें। जैसे: '...क्या हम 10 मिनट चाय पीकर शांत आवाज़ में बात कर सकते हैं?'",
                "ચોક્કસ વિનંતી કરો. જેમ કે: '...શું આપણે 10 મિનિટ ચા પીને શાંત અવાજે વાત કરી શકીએ?'"
            )
        )
    )

    val faqItems = listOf(
        FAQItem(
            question = LocalizedString(
                en = "Is this my fault? Did bad parenting or family stress cause this?",
                hi = "क्या यह मेरी गलती है? क्या हमारी परवरिश या तनाव के कारण ऐसा हुआ?",
                gu = "શું આ મારી ભૂલ છે? શું આપણો ઉછેર કે તણાવ આનું કારણ છે?"
            ),
            answer = LocalizedString(
                en = "No. Complex personality vulnerabilities arise from an interplay of genetic sensitivity, brain wiring, and environmental stresses. Blaming yourself only creates guilt that drains your energy to support them.",
                hi = "नहीं। व्यक्तित्व की जटिलताएँ आनुवंशिक संवेदनशीलता, मस्तिष्क की बनावट और तनाव के मेल से पैदा होती हैं। खुद को दोष देने से केवल अपराधबोध बढ़ता है और आपकी ऊर्जा नष्ट होती है।",
                gu = "ના. વ્યક્તિત્વની જટિલતાઓ વારસાગત સંવેદનશીલતા, મગજની રચના અને તણાવના મિશ્રણથી ઊભી થાય છે. જાતને દોષ દેવાથી માત્ર અપરાધભાવ વધે છે અને તમારી શક્તિ વેડફાય છે."
            )
        ),
        FAQItem(
            question = LocalizedString(
                en = "Will they ever change, or are they stuck like this forever?",
                hi = "क्या वे कभी बदलेंगे, या हमेशा ऐसे ही रहेंगे?",
                gu = "શું તેઓ ક્યારેય બદલાશે, કે પછી કાયમ આવા જ રહેશે?"
            ),
            answer = LocalizedString(
                en = "People can and do experience significant positive change. Longitudinal psychiatric studies show that personality traits naturally soften with age, and evidence-based psychotherapy (like DBT and Schema Therapy) teaches durable emotional regulation skills.",
                hi = "लोग निश्चित रूप से बदल सकते हैं और उनमें गहरा सुधार आता है। चिकित्सा शोध बताते हैं कि उम्र के साथ लक्षण शांत होते हैं, और सही थेरेपी (जैसे DBT) से लोग भावनाएं संभालना सीख जाते हैं।",
                gu = "લોકોમાં ચોક્કસ મોટો સુધારો આવી શકે છે. તબીબી સંશોધનો દર્શાવે છે કે ઉંમર સાથે લક્ષણો હળવા બને છે, અને યોગ્ય થેરાપી (જેમ કે DBT) થી લોકો લાગણીઓ સંભાળતા શીખી જાય છે."
            )
        ),
        FAQItem(
            question = LocalizedString(
                en = "Should I force them to see a psychiatrist?",
                hi = "क्या मुझे उन्हें जबरदस्ती मनोचिकित्सक के पास ले जाना चाहिए?",
                gu = "શું મારે તેમને જબરદસ્તી સાયકિયાટ્રિસ્ટ પાસે લઈ જવા જોઈએ?"
            ),
            answer = LocalizedString(
                en = "Unless there is immediate danger of harm to self or others, forcing therapy rarely works. Instead, frame professional care around relieving their pain (e.g. 'You seem so exhausted from anxiety lately; would you be open to talking with a specialist to get some relief?').",
                hi = "जब तक खुद को या किसी को तात्कालिक खतरे की स्थिति न हो, ज़बरदस्ती काम नहीं करती। इसके बजाय उनके तनाव को कम करने की बात करें (जैसे: 'आप तनाव से बहुत थके लगते हैं, क्या किसी विशेषज्ञ से बात करके राहत पाना चाहेंगे?').",
                gu = "જ્યાં સુધી તાત્કાલિક જોખમની સ્થિતિ ન હોય, ત્યાં સુધી બળજબરી કામ કરતી નથી. તેના બદલે તેમની મુશ્કેલી હળવી કરવાની વાત કરો (જેમ કે: 'તમે તણાવથી ખૂબ થાકેલા લાગો છો, શું રાહત મેળવવા નિષ્ણાત સાથે વાત કરશો?')."
            )
        ),
        FAQItem(
            question = LocalizedString(
                en = "What is the real difference between a 'difficult personality' and a personality disorder?",
                hi = "'मुश्किल व्यक्तित्व' और व्यक्तित्व विकार में वास्तविक अंतर क्या है?",
                gu = "'અઘરા વ્યક્તિત્વ' અને વ્યક્તિત્વ વિકાર વચ્ચે વાસ્તવિક તફાવત શું છે?"
            ),
            answer = LocalizedString(
                en = "Severity and flexibility. Someone with a 'difficult personality' can usually adapt when circumstances demand it (at work, in public). In an ICD-11 Personality Disorder, the patterns are pervasive across all contexts, inflexible, and cause chronic suffering or severe functional impairment.",
                hi = "गंभीरता और लचीलापन। 'मुश्किल व्यक्तित्व' वाला व्यक्ति जरूरत पड़ने पर खुद को ढाल लेता है। जबकि व्यक्तित्व विकार में ये लक्षण हर जगह, हर रिश्ते में कठोर रूप से बने रहते हैं और गंभीर पीड़ा देते हैं।",
                gu = "ગંભીરતા અને લવચીકતા. 'અઘરા વ્યક્તિત્વ'વાળી વ્યક્તિ જરૂર પડ્યે પોતાની જાતને સંભાળી લે છે. જ્યારે વ્યક્તિત્વ વિકારમાં આ લક્ષણો દરેક પરિસ્થિતિમાં જક્કી રહે છે અને ગંભીર પીડા આપે છે."
            )
        )
    )

    // --- Expressed Emotion: What the Evidence Shows Families ---
    val expressedEmotionSection: List<EducationalSectionItem> = listOf(
        EducationalSectionItem(
            title = LocalizedString("What is 'Expressed Emotion' (EE)?", "अभिव्यक्त भावना (Expressed Emotion) क्या है?", "અભિવ્યક્ત લાગણી (Expressed Emotion) શું છે?"),
            summary = LocalizedString(
                "A recognized clinical measure of family emotional atmosphere: criticism, hostility, and over-involvement.",
                "पारिवारिक माहौल का एक चिकित्सकीय पैमाना: लगातार आलोचना, कटुता और अत्यधिक भावनात्मक दखल।",
                "પારિવારિક વાતાવરણનું એક તબીબી માપદંડ: સતત ટીકા, કડવાશ અને અતિશય ભાવનાત્મક દખલગીરી."
            ),
            details = listOf(
                LocalizedString(
                    "High Expressed Emotion (High EE) consists of three patterns: (1) Critical remarks targeting the person's character, (2) Hostile rejection ('you ruin everything'), and (3) Emotional Over-Involvement (smothering, dramatic worry, hyper-policing their every move).",
                    "उच्च अभिव्यक्त भावना (High EE) में तीन बातें शामिल होती हैं: (1) चरित्र पर चोट करने वाली आलोचना, (2) कड़वाहट ('तुम सब बर्बाद कर देते हो'), और (3) अत्यधिक दखलअंदाजी (हर पल नजर रखना, अति-चिंता दिखाना)।",
                    "ઉચ્ચ અભિવ્યક્ત લાગણી (High EE) માં ત્રણ બાબતો સામેલ હોય છે: (1) ચારિત્ર્ય પર આક્ષેપ કરતી ટીકા, (2) કડવાશ ('તમે બધું બગાડી નાખો છો'), અને (3) અતિશય દખલગીરી (દરેક હિલચાલ પર નજર રાખવી, વધુ પડતી ચિંતા કરવી)."
                ),
                LocalizedString(
                    "High EE is usually driven by love, desperation, and caregiver exhaustion — not malice. But to an already sensitive nervous system, it sounds like an unbearable sensory siren.",
                    "यह व्यवहार अक्सर प्रेम, लाचारी और देखभालकर्ता की मानसिक थकावट से पैदा होता है। लेकिन संवेदनशील व्यक्ति के मस्तिष्क को यह असहनीय खतरे के सायरन जैसा लगता है।",
                    "આ વર્તન મોટાભાગે પ્રેમ, લાચારી અને થાકમાંથી જન્મે છે. પરંતુ સંવેદનશીલ વ્યક્તિના મગજ માટે તે અસહ્ય ભયના એલાર્મ જેવું કામ કરે છે."
                )
            ),
            takeaway = LocalizedString(
                "High EE is not a moral failure of parents; it is a cycle of stress that families can learn to de-escalate.",
                "यह परिवार की कोई विफलता नहीं है; यह तनाव का चक्र है जिसे परिवार मिलकर धीमा करना सीख सकते हैं।",
                "આ પરિવારની કોઈ ખામી નથી; આ તણાવનું એક ચક્ર છે જેને કુટુંબ મળીને શાંત કરતા શીખી શકે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("What Decades of Clinical Research Prove", "दशकों के क्लिनिकल शोध क्या साबित करते हैं?", "દાયકાઓના તબીબી સંશોધનો શું સાબિત કરે છે?"),
            summary = LocalizedString(
                "Homes with Low Expressed Emotion have less than half the relapse and crisis rates of High EE homes.",
                "शांत और कम तनाव वाले परिवारों में संकट और अस्पताल में भर्ती होने की दर आधे से भी कम पाई गई है।",
                "શાંત અને સમજણભર્યા પરિવારોમાં કટોકટી અને હોસ્પિટલમાં દાખલ થવાનો દર અડધાથી પણ ઓછો નોંધાયો છે."
            ),
            details = listOf(
                LocalizedString(
                    "Psychiatric studies across multiple cultures consistently demonstrate that when families learn to reduce criticism and tone down emotional intensity, patient stability improves dramatically.",
                    "दुनिया भर के चिकित्सा अध्ययनों से सिद्ध हुआ है कि जब परिवार आलोचना कम करना और बातचीत को शांत रखना सीखते हैं, तो व्यक्ति की मानसिक स्थिरता में भारी सुधार होता है।",
                    "વિશ્વભરના તબીબી અભ્યાસો દર્શાવે છે કે જ્યારે કુટુંબ ટીકા ઘટાડે છે અને વાતચીતમાં શાંતિ જાળવે છે, ત્યારે વ્યક્તિની સ્થિરતામાં નોંધપાત્ર સુધારો થાય છે."
                ),
                LocalizedString(
                    "Calm communication reduces biological cortisol spikes and amygdala over-activation, allowing the individual's logical brain to remain online and cooperative.",
                    "शांत बातचीत तनाव के हार्मोन को कम करती है, जिससे व्यक्ति का मस्तिष्क संतुलित रहता है और वह सहयोग करने के लिए तैयार होता है।",
                    "શાંત વાતચીત તણાવના હોર્મોન્સ ઘટાડે છે, જેથી વ્યક્તિનું મગજ સંતુલિત રહે છે અને સહકાર આપવા તૈયાર થાય છે."
                )
            ),
            takeaway = LocalizedString(
                "Lowering the emotional temperature at home is often as potent as clinical intervention.",
                "घर के भावनात्मक तापमान को कम रखना किसी पेशेवर उपचार जितना ही प्रभावशाली होता है।",
                "ઘરના ભાવનાત્મક વાતાવરણને શાંત રાખવું એ વ્યાવસાયિક સારવાર જેટલું જ અસરકારક સાબિત થાય છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("The Low EE Alternative: Calm, Warmth & Space", "शांत विकल्प: अपनापन, आदर और निजी जगह", "શાંત વિકલ્પ: સ્નેહ, આદર અને અંગત જગ્યા"),
            summary = LocalizedString(
                "Replacing criticism and smothering with clear boundaries, emotional space, and validating warmth.",
                "आलोचना और अति-दखल के बदले स्पष्ट सीमाएँ, सोचने का समय और समझदारी भरा अपनापन देना।",
                "ટીકા અને અતિ-દખલગીરીને બદલે સ્પષ્ટ મર્યાદાઓ, વિચારવાનો સમય અને સમજણભર્યો સ્નેહ આપવો."
            ),
            details = listOf(
                LocalizedString(
                    "Warmth without smothering: Show caring through practical support and gentle statements ('I love you and I am here when you are ready') without demanding immediate emotional confession.",
                    "बिना दबाव का अपनापन: व्यावहारिक सहारा दें और सहज शब्द कहें ('मैं तुमसे प्यार करता हूँ और जब तुम तैयार होगे मैं यहीं हूँ'), बिना तुरंत जवाब देने का दबाव बनाए।",
                    "દબાણ વગરનો સ્નેહ: વ્યવહારુ ટેકો આપો અને સહજ શબ્દો કહો ('હું તને પ્રેમ કરું છું અને તું તૈયાર હોઈશ ત્યારે હું અહીં જ છું'), તાત્કાલિક ખુલાસાની અપેક્ષા રાખ્યા વગર."
                ),
                LocalizedString(
                    "Respecting physical space: When someone is overwhelmed, stepping back into another room provides immediate nervous system relief.",
                    "निजी जगह का सम्मान: जब कोई अत्यधिक उत्तेजित हो, तो दूसरे कमरे में चले जाना उसके तंत्रिका तंत्र को तुरंत शांत होने में मदद करता है।",
                    "અંગત જગ્યાનું સન્માન: જ્યારે કોઈ ખૂબ ઉત્તેજિત હોય, ત્યારે થોડો સમય દૂર ખસી જવું તેની નર્વસ સિસ્ટમને તરત શાંત કરવામાં મદદ કરે છે."
                )
            ),
            takeaway = LocalizedString(
                "Peaceful presence speaks louder than arguments or interrogation.",
                "बहस या पूछताछ की तुलना में शांत मौजूदगी कहीं अधिक असरदार साबित होती है।",
                "દલીલ કે પૂછપરછ કરતાં શાંત હાજરી ક્યાંય વધુ અસરકારક નીવડે છે."
            )
        )
    )

    // --- Evidence-Based Family Psychological Management ---
    val familyManagementSteps: List<EducationalSectionItem> = listOf(
        EducationalSectionItem(
            title = LocalizedString("1. Family Psychoeducation", "1. पारिवारिक मानसिक शिक्षा", "1. પારિવારિક માનસિક શિક્ષણ"),
            summary = LocalizedString(
                "Understanding that intense reactions stem from emotional regulation vulnerabilities, not willful manipulation.",
                "यह समझना कि तीखा व्यवहार भावनात्मक संवेदनशीलता से उपजा है, जानबूझकर की गई साज़िश नहीं।",
                "એ સમજવું કે તીવ્ર વર્તન લાગણીશીલ સંવેદનશીલતામાંથી આવે છે, કોઈ જાણીજોઈને કરેલું નાટક નથી."
            ),
            details = listOf(
                LocalizedString(
                    "When family members recognize that emotional storms are involuntary responses of an over-sensitive nervous system, anger naturally shifts to grounded empathy.",
                    "जब परिवार समझता है कि तूफान एक संवेदनशील तंत्रिका तंत्र की लाचारी है, तो गुस्सा कम होकर शांत समझदारी में बदल जाता है।",
                    "જ્યારે કુટુંબ સમજે છે કે આવેશ એ સંવેદનશીલ મગજની લાચારી છે, ત્યારે ક્રોધ આપોઆપ શાંત સહાનુભૂતિમાં ફેરવાઈ જાય છે."
                ),
                LocalizedString(
                    "Both the individual and family read the same educational framework, establishing a shared neutral vocabulary free from blame.",
                    "जब पूरा परिवार एक ही वैज्ञानिक जानकारी समझता है, तो आपसी बातचीत से आरोप-प्रत्यारोप मिट जाते हैं।",
                    "જ્યારે સમગ્ર કુટુંબ એકસરખી વૈજ્ઞાનિક સમજણ મેળવે છે, ત્યારે પરસ્પર આક્ષેપો દૂર થઈ સામાન્ય ભાષા ઊભી થાય છે."
                )
            ),
            takeaway = LocalizedString(
                "Knowledge removes taking emotional outbursts personally.",
                "सही जानकारी होने से आप उनके गुस्से को अपने ऊपर व्यक्तिगत हमला मानना बंद कर देते हैं।",
                "સાચી સમજણ તમને તેમના ગુસ્સાને અંગત આક્ષેપ તરીકે લેવાથી બચાવે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("2. Lowering the Emotional Temperature", "2. घर का भावनात्मक तापमान घटाना", "2. ઘરનું ભાવનાત્મક વાતાવરણ શાંત કરવું"),
            summary = LocalizedString(
                "Lowering speech volume, slowing speech rate, and taking intentional cooling pauses during conflict.",
                "धीमी आवाज़, शांत गति, और बहस शुरू होते ही 20-30 मिनट का स्पष्ट विराम लेना।",
                "ધીમો અવાજ, શાંત ગતિ અને બોલાચાલી શરૂ થતાં જ 20-30 મિનિટનો સ્પષ્ટ વિરામ લેવો."
            ),
            details = listOf(
                LocalizedString(
                    "Research shows that heart rates spike above 100 bpm during intense arguments, effectively disabling logical problem-solving. Neither party can think clearly at that moment.",
                    "शोध बताते हैं कि तेज बहस के दौरान दिल की धड़कन 100 से ऊपर पहुंच जाती है, जिससे दिमाग का तार्किक हिस्सा काम करना बंद कर देता है।",
                    "સંશોધનો દર્શાવે છે કે ઉગ્ર દલીલો વખતે ધબકારા વધી જાય છે, જેથી તાર્કિક વિચારસરણી અટકી પડે છે. તે સમયે કોઈ સમાધાન શક્ય નથી."
                ),
                LocalizedString(
                    "Institute a family rule: anyone can call a 20-minute 'Cooling Pause' without penalty or pursuit, returning only when physiological calm is restored.",
                    "परिवार में नियम बनाएं: कोई भी बिना किसी सज़ा के 20 मिनट का 'कूलिंग ब्रेक' ले सकता है और दोनों के शांत होने पर ही बात होगी।",
                    "પરિવારમાં નિયમ બનાવો: કોઈ પણ વ્યક્તિ 20 મિનિટનો 'કૂલિંગ બ્રેક' લઈ શકે છે અને શાંત થયા પછી જ આગળ વાત થશે."
                )
            ),
            takeaway = LocalizedString(
                "Never try to solve a problem while the fire is actively burning; wait for the embers to cool.",
                "जब आग भड़की हो तब समस्या सुलझाने की कोशिश न करें; अंगारों के ठंडा होने का इंतज़ार करें।",
                "જ્યારે આગ ભડકેલી હોય ત્યારે સમાધાન ન શોધો; વાતાવરણ શાંત થવાની રાહ જુઓ."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("3. Consistency & Predictable Boundaries", "3. निरंतरता और स्पष्ट मर्यादाएं", "3. સુસંગતતા અને સ્પષ્ટ મર્યાદાઓ"),
            summary = LocalizedString(
                "Maintaining reliable boundaries that don't expand or collapse depending on emotional weather.",
                "ऐसी स्पष्ट सीमाएँ बनाए रखना जो किसी के गुस्से या भावुकता के आगे बार-बार न बदलें।",
                "એવી અડગ મર્યાદાઓ જાળવવી જે કોઈના ગુસ્સા કે લાગણીશીલ દબાણમાં વારંવાર ન તૂટે."
            ),
            details = listOf(
                LocalizedString(
                    "Saying 'yes' out of guilt after saying 'no' inadvertently rewards escalation. Consistency signals stability and safety.",
                    "अपराधबोध में आकर 'ना' को 'हाँ' में बदलना अनजाने में तेज गुस्से को बढ़ावा देता है। दृढ़ता सुरक्षा का अहसास देती है।",
                    "અપરાધભાવમાં આવીને 'ના' ને 'હા' માં ફેરવવું અજાણતાં ગુસ્સાને પ્રોત્સાહન આપે છે. સુસંગતતા સુરક્ષાની ખાતરી આપે છે."
                ),
                LocalizedString(
                    "Boundaries are about what YOU will do, not what you force them to do (e.g., 'I will step out if doors are slammed').",
                    "सीमाएं इस बारे में हैं कि आप क्या करेंगे, न कि आप उन पर क्या थोपेंगे (जैसे: 'अगर दरवाजे पटके गए, तो मैं बाहर चला जाऊंगा')।",
                    "મર્યાદાઓ એ વિશે છે કે તમે શું કરશો, સામેવાળા પર શું લાદશો તે નહીં (જેમ કે: 'જો બારણાં પછાડાશે તો હું બહાર જઈશ')."
                )
            ),
            takeaway = LocalizedString(
                "Predictable limits reduce underlying anxiety by making the world consistent and safe.",
                "निश्चित सीमाएँ दुनिया को सुरक्षित और पूर्वानुमानित बनाकर बेचैनी को कम करती हैं।",
                "નિશ્ચિત મર્યાદાઓ પરિસ્થિતિને અનુમાનિત બનાવી ચિંતામાં ઘટાડો કરે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("4. Collaborative Crisis Planning", "4. आपातकालीन संकट योजना", "4. કટોકટી વ્યવસ્થાપન આયોજન"),
            summary = LocalizedString(
                "Agreeing in advance on warning signs and emergency steps during peacetime.",
                "शांत समय में ही मिलकर तय करना कि संकट के समय कौन से कदम उठाए जाएंगे और किन नंबरों पर संपर्क होगा।",
                "શાંત સમયમાં જ સાથે મળીને નક્કી કરવું કે કટોકટી વખતે કયા પગલાં લેવાશે અને કયા નંબરો પર સંપર્ક કરવો."
            ),
            details = listOf(
                LocalizedString(
                    "Write down a brief one-page Crisis Agreement: identifying early triggers, agreed de-escalation actions, safe quiet spaces, and emergency contact numbers (Tele-MANAS 14416, trusted doctor).",
                    "एक पृष्ठ की संकट योजना बनाएं: शुरुआती तनाव के संकेत, शांत होने के तय तरीके, और हेल्पलाइन नंबर (Tele-MANAS 14416, डॉक्टर का संपर्क)।",
                    "એક પાનાનું કટોકટી આયોજન તૈયાર કરો: શરૂઆતી તણાવના સંકેતો, શાંત થવાના નક્કી કરેલા રસ્તા અને હેલ્પલાઇન નંબરો (Tele-MANAS 14416, ડૉક્ટરનો સંપર્ક)."
                ),
                LocalizedString(
                    "Keep copies easily visible so no one has to invent decisions under intense emergency panic.",
                    "इसे ऐसी जगह रखें जहाँ यह तुरंत दिखे ताकि संकट के समय किसी को घबराहट में सोचना न पड़े।",
                    "તેને એવી જગ્યાએ રાખો જેથી કટોકટી વખતે કોઈને ગભરાટમાં નિર્ણયો શોધવા ન પડે."
                )
            ),
            takeaway = LocalizedString(
                "A written crisis plan turns emergency chaos into orderly, life-saving teamwork.",
                "लिखित संकट योजना घबराहट भरे माहौल को व्यवस्थित और जीवन-रक्षक सहयोग में बदल देती है।",
                "લેખિત કટોકટી યોજના ગભરાટને બદલે વ્યવસ્થિત અને જીવનરક્ષક ટીમવર્ક પૂરું પાડે છે."
            )
        ),
        EducationalSectionItem(
            title = LocalizedString("5. Supporting the Caregiver & Preventing Burnout", "5. देखभालकर्ता की देखभाल और तनाव मुक्ति", "5. સંભાળકર્તાની પોતાની સંભાળ અને આરામ"),
            summary = LocalizedString(
                "You cannot pour from an empty cup; protecting caregiver physical and mental health is foundational.",
                "आप खाली बर्तन से पानी नहीं पिला सकते; अपनी सेहत और मानसिक शांति की रक्षा करना सबसे पहली प्राथमिकता है।",
                "ખાલી વાસણમાંથી પાણી પીવડાવી શકાતું નથી; પોતાની તંદુરસ્તી અને માનસિક શાંતિ જાળવવી સૌથી પહેલી જરૂરિયાત છે."
            ),
            details = listOf(
                LocalizedString(
                    "Caregivers frequently suffer from chronic insomnia, guilt, and social isolation. Maintaining personal friendships and regular leisure is essential clinical medicine.",
                    "देखभालकर्ता अक्सर अनिद्रा, अपराधबोध और अकेलेपन के शिकार हो जाते हैं। अपनी मित्रता और शौक बनाए रखना बहुत ज़रूरी है।",
                    "સંભાળકર્તાઓ ઘણીવાર અનિદ્રા, અપરાધભાવ અને એકલતાનો ભોગ બને છે. પોતાના મિત્રો અને શોખ જાળવી રાખવા ખૂબ જરૂરી છે."
                ),
                LocalizedString(
                    "Seeking personal counseling for yourself is not a betrayal; it provides private emotional ventilation and boundary coaching.",
                    "अपने लिए काउंसलर से बात करना कोई गलत बात नहीं है; यह आपको अपनी बात कहने और मजबूत बने रहने का हौसला देता है।",
                    "પોતાના માટે કાઉન્સેલરની મદદ લેવી કોઈ ખોટી વાત નથી; તે તમને મનની વાત રજૂ કરવા અને મક્કમ રહેવાની હિંમત આપે છે."
                )
            ),
            takeaway = LocalizedString(
                "Caring for yourself is the single greatest gift you can offer your loved one.",
                "अपनी देखभाल करना ही आपके प्रियजन के लिए आपका सबसे बड़ा और सच्चा उपहार है।",
                "તમારી પોતાની કાળજી લેવી એ જ તમારા સ્વજન માટે તમારી સૌથી મોટી અને સાચી ભેટ છે."
            )
        )
    )
}

