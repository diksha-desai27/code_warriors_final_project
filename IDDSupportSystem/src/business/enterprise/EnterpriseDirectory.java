/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class EnterpriseDirectory {
    private List<Enterprise> enterpriseList;

    public EnterpriseDirectory(List<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    
    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(List<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
}
