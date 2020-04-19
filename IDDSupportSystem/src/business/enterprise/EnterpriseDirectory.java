/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class EnterpriseDirectory {
    private List<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList();
    }

    
    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(List<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Facility) {
            enterprise = new FacilityEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
     public Enterprise deleteEnterprise(Enterprise enterprise) {
       enterpriseList.remove(enterprise);
       return enterprise;
        
       
    }
     
     public boolean checkIfEnterpriseIsUnique(String name,Enterprise.EnterpriseType type){
        if(type == Enterprise.EnterpriseType.Facility)
        {
         for (Enterprise ep : enterpriseList){
            if(ep.getName().equals(name))
            return false;
        }
         return true;
        
       }
        
        else if(type == Enterprise.EnterpriseType.Hospital)
        {
         for (Enterprise ep : enterpriseList){
            if(ep.getName().equals(name))
            return false;
        }
        return true;
        
       }
        return false;
     }
     }

