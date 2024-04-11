package com.jgpl.templateapp.presentation.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SampleComponent(onClickAction: () -> Unit) {
    Button(onClick = onClickAction) {
        Text("Press me!")
    }
}

@Preview
@Composable
private fun SampleComponentPreview() {
    SampleComponent() {}
}