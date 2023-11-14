package com.anncode.data.repository

import com.anncode.data.dto.toEmployee
import com.anncode.data.remote.api.Api
import com.anncode.data.remote.api.ResponseMapper
import com.anncode.data.remote.mockservice.MockEmployeeService
import com.anncode.domain.model.Employee
import com.anncode.domain.repository.EmployeesRepository

class EmployeeRepositoryImpl(
    private val api: Api,
    private val responseMapper: ResponseMapper
) : EmployeesRepository {
    override suspend fun getEmployees(): Result<List<Employee>> {
        val response = api.request(MockEmployeeService.getEmployeesRequest())
        val result = responseMapper.map(response)

        return result.map {
            it.employeesDTO.map {
                    employeeDTO -> employeeDTO.toEmployee()
                }
            }
    }

}