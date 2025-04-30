package com.forz.calculator.test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.forz.calculator.MainActivity
import org.junit.Rule

open class BaseTest {
    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)


}