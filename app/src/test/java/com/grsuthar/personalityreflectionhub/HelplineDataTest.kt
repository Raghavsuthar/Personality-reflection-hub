package com.grsuthar.personalityreflectionhub

import com.grsuthar.personalityreflectionhub.data.HelplineData
import com.grsuthar.personalityreflectionhub.data.Language
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class HelplineDataTest {

    @Test
    fun testHelplinesExistAndMultilingual() {
        assertTrue("Helplines list should not be empty", HelplineData.helplines.isNotEmpty())
        HelplineData.helplines.forEach { helpline ->
            assertTrue("Number should be present", helpline.number.isNotBlank())
            listOf(Language.ENGLISH, Language.HINDI, Language.GUJARATI).forEach { lang ->
                assertTrue("Name in $lang should be present", helpline.name.get(lang).isNotBlank())
                assertTrue("Description in $lang should be present", helpline.description.get(lang).isNotBlank())
            }
        }
    }

    @Test
    fun testProfessionalRolesComplete() {
        assertEquals("Should have 4 core mental health professional roles", 4, HelplineData.professionalRoles.size)
        HelplineData.professionalRoles.forEach { role ->
            listOf(Language.ENGLISH, Language.HINDI, Language.GUJARATI).forEach { lang ->
                assertTrue("Role title in $lang must not be blank", role.title.get(lang).isNotBlank())
                assertTrue("Role qualification in $lang must not be blank", role.qualification.get(lang).isNotBlank())
                assertTrue("Role whatTheyDo in $lang must not be blank", role.whatTheyDo.get(lang).isNotBlank())
                assertTrue("Role whenToSeeThem in $lang must not be blank", role.whenToSeeThem.get(lang).isNotBlank())
            }
        }
    }

    @Test
    fun testGpReferralGuidanceComprehensive() {
        assertEquals("Should have 5 core GP referral rationale points", 5, HelplineData.gpReferralGuidance.size)
        HelplineData.gpReferralGuidance.forEach { point ->
            listOf(Language.ENGLISH, Language.HINDI, Language.GUJARATI).forEach { lang ->
                assertTrue("Point title in $lang must not be blank", point.title.get(lang).isNotBlank())
                assertTrue("Point rationale in $lang must not be blank", point.rationale.get(lang).isNotBlank())
                assertTrue("Point practicalTip in $lang must not be blank", point.practicalTip.get(lang).isNotBlank())
            }
        }
    }

    @Test
    fun testFirstAppointmentStepsWalkthrough() {
        assertEquals("Should have 5 steps for first appointment walkthrough", 5, HelplineData.firstAppointmentSteps.size)
        HelplineData.firstAppointmentSteps.forEachIndexed { index, step ->
            assertEquals(index + 1, step.stepNumber)
            listOf(Language.ENGLISH, Language.HINDI, Language.GUJARATI).forEach { lang ->
                assertTrue("Step title in $lang must not be blank", step.title.get(lang).isNotBlank())
                assertTrue("Step summary in $lang must not be blank", step.summary.get(lang).isNotBlank())
                assertTrue("Step details in $lang must not be blank", step.details.get(lang).isNotBlank())
            }
        }
    }

    @Test
    fun testStigmaPrinciplesAndLegalRights() {
        assertEquals("Should have 3 foundational stigma & rights principles", 3, HelplineData.stigmaPrinciples.size)
        HelplineData.stigmaPrinciples.forEach { (title, summary, reassurance) ->
            listOf(Language.ENGLISH, Language.HINDI, Language.GUJARATI).forEach { lang ->
                assertTrue("Principle title in $lang must not be blank", title.get(lang).isNotBlank())
                assertTrue("Principle summary in $lang must not be blank", summary.get(lang).isNotBlank())
                assertTrue("Principle reassurance in $lang must not be blank", reassurance.get(lang).isNotBlank())
            }
        }
    }

    @Test
    fun testWhereToLookInIndia() {
        assertEquals("Should have 4 verified avenues for care in India", 4, HelplineData.whereToLookInIndia.size)
        HelplineData.whereToLookInIndia.forEach { (name, desc) ->
            listOf(Language.ENGLISH, Language.HINDI, Language.GUJARATI).forEach { lang ->
                assertTrue("Avenue name in $lang must not be blank", name.get(lang).isNotBlank())
                assertTrue("Avenue desc in $lang must not be blank", desc.get(lang).isNotBlank())
            }
        }
    }

    @Test
    fun testQuestionsToAskTherapist() {
        assertEquals("Should have 4 questions for first appointment", 4, HelplineData.questionsToAskTherapist.size)
        HelplineData.questionsToAskTherapist.forEach { (topic, question) ->
            listOf(Language.ENGLISH, Language.HINDI, Language.GUJARATI).forEach { lang ->
                assertTrue("Topic in $lang must not be blank", topic.get(lang).isNotBlank())
                assertTrue("Question in $lang must not be blank", question.get(lang).isNotBlank())
            }
        }
    }
}
