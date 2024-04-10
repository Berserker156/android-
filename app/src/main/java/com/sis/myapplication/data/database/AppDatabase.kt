package com.sis.myapplication.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sis.myapplication.data.database.dao.QuoteDao
import com.sis.myapplication.data.database.entity.QuoteEntity


@Database(entities = [QuoteEntity::class], version = 1)
abstract class
AppDatabase : RoomDatabase()  {

    abstract fun quoteDao(): QuoteDao

    companion object{
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase{
            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "quotes_database"
                ).allowMainThreadQueries().build()
            }
            return instance!!
        }
    }




}