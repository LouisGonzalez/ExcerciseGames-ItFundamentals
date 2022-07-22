package games;

import games.*;
import Utils.InputData;

public class Games {

    public void selectGame() {
        int option;
        do {
            System.out.println("--------------------------");
            System.out.println("Elija una de las opciones mostradas");
            System.out.println("1. TicTacToe");
            System.out.println("2. HangMan");
            System.out.println("3. Salir");
            System.out.println("--------------------------");
            option = InputData.readNumber();
            switch (option) {
                // case 1 -> ;
                // case 2 -> ();
                default -> System.out.println("Gracias por su atencion");
            }
        } while (option != 3);
    }
}
