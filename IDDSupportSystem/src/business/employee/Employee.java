/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.useraccount.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dikshadesai
 */
public class Employee {
    private String name;
    private String specialization;
    private UserAccount userAccount;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public Employee(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
    @Override
    public String toString() {
        return this.getName();
    }
}
