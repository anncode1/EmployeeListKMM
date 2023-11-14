package com.anncode.employeelistkmm.employees

import com.anncode.domain.model.Employee
import com.anncode.domain.usecases.GetEmployees
import com.anncode.employeelistkmm.viewmodel.SharedViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class EmployeesViewModel(
    getEmployees: GetEmployees
) : SharedViewModel() {

    private val _employeeState = MutableStateFlow<List<Employee>>(emptyList())
    val employeeState: StateFlow<List<Employee>> = _employeeState

    init {
        coroutineScope.launch {
            getEmployees().onSuccess {
                _employeeState.emit(it)
            }.onFailure {
                _employeeState.emit(emptyList())
            }
        }
    }
}