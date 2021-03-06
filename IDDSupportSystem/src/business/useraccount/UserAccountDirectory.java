/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.role.Role;
import business.role.Role.RoleType;
import business.workqueue.WorkQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class UserAccountDirectory {
    
   private List<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public List<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role, RoleType roleType){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setRoleType(roleType);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount deleUserAccount(UserAccount userAccount)
    {
       userAccountList.remove(userAccount);
       return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equalsIgnoreCase(username))
                return false;
        }
        return true;
    }
   
}
