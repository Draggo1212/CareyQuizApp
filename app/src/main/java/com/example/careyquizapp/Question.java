package com.example.careyquizapp;

public class Question {
    //instance variable
    private String qText;
    private String correctAnswer;
    
    //constructor(s)
    public Question(){
        qText = "Question undefined";
        correctAnswer = "";
    }
    public Question(String newQText, String newCorrectAnswer){
        qText = newQText;
        correctAnswer = newCorrectAnswer;
    }

    //methods
    public String getQText(){
        return qText;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public void setQText(String newQText){
        qText = newQText;
    }
    public void setCorrectAnswer(String newCorrectAnswer){
        correctAnswer = newCorrectAnswer;
    }
    @Override
    public String toString(){
        return "The question text is: " + qText + ". The correct answer answer is: " + correctAnswer + ".";
    }

}
