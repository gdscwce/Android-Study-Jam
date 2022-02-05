package com.example.newsapp

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , NewsItemClick {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://saurav.tech/NewsAPI/top-headlines/category/business/in.json"

        recycler_view.layoutManager = LinearLayoutManager(this)

        val adapter = NewsAdapter(this)

        val queue = Volley.newRequestQueue(this)

        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET , url , null ,
            { response ->

                val newsJsonArr = response.getJSONArray("articles")
                val newsArr = ArrayList<News>()
                for (i in 0 until newsJsonArr.length()){
                    val jsonObjNews = newsJsonArr.getJSONObject(i)
                    if (jsonObjNews.getString("title") != "" && jsonObjNews.getString("author") != "null" &&
                    jsonObjNews.getString("url") != "" && jsonObjNews.getString("urlToImage") != "") {
                        val newsItem = News(
                            jsonObjNews.getString("title"), jsonObjNews.getString("author"),
                            jsonObjNews.getString("url"), jsonObjNews.getString("urlToImage")
                        )
                        newsArr.add(newsItem)
                    }
                }
                adapter.updateNews(newsArr)

            } ,
            {
                   Toast.makeText(this , it.toString() , Toast.LENGTH_SHORT).show()
            }
        )

        queue.add(jsonObjectRequest)
        recycler_view.adapter = adapter

    }

    override fun onItemClick(item: News) {
        val intent = Intent(this , ArticleWebActivity::class.java)
        intent.putExtra("articleURL" , item.articleUrl)
        startActivity(intent)
    }
}