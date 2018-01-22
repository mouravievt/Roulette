package com.misha.api;

import com.misha.impl.Bet;

import java.util.List;

/**
 * Created by mouravievt on 12/23/2016.
 */
public interface Player {
    public boolean isPlaying();
    public void placeBets();
    public void win(Bet bet);
    public void lose(Bet bet);
    public List<Bet> getCurrentBets();
}
