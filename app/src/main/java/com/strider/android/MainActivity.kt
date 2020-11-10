package com.strider.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        conShowToast()
        setListener()
    }

    // ставим слушатель на кнопку обнуления счетчика
    private fun setListener() {
        btn_reset.setOnClickListener {
            AppPreferences.count = 0
        }
    }

    // можем ли показать тостер
    private fun conShowToast() {
        if (AppPreferences.count == 3) {
            Toast.makeText(baseContext, R.string.toast_message, Toast.LENGTH_LONG)
                    .show()
        }

    }
}