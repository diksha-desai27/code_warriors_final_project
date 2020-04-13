/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.enterprise.Enterprise;
import business.enterprise.FacilityEnterprise;
import business.enterprise.HospitalEnterprise;
import business.organization.Organization.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class OrganizationDirectory {
    List<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if(type == Organization.Type.Admin) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.Analyst) {
            organization = new ReviewerOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.Caregiver) {
            organization = new CaregiverOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.Doctor) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.Nurse) {
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    
    
}
