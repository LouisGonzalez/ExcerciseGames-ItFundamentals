<<<<<<< HEAD
import Menu.ProgramMenu;
import controller.ControllerPlayer;

public class Program {
    public static void main(String[] args) {

        new ProgramMenu().menu();
=======
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
>>>>>>> 06013256678a60fa7abd8c1c2df27bfb7f341401
    }

}