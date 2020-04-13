/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.individuals;

import java.util.Date;

/**
 *
 * @author kales
 */
public class Individual {
    
    private int registrationId;
    private String firstName;
    private String lastName;
    private String userName;
    private String birthDate;
    private String address;
    private String city;
    private int zipCode;
    private IDD iddInfo;
    private String serviceType;

    public Individual() {
        registrationId = (int) (System.currentTimeMillis() & 0xfffffff);
    }
    
   
    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public IDD getIddInfo() {
        return iddInfo;
    }

    public void setIddInfo(IDD iddInfo) {
        this.iddInfo = iddInfo;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    
        
    @Override
    public String toString(){
        return this.getUserName();
    }
    
}
