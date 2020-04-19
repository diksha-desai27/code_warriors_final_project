/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.individuals.IndividualDirectory;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class EcoSystem extends Organization{

    private static EcoSystem system;
    private List<Network> networkList;
    private UserAccountDirectory userAccountDirectory;
    private IndividualDirectory individualDirectory;

    public EcoSystem() {
        super(null);
        this.networkList = new ArrayList();
        this.userAccountDirectory = userAccountDirectory;
        this.individualDirectory = individualDirectory;
    }

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<Network> networkList) {
        this.networkList = networkList;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        if (userAccountDirectory == null) {
            userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }   
    
    public Network createNetwork() {
       
      Network network = new Network();
        networkList.add(network);
      return network;
    }
        

    public IndividualDirectory getIndividualDirectory() {
        if (individualDirectory == null) {
            individualDirectory = new IndividualDirectory();

        }
        return individualDirectory;
    }

    public void setIndividualDirectory(IndividualDirectory individualDirectory) {
        this.individualDirectory = individualDirectory;
    }

    @Override
    public List<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public boolean checkIfNetworkIsUnique(String name){
        for (Network na : networkList){
            if(na.getName().equals(name))
            return false;
        }
        return true;
    }

}
