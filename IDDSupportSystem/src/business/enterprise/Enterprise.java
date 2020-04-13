/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.Organization;
import business.organization.OrganizationDirectory;

/**
 *
 * @author dikshadesai
 */
public abstract class Enterprise extends Organization{
    public EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType {
        Hospital("Hospital"), Facility("Facility");

        private String value;
        
        private EnterpriseType(String value) {
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
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        if(organizationDirectory == null) {
            organizationDirectory = new OrganizationDirectory();
        }
        return organizationDirectory;
    }
    
    
    @Override
    public String toString() {
        return this.getName();
    }
}
