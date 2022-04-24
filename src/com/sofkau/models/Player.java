package com.sofkau.models;

public class Player extends User implements Comparable<Player>{
    private int price ;
    private int levelArchive;
    private int currenLevel;

    public Player(){
        super();
    }

    public Player(String name) {
        super(name);
    }

    public Player(String name, int price, int levelArchive, int currenLevel) {
        super(name);
        this.price = price;
        this.levelArchive = levelArchive;
        this.currenLevel = currenLevel;
    }

    public int getPrice() {
        return price;
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
