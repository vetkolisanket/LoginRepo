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

    fun enterEmail(email: String): LoginRobot {
        EspressoUtils.enterText(R.id.etEmail, email)
        return this
    }

    fun enterPassword(password: String): LoginRobot {
        EspressoUtils.enterText(R.id.etPassword, password)
        return this
    }

    fun clickLogin(): LoginRobot {
        EspressoUtils.performClick(R.id.btnLogin)
        return this
    }

    fun sendMockedSuccessfulResponse(main: ActivityTestRule<LoginActivity>): LoginRobot {
        main.runOnUiThread {
            main.activity.goToMainActivity()
        }
        return this
    }

    fun isMainActivityOpen(): LoginRobot {
        return this
    }

    fun sendMockedFailureResponse(main: ActivityTestRule<LoginActivity>, errorMessage: String): LoginRobot {
        main.runOnUiThread {
            main.activity.showMessage(errorMessage)
        }
        return this
    }

    fun isErrorVisibleInSnackbar(message: String) {
        EspressoUtils.isTextVisibleInSnackbar(message)
    }

    fun verifyValidateInputWasCalled(mockPresenter: LoginPresenter): LoginRobot {
        return this
    }

}