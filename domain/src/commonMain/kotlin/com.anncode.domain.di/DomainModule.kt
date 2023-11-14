package com.anncode.domain.di

import com.anncode.domain.usecases.GetEmployees
import org.koin.dsl.module

fun useCaseModule() = module {
    single { GetEmployees(get()) }
}