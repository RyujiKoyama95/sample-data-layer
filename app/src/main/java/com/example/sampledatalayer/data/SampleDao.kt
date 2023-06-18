package com.example.sampledatalayer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SampleDao {
    @Query("SELECT * FROM sample_data")
    suspend fun getData(): List<SampleData>
    @Insert
    suspend fun insert(data: SampleData)
    @Query("DELETE FROM sample_data")
    suspend fun deleteAll()
}