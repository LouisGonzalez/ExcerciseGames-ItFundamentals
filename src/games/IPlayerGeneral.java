package games;

import games.hangman.IHangmanPlayer;
import games.tictactoe.ITTTPlayer;
import games.tictactoe.SquareValue;

public interface IPlayerGeneral extends ITTTPlayer {

    public void saveGameResult();

    public String getName();
    public void setName(String name);
    public SquareValue getCoinTTT();
    public void setCoinTTT(SquareValue value);

}

