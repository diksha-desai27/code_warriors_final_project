/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.individuals.Individual;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import ui.individuals.IndividualsRegistrationFormJPanel1;
import ui.systemadmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author kales
 */
public class IndividualRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Individual individual, EcoSystem system) {
        return new IndividualsRegistrationFormJPanel1(userProcessContainer,account,individual,system);//To change body of generated methods, choose Tools | Templates.
    }
    
}
