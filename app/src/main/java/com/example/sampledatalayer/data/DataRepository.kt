package com.example.sampledatalayer.data

class DataRepository(
    private val dao: SampleDao
) {
    companion object {
        const val TAG = "DataRepository"
    }

    suspend fun createData(data: SampleData) {
        dao.insert(data)
    }
    suspend fun getData(): List<SampleData> {
        dao.getData()
    }
    suspend fun deleteAllData(id: Int) {
        dao.deleteAll()
    }
}