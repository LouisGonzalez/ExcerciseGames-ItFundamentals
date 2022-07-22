public class Bot extends Player{
    String[] wordBank = {"dog", "apple", "carrot", "school", "appendix", "laparoscopy"};
    char[] letterBank = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', ' '};
    
    
    public Bot(String name){
        super(name);
    }

    
    @Override
    public String selectWord(){
        System.out.println(this.getName() + ", enter secretword: ");
        int randomwordPosition = (int) (Math.random()*(wordBank.length-1));
        System.out.println(" *Entered secret word* ");
        Terminal.pressEnter();
        return wordBank[randomwordPosition];
    }

    @Override
    public String tryLetter(){
        System.out.println(this.getName() + ", enter letter guess");
        int randomLetterPosition = (int) (Math.random()*(letterBank.length-1));
        String guess = String.valueOf(letterBank[randomLetterPosition]);
        System.out.println(" *Entered guess letter* ");
        Terminal.pressEnter();
        return guess;
    }



}
