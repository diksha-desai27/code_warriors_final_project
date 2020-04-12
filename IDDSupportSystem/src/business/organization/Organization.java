/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
   // private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
   public enum Type {
    Analyst("Analyst Organization"), Doctor("Doctor Organization"),Caregiver("Caregiver Organization"), Admin("Admin Organization"), Nurse("NurseOrganization");

    private String value;
        
    private Type(String value) {
            this.value = value;
        }
        
    public String getValue() {
            return value;
        }
   }
   
    public Organization(String name) {
        this.name = name;
        this.workQueue = workQueue;
        this.userAccountDirectory = userAccountDirectory;
    }

    public abstract List<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }   
   
    
}
