package com.anncode.domain.usecases

import com.anncode.domain.model.Employee
import com.anncode.domain.repository.EmployeesRepository

class GetEmployees(
    private val repository: EmployeesRepository
) {
    suspend operator fun invoke(): Result<List<Employee>> {
        return repository.getEmployees().onSuccess {
            it.filter { employee ->  employee.isEmployed }
        }
    }
}