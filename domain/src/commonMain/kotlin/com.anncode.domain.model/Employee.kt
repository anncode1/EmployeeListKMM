package com.anncode.domain.model

import kotlinx.datetime.LocalDateTime

data class Employee(
    val id: String,
    val name: String,
    val email: String,
    val phone: String,
    val age: Int,
    val isEmployed: Boolean,
    val salary: Double,
    //val startDate: LocalDateTime
)
