package com.example.admin.loginrepo

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule

/**
 * Created by Sanket on 07/01/19.
 */
class LoginRobot {
    fun launch(main: ActivityTestRule<LoginActivity>) {
        main.launchActivity(LoginActivity.newIntent(InstrumentationRegistry.getTargetContext()))
    }
}