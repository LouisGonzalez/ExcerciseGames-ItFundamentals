<<<<<<< HEAD
import controller.ControllerPlayer;
import model.player.Player;

public class Hangman {
    private ControllerPlayer controller = new ControllerPlayer(); 

    private WordHG myWord;
    private Player player1; 
    private Player player2; 
    private Player playerGuesser; 
    private Player playerGiver; 
    private BoardHangMan board;

    private int remainingAttempts; 
    private int guessingAttempts; 
    private boolean hintGiven;


    public void go(Player[] players) {
        startUp();
        do {
            round();
        } while (!board.winCondition);
        checkWinner(); 
    }

    public void startUp(){
        System.out.println("**********************");
        System.out.println("**WELCOME TO HANGMAN**");
        System.out.println("**********************");
        hintGiven = false;
        guessingAttempts = 1;
        remainingAttempts = 8; 
        board = new BoardHangMan();
        board.cleanBoard();
        selectPlayers();
    }

    public void selectPlayers(){
        System.out.println("Selecting Players");
        //controller.ReadPlayers();
        setPlayers();     
        choose1stPlayer();          
    }

// temporary as Player Array has not been defined
public void setPlayers(){ 
    System.out.println("Selecting Player"); 
    player1 = new HumanHangman("Player 1", null); 
    player2 = new BotHangman("Player 2", null);        
    //player = controller.getOne();
}

    public void giveAHint(boolean given){
        System.out.println("Giving Hint");

    }

    public void choose1stPlayer(){
        int firstPlay  = (int) (Math.random()*(2)) + 1; 
        if (firstPlay == 1){  
            playerGiver = player2; 
            playerGuesser = player1;      
        } else { 
            playerGiver = player1; 
            playerGuesser = player2;           
        } 
        
    }


    public void round(){
        System.out.println("Playing turn #" + guessingAttempts); 
        System.out.println("Guessing attempts left " + (remainingAttempts)); 
        offerHint();
        try {
            turn();
            board.printHangMan();
            myWord.printMissingLetters();
        } catch (Exception e){
            if (hintGiven){
                   System.out.println("Please enter a letter"); 
                } else {
                    hintGiven = true; 
                    myWord.giveHint();
                }
        }

    }
    
    private void offerHint(){
        if (hintGiven){
            System.out.println("No more hints"); 
        } else 
        System.out.println("Leave blank for a hint");

    }

    public void turn() {   
        if (guessingAttempts == 1){
            firstTurn();
        } else {
            String currentGuess = "";
            currentGuess = playerGuesser.guessLetter();  
            myWord.setGuessingLetter(currentGuess); 
            //
            if (!myWord.checkLetter()){
                remainingAttempts--;
                board.setHangmanParts(remainingAttempts);  
                board.editHangedMan();
            } else board.setWinCondition(myWord.checkWin());  
        }  
        guessingAttempts++;            
    }

    public void checkWinner(){
        if (remainingAttempts == 0){
            System.out.print(playerGiver.getName() + " is Winner!!!!"); 
        } else {
            System.out.print(playerGuesser.getName() + " is Winner!!!!"); 
        }
    }

    public void firstTurn(){
        String secretWord = "";
        System.out.print("First Player is: ");   
        System.out.println(playerGiver.getName());   
        secretWord = playerGiver.selectWord();            
        myWord = new WordHG(secretWord);
        myWord.createGuessWord();        
    }

    
=======
package games.hangman;

import interfaces.IGame;

public class Hangman implements IGame {

    public void selectPlayers(int numberPlayers){
        
    }

    public void go(){

    }

    public void round(){

    }

    public void turn(int noPlayer){
        
    }

>>>>>>> 647acef7f6aec3e39ee4366a1f45523d23ce4e9f
}
