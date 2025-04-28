package com.forz.calculator.page

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.forz.calculator.R

class CalculatorPage : BasePage() {
    private val digitOneButton = withId(R.id.digit1Button)
    private val digitTwoButton = withId(R.id.digit2Button)

    private val plusButton = withId(R.id.plusButton)
    private val equalsButton = withId(R.id.equalsButton)

    fun tapDigitOneButton() {
        onView(digitOneButton).perform(click())
    }

    fun tapDigitTwoButton() {
        onView(digitTwoButton).perform(click())
    }

    fun tapPlusButton() {
        onView(plusButton).perform(click())
    }

    fun tapEqualsButton() {
        onView(equalsButton).perform(click())
    }
}