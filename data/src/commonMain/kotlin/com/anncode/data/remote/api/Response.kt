package com.anncode.data.remote.api

import io.ktor.client.statement.HttpResponse

data class Response<T>(
    val response: HttpResponse
)