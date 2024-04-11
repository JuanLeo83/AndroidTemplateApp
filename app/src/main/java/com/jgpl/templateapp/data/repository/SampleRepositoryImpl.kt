package com.jgpl.templateapp.data.repository

import com.jgpl.templateapp.data.source.local.SampleLocalDataSource
import com.jgpl.templateapp.domain.repository.SampleRepository

class SampleRepositoryImpl(private val localDataSource: SampleLocalDataSource) : SampleRepository {
    override fun sampleFunction(): String {
        return localDataSource.sampleFunction()
    }
}