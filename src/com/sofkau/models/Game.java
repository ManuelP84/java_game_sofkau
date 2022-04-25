package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Game implements IUtilities {
    private final Integer TOTAL_LEVELS = 5;

    @Override
    public void showMenu() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("***********************************\n***********-JUEGO-*****************\n***********************************\n");
        System.out.println("-1. INICIAR UNA PARTIDA");
        System.out.println("-2. VOLVER AL MENU");
        System.out.println("-3. SALIR");
    }

    @Override
    public Integer requestOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("INGRESA UNA OPCION: ");
        int option = 0;
        try {
            option = keyboard.nextInt();

        } catch (InputMismatchException e) {
            System.out.print("POR FAVOR, INGRESA UN NUMERO ENTRE 1 Y 3 ");
            showMenu();
            requestOption();
        }
        return option;
    }

    public Integer gameCycle(Integer option, List<List<Question>> totalQuestions) {
        Integer price = 0;
        do {
            switch (option) {
                case 1:
                    price = startGame(totalQuestions);
                    option = 3;
                    break;
                case 2:
                    option = 3;
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3, GRACIAS");
                    showMenu();
                    option = requestOption();
            }
        } while (option != 3);
        return price;
    }

    public Integer startGame(List<List<Question>> totalQuestions) {
        Integer price = 0;
        Integer counter = 0;
        while (counter < TOTAL_LEVELS) {
            String requestedAnswer;
            Question question;
            Boolean validatedAnswer;
            Integer randomIndex = randomQuestion();
            question = totalQuestions.get(counter).get(randomIndex);
            question.displayQuestion();
            requestedAnswer = requestAnswer();
            validatedAnswer = validateAnswer(question, requestedAnswer);
            if (validatedAnswer == false) {
                break;
            }
            price += 100;
            counter++;
        }
        return price;
    }

    public Integer randomQuestion() {
        Integer selectedQuestion = 0;
        int max = 4;
        int min = 0;
        int rang = max - min + 1;
        for (int i = 0; i < 4; i++) {
            selectedQuestion = (int) (Math.random() * rang) + min;
        }
        return selectedQuestion;
    }

    public Boolean validateAnswer(Question question, String answer) {
        return answer.equals(question.showAnswer()) ? true : false;
    }

    public String requestAnswer() {
        String requestedAnswer;
        Boolean isValidated = false;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("POR FAVOR INGRESA LA RESPUESTA: ");
            requestedAnswer = keyboard.nextLine();
            isValidated = validateTypo(requestedAnswer);
        } while (!isValidated);
        return requestedAnswer;
    }

    public Boolean validateTypo(String answer) {
        Boolean isValidated = false;

        switch (answer) {
            case "1":
            case "2":
            case "3":
            case "4":
                isValidated = true;
        }
        return isValidated;
    }
}
