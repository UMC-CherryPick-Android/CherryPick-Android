package com.example.cherry_pick_android.presentation.ui.searchList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cherry_pick_android.databinding.ActivitySearchListBinding
import com.example.cherry_pick_android.presentation.adapter.NewsRecyclerViewAdapter
import com.example.cherry_pick_android.presentation.ui.home.News

class SearchListActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchListBinding

    private val news = listOf(
        News("뉴스1"), News("뉴스2"), News("뉴스3"), News("뉴스4"),
        News("뉴스5"), News("뉴스6"), News("뉴스7"), News("뉴스8"),
        News("뉴스9"), News("뉴스10"), News("뉴스11"), News("뉴스12")

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchListBinding.inflate(layoutInflater)
        val view = binding.root

        initNewsList()

        setContentView(view)
    }

    fun initNewsList() {
        binding.rvSearchNewsList.adapter = NewsRecyclerViewAdapter(news)
    }
}