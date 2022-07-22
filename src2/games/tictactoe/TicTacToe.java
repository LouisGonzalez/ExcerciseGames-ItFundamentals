package games.tictactoe;

import java.util.ArrayList;

import javax.lang.model.type.ExecutableType;

import controller.ControllerPlayer;
import dictionaries.SquareValue;
import interfaces.IGame;
import interfaces.ITTTPlayer;
import model.Dice;
import model.player.Bot;
import model.player.Human;
import model.player.Player;
import utils.Terminal;

public class TicTacToe implements IGame{

    private int contMovements = 0;
    private ArrayList<ValuesPlayerTTT> playersTTT = new ArrayList<>();
    private int numberPlayers;
    private Dice dice = new Dice();
    private boolean gameOver = false;
    private BoardTTT board;
    private ControllerPlayer controllerPl;

    public TicTacToe(ArrayList<Player> listPlayers, int numberPlayers){
        this.numberPlayers = numberPlayers;
        this.board = new BoardTTT(this);
        this.controllerPl = new ControllerPlayer(listPlayers);
    }

    private SquareValue giveCoin(int index){
        if(index % 2 == 0) return SquareValue.X;
        else return SquareValue.O;        
    }

    public int findFirstTurn(){
        for (int i = 0; i < playersTTT.size(); i++) {
            if(playersTTT.get(i).getFirstPlayer()){
                return i;
            }
        }
        return -1;
    }

    public void selectRandomPriority(){
        int player = dice.turnDice(0, playersTTT.size()-1); 
        this.playersTTT.get(player).setFirstPlayer(true); 
    }
    
    public void selectPlayers(int numberPlayers){
        for (int i = 0; i < numberPlayers; i++) {
            Player player = controllerPl.getOne();
            ITTTPlayer iPlayer = findTypePlayer(player);
            playersTTT.add(new ValuesPlayerTTT(player, iPlayer, giveCoin(i)));

        }
        selectRandomPriority();
    }

    public void initialValues(){
        selectPlayers(numberPlayers);
        board.initialValues();
        board.printBoard(); 
    }

    public void round(){

    }
    
    public void go(){
        Terminal.clearScreen();
        Terminal.decorate();
        initialValues();
        int indexPlayer = findFirstTurn();
        do {
            turn(indexPlayer);
            if(indexPlayer == playersTTT.size() - 1) indexPlayer = 0;
            else indexPlayer++;
        } while(!gameOver);
        Terminal.pressEnter();
    }

    public void turn(int noPlayer){
        ValuesPlayerTTT playerTurn = playersTTT.get(noPlayer);
        switch(playerTurn.getMyCoin()){
            case EMPTY:
                break;
            case X:
                executeTurn(playerTurn, noPlayer);
                break;
            case O:
                executeTurn(playerTurn, noPlayer);
                break;
            default:
                break;
        }
        board.printBoard();
    }

    public void executeTurn(ValuesPlayerTTT player, int noPlayer){
        int posX = player.getITTTPlayer().returnPosition();
        int posY = player.getITTTPlayer().returnPosition();
        if(!this.board.putCoin(posX, posY, player.getMyCoin())) turn(noPlayer);
        else {
            contMovements++;
            if(!this.board.isTicTacToe(posX, posY, player.getMyCoin())){
                gameOver = board.isEmptySpaces(contMovements);
                //crear metodo que muestre que hubo un empate
                if(gameOver) Terminal.showMessage("Nadie ha podido ganar la partida");
            } else {
                gameOver = true;
                showPlayerWinner(player);
            }
        }
    }

    public void showPlayerWinner(ValuesPlayerTTT player){
        Terminal.clearScreen();
        Terminal.decorate();
        Terminal.showMessage("The winner is: " + player.getPlayer().getName());
        Terminal.decorate();
    }

    public ITTTPlayer findTypePlayer(Player player){
        if(player.getType().equals("Human")){
            return new HumanTTT(player.getName(), player.getStats());
        } else if(player.getType().equals("Bot")){
            return new BotTTT(player.getName(), player.getStats());
        }
        return null;
    }

    public void setContMovements(int contMovements){
        this.contMovements = contMovements;
    }

    public int getContMovements(){
        return this.contMovements;
    }

    

}
