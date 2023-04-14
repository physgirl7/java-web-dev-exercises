package org.launchcode.java.studios.quiz;

import java.util.*;

public class Checkbox extends Question {
    private ArrayList<String> answerOptions;
    private ArrayList<String> actualAnswer;

    public Checkbox(String question, ArrayList<String> answerOptions, ArrayList<String> actualAnswer){
        super(question, "Check Box");
        this.answerOptions = answerOptions;
        this.actualAnswer = actualAnswer;
    }

    public ArrayList<String> getAnswerOptions(){
        return answerOptions;
    }

    public ArrayList<String> getActualAnswer(){
        return actualAnswer;
    }

    public void setAnswerOptions(ArrayList<String> newAnswerOptions){
        this.answerOptions = newAnswerOptions;
    }

    public void setActualAnswer(ArrayList<String> newActualAnswer){
        this.actualAnswer = newActualAnswer;
    }
}
