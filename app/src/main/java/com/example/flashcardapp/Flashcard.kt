package com.example.flashcardapp //This class defines objects that we put in the database. For every field in Flashcard, a column is created in the database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.util.*

@Entity // Each Entity corresponds to table in our database
data class Flashcard( //Each instance of a flashcard, represents a row in our database table.
    @ColumnInfo(name = "question") val question: String,
    @ColumnInfo(name = "answer") val answer: String,
    @ColumnInfo(name = "wrong_answer_1") val wrongAnswer1: String? = null,
    @ColumnInfo(name = "wrong_answer_2") val wrongAnswer2: String? = null,
    @PrimaryKey(autoGenerate = true) var uuid: Int = 0,
)
