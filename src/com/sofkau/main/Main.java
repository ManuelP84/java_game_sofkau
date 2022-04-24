package com.sofkau.main;

import com.sofkau.models.Score;
import com.sofkau.questions.QuestionCollection;

import java.util.ArrayList;
import java.util.List;
import com.sofkau.models.Question;


public class Main {

    public static void main(String[] args) {
        List<List<Question>> totalQuestions = new ArrayList<>();
        List<List> questionListByLevel;
        totalQuestions = QuestionCollection.populateQuestionList();

        System.out.println(totalQuestions.get(0).get(0).showCathegory());
        System.out.println(totalQuestions.get(0).get(0).showQuestion());
        System.out.println(totalQuestions.get(0).get(1).showCathegory());
        System.out.println(totalQuestions.get(0).get(1).showQuestion());
        System.out.println(totalQuestions.get(0).get(2).showCathegory());
        System.out.println(totalQuestions.get(0).get(2).showQuestion());
        System.out.println(totalQuestions.get(0).get(3).showCathegory());
        System.out.println(totalQuestions.get(0).get(3).showQuestion());
        System.out.println(totalQuestions.get(0).get(4).showCathegory());
        System.out.println(totalQuestions.get(0).get(4).toString());

        Score score = new Score();
        score.scoreUser();
        score.showMenu();
        score.requestOption();
    }
}

