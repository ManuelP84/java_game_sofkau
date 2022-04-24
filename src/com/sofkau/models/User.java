package com.sofkau.models;

import java.util.Scanner;

public class User {
    private  String name;

    public User(){

    }

    public User(String name) {
        this.name = name;
    }

    public void requestName(){
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("POR FAVOR INGRESA TU NOMBRE: ");
        name = keyboard.nextLine();
        System.out.println("GRACIAS, " + name + ", ESPERAMOS DISFRUTES EL JUEGO!!!");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
