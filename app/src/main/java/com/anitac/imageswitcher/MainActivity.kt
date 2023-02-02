package com.anitac.imageswitcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayList = ArrayList<String>()
        arrayList.add("R.drawable.ic_launcher_foreground")
        startActivity(
            GalleryPagerActivity.getStartIntent(
                this@MainActivity,
                arrayList, arrayList.size
            )
        )
    }
}