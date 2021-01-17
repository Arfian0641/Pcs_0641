package com.Arfian.pcs.ui.main.api

import com.Arfian.pcs.ui.main.data.model.DetailUserResponse
import com.Arfian.pcs.ui.main.data.model.User
import retrofit2.Call
import com.Arfian.pcs.ui.main.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 90aed56b74d8641390ca0de41c628ddb6a065b2b")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 90aed56b74d8641390ca0de41c628ddb6a065b2b")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 90aed56b74d8641390ca0de41c628ddb6a065b2b")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 90aed56b74d8641390ca0de41c628ddb6a065b2b")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>

}