package com.sofkau.main;

import com.sofkau.models.Player;
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
        score.addScorePlayer(new Player("Manuel1", 600, 1, 1));
        score.addScorePlayer(new Player("Manuel2", 500, 1, 1));
        score.addScorePlayer(new Player("Manuel3", 200, 1, 1));
        score.addScorePlayer(new Player("Manuel4", 800, 1, 1));
        score.addScorePlayer(new Player("Manuel5", 100, 1, 1));
        score.addScorePlayer(new Player("Manuel6", 150, 1, 1));
        score.addScorePlayer(new Player("Manuel7", 50, 1, 1));
        score.addScorePlayer(new Player("Manuel7", 1000, 1, 1));
        score.addScorePlayer(new Player("Manuel7", 500, 1, 1));
        score.addScorePlayer(new Player("Manuel7", 5000, 1, 1));

        score.showMenu();
        score.requestOption();
    }
}

