package org.launchcode.java.studios.quiz;

import java.util.*;

public class Quiz {
    private ArrayList<Question> newQuiz;

    public Quiz(){
        this.newQuiz = newQuiz;
    }

//    public void addQuestion(Question newQuestion){
//        this.newQuiz.add(newQuestion);
//    }
//
//    public ArrayList<Question> getNewQuiz() {
//        return this.newQuiz;
//    }


//    public void runQuiz(ArrayList<Question> newQuiz) {
//        System.out.println("Welcome to This Random Quiz!\n" +
//                "Answer the following multiple choice and true/false questions and I'll" +
//                "tell you your score!");
//
//        Scanner input = new Scanner(System.in);
//
//        for (Question quesList : newQuiz)
//            if (quesList.getQuestionType() == "Multiple Choice") {
//                System.out.println(quesList.getAQuestion() + "\n");
//           ArrayList<String> allAnswerOptions = ((MultipleChoice) quesList).getAnswerOptions();
//                for (String option : ((MultipleChoice) quesList).getAnswerOptions()) {
//                    System.out.println(option + "\n");
//                }
//                String userHasChosenOption = input.nextLine();
//                System.out.println("The correct answer is: " +((MultipleChoice) quesList).getActualAnswer());
//                if(userHasChosenOption.contains(((MultipleChoice) quesList).getActualAnswer())){
//                    System.out.println("You have chosen wisely! You are correct!");
////                } else{
//                    System.out.println("You have chosen poorly. Better luck next time!");
//                }
//
//            } else if (quesList.getQuestionType() == "True/False"){
//                System.out.println(quesList.getAQuestion() + " True or False?\n");
//                String userHasChosenOption = input.nextLine();
//                System.out.println("The correct answer is: " + ((TrueFalse)quesList).getActualAnswer());
//                if(userHasChosenOption == (((TrueFalse)quesList).getActualAnswer()){
//                    System.out.println("");
//                }
//            }
//            }


//    public static void main(String[] args) {
//        ArrayList<String> possibleAnswers1 = new ArrayList<>();
//        String optionOne = "A. Barak Obama";
//        possibleAnswers1.add(optionOne);
//        String optionTwo = "B. Theodore Roosevelt";
//        possibleAnswers1.add(optionTwo);
//        String optionThree = "C. John F. Kennedy";
//        possibleAnswers1.add(optionThree);
//        MultipleChoice firstQuestion = new MultipleChoice("Who was the youngest President of the United " +
//                "States?", possibleAnswers1,"B");
//
//        ArrayList<String> possibleAnswers2 = new ArrayList<>();
//        String option2One = "A. Neil Armstrong";
//        possibleAnswers2.add(option2One);
//        String option2Two = "B. Buzz Aldrin";
//        possibleAnswers2.add(option2Two);
//        String option2Three = "C. Phil Cernan";
//        possibleAnswers2.add(option2Three);
//        MultipleChoice secondQuestion = new MultipleChoice("Who was the first person to walk on the" +
//                "moon?", possibleAnswers2,"A");
//
//        ArrayList<Question> newQuiz = new ArrayList<>();
////        newQuiz.add(firstQuestion);
////        newQuiz.add(secondQuestion);
//
//        Quiz myQuiz = new Quiz(firstQuestion, newQuiz);
//        myQuiz.addQuestion(secondQuestion, myQuiz);
//
//        System.out.println(firstQuestion.getAQuestion());
//        System.out.println(firstQuestion.getAnswerOptions());
//        Scanner input = new Scanner(System.in);
//        String userHasChosenOption = input.nextLine();
//        System.out.println("The correct answer is: " +firstQuestion.getActualAnswer());
//        if(userHasChosenOption.contains(firstQuestion.getActualAnswer())){
//                    System.out.println("You have chosen wisely! You are correct!");
//                } else{
//                    System.out.println("You have chosen poorly. Better luck next time!");
//                }
//
//
//
//
//    }
}
