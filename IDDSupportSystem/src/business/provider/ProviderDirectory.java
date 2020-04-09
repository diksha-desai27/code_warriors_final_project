/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.provider;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class ProviderDirectory {
    private List<Provider> providerList;

    public ProviderDirectory(List<Provider> providerList) {
        this.providerList = new ArrayList();
    }
    
    public List<Provider> getProviderList() {
        return providerList;
    }

    public void setProviderList(List<Provider> providerList) {
        this.providerList = providerList;
    }
    
    
}
