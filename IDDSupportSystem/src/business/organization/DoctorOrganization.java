/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.DoctorRole;
import business.role.Role;
import business.schedule.Schedule;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author dikshadesai
 */
public class DoctorOrganization extends Organization{
    
    
    Map<Schedule, UserAccount> doctorSchedule;

    public Map<Schedule, UserAccount> getDoctorSchedule() {
        return doctorSchedule;
    }

    public void setDoctorSchedule(Map<Schedule, UserAccount> doctorSchedule) {
        this.doctorSchedule = doctorSchedule;
    }
    
    public DoctorOrganization() {
        super(Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
