package model.player;

import statistics.StatisticsPlayer;

public abstract class Bot extends Player {
    
    public Bot(String name, StatisticsPlayer stats){
        super(name, stats);
    }

}
