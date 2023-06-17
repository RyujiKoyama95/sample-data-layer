package com.example.sampledatalayer.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SampleData::class], version = 1, exportSchema = false)
abstract class SampleDatabase: RoomDatabase() {
    abstract fun sampleDao(): SampleDao
}