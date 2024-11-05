package com.example.recyclerviewimage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_image)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val imageList = listOf(
            ImageItem(R.drawable.image_one),
            ImageItem(R.drawable.image_two),
            ImageItem(R.drawable.image_three),
            ImageItem(R.drawable.image_four),
            ImageItem(R.drawable.image_five),
            ImageItem(R.drawable.image_six),
            ImageItem(R.drawable.image_seven),
            ImageItem(R.drawable.image_eight),
            ImageItem(R.drawable.image_nine)
        )

        recyclerView.adapter = ImageAdapter(imageList)
    }

}