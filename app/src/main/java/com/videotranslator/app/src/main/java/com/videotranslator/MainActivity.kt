package com.videotranslator

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        view.text = "Video Translator v0.1"
        view.textSize = 22f
        view.setPadding(48, 96, 48, 48)
        setContentView(view)
    }
}
