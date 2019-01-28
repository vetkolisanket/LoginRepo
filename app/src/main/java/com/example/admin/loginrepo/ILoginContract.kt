package com.example.admin.loginrepo

/**
 * Created by Sanket on 28/01/19.
 */
interface ILoginContract {

    interface View {

        fun goToMainActivity()

        fun showMessage(message: String)

        fun showEmailEmptyError()

        fun showPasswordEmptyError()

    }

    interface Presenter {

        fun validateInputAndLogin()

    }

}