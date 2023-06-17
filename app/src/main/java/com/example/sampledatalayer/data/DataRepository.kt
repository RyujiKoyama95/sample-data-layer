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

    suspend fun createData(data: SampleData) {
        dao.insert(data)
    }
    suspend fun getData() {
        dao.getData()
    }
    suspend fun deleteAllData(id: Int) {
        dao.deleteAll()
    }
}