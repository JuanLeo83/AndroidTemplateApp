package com.jgpl.templateapp.di

import com.jgpl.templateapp.domain.usecase.SampleUseCase
import org.koin.dsl.module

val domainModule = module {
    single { SampleUseCase(get()) }
}