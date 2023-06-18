package com.example.sampledatalayer.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampledatalayer.data.DataRepository
import com.example.sampledatalayer.data.SampleDao
import com.example.sampledatalayer.data.SampleData
import com.example.sampledatalayer.data.SampleDatabase
import kotlinx.coroutines.launch

class SampleViewModel(
    private val context: Context
): ViewModel() {
    companion object {
        const val TAG = "SampleViewModel"
    }

    private var repo: DataRepository

    init {
        val dao = SampleDatabase.getDatabase(context).sampleDao()
        repo = DataRepository(dao)
    }

    fun create(data: SampleData) {
        viewModelScope.launch {
            repo.createData(data)
        }
    }
    fun get(): List<SampleData> {
        var list = listOf<SampleData>()
        viewModelScope.launch {
            list = repo.getData()
        }
        return list
    }
    fun delete() {
        viewModelScope.launch {
            repo.deleteAllData()
        }
    }
}