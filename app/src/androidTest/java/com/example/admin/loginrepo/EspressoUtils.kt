package com.example.admin.loginrepo

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.allOf


/**
 * Created by Sanket on 11/01/19.
 */
class EspressoUtils {

    companion object {
        @JvmStatic
        fun isViewVisible(id: Int) {
            onView(withId(id)).check(matches(isDisplayed()))
        }

        fun enterText(id: Int, text: String) {
            onView(withId(id)).perform(clearText(), typeText(text), closeSoftKeyboard())
        }

        fun performClick(id: Int) {
            onView(withId(id)).perform(click())
        }

        fun isTextVisibleInSnackbar(text: String) {
            onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(text)))
                    .check(matches(withEffectiveVisibility(
                            ViewMatchers.Visibility.VISIBLE
                    )))

        }
    }

}