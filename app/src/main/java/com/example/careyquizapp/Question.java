package com.example.careyquizapp;

public class Question {
    //instance variable
    private String qText;
    private String correctAnswer;
    private int picture;
    
    //constructor(s)
    public Question(){
        qText = "Question undefined";
        correctAnswer = "";
        picture = 0;
    }
    public Question(String newQText, String newCorrectAnswer, int newPicture){
        qText = newQText;
        correctAnswer = newCorrectAnswer;
        picture = newPicture;
    }

    //methods
    public String getQText(){
        return qText;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public int getPicture(){
        return picture;
    }
    public void setQText(String newQText){
        qText = newQText;
    }
    public void setCorrectAnswer(String newCorrectAnswer){
        correctAnswer = newCorrectAnswer;
    }
    public void setPicture(int newPicture){
        picture = newPicture;
    }
    @Override
    public String toString(){
        return "The question text is: " + qText + ". The correct answer answer is: " + correctAnswer +".The picture id is:"+ picture + ".";
    }

}
