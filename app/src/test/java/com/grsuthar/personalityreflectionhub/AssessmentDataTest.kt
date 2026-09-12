package com.grsuthar.personalityreflectionhub

import com.grsuthar.personalityreflectionhub.data.AssessmentData
import com.grsuthar.personalityreflectionhub.data.Language
import com.grsuthar.personalityreflectionhub.data.TraitDomain
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class AssessmentDataTest {

    @Test
    fun testTraitDomainsComplete() {
        // Verify that all 6 domains (5 trait domains + Borderline specifier) exist
        assertEquals(6, TraitDomain.entries.size)
    }

    @Test
    fun testQuestionCountPerDomain() {
        // Verify each domain has 6 original reflection questions (36 total)
        assertEquals(36, AssessmentData.questions.size)
        TraitDomain.entries.forEach { domain ->
            val domainQuestions = AssessmentData.questions.filter { it.domain == domain }
            assertEquals("Domain $domain should have 6 items", 6, domainQuestions.size)
        }
    }

    @Test
    fun testMultilingualTranslationsPresent() {
        // Verify English, Hindi, and Gujarati translations for every question
        AssessmentData.questions.forEach { question ->
            assertTrue("Question ${question.id} has valid English text", question.text.get(Language.ENGLISH).isNotBlank())
            assertTrue("Question ${question.id} has valid Hindi text", question.text.get(Language.HINDI).isNotBlank())
            assertTrue("Question ${question.id} has valid Gujarati text", question.text.get(Language.GUJARATI).isNotBlank())
        }
    }

    @Test
    fun testDomainImpactQuestionsPresent() {
        // Verify every domain has an everyday life impact question
        TraitDomain.entries.forEach { domain ->
            val impactQuestion = AssessmentData.domainImpactQuestions[domain]
            assertTrue("Domain $domain should have an impact question", impactQuestion != null)
            assertTrue(impactQuestion!!.get(Language.ENGLISH).isNotBlank())
        }
    }

    @Test
    fun testDomainIndexBoundsSafety() {
        // Simulates progression through all domain indices 0..5, then safety check step 6
        val domains = TraitDomain.entries
        for (i in 0 until domains.size) {
            val domain = domains.getOrNull(i)
            assertTrue("Domain at index $i must be non-null", domain != null)
            val questions = domain?.let { d -> AssessmentData.questions.filter { it.domain == d } } ?: emptyList()
            assertEquals("Domain $domain questions count must be 6", 6, questions.size)
        }
        // At safety check step, index == domains.size (6)
        val safetyCheckDomain = domains.getOrNull(domains.size)
        assertEquals("Domain at safety check step index must safely return null", null, safetyCheckDomain)
        val safetyCheckQuestions = safetyCheckDomain?.let { d -> AssessmentData.questions.filter { it.domain == d } } ?: emptyList()
        assertTrue("Questions at safety check step must be empty without error", safetyCheckQuestions.isEmpty())
    }

    @Test
    fun testPurposeStatementContent() {
        assertEquals("Why This Reflection Matters", AssessmentData.purposeStatementTitle.get(Language.ENGLISH))
        assertTrue(AssessmentData.purposeStatementTitle.get(Language.HINDI).isNotBlank())
        assertTrue(AssessmentData.purposeStatementTitle.get(Language.GUJARATI).isNotBlank())

        assertTrue(AssessmentData.purposeStatementBody.get(Language.ENGLISH).contains("Understanding your own patterns of thinking"))
        assertTrue(AssessmentData.purposeStatementBody.get(Language.HINDI).contains("सोचने, महसूस करने और दूसरों से जुड़ने"))
        assertTrue(AssessmentData.purposeStatementBody.get(Language.GUJARATI).contains("વિચારવાની, લાગણી અનુભવવાની અને અન્યો સાથે"))
    }

    @Test
    fun testNextStepsProfileMinimalImpactNoElevated() {
        // Profile 1: Minimal impact (0) everywhere, all domains ABOUT_TYPICAL
        val results = TraitDomain.entries.map { domain ->
            com.grsuthar.personalityreflectionhub.data.DomainResult(
                domain = domain,
                rawScore = 18,
                maxScore = 30,
                percentage = 0.6f,
                tier = com.grsuthar.personalityreflectionhub.data.ResultTier.ABOUT_TYPICAL,
                impactLevel = 0
            )
        }

        val elevatedDomains = results.filter { it.tier == com.grsuthar.personalityreflectionhub.data.ResultTier.MORE_THAN_MOST }
        assertTrue("No domain should be elevated", elevatedDomains.isEmpty())

        val highestImpact = results.maxOfOrNull { it.impactLevel } ?: 0
        assertEquals(0, highestImpact)

        val guidanceEn = AssessmentData.nextStepsTieredGuidance[highestImpact].get(Language.ENGLISH)
        assertTrue("Guidance should be minimal impact", guidanceEn.contains("Right now, these patterns don't seem to be creating real difficulty"))
        val guidanceHi = AssessmentData.nextStepsTieredGuidance[highestImpact].get(Language.HINDI)
        assertTrue(guidanceHi.contains("फिलहाल, ये प्रवृत्तियाँ आपके जीवन में कोई वास्तविक कठिनाई"))
        val guidanceGu = AssessmentData.nextStepsTieredGuidance[highestImpact].get(Language.GUJARATI)
        assertTrue(guidanceGu.contains("અત્યારે, આ વલણો તમારા જીવનમાં કોઈ વાસ્તવિક મુશ્કેલી"))
    }

    @Test
    fun testNextStepsProfileElevatedDomainWithSignificantDistress() {
        // Profile 2: Negative Affectivity is MORE_THAN_MOST and highest impact is 3
        val results = TraitDomain.entries.map { domain ->
            val isElevated = domain == TraitDomain.NEGATIVE_AFFECTIVITY
            com.grsuthar.personalityreflectionhub.data.DomainResult(
                domain = domain,
                rawScore = if (isElevated) 28 else 12,
                maxScore = 30,
                percentage = if (isElevated) 0.93f else 0.4f,
                tier = if (isElevated) com.grsuthar.personalityreflectionhub.data.ResultTier.MORE_THAN_MOST else com.grsuthar.personalityreflectionhub.data.ResultTier.LESS_THAN_MOST,
                impactLevel = if (isElevated) 3 else 1
            )
        }

        val elevatedDomains = results.filter { it.tier == com.grsuthar.personalityreflectionhub.data.ResultTier.MORE_THAN_MOST }
        assertEquals(1, elevatedDomains.size)
        assertEquals(TraitDomain.NEGATIVE_AFFECTIVITY, elevatedDomains.first().domain)

        // Test English callout
        val domainNamesEn = elevatedDomains.joinToString(", ") { it.domain.everydayName.get(Language.ENGLISH) }
        assertEquals(TraitDomain.NEGATIVE_AFFECTIVITY.everydayName.get(Language.ENGLISH), domainNamesEn)
        val calloutEn = AssessmentData.getDomainCalloutText(domainNamesEn, Language.ENGLISH)
        assertTrue(calloutEn.contains("Your reflection today highlighted stronger patterns in: ${TraitDomain.NEGATIVE_AFFECTIVITY.everydayName.get(Language.ENGLISH)}."))

        // Test Hindi callout
        val domainNamesHi = elevatedDomains.joinToString(", ") { it.domain.everydayName.get(Language.HINDI) }
        val calloutHi = AssessmentData.getDomainCalloutText(domainNamesHi, Language.HINDI)
        assertTrue(calloutHi.contains(domainNamesHi))

        // Test Gujarati callout
        val domainNamesGu = elevatedDomains.joinToString(", ") { it.domain.everydayName.get(Language.GUJARATI) }
        val calloutGu = AssessmentData.getDomainCalloutText(domainNamesGu, Language.GUJARATI)
        assertTrue(calloutGu.contains(domainNamesGu))

        // Test Level 3 guidance
        val highestImpact = results.maxOfOrNull { it.impactLevel } ?: 0
        assertEquals(3, highestImpact)

        val guidanceEn = AssessmentData.nextStepsTieredGuidance[highestImpact].get(Language.ENGLISH)
        assertTrue(guidanceEn.contains("You indicated significant, ongoing distress."))
        val guidanceHi = AssessmentData.nextStepsTieredGuidance[highestImpact].get(Language.HINDI)
        assertTrue(guidanceHi.contains("आपने गंभीर और लगातार मानसिक कष्ट का संकेत दिया है।"))
        val guidanceGu = AssessmentData.nextStepsTieredGuidance[highestImpact].get(Language.GUJARATI)
        assertTrue(guidanceGu.contains("તમે ગંભીર અને સતત માનસિક પીડા દર્શાવી છે."))
    }

    @Test
    fun testNextStepsProfileIntermediateImpactLevels() {
        // Level 1: Mild friction
        val guidanceL1 = AssessmentData.nextStepsTieredGuidance[1].get(Language.ENGLISH)
        assertTrue(guidanceL1.contains("You noticed some mild friction in specific situations."))

        // Level 2: Moderate strain
        val guidanceL2 = AssessmentData.nextStepsTieredGuidance[2].get(Language.ENGLISH)
        assertTrue(guidanceL2.contains("You indicated these patterns are creating ongoing strain in more than one part of your life."))
    }
}
