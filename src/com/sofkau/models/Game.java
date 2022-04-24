package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements IUtilities {
    public void showMenu() {
        System.out.println("\n*********BIENVENIDOS AL JUEGO*********\n");
        System.out.println("1. Iniciar nueva partida");
        System.out.println("2. Volver al menu principal");
        System.out.println("3. Salir");
    }

    public void requestOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa una opción: ");
        int opcion = 0;
        try {
            opcion = keyboard.nextInt();

        } catch (InputMismatchException e) {
            System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3 ");
            showMenu();
            requestOption();
        }
        switch (opcion) {
            case 1:
                //nueva partida
                break;
            case 2:
                //menu principal
                break;
            case 3:
                //salir
                break;
            default:
                System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3, GRACIAS");
        }
    }
}
