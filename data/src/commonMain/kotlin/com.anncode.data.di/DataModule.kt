package com.anncode.data.di

import com.anncode.data.remote.api.Api
import com.anncode.data.remote.api.ResponseMapper
import com.anncode.data.remote.ktor.KtorRequest
import com.anncode.data.remote.ktor.getHttpClient
import com.anncode.data.repository.EmployeeRepositoryImpl
import com.anncode.domain.repository.EmployeesRepository
import org.koin.dsl.module

fun dataModule() = module {
    single { getHttpClient() }
    single<Api> { KtorRequest(get()) }
    single<EmployeesRepository> { EmployeeRepositoryImpl(get(), get()) }
    factory { ResponseMapper() }
}