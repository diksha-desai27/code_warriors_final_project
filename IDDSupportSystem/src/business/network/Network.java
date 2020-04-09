/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.provider.ProviderDirectory;

/**
 *
 * @author dikshadesai
 */
public class Network {
    private String name;
    private ProviderDirectory providerDirectory;

    public Network(String name, ProviderDirectory providerDirectory) {
        this.name = name;
        this.providerDirectory = this.providerDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProviderDirectory getProviderDirectory() {
        return providerDirectory;
    }

    public void setProviderDirectory(ProviderDirectory providerDirectory) {
        this.providerDirectory = providerDirectory;
    }
    
    
}
