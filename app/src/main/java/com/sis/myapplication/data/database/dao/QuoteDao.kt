package com.sis.myapplication.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sis.myapplication.data.database.entity.QuoteEntity


@Dao
interface QuoteDao {

    @Query("SELECT * FROM quotes")
    fun geAll(): List<QuoteEntity>

    @Insert
    fun insertQuote(quote: QuoteEntity)
}