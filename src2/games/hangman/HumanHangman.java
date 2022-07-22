package games.hangman;

import interfaces.IHangmanPlayer;
import model.player.Human;
import statistics.StatisticsPlayer;

public class HumanHangman extends Human implements IHangmanPlayer {
    
    public HumanHangman(String name, StatisticsPlayer stats){
        super(name, stats);
    }

    public void selectWord(){

    }

    public void tryLetter(){

    }

    public void guessWord(){

    }

    public void askForAHint(){
        
    }

}
