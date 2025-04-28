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
class CalculatorBasicTest : BaseTest() {

    private lateinit var calculatorPage: CalculatorPage

    @Before
    fun setUp() {
        calculatorPage = CalculatorPage()
    }

    @Test
    fun testSimpleAddition() {
        calculatorPage.tapDigitOneButton()
        calculatorPage.tapPlusButton()
        calculatorPage.tapDigitTwoButton()
        calculatorPage.tapEqualsButton()

        onView(withId(R.id.expressionTextView)).check(matches(withText("3")))
    }
}