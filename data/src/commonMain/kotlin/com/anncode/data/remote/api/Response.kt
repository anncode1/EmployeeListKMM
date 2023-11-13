package com.anncode.data.remote.api

import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.http.isSuccess

data class Response<T>(
    val response: HttpResponse
)

class ResponseMapper {
    suspend inline fun <reified T> map(httpResponse: Response<T>): Result<T> {
        return if (httpResponse.response.status.isSuccess()) {
            Result.success(httpResponse.response.body())
        } else if (httpResponse.response.status.value == 401) {
            Result.failure(Exception())
        } else {
            Result.failure(Throwable("Error"))
        }
    }
}