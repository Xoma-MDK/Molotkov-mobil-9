package com.xomic.molotkov_mobil_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "RatingBar"
        val smallRatingBar = findViewById<View>(R.id.ratingBar_small) as RatingBar
        val indicatorRatingBar = findViewById<View>(R.id.ratingBar_indicator) as RatingBar
        val defaultRatingBar = findViewById<View>(R.id.ratingBar_default) as RatingBar
        defaultRatingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                smallRatingBar.rating = rating
                indicatorRatingBar.rating = rating
                Toast.makeText(
                    this@MainActivity, "рейтинг: $rating",
                    Toast.LENGTH_SHORT
                ).show()
            }
    }
}
