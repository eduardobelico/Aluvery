package com.example.aluvery.ui.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.aluvery.ui.state.HomeScreenUiState

class HomeScreenViewModel : ViewModel() {

    var uiState by mutableStateOf(HomeScreenUiState())
        private set
}