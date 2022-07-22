import java.util.ArrayList;

import games.tictactoe.TicTacToe;
import model.player.Human;
import model.player.Player;

public class Program {


    
    public static void main(String[] args){
        ArrayList<Player> players = new ArrayList<>();


        players.add(new Human("jugador1", null));
        players.add(new Human("jugador1", null));

        
        new TicTacToe(players, 2).go();
    }



}