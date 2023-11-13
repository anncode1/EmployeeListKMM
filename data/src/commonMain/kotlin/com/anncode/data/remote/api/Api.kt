package com.anncode.data.remote.api

interface Api {
    suspend fun <T> request(request: Request<T>): Response<T>
}