package com.company;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int pisteet = 0;
        List<Question> questions = QuestionsGenerator.generateQuestions();
        Random rand = new Random();

        while(true){
            int  questionNumber = rand.nextInt(questions.size()-1) + 1;
            Question question = questions.get(questionNumber);

            if(!QuestionHelper.askQuestion(question)){
                System.out.println("Vastasit väärin typerys!");
                System.out.println("Sait " + pisteet + " pistettä :)))");
                break;
            }
            pisteet++;
            System.out.println("Oikein! Taidatkin olla varsinainen mestari!");
        }
    }
}
