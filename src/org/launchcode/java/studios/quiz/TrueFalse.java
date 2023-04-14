package org.launchcode.java.studios.quiz;

import java.util.*;

public class TrueFalse extends Question {
    private ArrayList<String> actualAnswers;

    public TrueFalse(String question, ArrayList<String> actualAnswers){
        super(question, "True/False");
        this.actualAnswers = actualAnswers;
    }

    public void askQuestion(){
        System.out.println(super.getAQuestion());
        for(int i = 0; i < actualAnswers.size(); i++){
            System.out.println(i + "." + actualAnswers.get(i));
        }
    }
    public ArrayList<String> getActualAnswer(){
        return actualAnswers;
    }

    public void setActualAnswer(ArrayList<String> newAnswer){
        this.actualAnswers = newAnswer;
    }



}
