package com.example.relationdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.relationdatabase.entities.Student
import com.example.relationdatabase.entities.StudentSubjectCrossRef
import com.example.relationdatabase.entities.Subject


data class StudentWithSubjects(
     @Embedded val student: Student,
     @Relation(
         parentColumn = "studentName",
         entityColumn = "subjectName",
         associateBy = Junction(StudentSubjectCrossRef::class)
     )
     val subjects : List<Subject>
)
