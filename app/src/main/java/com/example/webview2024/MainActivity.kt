package com.example.webview2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This is a git test
        val webView = findViewById<WebView>(R.id.webView)

        webView.loadUrl("https://godotengine.org")
        webView.settings.javaScriptEnabled = true

        val viewWebsiteButton = findViewById<Button>(R.id.visitWebsiteButton)

        viewWebsiteButton.setOnClickListener {
            webView.loadUrl("https://www.python.org")
        }

        val moreInfoButton = findViewById<Button>(R.id.moreInfoButton)

        moreInfoButton.setOnClickListener {
            webView.loadUrl("https://guayama.inter.edu")
        }

    }
}