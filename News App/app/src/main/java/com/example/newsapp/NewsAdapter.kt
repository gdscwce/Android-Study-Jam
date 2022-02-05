package com.example.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NewsAdapter(private val listener : NewsItemClick) : RecyclerView.Adapter<NewsViewHolder>() {

    private val items = ArrayList<News>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item_layout ,parent , false)
        val viewsHolder = NewsViewHolder(view)
        view.setOnClickListener{
            listener.onItemClick(items[viewsHolder.adapterPosition])
        }
        return viewsHolder
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.titleTV.text = items[position].title
        val author = '~' + items[position].author
        holder.authorTV.text = author
        Glide.with(holder.itemView.context).load(items[position].imageUrl).into(holder.imageIV)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun updateNews(newsArr : ArrayList<News>) {
        items.clear()
        items.addAll(newsArr)

        notifyDataSetChanged()
    }

}

class NewsViewHolder(view : View ) : RecyclerView.ViewHolder(view){
    val titleTV : TextView= view.findViewById(R.id.tv_title)
    val authorTV : TextView = view.findViewById(R.id.tv_author)
    val imageIV : ImageView = view.findViewById(R.id.iv_news_image)
}

interface NewsItemClick{
    fun onItemClick(item : News)
}