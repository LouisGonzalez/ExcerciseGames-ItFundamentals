package games.tictactoe;

import interfaces.ITTTPlayer;
import model.player.Human;
import statistics.StatisticsPlayer;

public class HumanTTT extends Human implements ITTTPlayer {
    
    public HumanTTT(String name, StatisticsPlayer stats){
        super(name, stats);
    }

    public void returnPosition(){

    }

}
