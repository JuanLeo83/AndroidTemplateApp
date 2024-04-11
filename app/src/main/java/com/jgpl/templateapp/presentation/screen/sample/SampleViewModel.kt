package com.jgpl.templateapp.presentation.screen.sample

import androidx.lifecycle.ViewModel
import com.jgpl.templateapp.domain.usecase.SampleUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SampleViewModel(private val sampleUseCase: SampleUseCase) : ViewModel() {

    private val _screenState = MutableStateFlow(SampleViewData())
    val screenState = _screenState.asStateFlow()

    fun onClickSampleButton() {
        val result = sampleUseCase()
        _screenState.value = SampleViewData(result)
    }

}