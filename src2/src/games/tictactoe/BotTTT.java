package games.tictactoe;

import interfaces.ITTTPlayer;
import model.player.Bot;
import statistics.StatisticsPlayer;

public class BotTTT extends Bot implements ITTTPlayer {

    public BotTTT(String name, StatisticsPlayer stats){
        super(name, stats);
    }

    public void returnPosition(){
        
    }


}
