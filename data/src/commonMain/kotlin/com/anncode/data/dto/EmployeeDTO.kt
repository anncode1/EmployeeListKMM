package com.anncode.data.dto

import com.anncode.domain.model.Employee
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EmployeeDTO(
    @SerialName("id")
    val id: String,

    @SerialName("name")
    val name: String,

    @SerialName("email")
    val email: String,

    @SerialName("phone")
    val phone: String,

    @SerialName("age")
    val age: Int,

    @SerialName("isEmployed")
    val isEmployed: Boolean,

    @SerialName("salary")
    val salary: Double
)

@Serializable
data class EmployeesDTO(
    @SerialName("employees")
    val employeesDTO: List<EmployeeDTO>
)

fun EmployeeDTO.toEmployee(): Employee {
    return Employee(
        id, name, email, phone, age, isEmployed, salary //, startDate
    )
}
