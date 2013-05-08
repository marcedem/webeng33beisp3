package beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author alex
 */
@ManagedBean
@SessionScoped
public class Login {

    @ManagedProperty(value = "#{player}")
    private Player player;
    @ManagedProperty(value = "#{playerList}")
    private PlayerList playerList;
    private String username, password;

    
    public String login() {
        if (this.username.isEmpty() || this.password.isEmpty()) {
            this.username = "";
            this.password = "";
            return "/index.xhtml";
        } else {
            if (!this.playerList.getPlayerList().containsKey(this.username)) {
                this.username = "";
                this.password = "";
                return "/index.xhtml";
            } else {
                if (this.playerList.getPlayerList().get(this.username)
                        .getPassword().equals(this.password)) {
                    this.player = this.playerList.getPlayerList().get(
                            this.username);

                    this.username = "";
                    this.password = "";
                    return "/table.xhtml";
                } else {
                    this.username = "";
                    this.password = "";
                    return "/index.xhtml";
                }
            }
        }
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * @return the playerList
     */
    public PlayerList getPlayerList() {
        return playerList;
    }

    /**
     * @param playerList the playerList to set
     */
    public void setPlayerList(PlayerList playerList) {
        this.playerList = playerList;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
