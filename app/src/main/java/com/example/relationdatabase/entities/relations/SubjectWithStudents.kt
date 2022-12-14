package com.example.relationdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.relationdatabase.entities.Student
import com.example.relationdatabase.entities.StudentSubjectCrossRef
import com.example.relationdatabase.entities.Subject


data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students : List<Student>
)
