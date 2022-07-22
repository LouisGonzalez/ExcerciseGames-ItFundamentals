package games.tictactoe;

import interfaces.ITTTPlayer;
import model.player.Human;
import statistics.StatisticsPlayer;
import utils.Terminal;

public class HumanTTT extends Human implements ITTTPlayer {
    
    public HumanTTT(String name, StatisticsPlayer stats){
        super(name, stats);
    }

    public int returnPosition(){
        int number = Terminal.askNumber("Type a number");
        if(number < 1 || number > 3){
            Terminal.showMessage("Invalid range position");
            return returnPosition();
        } else {
            return number - 1;
        }
    }

}
