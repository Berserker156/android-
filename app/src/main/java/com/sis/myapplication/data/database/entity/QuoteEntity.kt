package com.sis.myapplication.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quotes")
data  class QuoteEntity (
        @PrimaryKey(autoGenerate = true) val uid:Int,
        @ColumnInfo(name = "quote") val quote:String,
        @ColumnInfo(name = "author") val author:String,
        )