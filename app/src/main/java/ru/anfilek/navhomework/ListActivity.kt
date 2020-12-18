package ru.anfilek.navhomework

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        findViewById<FloatingActionButton>(R.id.fabStartCamera).setOnClickListener {
            startCameraFeature()
        }

        findViewById<Button>(R.id.buttonItem).setOnClickListener {
            startItemActivity()
        }

    }

    private fun startCameraFeature() {
        // check camera permission
        // handle the check result
        // show dialog if it is needed
        // feel free to customise the button if it is needed
    }

    private fun startItemActivity() {
    }
}