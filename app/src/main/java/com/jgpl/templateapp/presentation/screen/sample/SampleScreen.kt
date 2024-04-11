package com.jgpl.templateapp.presentation.screen.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jgpl.templateapp.presentation.component.SampleComponent
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun SampleScreen() {
    val viewModel: SampleViewModel = koinViewModel()
    val state by viewModel.screenState.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Text(state.text)
            SampleComponent() {
                viewModel.onClickSampleButton()
            }
        }

    }
}

@Preview
@Composable
private fun SampleScreenPreview() {
    SampleScreen()
}