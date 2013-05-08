package beans;

import java.util.HashMap;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alex
 */
@ManagedBean
@ApplicationScoped
public class PlayerList {
    
    private HashMap<String, Player> playerList = new HashMap<String, Player>();

    /**
     * @return the playerList
     */
    public HashMap<String, Player> getPlayerList() {
        return playerList;
    }

    /**
     * @param playerList the playerList to set
     */
    public void setPlayerList(HashMap<String, Player> playerList) {
        this.playerList = playerList;
    }
    
    
    
}
