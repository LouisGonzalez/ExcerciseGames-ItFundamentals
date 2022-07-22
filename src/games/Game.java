package games;

import java.util.ArrayList;
public abstract class Game {

    public ArrayList<IPlayerGeneral> players;
    private int totalPlayers;

    public Game(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public void selectPlayer(GamePlayersProvider listProviders) {
        players = listProviders.getPlayersGeneralList(this.totalPlayers);
    }

    public abstract void go();

    public abstract void turn();

}