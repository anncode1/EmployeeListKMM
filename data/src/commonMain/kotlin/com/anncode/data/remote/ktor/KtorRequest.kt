package com.anncode.data.remote.ktor

import com.anncode.data.remote.api.Api
import com.anncode.data.remote.api.ApiMethod
import com.anncode.data.remote.api.Request
import com.anncode.data.remote.api.Response
import io.ktor.client.HttpClient
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.request
import io.ktor.http.HttpMethod
import io.ktor.http.takeFrom
import io.ktor.util.InternalAPI


class KtorRequest(
    private val client: HttpClient
) : Api {
    @OptIn(InternalAPI::class)
    override suspend fun <T> request(request: Request<T>): Response<T> {
        val response = client.request {
            method(request.method)
            url(request.url, request.path)
            request.requestBody?.let {
                body = request.requestBody
            }
        }

        return Response(response)
    }

    private fun HttpRequestBuilder.method(originalMethod: ApiMethod) {
        method = when (originalMethod) {
            ApiMethod.GET -> HttpMethod.Get
            ApiMethod.POST -> HttpMethod.Post
            ApiMethod.PUT -> HttpMethod.Put
            ApiMethod.DELETE -> HttpMethod.Delete
        }
    }
    private fun HttpRequestBuilder.url(newUrl: String, path: String) = url {
        takeFrom(newUrl + path)
    }
}