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
}
