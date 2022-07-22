<<<<<<< HEAD
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
=======
import java.util.ArrayList;

import games.tictactoe.TicTacToe;
import model.player.Human;
import model.player.Player;

public class Program {
>>>>>>> c778fbc22518cec5f054c7c375036af08fd4ea23


    
    public static void main(String[] args){
        ArrayList<Player> players = new ArrayList<>();
<<<<<<< HEAD
        players.add(new Human("jugador1", null));
        players.add(new Human("jugador1", null));
        new TicTacToe(players, 2).go();
>>>>>>> 06013256678a60fa7abd8c1c2df27bfb7f341401
    }

=======


        players.add(new Human("jugador1", null));
        players.add(new Human("jugador1", null));

        
        new TicTacToe(players, 2).go();
    }



>>>>>>> c778fbc22518cec5f054c7c375036af08fd4ea23
}