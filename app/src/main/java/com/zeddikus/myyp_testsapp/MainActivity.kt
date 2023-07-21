package com.zeddikus.myyp_testsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.poster)
//        val imageClickListener: View.OnClickListener = object : View.OnClickListener { override fun onClick(v: View?) {
//            Toast.makeText(this@MainActivity, "Здесь какой-то текст", Toast.LENGTH_SHORT).show()
//        } }
//        image.setOnClickListener(imageClickListener)
        image.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на картинку! ", Toast.LENGTH_SHORT).show()
            image.setBackgroundColor(getColor(R.color.black))
            image.scaleType = ImageView.ScaleType.CENTER_CROP
            image.setImageResource(R.drawable.poster)
        }
    }
}