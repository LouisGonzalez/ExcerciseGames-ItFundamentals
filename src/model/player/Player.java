package model.player;

import games.IPlayerGeneral;
import games.tictactoe.SquareValue;

public abstract class Player implements IPlayerGeneral {
    
    private String name;

    private SquareValue coinTTT;

    public Player(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCoinTTT(SquareValue coinTTT){
        this.coinTTT = coinTTT;
    }

    public SquareValue getCoinTTT(){
        return this.coinTTT;
    }

}
