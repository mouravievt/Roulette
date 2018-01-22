package com.misha.impl;

import java.util.Hashtable;
import java.util.List;

/**
 * Created by mouravievt on 12/23/2016.
 */
public class Table {
    private Hashtable<String, List<Outcome>> bets = new Hashtable<>();

    public void placeBet(String userName, Outcome outcome){
        bets.get(userName).add(outcome);
    }
}
