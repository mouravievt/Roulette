package com.misha.impl;

import com.misha.api.Game;
import com.misha.api.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mouravievt on 12/22/2016.
 */
public class RouletteGame implements Game {

    private List<Player> players = new ArrayList<>();
    private Wheel wheel = new Wheel();
    private Bin currentWinner;

    @Override
    public boolean placeBets() {
        boolean isAnybodyPlaying = false;

        for(Player pp : players){
            if(pp.isPlaying()){
                pp.placeBets();
                isAnybodyPlaying = true;
            }
        }
        return isAnybodyPlaying;
    }

    @Override
    public void spinWheel() {
        currentWinner = wheel.nextWinningBin();

    }

    @Override
    public void resolveBets() {
        for(Player pp : players){
            for(Bet bb : pp.getCurrentBets()){
                if(currentWinner.getBinOutcomes().contains(bb)){
                    pp.win(bb);
                }else{
                    pp.lose(bb);
                }
            }
        }
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        players.remove(player);
    }
}

