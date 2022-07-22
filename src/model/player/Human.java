package model.player;

import utils.Terminal;

public class Human extends Player {
    
    public Human(String name){
        super(name);
    }

    public int returnPosition(){
        int number = Terminal.askNumber("Type a number");
        if(number < 1 || number > 3){
            Terminal.showMessage("Invalid range position");
            return returnPosition();
        } else {
            return number - 1;
        }
    }

    public void saveGameResult(){

    }

}
