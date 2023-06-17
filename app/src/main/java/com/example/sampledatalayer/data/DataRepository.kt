package com.example.sampledatalayer.data

class DataRepository(
    private val database: SampleDatabase,
    private var dao: SampleDao
) {
    companion object {
        const val TAG = "DataRepository"
    }

    init {
        dao = database.sampleDao()
    }

    suspend fun createData(title: String) {
        dao.insert(title)
    }
    suspend fun getData() {
        dao.getData()
    }
    suspend fun deleteData(id: Int) {
        dao.delete(id)
    }
}