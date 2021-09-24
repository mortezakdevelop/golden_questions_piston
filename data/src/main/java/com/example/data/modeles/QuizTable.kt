package com.example.data.modeles

data class QuizTable(
    val id:Int,
    val QuizNumber:Int,
    val title:String,
    val answer1:String,
    val answer2:String,
    val answer3:String,
    val answer4:String,
    val trueAnswer:Int,
    val image:Int
)
