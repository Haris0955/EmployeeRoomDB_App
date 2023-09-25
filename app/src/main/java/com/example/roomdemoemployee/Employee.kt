package com.example.roomdemoemployee


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//creating a Data Model Class
@Entity(tableName = "employee-table")
data class Employee(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    var name: String,
    @ColumnInfo(name = "email-id")
    var email: String)
