/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.CaregiverRole;
import business.role.Role;
import business.schedule.Schedule;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author dikshadesai
 */
public class CaregiverOrganization extends Organization {

    Map<Schedule, UserAccount> careGiverSchedule;

    public CaregiverOrganization() {
        super(Type.Caregiver.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaregiverRole());
        return roles;
    }

    public Map<Schedule, UserAccount> getCareGiverSchedule() {
        return careGiverSchedule;
    }

    public void setCareGiverSchedule(Map<Schedule, UserAccount> careGiverSchedule) {
        this.careGiverSchedule = careGiverSchedule;
    }
    
    

}
