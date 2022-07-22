package controller;

import games.IPlayerGeneral;
import model.player.*;
import utils.Terminal;
import java.util.ArrayList;
import java.util.Iterator;

public class ControllerPlayer {
    static String name, name2;
    private ArrayList<IPlayerGeneral> playerList;

    public ControllerPlayer(ArrayList<IPlayerGeneral> playerList) {
        this.playerList = playerList;
    }

    public void crudMenu() {
        int option;

        do {
            System.out.println("--------------------------");
            System.out.println("Bienvenido al Menu del Administrador");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Leer Jugadores");
            System.out.println("3. Actualizar Jugadores");
            System.out.println("4  Borrar jugadores");
            System.out.println("5  Obtener jugador");
            System.out.println("6  Mostrar a todos los jugadores");
            System.out.println("7. Regresar al menu principal");
            System.out.println("--------------------------");
            option = Terminal.askNumber("Introduzca un numero");;
            switch (option) {
                case 1 -> createPlayer();
                case 2 -> readPlayer();
                case 3 -> updatePlayer();
                case 4 -> removePlayer();
                case 5 -> getOne();
                case 6 -> ShowPlayers();
                case 7 -> new MainMenu.ProgramMenu();
                default -> System.out.println("Vuelva a intentar");
            }
        } while (option != 7);
    }
    public void createPlayer() {
        System.out.println("Ingrese un numero");
        System.out.println("1. Humano\n2. Boot");
        int option = Terminal.askNumber("Introduzca un numero");
        if (option == 1) {
            name = Terminal.askString("Introduzca un nombre para el jugador Humano");
            Player human = new Human(name);
            playerList.add(human);
        } else if (option == 2) {
            name = Terminal.askString("Introduzca un nombre para el jugador Boot");
            Player boot = new Bot(name);
            playerList.add(boot);
            System.out.println("index: " + playerList.indexOf(boot));
        }
    }

    public void readPlayer () {
        boolean found = false;
        System.out.println("--------------------------");
        name = Terminal.askString("Ingresa el Nombre del jugador que buscas");
        Iterator<IPlayerGeneral> i = playerList.iterator();
        while (i.hasNext()) {
            IPlayerGeneral players = i.next();
            if (players.getName().equals(name)) {
                System.out.println("Jugador: "+ name+" fue encontrado");
                 found = true;
            }
        }
        if(!found){
            System.out.println("Jugador no encontrado");
        }
    }

    public void updatePlayer () {
        System.out.println("--------------------------");
        name = Terminal.askString("Ingresa el Nombre del jugador que quieres modificar");
        name2 = Terminal.askString("Ingresa el nuevo nombre");
        Iterator<IPlayerGeneral> i = playerList.iterator();
        while (i.hasNext()) {
            IPlayerGeneral players = i.next();
            if (players.getName().equals(name)) {
                players.setName(name2);
            }
        }
    }

    public  void removePlayer () {
        boolean found = false;
        System.out.println("--------------------------");
        name = Terminal.askString("Ingresa el nombre del jugador que quieres modificar");
        Iterator<IPlayerGeneral> i = playerList.iterator();
        while (i.hasNext()) {
            IPlayerGeneral player = i.next();
            if (player.getName().equals(name)) {
                i.remove();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Jugador no encontrado");
        } else {
            System.out.println("Jugador fue borrado satisfactoriasmente");
        }
    }

   public IPlayerGeneral getOne () {
        int playerPosition = Terminal.askNumber("Ingrese numero del 1-10 para seleccionar un jugador");
        if(playerPosition -1 < playerList.size())
            return this.playerList.get(playerPosition-1);
        Terminal.showMessage("La posicion no existe");
        return null;
   }

    public void ShowPlayers() {
        System.out.println("--------------------------");
        System.out.println("Lista de jugadores Creados");
        for (IPlayerGeneral player : playerList) {
            System.out.println("Nombre: " + player.getName());
            System.out.println("index: " + playerList.indexOf(player));
        }
    }
}
