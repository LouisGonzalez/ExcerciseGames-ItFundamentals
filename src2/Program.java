import model.player.Player;

public class Program {
    
    public static void main(String[] args){
        Player[] players = new Player[2];
        while (true){
        new Hangman().go(players);
    }
    }
}
