package com.anncode.domain.repository

import com.anncode.domain.model.Employee

interface EmployeesRepository {

    suspend fun getEmployees(): Result<List<Employee>>
}