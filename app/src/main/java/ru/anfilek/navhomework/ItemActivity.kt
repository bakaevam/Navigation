package ru.anfilek.navhomework

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ItemActivity : AppCompatActivity() {

    private val userLogin: UserLogin by lazy { UserLogin(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        findViewById<Button>(R.id.startAgainButton).setOnClickListener {
            startMeAgain()
        }

        findViewById<Button>(R.id.logout).setOnClickListener {
            logout()
        }
    }

    private fun renderItemId() {
        // get id from arguments and set it in the tvItemId
    }

    private fun startMeAgain() {
        // start the activity again.
        // For user it should look like activity is just updated
        // Do not forget to randomise new itemIt and put it as an argument.
    }

    private fun logout() {
        userLogin.setUserLoggedOut()
        // go to login screen
        // pay attention to backstack
    }
}