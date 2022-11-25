package com.burhanrashid52.photoediting.functionality.communication

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiManager {
//    val baseUrl = "https://jaldi.book-reading.com/api/"
//    val baseUrl = "https://billye.app/api/"
    val url = "http://185.173.34.168:81/"
    val baseUrl = "http://185.173.34.168/api/"

    fun create(): ApiInterface {
    var gson = GsonBuilder()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
        .create()

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

        return retrofit.create(ApiInterface::class.java)
    }

//    fun create(): ApiInterface {
//        val gson = GsonBuilder().serializeNulls()
//            .setLenient()
//            .create()
//        val retrofit = Retrofit.Builder()
//            .baseUrl(baseUrl)
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .client(defaultOkHttpClient()!!).build()
//        return retrofit.create(ApiInterface::class.java)
//    }

//    private fun defaultOkHttpClient(): OkHttpClient? {
//        val client = OkHttpClient.Builder()
//        client.connectTimeout(50000, TimeUnit.MILLISECONDS)
//        client.readTimeout(50000, TimeUnit.MILLISECONDS)
//        client.writeTimeout(50000, TimeUnit.MILLISECONDS)
//        client.interceptors().add(TokenInterceptor())
//        return client.build()
//    }
//
//    fun createPartFromString(string: String): RequestBody {
//        return RequestBody.create(MultipartBody.FORM, string)
//    }
}
