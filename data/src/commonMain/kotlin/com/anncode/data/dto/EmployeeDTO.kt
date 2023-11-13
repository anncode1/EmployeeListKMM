package com.anncode.data.dto

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class EmployeeDTO(
    val id: String,
    val name: String,
    val email: String,
    val phone: String,
    val age: Int,
    val isEmployed: Boolean,
    val salary: Double,
    val startDate: LocalDateTime
)
