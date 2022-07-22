<<<<<<< HEAD

public class WordHG {
    public String originalWord;
    public String hiddenWord;
    public String guessingLetter;

    public WordHG(String originalWord) {
        this.originalWord = originalWord;
    }
    
    public void setGuessingLetter(String guessingLetter) {
        this.guessingLetter = guessingLetter;
    }

    private int getExistingPosition(){        
        int letterPosition = this.originalWord.indexOf(this.guessingLetter.toLowerCase()); 
        return letterPosition;
    }

    public void createGuessWord(){
        this.hiddenWord = "";
        for (int i = 0; i < this.originalWord.length(); i++){
            this.hiddenWord += " ";
        }
    }

    private void placeLetters(){
        char[] secretWordarray = this.originalWord.toCharArray();
        int wordLen = secretWordarray.length;
        char[] hiddenWordarray = this.hiddenWord.toCharArray();
        char letter = this.guessingLetter.toCharArray()[0];

        for (int i = 0; i < wordLen; i++){
            if (secretWordarray[i] == letter) {
                hiddenWordarray[i] = letter;
            }
        }
        this.hiddenWord = String.valueOf(hiddenWordarray);        
    }

    public boolean checkWin(){
        char[] secretWordarray = this.originalWord.toCharArray();
        char[] hiddenWordarray = this.hiddenWord.toCharArray();
        int wordLen = secretWordarray.length;
        boolean wordIsGuessed = true;
        
        for (int i = 0; i < wordLen; i++){
            if (secretWordarray[i] != hiddenWordarray[i]) {
                wordIsGuessed = false;
            }
        }
        return wordIsGuessed;
    }

    public void printMissingLetters(){
        char[] secretWordarray = this.originalWord.toCharArray();
        System.out.println(this.hiddenWord);  

        for (int i = 0; i < secretWordarray.length; i++){
            System.out.print("-");                             
        }
        System.out.println(); 
    }

    public boolean checkLetter(){
        int letterPosition = getExistingPosition();

        if (letterPosition == -1 ){
            System.out.println(this.guessingLetter + " is not in word"); 
            return false;
        }
        else {
            System.out.println(this.guessingLetter + " is in word!!");             
            placeLetters();
            return true;
        }

    }
    
    public void giveHint(){
        char[] secretWordarray = this.originalWord.toCharArray();
        int wordLen = secretWordarray.length;
        char[] hiddenWordarray = this.hiddenWord.toCharArray();

        for (int i = 0; i < wordLen; i++){
            if (hiddenWordarray[i] == ' ') {
                hiddenWordarray[i] = secretWordarray[i];
                break;
            }
        }
        this.hiddenWord = String.valueOf(hiddenWordarray);
        System.out.println("**HINT GIVEN**"); 
        printMissingLetters();
    }


=======
package games.hangman;

public class WordHG {
    
>>>>>>> 647acef7f6aec3e39ee4366a1f45523d23ce4e9f
}
