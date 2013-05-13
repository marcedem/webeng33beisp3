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

    @ManagedProperty(value = "#{user}")
    private User user;
    @ManagedProperty(value = "#{userList}")
    private UserList userList;
    private String username, password;

    
    public String login() {
        if (this.username.isEmpty() || this.password.isEmpty()) {
            this.username = "";
            this.password = "";
            return "/index.xhtml";
        } else {
            if (!this.userList.getUserList().containsKey(this.username)) {
                this.username = "";
                this.password = "";
                return "/index.xhtml";
            } else {
                if (this.userList.getUserList().get(this.username)
                        .getPassword().equals(this.password)) {
                    this.user = this.userList.getUserList().get(
                            this.username);

                    this.username = "";
                    this.password = "";
                    System.out.println("Successful login test");
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
    public User getUser() {
        return user;
    }

    /**
     * @param player the player to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the userList
     */
    public UserList getUserList() {
        return userList;
    }

    /**
     * @param userList the playerList to set
     */
    public void setUserList(UserList userList) {
        this.userList = userList;
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
