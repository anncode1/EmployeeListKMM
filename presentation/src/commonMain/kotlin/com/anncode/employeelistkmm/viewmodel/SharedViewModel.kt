package com.anncode.employeelistkmm.viewmodel

import kotlinx.coroutines.CoroutineScope

expect abstract class SharedViewModel() {
    val coroutineScope: CoroutineScope
    fun dispose()
    protected open fun onCleared()
}