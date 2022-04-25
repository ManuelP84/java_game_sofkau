package com.sofkau.main;

import com.sofkau.models.Game;
import com.sofkau.models.Player;
import com.sofkau.models.Score;
import com.sofkau.questions.QuestionCollection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.sofkau.models.Question;


public class Main {

    public static void main(String[] args) {
        List<List<Question>> totalQuestions = new ArrayList<>();
        totalQuestions = QuestionCollection.populateQuestionList();
        Integer option = 0;
        Integer price = 0;

        Game game = new Game();
        Score score = new Score();

        do {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("***********************************\n***********-BIENVENIDOS-***********\n***********************************\n");
            System.out.println();
            System.out.println("POR FAVOR, SIGUE  LAS INSTRUCCIONES DE  LA CONSOLA ");
            System.out.println();
            System.out.println("-1. COMENZAR UN NUEVO JUEGO");
            System.out.println("-2. PUNTAJES ALTOS");
            System.out.println("-3. SALIR");
            System.out.println();

            Scanner keyboard = new Scanner(System.in);
            System.out.print("INGRESA UNA OPCIÓN: ");
            try {
                option = keyboard.nextInt();

            } catch (InputMismatchException e) {
                System.out.print("POR FAVOR, INGRESA UN NUMERO ENTRE 1 Y 3: ");
            }
            {
                switch (option) {
                    case 1:
                        Player player = new Player();
                        player.requestName();
                        Integer optionGame = 0;
                        game.showMenu();
                        optionGame = game.requestOption();
                        price = game.gameCycle(optionGame, totalQuestions);
                        player.setPrice(price);
                        score.setPlayer(player);
                        System.out.println();
                        System.out.println("GRACIAS POR PARTICIPAR " + player.getName().toUpperCase() + " TU PREMIO ACUMULADO FUE DE: " + player.getPrice());
                        System.out.println();
                        break;
                    case 2:
                        Integer opcionScore = 0;
                        score.showMenu();
                        opcionScore = score.requestOption();
                        score.cicloScore(opcionScore);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        while (true);
    }
}
