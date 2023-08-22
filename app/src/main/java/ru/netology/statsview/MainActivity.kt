package ru.netology.statsview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val statsView = findViewById<StatsView>(R.id.statsView)

        statsView.data = listOf(500f, 500f, 500f, 500f)

        statsView.postDelayed({
            statsView.data = listOf(
                500F, 500F, 500F, 500F
            )
        }, 300)
    }
}