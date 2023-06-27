package com.dkgtech.quizapp.roomDb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dkgtech.quizapp.model.QuestionModel

@Dao
interface QuestionDao {

    @Insert
    fun addQuestion(newQuestion: QuestionModel)

    @Delete
    fun deleteQuestion(question: QuestionModel)

    @Update
    fun updateQuestion(question: QuestionModel)

    @Query("select * from questions_table")
    fun getAllQuestion(): LiveData<List<QuestionModel>>

}