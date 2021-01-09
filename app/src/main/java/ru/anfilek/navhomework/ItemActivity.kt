package ru.anfilek.navhomework

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class ItemActivity : AppCompatActivity() {

    private val userLogin: UserLogin by lazy { UserLogin(this) }
    lateinit var idTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        idTextView = findViewById(R.id.tvItemId)
        idTextView.text = intent.getIntExtra("ITEM_ID", 0).toString()

        findViewById<Button>(R.id.startAgainButton).setOnClickListener {
            startMeAgain()
        }

        findViewById<Button>(R.id.logout).setOnClickListener {
            logout()
        }
    }

    private fun renderItemId(): Int {
        // get id from arguments and set it in the tvItemId
        return Random.nextInt(1, 100)
    }

    private fun startMeAgain() {
        val intent = Intent(this, ItemActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        intent.putExtra("ITEM_ID", renderItemId())
        finish()
        overridePendingTransition(0, 0)
        startActivity(intent)
        overridePendingTransition(0, 0)
        // start the activity again.
        // For user it should look like activity is just updated
        // Do not forget to randomise new itemIt and put it as an argument.
    }

    private fun logout() {
        userLogin.setUserLoggedOut()
        // go to login screen
        val logoutIntent = Intent(this, LoginActivity::class.java)
        logoutIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(logoutIntent)
        finish()
        // pay attention to backstack
    }
}