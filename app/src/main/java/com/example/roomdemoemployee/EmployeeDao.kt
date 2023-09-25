package com.example.roomdemoemployee

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {

    @Insert
    suspend fun insert(employeeEntity: Employee)

    @Update
    suspend fun update(employeeEntity: Employee)

    @Delete
    suspend fun delete(employeeEntity: Employee)

    @Query("Select * from `employee-table`")
    fun fetchAllEmployee(): Flow<List<Employee>>

    @Query("Select * from `employee-table` where id=:id")
    fun fetchEmployeeById(id:Int): Flow<Employee>
}