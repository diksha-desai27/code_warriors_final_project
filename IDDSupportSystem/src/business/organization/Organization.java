/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
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
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
   public enum Type {
    Reviewer("Reviewer Organization"), Doctor("Doctor Organization"),Caregiver("Caregiver Organization"), Admin("Admin Organization"), Nurse("Nurse Organization"),Trainer("Trainer Organization");

    private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    
        @Override
        public String toString() {
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
        if(userAccountDirectory == null)
        {
            userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }  
    
    public EmployeeDirectory getEmployeeDirectory() {
        if(employeeDirectory == null)
        {
            employeeDirectory = new EmployeeDirectory();
        }
        return employeeDirectory;
    }  
   
    @Override
    public String toString() {
        return this.getName();
    }
    
}
