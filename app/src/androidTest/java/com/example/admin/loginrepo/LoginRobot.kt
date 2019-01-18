package com.example.admin.loginrepo

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule

/**
 * Created by Sanket on 07/01/19.
 */
class LoginRobot {

    fun launch(main: ActivityTestRule<LoginActivity>): LoginRobot {
        main.launchActivity(LoginActivity.newIntent(InstrumentationRegistry.getTargetContext()))
        return this
    }

    fun checkEmailPasswordAndLoginViewsAreVisible(): LoginRobot {
        EspressoUtils.isViewVisible(R.id.etEmail)
        EspressoUtils.isViewVisible(R.id.etPassword)
        EspressoUtils.isViewVisible(R.id.btnLogin)
        return this
    }

    fun enterEmail(): LoginRobot {
        return this
    }

    fun enterPassword(): LoginRobot {
        return this
    }

    fun clickLogin(): LoginRobot {
        return this
    }

    fun sendMockedSuccessfulResponse(): LoginRobot {
        return this
    }

    fun isMainActivityOpen(): LoginRobot {
        return this
    }
}