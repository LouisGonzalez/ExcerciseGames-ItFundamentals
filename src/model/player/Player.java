package model.player;

import statistics.StatisticsPlayer;

public abstract class Player {
    
    private String name;
    private StatisticsPlayer stats;

    public Player(String name, StatisticsPlayer stats){
        this.name = name;
        this.stats = stats;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setStats(StatisticsPlayer stats){
        this.stats = stats;
    }

    public StatisticsPlayer getStats(){
        return this.stats;
    }

}
