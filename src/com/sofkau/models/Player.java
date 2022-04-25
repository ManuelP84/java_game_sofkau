package com.sofkau.models;

public class Player extends User implements Comparable<Player>{
    private int price ;

    public Player(){
        super();
    }

    public Player(String name) {
        super(name);
    }

    public Player(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Player player) {
        if (price < player.getPrice()) {
            return -1;
        } else if (price > player.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "Player: " + getName() + " Price: " + price;
    }
}
