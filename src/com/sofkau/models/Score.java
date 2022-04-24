package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;

import java.util.*;

public class Score implements IUtilities {
    private ArrayList users = new ArrayList<>();
    List<Player> playersSortedPrice = new ArrayList<>(users);

    public void scoreUser() {
        playersSortedPrice.add(new Player("Manuel1", 600, 1, 1));
        playersSortedPrice.add(new Player("Manuel2", 500, 1, 1));
        playersSortedPrice.add(new Player("Manuel3", 200, 1, 1));
        playersSortedPrice.add(new Player("Manuel4", 800, 1, 1));
        playersSortedPrice.add(new Player("Manuel5", 100, 1, 1));
        playersSortedPrice.add(new Player("Manuel6", 150, 1, 1));
        playersSortedPrice.add(new Player("Manuel7", 50, 1, 1));
        playersSortedPrice.add(new Player("Manuel8", 1000, 1, 1));
        playersSortedPrice.add(new Player("Manuel9", 500, 1, 1));
        playersSortedPrice.add(new Player("Manuel10", 5000, 1, 1));
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
                System.out.println("********************\n**********SCORE**********\n********************");
                highestScore();
                showHighestScore();
                showMenu();
                break;
            case 2:
                System.out.print("menu principal");
                break;
            case 3:
                System.out.print("salir");
                break;
            default:
                System.out.print("POR FAVOR INGRESA UN NUMERO ENTRE 1 Y 3, GRACIAS");
                showMenu();
                requestOption();
        }
    }
    public void showHighestScore() {
        playersSortedPrice.stream().forEach(System.out::println);
    }
    public void highestScore () {
        Comparator<Player> priceComparator = Comparator.comparing(Player::getPrice);
        System.out.println();
        System.out.println("********************\n****Ranking de jugadores****\n********************\n");
        Collections.sort(playersSortedPrice, priceComparator.reversed());
    }
}
