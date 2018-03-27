package com.company.project.database.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by tim.wienrich on 27.03.18.
 */

@Entity
class User// --- CONSTRUCTORS ---
(@PrimaryKey
 @SerializedName("id")
 @Expose var id: String, login: String, avatar_url: String, name: String, company: String, blog: String, lastRefresh: Date) {

    @SerializedName("login")
    @Expose
    var login: String? = login

    @SerializedName("avatar_url")
    @Expose
    var avatar_url: String? = avatar_url

    @SerializedName("name")
    @Expose
    var name: String? = name

    @SerializedName("company")
    @Expose
    var company: String? = company

    @SerializedName("blog")
    @Expose
    var blog: String? = blog

    var lastRefresh: Date? = lastRefresh

}
