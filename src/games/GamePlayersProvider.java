import java.util.ArrayList;

public interface GamePlayersProvider {

    ArrayList<IPlayerGeneral> getPlayersGeneralList(int totalPlayers);
    
}
