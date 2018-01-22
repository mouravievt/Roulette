package com.misha.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mouravievt on 12/22/2016.
 */
public class Wheel {

    private Random generator = new Random();
    private List<Bin> bins; //bins will have #s 0-37 (37 == 00)

    public Wheel(){
        this.bins = new ArrayList<>(38);

        for(int ii = 0; ii < 38; ii++){
            bins.add(ii, new Bin(ii));
        }

    }
    /**
     * @return winning bin
     */
    public Bin nextWinningBin(){
        int winner = generator.nextInt(38);
        return bins.get(winner);
    }
}
