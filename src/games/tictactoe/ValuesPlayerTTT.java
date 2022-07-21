package games.tictactoe;

import dictionaries.SquareValue;
import interfaces.ITTTPlayer;
import model.player.Player;

public class ValuesPlayerTTT {
    
    private Player player;
    private ITTTPlayer iPlayer;
    private boolean firstPlayer = false;
    private SquareValue myCoin;

    public ValuesPlayerTTT(Player player, ITTTPlayer iPlayer, SquareValue myCoin){
        this.player = player;
        this.iPlayer = iPlayer;
        this.myCoin = myCoin;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return this.player;
    }

    public void setIPlayer(ITTTPlayer iPlayer){
        this.iPlayer = iPlayer;
    }

    public ITTTPlayer getITTTPlayer(){
        return this.iPlayer;
    }

    public void setFirstPlayer(boolean firstPlayer){
        this.firstPlayer = firstPlayer;
    }

    public boolean getFirstPlayer(){
        return this.firstPlayer;
    }

    public void setMyCoin(SquareValue myCoin){
        this.myCoin = myCoin;
    }

    public SquareValue getMyCoin(){
        return this.myCoin;
    }

}
