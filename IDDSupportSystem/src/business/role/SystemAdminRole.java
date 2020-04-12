/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import ui.systemadmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author dikshadesai
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, Enterprise enterprise) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,system);//To change body of generated methods, choose Tools | Templates.
    }
    
}
