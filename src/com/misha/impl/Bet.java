package com.misha.impl;

/**
 * Created by mouravievt on 12/26/2016.
 */
public class Bet {
    private Outcome betOutcome;
    private double betAmount;

    public Bet(Outcome outcome, double amount){
        betOutcome = outcome;
        betAmount = amount;
    }

    public double getBetAmount(){
        return betAmount;
    }

    public double getBetMultiplier(){
        return betOutcome.getOdds();
    }

}
