package com.forz.calculator.page

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.forz.calculator.R
import com.forz.calculator.page.CalculatorPage.Digits.digitEightButton
import com.forz.calculator.page.CalculatorPage.Digits.digitFiveButton
import com.forz.calculator.page.CalculatorPage.Digits.digitFourButton
import com.forz.calculator.page.CalculatorPage.Digits.digitNineButton
import com.forz.calculator.page.CalculatorPage.Digits.digitOneButton
import com.forz.calculator.page.CalculatorPage.Digits.digitSevenButton
import com.forz.calculator.page.CalculatorPage.Digits.digitSixButton
import com.forz.calculator.page.CalculatorPage.Digits.digitThreeButton
import com.forz.calculator.page.CalculatorPage.Digits.digitTwoButton
import com.forz.calculator.page.CalculatorPage.Digits.digitZeroButton
import com.forz.calculator.page.CalculatorPage.Operators.divisionButton
import com.forz.calculator.page.CalculatorPage.Operators.equalsButton
import com.forz.calculator.page.CalculatorPage.Operators.minusButton
import com.forz.calculator.page.CalculatorPage.Operators.multiplicationButton
import com.forz.calculator.page.CalculatorPage.Operators.plusButton

class CalculatorPage : BasePage() {

    private object Digits {
        val digitOneButton = withId(R.id.digit1Button)
        val digitTwoButton = withId(R.id.digit2Button)
        val digitThreeButton = withId(R.id.digit3Button)
        val digitFourButton = withId(R.id.digit4Button)
        val digitFiveButton = withId(R.id.digit5Button)
        val digitSixButton = withId(R.id.digit6Button)
        val digitSevenButton = withId(R.id.digit7Button)
        val digitEightButton = withId(R.id.digit8Button)
        val digitNineButton = withId(R.id.digit9Button)
        val digitZeroButton = withId(R.id.digit0Button)
    }

    private object Operators {
        val plusButton = withId(R.id.plusButton)
        val minusButton = withId(R.id.minusButton)
        val multiplicationButton = withId(R.id.multiplicationButton)
        val divisionButton = withId(R.id.divisionButton)
        val equalsButton = withId(R.id.equalsButton)
    }

    private val allClearButton = withId(R.id.clearButton)

    private val resultDisplay = withId(R.id.expressionTextView)

    fun tapDigitOneButton() {
        onView(digitOneButton).perform(click())
    }

    fun tapDigitTwoButton() {
        onView(digitTwoButton).perform(click())
    }

    fun tapDigitThreeButton() {
        onView(digitThreeButton).perform(click())
    }

    fun tapDigitFourButton() {
        onView(digitFourButton).perform(click())
    }

    fun tapDigitFiveButton() {
        onView(digitFiveButton).perform(click())
    }

    fun tapDigitSixButton() {
        onView(digitSixButton).perform(click())
    }

    fun tapDigitSevenButton() {
        onView(digitSevenButton).perform(click())
    }

    fun tapDigitEightButton() {
        onView(digitEightButton).perform(click())
    }

    fun tapDigitNineButton() {
        onView(digitNineButton).perform(click())
    }

    fun tapDigitZeroButton() {
        onView(digitZeroButton).perform(click())
    }

    fun tapDigits(number: String) {
        number.forEach { digit ->
            when (digit) {
                '1' -> tapDigitOneButton()
                '2' -> tapDigitTwoButton()
                '3' -> tapDigitThreeButton()
                '4' -> tapDigitFourButton()
                '5' -> tapDigitFiveButton()
                '6' -> tapDigitSixButton()
                '7' -> tapDigitSevenButton()
                '8' -> tapDigitEightButton()
                '9' -> tapDigitNineButton()
                '0' -> tapDigitZeroButton()
                else -> IllegalArgumentException("Invalid digit: $digit")
            }
        }

    }

    fun tapPlusButton() {
        onView(plusButton).perform(click())
    }

    fun tapMinusButton() {
        onView(minusButton).perform(click())
    }

    fun tapMultiplicationButton() {
        onView(multiplicationButton).perform(click())
    }

    fun tapDivisionButton() {
        onView(divisionButton).perform(click())
    }

    fun tapEqualsButton() {
        onView(equalsButton).perform(click())
    }

    fun tapAllClearButton() {
        onView(allClearButton).perform(click())
    }

    fun assertResult(result: String) {
        onView(resultDisplay).check(matches(withText(result)))
    }
}