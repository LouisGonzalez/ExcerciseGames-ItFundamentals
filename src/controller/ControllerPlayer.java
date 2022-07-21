package controller;

import java.util.ArrayList;

import model.player.Player;
import utils.Terminal;

public class ControllerPlayer {
    //todo lo relacionado a crud player

    private ArrayList<Player> players;

    public ControllerPlayer(ArrayList<Player> players){
        this.players = players;
    }

    public Player getOne(){
        int playerPosition = Terminal.askNumber("Select one player");
        if(playerPosition - 1 < players.size())
            return this.players.get(playerPosition - 1);
        Terminal.showMessage("The position is non-existent");
        return null;
    }

}
