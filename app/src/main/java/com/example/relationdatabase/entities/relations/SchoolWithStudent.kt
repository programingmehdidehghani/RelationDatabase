package com.example.relationdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.relationdatabase.entities.School
import com.example.relationdatabase.entities.Student


data class SchoolWithStudent(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val student: List<Student>

)

