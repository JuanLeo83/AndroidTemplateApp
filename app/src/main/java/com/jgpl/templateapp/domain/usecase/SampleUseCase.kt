package com.jgpl.templateapp.domain.usecase

import com.jgpl.templateapp.domain.repository.SampleRepository

class SampleUseCase(private val repository: SampleRepository) {
    operator fun invoke(): String {
        return repository.sampleFunction()
    }
}