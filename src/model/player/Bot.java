package model.player;

import utils.Terminal;


public class Bot extends Player{
    
    
    public Bot(String name){
        super(name);
    }

    public int returnPosition(){
        return (int) (Math.floor(Math.random() * 3 + 1)) - 1;
    }
  
    public String selectWord(){
        String[] wordBank = {"dog", "apple", "carrot", "school", "appendix", "laparoscopy"};
        System.out.println(this.getName() + ", enter secretword: ");
        int randomwordPosition = (int) (Math.random()*(wordBank.length-1));
        System.out.println(" *Entered secret word* ");
        Terminal.pressEnter();
        return wordBank[randomwordPosition];
    }

    public String tryLetter(){
        char[] letterBank = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', ' '};
        System.out.println(this.getName() + ", enter letter guess");
        int randomLetterPosition = (int) (Math.random()*(letterBank.length-1));
        String guess = String.valueOf(letterBank[randomLetterPosition]);
        System.out.println(" *Entered guess letter* ");
        Terminal.pressEnter();
        return guess;
    }
    public void saveGameResult(){

    }

}
