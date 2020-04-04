package com.groundzero.github.feature.owner.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Owner(
    val id: Long,
    @SerializedName("login")
    val name: String,
    @SerializedName("avatar_url")
    val avatar: String,
    @SerializedName("html_url")
    val htmlUrl: String,
    val type: String,
    @SerializedName("site_admin")
    val isSiteAdmin: Boolean
) : Serializable