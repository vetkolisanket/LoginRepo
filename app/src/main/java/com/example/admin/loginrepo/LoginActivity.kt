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
class LoginActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onLoginSuccess() {
        startActivity(MainActivity.newIntent(this))
    }

    fun showError(errorMessage: String) {
        Snackbar.make(parentContainer, errorMessage, Snackbar.LENGTH_SHORT).show()
    }

}