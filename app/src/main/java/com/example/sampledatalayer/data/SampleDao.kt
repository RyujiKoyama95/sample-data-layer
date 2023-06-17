package com.example.sampledatalayer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SampleDao {
    @Query("SELECT * FROM sample_data")
    suspend fun getData()
    @Insert
    suspend fun insert(title: String)
    @Delete
    suspend fun delete(id: Int)
}