package com.anncode.data.remote.api

import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.http.isSuccess

data class Response<T>(
    val response: HttpResponse
)