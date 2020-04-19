/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.employee.Employee;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.schedule.Schedule;
import business.useraccount.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dikshadesai
 */
public abstract class Enterprise extends Organization {

    public EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Map<Employee, UserAccount> empMap;
    Map<UserAccount, Schedule> schedule;

    public Map<Employee, UserAccount> getEmpMap() {
        if (empMap == null) {
            empMap = new HashMap<>();
        }
        return empMap;
    }

    public void setEmpMap(Map<Employee, UserAccount> empMap) {
        this.empMap = empMap;
    }

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
        if (organizationDirectory == null) {
            organizationDirectory = new OrganizationDirectory();
        }
        return organizationDirectory;
    }

    public Map<UserAccount, Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<UserAccount, Schedule> schedule) {
        this.schedule = schedule;
    }

  
    @Override
    public String toString() {
        return this.getName();
    }

}
