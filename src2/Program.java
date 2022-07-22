<<<<<<< HEAD
import model.player.Player;
=======
<<<<<<< HEAD
<<<<<<< HEAD
import Menu.ProgramMenu;
import controller.ControllerPlayer;
>>>>>>> 647acef7f6aec3e39ee4366a1f45523d23ce4e9f

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
<<<<<<< HEAD
        Player[] players = new Player[2];
        while (true){
        new Hangman().go(players);
    }
=======
        ArrayList<Player> players = new ArrayList<>();
<<<<<<< HEAD
        players.add(new Human("jugador1", null));
        players.add(new Human("jugador1", null));
        new TicTacToe(players, 2).go();
>>>>>>> 06013256678a60fa7abd8c1c2df27bfb7f341401
>>>>>>> 647acef7f6aec3e39ee4366a1f45523d23ce4e9f
    }

=======


        players.add(new Human("jugador1", null));
        players.add(new Human("jugador1", null));

        
        new TicTacToe(players, 2).go();
    }



>>>>>>> c778fbc22518cec5f054c7c375036af08fd4ea23
}