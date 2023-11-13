package com.anncode.employeelistkmm.viewmodel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

actual abstract class SharedViewModel {
    actual val coroutineScope: CoroutineScope =  CoroutineScope(Dispatchers.IO + SupervisorJob())


    protected actual open fun onCleared() {
    }

    actual fun dispose() {
        coroutineScope.cancel()
        onCleared()
    }
}