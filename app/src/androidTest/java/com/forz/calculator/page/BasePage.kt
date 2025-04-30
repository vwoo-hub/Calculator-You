package com.forz.calculator.page

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.pressBack
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.forz.calculator.R
import com.google.android.material.tabs.TabLayout
import org.hamcrest.Matcher

abstract class BasePage {
    private val tabLayout = withId(R.id.tabLayout)
    private val overflowButton = withId(R.id.toolbar)

    private fun clickTabAtPosition(position: Int): ViewAction {
        return object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return isAssignableFrom(TabLayout::class.java)
            }

            override fun getDescription(): String {
                return "Click on tab at position $position"
            }

            override fun perform(uiController: UiController?, view: View) {
                val tabLayout = view as TabLayout
                val tab = tabLayout.getTabAt(position)
                tab?.select()
            }
        }
    }

    fun tapConvertTab() {
        onView(tabLayout).perform(clickTabAtPosition(0))
    }

    fun tapCalculateTab() {
        onView(tabLayout).perform(clickTabAtPosition(1))
    }

    fun tapHistoryTab() {
        onView(tabLayout).perform(clickTabAtPosition(2))
    }


    fun tapDeviceBackButton() {
        onView(isRoot()).perform(pressBack())
    }
}