package model.player;
<<<<<<< HEAD
import statistics.StatisticsPlayer;
public class Player{

    private String name;
    private StatisticsPlayer stats;

    public Player(String name, StatisticsPlayer stats ) {
=======

import statistics.StatisticsPlayer;

public abstract class Player {
    
    private String name;
    private StatisticsPlayer stats;

    public Player(String name, StatisticsPlayer stats){
>>>>>>> c778fbc22518cec5f054c7c375036af08fd4ea23
        this.name = name;
        this.stats = stats;
    }

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStats(StatisticsPlayer stats) {
        this.stats = stats;
    }

    public StatisticsPlayer getStats() {
=======
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
>>>>>>> c778fbc22518cec5f054c7c375036af08fd4ea23
        return this.stats;
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }

}
