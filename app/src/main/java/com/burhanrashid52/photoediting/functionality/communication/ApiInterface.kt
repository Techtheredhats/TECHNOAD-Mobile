package com.burhanrashid52.photoediting.functionality.communication

import com.burhanrashid52.photoediting.functionality.model.ResponseSignIn
import com.burhanrashid52.photoediting.functionality.model.ResponseSignUp
import com.burhanrashid52.photoediting.functionality.model.SignInModel
import com.burhanrashid52.photoediting.functionality.model.SignUpModel
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {
    @POST(ApiConstants.SIGNIN)
    fun signIn(
        @Header("apikey") apikey: String,
        @Body signInModel: SignInModel,
    ): Call<ResponseSignIn>

    @POST(ApiConstants.SIGNUP)
    fun signUp(
        @Header("apikey") apikey: String,
        @Body signUpModel: SignUpModel,
    ): Call<ResponseSignUp>

   /* @POST(ApiConstants.VERIFY_LOGIN)
    fun verifyLogin(
        @Header("apikey") apikey: String,
        @Body verifyLoginMode: VerifyLoginMode,
    ): Call<ResponseSignIn>

    @GET(ApiConstants.GETALL)
    fun getAllService(
        @Header("apikey") apikey: String,
    ): Call<GetAllModel>

    @GET(ApiConstants.GETSERVICEDETAIL)
    fun getServiceDetail(
        @Header("apikey") apikey: String,
        @Path("serviceid") serviceid: Int,
    ): Call<GetServiceDetailModel>

    @Multipart
    @POST(ApiConstants.UPLOADBOOKINGIMAGE)
    fun uploadBookingImage(
        @Part("Userid") id: RequestBody,
        @Part bookingimage: MultipartBody.Part?,
        @Part("Authtoken") authtoken: RequestBody,
    ): Call<ResponseUploadBookingImage>

    @Multipart
    @POST(ApiConstants.UPLOADPROFILEIMAGE)
    fun uploadProfileImage(
        @Part("Userid") id: RequestBody,
        @Part Profileimage: MultipartBody.Part?,
        @Part("Authtoken") Authtoken: RequestBody,
    ): Call<ResponseUploadProfileImage>


    @GET(ApiConstants.GETPROFILE)
    fun getProfile(
        @Header("Authorization") authtoken: String,
    ): Call<GetProfileModel>

    @GET(ApiConstants.GETPROFILE)
    fun completedBookings(
        @Header("Authorization") authtoken: String,
    ): Call<GetProfileModel>

    @GET(ApiConstants.UPCOMINGBOOKINGS)
    fun upcomingBookings(
        @Header("Authorization") authtoken: String,
    ): Call<ResponseUpcomingBookings>

    @POST(ApiConstants.ADDBOOKING)
    fun addBooking(
        @Header("Authorization") authtoken: String,
        @Body addBookingModel: AddBookingModel,
    ): Call<ResponseAddBooking>

    @POST(ApiConstants.VALIDATETOKEN)
    fun validateToken(
        @Header("apikey") authtoken: String,
        @Body validateTokenModel: ValidateTokenModel,
    ): Call<ResponseValidateTokenModel>

    @POST(ApiConstants.REFRESHTOKEN)
    fun refreshToken(
        @Header("apikey") authtoken: String,
        @Body refrshTokenModel: RefreshTokenModel,
    ): Call<ResponseRefreshToken>

    @POST(ApiConstants.UPDATEPROFILE)
    fun updateProfile(
        @Header("Authorization") authtoken: String,
        @Body updateProfileModel: UpdateProfileModel,
    ): Call<ResponseUpdateProfile>

    @POST(ApiConstants.UPDATEPROFILEIMAGE)
    fun updateProfileImage(
        @Header("Authorization") authtoken: String,
        @Body updateProfileImageModel: UpdateProfileImageModel,
    ): Call<ResponseUpdateProfileImage>


    @POST("Booking/dobooking")
    fun doBooking(
        @Body doBooking: DoBooking,
    ): Call<DoBookingResponseClass>

    @POST("Payment/capturepayment")
    fun capturePayment(
        @Header("Authorization") authtoken: String,
        @Body captureBooking: CapturePayment,
    ): Call<CapturePaymentResponseClass>

    @POST("Payment/savepayment")
    fun savePayment(
        @Body savePayment: SaveBooking,
    ): Call<ResponseClass>


    @POST("PushNotification/sendbookingpushnotification")
    fun sendBookingPushNotification(
        @Body requestSaveBookingPushModel: RequestSaveBookingPushModel,
    ): Call<ResponseClass>
*/
//    @FormUrlEncoded
//    @POST(ApiConstants.VALIDATE_INSTALLATION)
//    fun validateInstallation(
//        @Field("store_code") storeCode: String,
//        @Field("branch_code") branchCode: String,
//    ): Call<EmployeesResponse>
//
//    //    @FormUrlEncoded
//    /* @POST(ApiConstants.LOGIN)
//     fun validateLogin(
//         @Body request: LoginRequestModel,
//     ): Call<LoginResponse>*/
//    @FormUrlEncoded
//    @POST(ApiConstants.LOGIN)
//    fun validateLogin(
//        @Field("username") username: String,
//        @Field("password") branchCode: String,
//    ): Call<LoginResponse>
//
//    @GET(ApiConstants.INSTALL_EMPLOYEES)
//    fun employeesInstallation(
//        @Query("store_code") storeCode: String,
//        @Query("branch_code") branchCode: String,
//    ): Call<EmployeesResponse>
//
//    @GET(ApiConstants.INSTALL_SUPPLIERS)
//    fun supplierInstallation(
//        @Query("store_code") storeCode: String,
//        @Query("branch_code") branchCode: String,
//    ): Call<SupplierResponse>
//
//    @GET(ApiConstants.INSTALL_PRODUCTS)
//    fun productInstallation(
//        @Query("store_code") storeCode: String,
//        @Query("branch_code") branchCode: String,
//    ): Call<ProductResponse>
//
//    @GET(ApiConstants.INSTALL_CUSTOMERS)
//    fun customerInstallation(
//        @Query("store_code") storeCode: String,
//        @Query("branch_code") branchCode: String,
//    ): Call<CustomerResponse>
//
//    @GET(ApiConstants.BILLYE_CUSTOMERS)
//    fun customerDetails(
//    ): Call<CustomerBillyeResponse>
//
//    @GET(ApiConstants.BILLYE_CATEGORY)
//    fun categoriesDetails(
//    ): Call<CategoryBillyeResponse>
//
//    @GET(ApiConstants.BILLYE_PRODUCTS)
//    fun productsDetails(
//    ): Call<ProductBillyeResponse>
//
//    @FormUrlEncoded
//    @POST(ApiConstants.CHECK_OUT)
//    fun checkout(
//        @Field("store_code") storeCode: String,
//        @Field("branch_code") branchCode: String,
//        @Field("sub_total") sub_total: Double,
//        @Field("vat_total") vat_total: Double,
//        @Field("grand_total") grand_total: Double,
//        @Field("payment_method") payment_method: Int,
//        @Field("check") check: String,
//        @Field("sale_by_id") sale_by_id: Int,
//        @FieldMap params: HashMap<String, String>,
//    ): Call<BillSavedResponse>
//
//    @GET(ApiConstants.SESSION)
//    fun getSession(
//    ): Call<GetSessionResponse>
//
//    @FormUrlEncoded
//    @POST(ApiConstants.POSTSESSION)
//    fun postSession(
//        @Field("uid") uid: Int,
//        @Field("salesdate") salesdate: String,
//        @Field("salesopeningAmt") salesopeningAmt: Int,
//        @Field("closingCash") closingCash: Int,
//        @Field("ClosingCardAmount") ClosingCardAmount: Int,
//        @Field("EnvelopeNumber") EnvelopeNumber: String,
//    ): Call<PostSessionResponse>
//
//    @FormUrlEncoded
//    @POST(ApiConstants.CLOSESESSION)
//    fun closesession(
//        @Field("uid") uid: Int,
//        @Field("salesdate") salesdate: String,
//        @Field("salesopeningAmt") salesopeningAmt: Int,
//        @Field("closingCash") closingCash: Int,
//        @Field("ClosingCardAmount") ClosingCardAmount: Int,
//        @Field("EnvelopeNumber") EnvelopeNumber: String,
//    ): Call<PostSessionResponse>
//
//    @GET(ApiConstants.GETPOSSALES)
//    fun getPossales(
//    ): Call<ResposnseGetPossalesModel>
}