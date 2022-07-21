package games.tictactoe;

import interfaces.ITTTPlayer;
import model.player.Bot;
import statistics.StatisticsPlayer;
import utils.Terminal;

public class BotTTT extends Bot implements ITTTPlayer {

    public BotTTT(String name, StatisticsPlayer stats){
        super(name, stats);
    }

    public int returnPosition(){
        return (int) (Math.floor(Math.random() * 3 + 1)) - 1;
    }


}
