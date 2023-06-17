package com.example.sampledatalayer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SampleData::class], version = 1, exportSchema = false)
abstract class SampleDatabase: RoomDatabase() {
    abstract fun sampleDao(): SampleDao

    companion object {
        private var sampleDatabase: SampleDatabase? = null

        fun getDatabase(context: Context): SampleDatabase {
            return sampleDatabase ?: synchronized(this) {
                val instanse = Room.databaseBuilder(
                    context.applicationContext,
                    SampleDatabase::class.java,
                    "sample_database"
                ).fallbackToDestructiveMigration().build()
                sampleDatabase = instanse
                return sampleDatabase as SampleDatabase
            }
        }
    }
}