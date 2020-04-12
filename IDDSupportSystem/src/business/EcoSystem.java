/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class EcoSystem {
    
    private static EcoSystem system;
    private List<Network> networkList;
    private UserAccountDirectory userAccountDirectory;

    public EcoSystem() {
        this.networkList = new ArrayList();
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public static EcoSystem getInstance() {
        if(system == null)
        {
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
        if(userAccountDirectory == null)
        {
            userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }   
    
}
