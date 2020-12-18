package ru.anfilek.navhomework

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.button).setOnClickListener {
            performLogin()
        }
        checkLoginFlow()
    }

    private fun checkLoginFlow() {
        if (isUserLoggedIn()) {
            // close this activity and open ListActivity
        }
    }

    private fun isUserLoggedIn(): Boolean {
        return Random.nextBoolean()
    }

    private fun performLogin() {
        // pretend that login is already happened
        // close this activity and open ListActivity
    }
}