package com.anncode.data.remote.api

import com.anncode.data.remote.mockservice.EndPoint.BASE_URL

data class Request<T>(
    val method: ApiMethod,
    val url: String = BASE_URL,
    val path: String,
    val requestBody: Any? = null
)

enum class ApiMethod {
    GET,
    POST,
    PUT,
    DELETE
}