package com.misha.api;

/**
 * Created by mouravievt on 12/22/2016.
 */
public interface Game {
    public boolean placeBets();
    public void spinWheel();
    public void resolveBets();
    public void addPlayer(Player player);
    public void removePlayer(Player player);
}
