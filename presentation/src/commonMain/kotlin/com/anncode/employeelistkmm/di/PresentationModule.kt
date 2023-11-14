package com.anncode.employeelistkmm.di

import com.anncode.employeelistkmm.employees.EmployeesViewModel
import org.koin.core.component.KoinComponent
import org.koin.dsl.module

fun presentationModule() = module {
    single { EmployeesViewModel(get()) }
}

object KotlinDependencies : KoinComponent {

    fun getEmployeesViewModel() = getKoin().get<EmployeesViewModel>()
}