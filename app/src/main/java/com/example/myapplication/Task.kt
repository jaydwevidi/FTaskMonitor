package com.example.myapplication

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class Task(
    @PrimaryKey(autoGenerate = true) var id: Int,
    var name: String,
    var date: String,
    var description: String,
    var finished: Boolean = false,
    var priority: Int = 0
) : Parcelable