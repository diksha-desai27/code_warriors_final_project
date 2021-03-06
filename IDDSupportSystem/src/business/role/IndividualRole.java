/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.network.Network;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import ui.individuals.IndividualMyAccountJPanel;
import ui.individuals.IndividualsRegistrationFormJPanel1;
import ui.systemadmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author kales
 */
public class IndividualRole extends Role {

    ArrayList<Enterprise> facilityList = new ArrayList<Enterprise>();

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, Enterprise enterprise, Individual individual) {
       facilityList = new ArrayList<Enterprise>();
        if (individual != null) {
            for (Network n : system.getNetworkList()) {
                if (n.getName().equalsIgnoreCase(individual.getCity())) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.enterpriseType.getValue().equalsIgnoreCase("Facility")) {
                            facilityList.add(e);
                        }
                    }
                }
            }
        }
        if (individual.getIddInfo().getdName() == null || individual.getIddInfo().getdName().equals("")) {
            return new IndividualsRegistrationFormJPanel1(userProcessContainer, account, individual, facilityList);//To change body of generated methods, choose Tools | Templates.

        }
        return new IndividualMyAccountJPanel(userProcessContainer, account, individual, facilityList);//To change body of generated methods, choose Tools | Templates.
    }

}
