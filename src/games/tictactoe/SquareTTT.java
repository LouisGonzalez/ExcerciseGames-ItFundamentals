package games.tictactoe;

import dictionaries.SquareValue;

public class SquareTTT {

    private SquareValue myValue;

    public SquareTTT(){
        myValue = SquareValue.EMPTY;
    }

    public void setMyValue(SquareValue myValue){
        this.myValue = myValue;
    }

    public SquareValue getMyValue(){
        return this.myValue;
    }



}
