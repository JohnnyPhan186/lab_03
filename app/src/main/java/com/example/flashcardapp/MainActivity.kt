package com.example.flashcardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashcardQuestion =  findViewById<View>(R.id.flashcard_question) //val is used to store the variable
        val flashcardAnswer = findViewById<View>(R.id.flashcard_answer)

        flashcardQuestion.setOnClickListener {
        flashcardQuestion.visibility = View.INVISIBLE
        flashcardAnswer.visibility = View.VISIBLE
        }
        //Basically the reverse of this ^
        flashcardAnswer.setOnClickListener {
            flashcardAnswer.visibility = View.INVISIBLE
            flashcardQuestion.visibility = View.VISIBLE
        }
    }

}