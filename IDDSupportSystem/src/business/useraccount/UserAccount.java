/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.role.Role;
import business.role.Role.RoleType;
import business.workqueue.WorkQueue;

/**
 *
 * @author dikshadesai
 */
public class UserAccount {
    
   private String username;
   private String password;
   private Role role;
   private RoleType roleType;
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

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    void setRole(Role role) {
        this.role = role;
    }
    
    public String toString() {
        return this.getUsername();
    }

   
   
}
