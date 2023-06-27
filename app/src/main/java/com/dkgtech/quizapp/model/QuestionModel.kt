package com.dkgtech.quizapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions_table")
data class QuestionModel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "question") val question: String,
    @ColumnInfo(name = "optA") val optA: String,
    @ColumnInfo(name = "optB") val optB: String,
    @ColumnInfo(name = "optC") val optC: String,
    @ColumnInfo(name = "optD") val optD: String,
    @ColumnInfo(name = "answer") val answer: Int

)
