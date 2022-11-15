package com.example.relationdatabase.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(primaryKeys = ["studentName" , "subjectName"])
data class StudentSubjectCrossRef(
    val studentName : String,
    val subjectName : String
)
