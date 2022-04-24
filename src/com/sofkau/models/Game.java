package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;
import com.sofkau.questions.QuestionCollection;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Game implements IUtilities {
    private final Integer TOTAL_LEVELS = 5;

    public void showMenu() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("***********************************\n***********-JUEGO-*****************\n***********************************\n");
        System.out.println("-1. INICIAR UNA PARTIDA");
        System.out.println("-2. VOLVER AL MENU");
        System.out.println("3. SALIR");
        System.out.println(randomQuestion());
    }

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

    public void gameCycle(Integer option, Player player, Score score, List<List<Question>> totalQuestions) {
        do {
            switch (option){
                case 1:
                    startGame(player, score, totalQuestions);
                    break;
                case 2:
                    //volver al menu
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3, GRACIAS");
                    showMenu();
                    option = requestOption();
            }
        }while (option != 3);
    }

    public void startGame(Player player, Score score, List<List<Question>> totalQuestions) {
        // Contruimos cilo del juego por niveles. Total niveles = 5
        Integer counter = 0;
        while (counter < TOTAL_LEVELS){
            //Validacion si la pregunta es correcta
            Integer randomIndex = randomQuestion();
            totalQuestions.get(counter).get(randomIndex).displayQuestion();
            System.out.println(randomIndex);

            counter++;
        }
    }

    public Integer randomQuestion(){
        Integer selectedQuestion = 0 ;
        int max = 4;
        int min = 0;
        int rang= max - min +1;
        for (int i = 0; i < 4; i++) {
            selectedQuestion = (int ) (Math.random() * rang)+min;
        }
        return selectedQuestion;
    }

    public Boolean validateAnswer(Question question, String answer){
        return question.showAnswer() == answer?true:false;
    }

    public String requestAnswer(){
        String requestedAnswer;
        Boolean isValidated = false;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("POR FAVOR INGRESA LA RESPUESTA: ");
            requestedAnswer = keyboard.nextLine();
            isValidated = validateTypo(requestedAnswer);
        }while (!isValidated);
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
