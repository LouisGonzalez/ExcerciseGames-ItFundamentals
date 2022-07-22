package model.player;


public class Bot extends Player{
    
    public Bot(String name){
        super(name);
    }

    public int returnPosition(){
        return (int) (Math.floor(Math.random() * 3 + 1)) - 1;
    }

    public void saveGameResult(){

    }

}
