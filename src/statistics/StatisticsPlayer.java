package statistics;

import utils.Terminal;

import java.util.ArrayList;

public class StatisticsPlayer {
    private ArrayList<Statistic>listStatistics= new ArrayList<>();

    public void statsMenu(){
        int option;
        do {
            System.out.println("--------------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Estadisticas");
            System.out.println("2. Estadisticas de juego por jugador");
            System.out.println("3. Regresar al menu principal");
            System.out.println("--------------------------");
            option = Terminal.askNumber("Introduzca un numero");
            switch (option) {
                //case 1 -> ;
                //case 2 -> ;
                //case 3 -> ;
                default -> System.out.println("Gracias por su atencion");
            }
        } while (option != 4);
    }
    public void statsPlayer(){

    }
}
