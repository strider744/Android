package com.strider.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.strider.android.firsttask.Task
import com.strider.android.secondtask.Data
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        conShowToast()
        setListener()

        Task.main()
        writeData()
    }

    private fun writeData() {
        for (i in 0 until 20) {

            val prices = mutableListOf<Int>()
            for (price in 0 until 10) {
                prices.add(Random.nextInt(0, 200))
            }
            Log.e("Task3", "price = $prices")
            val discount = Random.nextInt(1, 99)
            Log.e("Task3", "discount = $discount")
            val offset = Random.nextInt(0, 9)
            Log.e("Task3", "offset = $offset")
            val readLength = 10 - offset
            Log.e("Task3", "readLength = $readLength")

            Log.e(
                "Task3", "new Array ${
                    Data().decryptData(
                        prices.toIntArray(),
                        discount, offset, readLength
                    )?.contentToString()
                } \n"
            )

        }
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