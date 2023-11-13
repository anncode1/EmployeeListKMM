package com.anncode.data.di

import com.anncode.data.remote.ktor.KtorRequest
import com.anncode.data.remote.ktor.getHttpClient
import org.koin.dsl.module

fun dataModule() = module {
    single { getHttpClient() }
    single { KtorRequest(get()) }
}