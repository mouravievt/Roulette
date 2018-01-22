package com.misha.impl;

import com.misha.api.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mouravievt on 12/23/2016.
 */
public class SimplePlayer implements Player {
    private String name;
    private List<Bet> currentBets = new ArrayList<>();
    private double myMoney = 100.00;
    private double startAmount = myMoney;
    private double lastBet = 2.50;
    private boolean isPlaying = true;

    public SimplePlayer(String name){
        this.name = name;
    }

    @Override
    public boolean isPlaying() {
        return isPlaying;
    }

    @Override
    public void placeBets() {
        double amount = lastBet * 2;
        if(myMoney > startAmount){
            isPlaying = false;
            return;
        }

        if(myMoney - amount > 0){
            Bet current = new Bet(new Outcome("Red", 35), amount);
            currentBets.add(current);
            myMoney -= amount;
            System.out.println("Player " + this.name + " placed " + amount + " on Red");
            lastBet = amount;

        }else{
            isPlaying = false;
        }
    }

    @Override
    public void win(Bet bet) {
        myMoney += bet.getBetAmount() * bet.getBetMultiplier();
        System.out.println("YOU WIN");
        System.out.println("Your total is: " + myMoney);
    }

    @Override
    public void lose(Bet bet) {
        System.out.println("YOU LOSE");
        System.out.println("Your total is: " + myMoney);
    }

    @Override
    public List<Bet> getCurrentBets() {
        return currentBets;
    }

}
