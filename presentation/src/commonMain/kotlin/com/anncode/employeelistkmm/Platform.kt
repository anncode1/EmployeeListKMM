package com.anncode.employeelistkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform