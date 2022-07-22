package games.hangman;

import games.Game;
import games.IPlayerGeneral;
import utils.Terminal;

public class Hangman extends Game{
 

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
        Terminal.clearScreen();
        Terminal.decorate();
        Terminal.showMessage("**WELCOME TO HANGMAN**");
        Terminal.showMessage("**********************");
        hintGiven = false;
        guessingAttempts = 1;
        remainingAttempts = 8; 
        board = new BoardHangMan();
        board.cleanBoard();
        setPlayers();     
        choose1stPlayer();
    }  

    public void setPlayers(){ 
        Terminal.showMessage("Selecting Player"); 
        player1 = this.players.get(0); 
        player2 = this.players.get(1);  
    }

    public void giveAHint(boolean given){
        Terminal.showMessage("Giving Hint");

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
        Terminal.showMessage("Playing turn #" + guessingAttempts); 
        Terminal.showMessage("Guessing attempts left " + (remainingAttempts)); 
        offerHint();
        try {
            turn();
            board.printHangMan();
            myWord.printMissingLetters();
        } catch (Exception e){
            if (hintGiven){
                Terminal.showMessage("Please enter a letter"); 
                } else {
                    hintGiven = true; 
                    myWord.giveHint();
                }
        }

    }
    
    private void offerHint(){
        if (hintGiven){
            Terminal.showMessage("No more hints"); 
        } else 
        Terminal.showMessage("Leave blank for a hint");

    }

    public void checkWinner(){
        if (remainingAttempts == 0){
            Terminal.showMessage(playerGiver.getName() + " is Winner!!!!"); 
        } else {
            Terminal.showMessage(playerGuesser.getName() + " is Winner!!!!"); 
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
