package com.hossam.listtile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_item.setTitle("this is a title")
        list_item.setSubtitle("this is a subtitle")
        list_item.setImageDrawable(this.getDrawable(R.drawable.ic_launcher_background))
    }
}