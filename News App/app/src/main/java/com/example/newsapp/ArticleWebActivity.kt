package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_article_web.*

class ArticleWebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_web)

        val intent = intent

      // wv_article.webChromeClient = WebChromeClient()
        wv_article.webViewClient = WebViewClient()
       wv_article.settings.javaScriptEnabled = true
        wv_article.loadUrl(intent.getStringExtra("articleURL")!!)
    }
}