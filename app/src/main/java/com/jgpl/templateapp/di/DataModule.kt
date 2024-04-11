package com.jgpl.templateapp.di

import com.jgpl.templateapp.data.repository.SampleRepositoryImpl
import com.jgpl.templateapp.data.source.local.SampleLocalDataSource
import com.jgpl.templateapp.domain.repository.SampleRepository
import org.koin.dsl.module

val dataModule = module {
    single<SampleRepository> { SampleRepositoryImpl(get()) }

    single { SampleLocalDataSource() }
}