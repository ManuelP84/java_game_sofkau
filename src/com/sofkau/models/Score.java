package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;

import java.util.*;

public class Score implements IUtilities {
    List<Player> playersSortedPrice = new ArrayList<>();

    public void setPlayer(Player player) {
        this.playersSortedPrice.add(player);
    }

    @Override
    public void showMenu() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("***********************************\n************-HIGH SCORE-***********\n***********************************\n");
        System.out.println("-1. ULTIMOS MEJORES PUNTAJES");
        System.out.println("-2. VOLVER AL MENU PRINCIPAL");
        System.out.println("-3. SALIR");
        System.out.println();
    }

    @Override
    public Integer requestOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("INGRESA UNA OPCIÓN: ");
        int opcion = 0;
        try {
            opcion = keyboard.nextInt();

        } catch (InputMismatchException e) {
            System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3 ");
            showMenu();
            requestOption();
        }
        return opcion;
    }

    public void showHighestScore() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("***********************************\n*******-RANKING DE JUGADORES-******\n***********************************\n");
        playersSortedPrice.stream().forEach(System.out::println);
    }

    public void orderScore() {
        Comparator<Player> priceComparator = Comparator.comparing(Player::getPrice);
        Collections.sort(playersSortedPrice, priceComparator.reversed());
    }

    public void cicloScore(Integer opcion) {
        do {
            switch (opcion) {
                case 1:
                    orderScore();
                    showHighestScore();
                    opcion = 3;
                    break;
                case 2:
                    //System.out.print("menu principal");
                    opcion = 3;
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.print("POR FAVOR, INGRESA UN NUMERO ENTRE 1 Y 3, GRACIAS");
                    showMenu();
                    opcion = requestOption();
            }
        } while (opcion != 3);
    }
}
