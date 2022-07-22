package MainMenu;


import games.IPlayerGeneral;
import utils.Terminal;
import java.util.ArrayList;

public class ProgramMenu {
    private ArrayList<IPlayerGeneral> playerList = new ArrayList<>();
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
            option = Terminal.askNumber("Introduzca un numero");
            switch (option) {
                //case 1 -> ;
                case 2 -> new controller.ControllerPlayer(playerList).crudMenu();
                //case 3 -> ;
                default -> System.out.println("Gracias por su atencion");
            }
        } while (option != 4);
    }
}
