package com.example.admin.loginrepo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by Sanket on 05/01/19.
 */
class LoginActivity : AppCompatActivity(), ILoginContract.View {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    /**
     * Lifecycle
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    /**
     * Contract
     */

    override fun goToMainActivity() {
        startActivity(MainActivity.newIntent(this))
    }

    override fun showMessage(message: String) {
        Snackbar.make(parentContainer, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun showEmailEmptyError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showPasswordEmptyError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}