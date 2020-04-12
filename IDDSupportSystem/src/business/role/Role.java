/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

/**
 *
 * @author dikshadesai
 */

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        Caregiver("Caregiver"),
        Analyst("Analyst"),
        Individual("Individual");
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, Enterprise enterprise,Individual individual);


    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
