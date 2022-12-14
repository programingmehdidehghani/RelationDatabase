package com.example.relationdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.relationdatabase.entities.Director
import com.example.relationdatabase.entities.School


data class SchoolAndDirector(
     @Embedded val school: School,
     @Relation(
         parentColumn = "schoolName",
         entityColumn = "schoolName"
     )
     val director: Director
)