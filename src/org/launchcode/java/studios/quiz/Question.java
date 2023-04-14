package org.launchcode.java.studios.quiz;

public abstract class Question {
    private String aQuestion;
    private String questionType;

    public Question(){
        this.aQuestion = "No question entered";
        this.questionType = "No question type given";
    }

    public Question(String aQuestion, String questionType){
        this.aQuestion = aQuestion;
        this.questionType = questionType;
    }

    public String getAQuestion(){
        return this.aQuestion;
    }

    public void setAQuestion(String newQuestion){
        this.aQuestion = newQuestion;
    }

    public String getQuestionType(){
        return this.questionType;
    }

}
