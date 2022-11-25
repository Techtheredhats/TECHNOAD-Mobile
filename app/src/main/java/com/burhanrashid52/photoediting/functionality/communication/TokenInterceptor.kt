package com.billye.android.communication

import okhttp3.Response
import okhttp3.Interceptor
import java.io.IOException
//import com.billye.android.common.UserSession
import okhttp3.ResponseBody.Companion.toResponseBody

class TokenInterceptor : Interceptor {

    //    @Throws(IOException::class)
//    override fun intercept(chain: Interceptor.Chain): Response {
//        val originalRequest = chain.request()
//
//        val requestBuilder = originalRequest.newBuilder()
//            .addHeader(ApiConstants.AUTHORIZATION_HEADER, UserSession.getAccessToken() ?: "")
//
//        val newRequest = requestBuilder.build()
//        val response = chain.proceed(newRequest)
//
//        val bodyString = response.body?.string()
//        return response.newBuilder()
//            .body(bodyString?.toResponseBody(response.body?.contentType()))
//            .build()
//    }
    override fun intercept(chain: Interceptor.Chain): Response {
        TODO("Not yet implemented")
    }
}