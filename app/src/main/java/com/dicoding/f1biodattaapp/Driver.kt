package com.dicoding.f1biodattaapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Driver(
    val name: String,
    val team: String,
    val nationality: Int
): Parcelable
