package com.example.admin.loginrepo

import android.support.test.espresso.intent.Intents
import android.support.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Test

/**
 * Created by Sanket on 07/01/19.
 */
class LoginActivityTest {

    private val robot by unsafeLazy { LoginRobot() }

    private val main = ActivityTestRule<LoginActivity>(LoginActivity::class.java, false, false)


    @Before
    fun setup() {

    }

    @Test
    fun launchLoginActivity() {
        robot
                .launch(main)
    }

    @Test
    fun enterValidEmailPassword_successfulResponseFromBackend_openMainActivity() {
        val email = "abc@gmail.com"
        val password = "abcdef"

        Intents.init()

        robot
                .launch(main)
                .checkEmailPasswordAndLoginViewsAreVisible()
                .enterEmail(email)
                .enterPassword(password)
                .clickLogin()
                .sendMockedSuccessfulResponse(main)
                .isMainActivityOpen()

        Intents.release()
    }

    @Test
    fun enterValidEmailPassword_failureResponseFromBackend_shouldShowFailureMessage() {

    }

    @Test
    fun loginWithEmailPasswordEmpty_shouldShowEmptyEmailError() {

    }

    @Test
    fun loginWithPasswordEmpty_shouldShowEmptyPasswordError(){

    }

    @Test
    fun loginWithInvalidEmail_shouldShowInvalidEmailError() {

    }

    @Test
    fun loginWithInvalidPassword_shouldShowInvalidPasswordError() {

    }

}