package com.example.submission_android_pemula.yofhi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cat(
    var name: String = "",
    var description: String = "",
    var photo: String = "",
):Parcelable
