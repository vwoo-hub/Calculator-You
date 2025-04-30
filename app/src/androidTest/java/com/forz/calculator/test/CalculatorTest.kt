package com.forzz.calculator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.forz.calculator.R
import com.forz.calculator.page.CalculatorPage
import com.forz.calculator.test.BaseTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CalculatorTest : BaseTest() {

    private lateinit var calculatorPage: CalculatorPage

    @Before
    fun setUp() {
        calculatorPage = CalculatorPage()
        calculatorPage.tapAllClearButton()
    }

    @Test
    fun givenTwoDigits_whenPerformingAddition_thenShowTotal() {
        calculatorPage.tapDigitOneButton()
        calculatorPage.tapPlusButton()
        calculatorPage.tapDigitTwoButton()
        calculatorPage.tapEqualsButton()

        calculatorPage.assertResult("3")
    }

    @Test
    fun givenTwoNumbers_whenPerformingAddition_thenShowTotal() {
        calculatorPage.tapDigits("10")
        calculatorPage.tapPlusButton()
        calculatorPage.tapDigits("30")
        calculatorPage.tapEqualsButton()

        calculatorPage.assertResult("40")
    }

    @Test
    fun givenTwoDigits_whenPerformingSubtraction_thenShowTotal() {
        calculatorPage.tapDigitNineButton()
        calculatorPage.tapMinusButton()
        calculatorPage.tapDigitFourButton()
        calculatorPage.tapEqualsButton()

        calculatorPage.assertResult("5")
    }


    @Test
    fun testNavigateTabLayout() {
        calculatorPage.tapConvertTab()
        calculatorPage.tapHistoryTab()
        calculatorPage.tapCalculateTab()
    }
}