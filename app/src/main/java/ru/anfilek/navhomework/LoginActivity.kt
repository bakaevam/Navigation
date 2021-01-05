package ru.anfilek.navhomework

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private val userLogin: UserLogin by lazy { UserLogin(this) }
    lateinit var editTextLogin: EditText
    lateinit var editTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextLogin = findViewById(R.id.editTextTextPersonName)
        editTextPassword = findViewById(R.id.editTextTextPassword)

        findViewById<Button>(R.id.button).setOnClickListener {
            performLogin()
        }
        checkLoginFlow()
    }

    private fun checkLoginFlow() {
        if (userLogin.isUserLoggedIn()) {
            // close this activity and open ListActivity
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }

    private fun performLogin() {
        if (editTextLogin.text.isNotEmpty() && editTextPassword.text.isNotEmpty()) {
            userLogin.setUserLoggedIn()
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        } else {
            AlertDialog.Builder(this)
                .setTitle("Warning")
                .setMessage("Login or password isn't entered")
                .setPositiveButton("OK", null)
                .show()
        }
    }

    companion object {
        const val EXTRA_MESSAGE = "EXTRA_MESSAGE"
    }
}