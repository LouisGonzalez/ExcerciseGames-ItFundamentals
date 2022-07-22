import java.util.Scanner;

public class Human extends Player {
    

    public Human(String name){
        super(name);
    }

    @Override
    public String selectWord() {
        String msg = (this.getName() + ", enter secretword: ");  
        String secretWord = Terminal.askString(msg);
        return secretWord;
    }

    @Override
    public String tryLetter() {          
        String msg = (this.getName() + ", enter letter guess: ");  
        String guess = Terminal.askString(msg);
        return guess;
    }


}
