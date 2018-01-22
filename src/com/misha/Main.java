package com.misha;

import com.misha.api.Game;
import com.misha.api.Player;
import com.misha.impl.RouletteGame;
import com.misha.impl.SimplePlayer;

public class Main {

    public static void main(String[] args) {
        Game roulette = new RouletteGame();
        roulette.addPlayer(new SimplePlayer("Reggie"));
        //run it once
        while (roulette.placeBets()) {
            roulette.spinWheel();
            roulette.resolveBets();
        }
    }
}
