package com.sofkau.main;

import com.sofkau.interfaces.IUtilities;
import com.sofkau.models.Game;
import com.sofkau.models.Player;
import com.sofkau.models.Score;
import com.sofkau.questions.QuestionCollection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.sofkau.models.Question;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Main implements IUtilities {

    public static void main(String[] args) {
        List<List<Question>> totalQuestions = new ArrayList<>();
        List<List> questionListByLevel;
        totalQuestions = QuestionCollection.populateQuestionList();
        Integer option=0;

        // Instanciamos objetos
        Game game  = new Game();
        Score score = new Score();
        Player player = new Player();

        do {
            showMenu();
            option = requestOption();
            {
                switch (option){
                    case 1:
                        // game.showMenu()
                        // Menu:
                        // Bienvenidos
                        // 1. Iniciar juego
                        // 2. Salir
                        // game.requestOption()
                        // Logiga de Game
                        // ciclo
                        break;
                    case 2:
                        Integer opcionScore=0;
                        score.showMenu();
                        opcionScore = score.requestOption();
                        score.scoreUser();
                        score.cicloScore(opcionScore);

                        // score.cicloSclo(opcion);
                        // Menu:
                        // Bienvenidos
                        // 1. Ver ranking
                        // 2. Salir
                        // score.requestOption()
                        // Logica de Score
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        while(true);
    }


    public static void showMenu() {
        System.out.println("********BIENVENIDOS********");
        System.out.println("1. Comenzar un nuevo juego.");
        System.out.println("2. Puntajes altos.");
        System.out.println("3. Salir.");

    }

    public static Integer requestOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa una opción: ");
        int opcion=0;
        try {
            opcion = keyboard.nextInt();

        }catch (InputMismatchException e){
            System.out.print("Por favor ingresa un número entre 1 y 3: ");
        }
    return opcion;
    }
}


/*
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
*/

/*        Score score = new Score();
        score.scoreUser();
        score.showMenu();
        score.requestOption();*/

