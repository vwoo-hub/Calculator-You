package com.forz.calculator.page

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.pressBack
import androidx.test.espresso.matcher.ViewMatchers.isRoot

abstract class BasePage {
    fun tapDeviceBackButton() {
        onView(isRoot()).perform(pressBack())
    }
}