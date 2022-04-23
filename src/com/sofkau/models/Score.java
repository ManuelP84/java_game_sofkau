package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Score implements IUtilities {

    private ArrayList<Player> listPlayers = new ArrayList<>();

    public ArrayList orderListPlayers() {
        ArrayList<Player> playersDisplayedOrderely = new ArrayList<>();

        return playersDisplayedOrderely;
    }

    public void addPlayer(Player player) {
        this.listPlayers.add(player);
    }


    @Override
    public void showMenu() {
        System.out.println(" BIENVENIDOS A HIGH SCORE");
        System.out.println("1.ULTIMOS MEJORES PUNTAJES");
        System.out.println("2.VOLVER AL MENU PRINCIPAL");
        System.out.println("3.SALIR");
    }

    @Override
    public void requestOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("INGRESA UNA OPCION: ");
        int opcion=0;
        try {
             opcion = keyboard.nextInt();

        }catch (InputMismatchException e){
            System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3 ");
            showMenu();
            requestOption();
        }
        switch (opcion){
            case 1:
                System.out.println("score");
                showMenu();
                break;
            case 2:
                System.out.print("menu principal");
                break;
            case 3:
                System.out.print("salir");
            default:
                System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3, GRACIAS");
                showMenu();
                requestOption();
        }
    }
}
