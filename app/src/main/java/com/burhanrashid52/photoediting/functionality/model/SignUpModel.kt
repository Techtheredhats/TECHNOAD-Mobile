package com.burhanrashid52.photoediting.functionality.model

data class SignUpModel(
    val email: String,
    val mobile: String,
    val firstname: String,
    val lastname: String,
    val password: String,
)

data class ResponseSignUp(
    val statuscode: Int,
    val message: String,
    val haserror: Boolean,
)