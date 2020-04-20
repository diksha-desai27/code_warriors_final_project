/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.DoctorRole;
import business.role.ReviewerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author kales
 */
public class TrainerOrganization extends Organization {
    
 
    public TrainerOrganization() {
        super(Type.Trainer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReviewerRole());
        return roles;
    }
    
}
