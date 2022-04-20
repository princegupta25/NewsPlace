package com.androiddevs.mvvmnewsapp.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.androiddevs.mvvmnewsapp.Source
import java.io.Serializable

@Entity(tableName = "articles")
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    @Embedded
    val source: Source?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
) : Serializable