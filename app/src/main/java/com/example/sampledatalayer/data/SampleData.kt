package com.example.sampledatalayer.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sample_data")
data class SampleData(
    @PrimaryKey val id: Int,
    val title: String,
    val isCompleted: Boolean
)