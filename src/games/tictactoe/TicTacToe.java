package games.tictactoe;

import games.Game;
import games.IPlayerGeneral;
import model.player.Dice;
import utils.Terminal;

public class TicTacToe extends Game {

    private int contMovements = 0;
    private int indexPlayer;
    private boolean gameOver = false;
    private Board board;
    private Dice dice = new Dice();

    public TicTacToe(int totalPlayers){
        super(totalPlayers);
        this.board = new Board(this);
    }

    private SquareValue giveCoin(int index){
        if(index % 2 == 0) return SquareValue.X;
        else return SquareValue.O;
    }

    public void selectRandomPriority(){
        this.indexPlayer = dice.turnDice(0, this.players.size() - 1);
    }

    public void giveCoinsToPlayers(){
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).setCoinTTT(giveCoin(i));       
        }
        selectRandomPriority();
    }

    public void initialValues(){
        giveCoinsToPlayers();
        board.initialValues();
        board.printBoard();
    }

    public void go(){
        Terminal.clearScreen();
        Terminal.decorate();
        initialValues();
        do {
            turn();
            if(indexPlayer == this.players.size()-1) indexPlayer = 0;
            else indexPlayer++;
        } while(!gameOver);
        Terminal.pressEnter();
    }

    public void turn(){
        IPlayerGeneral actualPlayer = this.players.get(this.indexPlayer);
        switch(actualPlayer.getCoinTTT()){
            case EMPTY:
                break;
            case X:
                this.executeTurn(actualPlayer);
                break;
            case O:
                this.executeTurn(actualPlayer);
                break;
            default:
                break;
        }
        board.printBoard();
    }

    public void executeTurn(IPlayerGeneral actualPlayer){
        int posX = actualPlayer.returnPosition();
        int posY = actualPlayer.returnPosition();
        if(!this.board.putCoin(posX, posY, actualPlayer.getCoinTTT())) turn();
        else {
            this.contMovements++;
            if(!this.board.isTicTacToe(posX, posY, actualPlayer.getCoinTTT())){
                this.gameOver = board.isEmptySpaces(this.contMovements);
                if(this.gameOver) Terminal.showMessage("Nadie ha podido ganar el juego");
            } else {
                this.gameOver = true;
                showPlayerWinner(actualPlayer);
            }
        }
    }

    public void showPlayerWinner(IPlayerGeneral actualPlayer){
        Terminal.clearScreen();
        Terminal.decorate();
        Terminal.showMessage("The winner is: " + actualPlayer.getName());
        Terminal.decorate();
    }

    public void setContMovements(int contMovements){
        this.contMovements = contMovements;
    }

    public int getContMovements(){
        return this.contMovements;
    }

}
