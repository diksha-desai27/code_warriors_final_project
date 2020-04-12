/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class FacilityEnterprise extends Enterprise{
    
    public FacilityEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.Facility);
    }

    @Override
    public List<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
