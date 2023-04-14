package org.launchcode.java.studios.quiz;

import java.util.*;

public class MultipleChoice extends Question {
    private ArrayList<String> answerOptions;
    private String actualAnswer;


    public MultipleChoice(String question, ArrayList<String> answerOptions, String actualAnswer){
        super(question, "Multiple Choice");
        this.answerOptions = answerOptions;
        this.actualAnswer = actualAnswer;
    }

    public ArrayList<String> getAnswerOptions(){
        return answerOptions;
    }

    public String getActualAnswer(){
        return actualAnswer;
    }

    public void setAnswerOptions(ArrayList<String> newAnswerOptions){
        this.answerOptions = newAnswerOptions;
    }

    public void setActualAnswer(String newActualAnswer){
        this.actualAnswer = newActualAnswer;
    }

    public static void main(String[] args) {
        ArrayList<String> possibleAnswers = new ArrayList<>();
        String optionOne = "Barak Obama";
        possibleAnswers.add(optionOne);
        String optionTwo = "Theodore Roosevelt";
        possibleAnswers.add(optionTwo);
        String optionThree = "John F. Kennedy";
        possibleAnswers.add(optionThree);
        MultipleChoice firstQuestion = new MultipleChoice("Who was the youngest President of the United " +
                "States?", possibleAnswers,"Theodore Roosevelt");

        System.out.println(firstQuestion.getAQuestion());
        System.out.println(firstQuestion.getAnswerOptions());
        System.out.println(firstQuestion.getActualAnswer());
        System.out.println(firstQuestion.getQuestionType());
    }
}
