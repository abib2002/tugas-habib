package com.example.tugashabibzihandri

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.net.PasswordAuthentication

@Parcelize
data class User(
    val username:String,
    val password:String
):Parcelable
