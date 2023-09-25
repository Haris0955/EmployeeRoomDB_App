package com.example.roomdemoemployee

import android.app.Application

// create the application class and initialize the database
class EmployeeApp : Application() {
    val db by lazy {
        EmployeeDatabase.getInstance(this)
    }
}