/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.role.Role;
import business.workqueue.WorkQueue;

/**
 *
 * @author dikshadesai
 */
public class UserAccount {
    
    private String username;
   private String password;
   private Role role;
   private WorkQueue workQueue;
   
   public UserAccount() {
        workQueue = new WorkQueue();
   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    void setRole(Role role) {
        this.role = role;
    }

   
   
}
