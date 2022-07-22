package games;
import java.lang.annotation.Inherited;

import games.hangman.IHangmanPlayer;
//import games.tictactoe.ITTTPlayer;
import games.hangman.IHangmanPlayer;

public interface IPlayerGeneral extends  IHangmanPlayer {

    public void saveGameResult();
    public String getName();
    public void setName(String name);

}