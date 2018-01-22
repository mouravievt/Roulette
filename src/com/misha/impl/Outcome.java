package com.misha.impl;

/**
 * Created by mouravievt on 12/22/2016.
 */
public class Outcome {

    private String name;
    private int odds;

    public Outcome(String name, int odds){
        this.name = name;
        this.odds = odds;
    }

    public double getOdds(){
        return odds;
    }
}
