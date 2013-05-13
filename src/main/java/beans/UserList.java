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
public class UserList {
    
    private HashMap<String, User> userList = new HashMap<String, User>();

    /**
     * @return the playerList
     */
    public HashMap<String, User> getUserList() {
        return userList;
    }

    /**
     * @param playerList the playerList to set
     */
    public void setUserList(HashMap<String, User> userList) {
        this.userList = userList;
    }
    
    
    
}
