package com.example.flashcardapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.flashcardapp.Flashcard

@Dao
interface FlashcardDao { //Dao stands for Data Access Objects. This is a fancy way of saying that this class lets us perform SQL queries without actually having to write complicated SQL queries.
    @Query("SELECT * FROM flashcard")
    fun getAll(): List<Flashcard>

    @Insert
    fun insertAll(vararg flashcards: Flashcard)

    @Delete
    fun delete(flashcard: Flashcard)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(flashcard: Flashcard)
}
