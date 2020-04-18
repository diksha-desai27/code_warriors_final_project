/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.role.Role;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author dikshadesai
 */
public class ConfigureASystem {
    
    public static EcoSystem configure() {
        
        EcoSystem system = EcoSystem.getInstance();
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole(), Role.RoleType.SystemAdmin);
        
        return system;
    }
    
}
