package com.sofkau.models;

import com.sofkau.interfaces.IUtilities;

import java.util.ArrayList;
import java.util.Collection;

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

    }

    @Override
    public void requestOption() {

    }
}
