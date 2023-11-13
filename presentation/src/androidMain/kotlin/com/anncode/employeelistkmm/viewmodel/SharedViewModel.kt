package com.anncode.employeelistkmm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel

actual abstract class SharedViewModel : ViewModel() {
    actual val coroutineScope: CoroutineScope = viewModelScope

    actual fun dispose() {
        coroutineScope.cancel()
        onCleared()
    }

    actual override fun onCleared() {
        super.onCleared()
    }
}