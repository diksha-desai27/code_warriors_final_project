/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import ui.trainers.TrainerWorkAreaJPanel;

/**
 *
 * @author kales
 */
public class TrainerRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, Enterprise enterprise,Individual individual) {
        return new TrainerWorkAreaJPanel(userProcessContainer, account, enterprise);
    }
    
}
