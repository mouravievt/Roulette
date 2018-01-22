package com.misha.impl;

import java.util.*;

/**
 * Created by mouravievt on 12/22/2016.
 */
public class Bin {
    private static final Integer[] redNums = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    private static final List<Integer> red = Arrays.asList(redNums);
    private int binNumber;
    private List<Outcome> outcomes;

    public Bin(int binNumber){
        this.binNumber = binNumber;
        this.outcomes = new ArrayList<>();
        initOutcomes();
    }

    public List<Outcome> getBinOutcomes() {

        return outcomes;
    }

    private void initOutcomes(){
        if(binNumber == 0){
            outcomes.add(new Outcome("Zero", 35));
        }
        else if(binNumber == 37){
            outcomes.add(new Outcome("Double Zero", 35));
        }
        else{
            outcomes.add(new Outcome("#" + binNumber, 35));
            // Red or Black
            if(isRed(binNumber)){
                outcomes.add(new Outcome("Red", 35));
            } else {
                outcomes.add(new Outcome("Black", 35));
            }
            // Even or Odd
            if(binNumber % 2 > 0){
                outcomes.add(new Outcome("Odd", 35));
            } else {
                outcomes.add(new Outcome("Even", 35));
            }
        }
    }

    private boolean isRed(int num){
        return red.contains(new Integer(num));
    }
}
