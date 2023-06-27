package com.dkgtech.quizapp.roomDb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dkgtech.quizapp.model.QuestionModel

@Database(entities = [QuestionModel::class], exportSchema = false, version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        val DATABASE_NAME = "question_db"
        var DATABASE_INTSANCE: AppDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): AppDatabase {
            if (DATABASE_INTSANCE == null) {
                DATABASE_INTSANCE = Room.databaseBuilder(
                    context.applicationContext, AppDatabase::class.java,
                    DATABASE_NAME
                ).allowMainThreadQueries().build()
            }
            return DATABASE_INTSANCE!!
        }
    }

    abstract fun QuestionDao(): QuestionDao

    fun AllQuestion() {
        QuestionDao().apply {
            addQuestion(
                QuestionModel(
                    id = 0,
                    question = "How to pass the data between activities in Android?",
                    optA = "Intent",
                    optB = "Content Provider",
                    optC = "Broadcast receiver",
                    optD = "None of the Above",
                    answer = 1
                )
            )

            addQuestion(
                QuestionModel(
                    id = 0,
                    question = "How to get current location in android?",
                    optA = "Using with GPRS",
                    optB = "Using location provider",
                    optC = "A & B",
                    optD = "None of the Above",
                    answer = 3
                )
            )

            addQuestion(
                QuestionModel(
                    id = 0,
                    question = "How many ports are allocated for new emulator?",
                    optA = "2",
                    optB = "0",
                    optC = "10",
                    optD = "None of the Above",
                    answer = 1
                )
            )

        }
    }
}