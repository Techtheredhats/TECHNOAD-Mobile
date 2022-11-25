package com.burhanrashid52.photoediting.functionality.model

import android.os.Parcel
import android.os.Parcelable

data class SignInModel(
    val email: String,
    val mobile: String,
    val password: String,

)

data class ResponseSignIn(
    val statuscode: Int,
    val message: String,
    val haserror: Boolean,
    val result: User,
)


data class User(
    val userid: Int,
    val email: String,
    var firstname: String,
    var lastname: String,
    var authtoken: String,
    var refreshtoken: String,
    var imagepath: String,
    val smsotp: Int,
    val emailcode: Int,
)

