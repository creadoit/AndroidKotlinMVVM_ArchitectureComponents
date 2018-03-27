package com.company.project.api

import com.company.project.database.entity.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by tim.wienrich on 27.03.18.
 */
interface UserWebservice {
    @GET("/users/{user}")
    fun getUser(@Path("user") userId: String): Call<User>
}