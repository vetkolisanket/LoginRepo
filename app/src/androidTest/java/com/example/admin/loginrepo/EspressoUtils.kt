package com.example.admin.loginrepo

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId


/**
 * Created by Sanket on 11/01/19.
 */
class EspressoUtils {

    companion object {
        @JvmStatic
        fun isViewVisible(id: Int) {
            onView(withId(id)).check(matches(isDisplayed()))
        }
    }

}