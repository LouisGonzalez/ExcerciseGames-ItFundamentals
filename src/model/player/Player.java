package model.player;

import games.IPlayerGeneral;

public abstract class Player implements IPlayerGeneral {
    
    private String name;

    public Player(String name){
        this.name = name;
    }

    public  String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
