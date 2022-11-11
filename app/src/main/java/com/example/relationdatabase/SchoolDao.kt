package com.example.relationdatabase

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.relationdatabase.entities.Director
import com.example.relationdatabase.entities.School

interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)
}