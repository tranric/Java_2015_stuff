
import humber.user.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leiroux
 */
public class UserMap {
    
    private Map<String, User> UserMap;
    
        
    public Iterator getUserMap() {
        return new ArrayList<>().iterator();
    }
    
      public UserMap() {
        
    }
    
    public boolean addUserMap(User user) {
        return true;
    }
    
    public boolean removeUserMap(String user) {
        return true;
    }
    
    
    public User getUserMap(String user) {
        return new User("","");
    }
    
}
