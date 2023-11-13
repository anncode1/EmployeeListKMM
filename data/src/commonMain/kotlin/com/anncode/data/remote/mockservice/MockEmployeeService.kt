package com.anncode.data.remote.mockservice

import com.anncode.data.dto.EmployeeDTO
import com.anncode.data.remote.api.ApiMethod
import com.anncode.data.remote.api.Request

internal object MockEmployeeService {
    fun getEmployeesRequest() = Request<List<EmployeeDTO>>(
        ApiMethod.GET, path = "employees"
    )
}