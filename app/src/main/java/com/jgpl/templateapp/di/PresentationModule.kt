package com.jgpl.templateapp.di

import com.jgpl.templateapp.presentation.screen.sample.SampleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { SampleViewModel(get()) }
}