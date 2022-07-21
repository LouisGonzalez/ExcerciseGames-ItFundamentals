package controller;
import Utils.InputData;
import model.player.Player;
import java.util.Iterator;
import java.util.ArrayList;


import java.util.ArrayList;

import model.player.Player;
import utils.Terminal;

public class ControllerPlayer {
<<<<<<< HEAD
    // todo lo relacionado a crud player
    private ArrayList<Player> playerList;
    String name, name2;

    public void crudMenu() {
        int option;

        do {
            System.out.println("--------------------------");
            System.out.println("Bienvenido al Menu del Administrador");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Leer Jugadores");
            System.out.println("3. Actualizar Jugadores");
            System.out.println("4  Borrar jugadores");
            System.out.println("5. Regresar al menu anterior");
            System.out.println("--------------------------");
            option = InputData.readNumber();
            switch (option) {
                case 1 -> createPlayer();
                case 2 -> ReadPlayer();
                case 3 -> updatePlayer();
                case 4 -> removePlayer();
                case 5 -> new Menu.ProgramMenu();
                default -> System.out.println("Vuelva a intentar");
            }
        } while (option != 5);
    }

    public void createPlayer() {
        System.out.println("Ingrese un numero");
        System.out.println("1. Humano\n2. Boot");
        int option = InputData.readNumber();
        if (option == 1) {
            System.out.println("Introduce el nombre del Jugador");
            name = InputData.readString();
            playerList = new ArrayList<Player>(name,null));
            playerList.add(name);
        } else if (option == 2) {
            name = "Boot";
            playerList = new Player(name);
            playerList.add(name);
            System.out.println("index: " + playerList.indexOf(playerList));
        }
    }

    public void ReadPlayer() {
        System.out.println("--------------------------");
        System.out.println("Lista de jugadores Creados Humanos creados");
        for (Player players : playerList) {
            System.out.println("Nombre: " + Player.getName());
            System.out.println("index: " + playerList.indexOf(players));
        }
    }

    public void updatePlayer() {
        System.out.println("--------------------------");
        System.out.println("Ingresa el Nombre del jugador que quieres modificar");
        name = Utils.readString();
        System.out.println("Ingresa el nuevo nombre");
        name2 = Utils.readString();
        Iterator<String> i = playerList.iterator();
        while (i.hasNext()) {
            Player players = i.next();
            if (players.getName().equals(name)) {
                players.setName(name2);
            }
        }
    }

    public void removePlayer() {
        boolean found = false;
        System.out.println("--------------------------");
        System.out.println("Ingresa el nombre del jugador que quieres modificar");
        name = Utils.readString();
        Iterator<String> i = playerList.iterator();
        while (i.hasNext()) {
            String players = i.next();
            if (Player.getName().equals(name)) {
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
=======
    //todo lo relacionado a crud player

    private ArrayList<Player> players;

    public ControllerPlayer(ArrayList<Player> players){
        this.players = players;
    }

    public Player getOne(){
        int playerPosition = Terminal.askNumber("Select one player");
        if(playerPosition - 1 < players.size())
            return this.players.get(playerPosition - 1);
        Terminal.showMessage("The position is non-existent");
        return null;
    }

>>>>>>> 06013256678a60fa7abd8c1c2df27bfb7f341401
}
