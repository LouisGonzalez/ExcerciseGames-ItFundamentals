
public class BoardHangMan {


    public final int BODY_SEGMENTS = 6;    
    public int hangmanParts; //attempts
    public String[] hangedMan = new String[BODY_SEGMENTS]; 
    public boolean winCondition;


    public void setWinCondition(boolean winCondition) {
        this.winCondition = winCondition;
    }

    public void setHangmanParts(int hangmanParts) {
        this.hangmanParts = hangmanParts;
    }


    public void cleanBoard(){
        this.winCondition = false;
        this.hangmanParts = 8; 
        this.hangedMan[0] = ("");                 //rope
        this.hangedMan[1] = ("");                 //head
        this.hangedMan[2] = ("");                 //arms  and body
        this.hangedMan[3] = ("");                 //body
        this.hangedMan[4] = ("");                 //legs
        this.hangedMan[5] = ("");                 //legs
    }

    public void printHangMan(){  
        System.out.println("******************");  
        System.out.println("   ---------- ");   

        for (int i = 0; i < BODY_SEGMENTS; i++){
            System.out.println("   |       " + this.hangedMan[i]);                 
        }   
        System.out.println("---------------");     
        System.out.println("******************");  
             
    }


    public void editHangedMan(){
        switch(hangmanParts){
            case 0:
                this.hangedMan[4] = "/ \\"; 
                this.hangedMan[5] = "**********YOU DIED**********";
                this.winCondition = true;
            break;
            case 1:  
                this.hangedMan[4] = "/";               
            break;
            case 2:        
                this.hangedMan[3] = " |";        
            break;
            case 3:
                this.hangedMan[2] = "/|\\";                
            break;
            case 4:
                this.hangedMan[2] = "/|";                
            break;
            case 5:
                this.hangedMan[2]= "/";                 
            break;
            case 6:
                this.hangedMan[1] = " O";                
            break;
            case 7:
                this.hangedMan[0] = " |";
            break;
            default:
            break;
        }
    }


}
