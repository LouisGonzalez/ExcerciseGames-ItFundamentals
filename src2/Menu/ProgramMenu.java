package Menu;

import Utils.InputData;
import java.util.ArrayList;
import controller.ControllerPlayer;
import model.player.Player;

public class ProgramMenu {

    public void menu() {
        int option;
        do {
            System.out.println("--------------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Juegos");
            System.out.println("2. Crud");
            System.out.println("3. Estadisticas");
            System.out.println("4. Salir");
            System.out.println("--------------------------");
            option = InputData.readNumber();
            switch (option) {
                // case 1 -> ;
                case 2 -> new controller.ControllerPlayer().crudMenu();
                // case 3 -> CrudPlayers.searchPlayerHuman("Jose");
                default -> System.out.println("Gracias por su atencion");
            }
        } while (option != 4);
    }
}
