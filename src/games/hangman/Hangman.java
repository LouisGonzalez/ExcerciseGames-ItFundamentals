package games.hangman;

import java.util.ArrayList;

import controller.ControllerPlayer;
import games.Game;
import games.IPlayerGeneral;
import model.player.Player;

public class Hangman extends Game{

    private ControllerPlayer controller; 

    private WordHG myWord;
    private IGuesserable playerGuesser; 
    private IGiverable playerGiver; 
    private IPlayerGeneral player1; 
    private IPlayerGeneral player2; 
    private BoardHangMan board;

    private int remainingAttempts; 
    private int guessingAttempts; 
    private boolean hintGiven;

 
    public Hangman(int totalPlayers) {
        super(totalPlayers);
       // this.selectPlayer(listProviders);
        controller =  new ControllerPlayer(this.players);
    }

    @Override
    public void go() {
        startUp();
        do {
            round();
        } while (!board.winCondition);
        checkWinner(); 
        
    }

    @Override
    public void turn() {
        if (guessingAttempts == 1){
            firstTurn();
        } else {
            String currentGuess = "";
            currentGuess = playerGuesser.tryLetter();  
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


    public void startUp(){
        System.out.println("**********************");
        System.out.println("**WELCOME TO HANGMAN**");
        System.out.println("**********************");
        hintGiven = false;
        guessingAttempts = 1;
        remainingAttempts = 8; 
        board = new BoardHangMan();
        board.cleanBoard();
        setPlayers();     
        choose1stPlayer();
    }  

// temporary as Player Array has not been defined
public void setPlayers(){ 
    System.out.println("Selecting Player"); 
    player1 = this.players.get(0); 
    player2 = this.players.get(1);  
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

  

    

    
}
