package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;
import com.sofkau.questions.QuestionCollection;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Game implements IUtilities {
    public void showMenu() {
        System.out.println("\n*********BIENVENIDOS AL JUEGO*********\n");
        System.out.println("1. Iniciar nueva partida");
        System.out.println("2. Volver al menu principal");
        System.out.println("3. Salir");
    }

    public Integer requestOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa una opción: ");
        int option = 0;
        try {
            option = keyboard.nextInt();

        } catch (InputMismatchException e) {
            System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3 ");
            showMenu();
            requestOption();
        }
        return option;
    }

    public void gameCycle(Integer option) {
        do {
            switch (option){
                case 1:
                    //iniciar juego
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

    public void startGame() {
        QuestionCollection.populateQuestionList();

    }

}
