/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;


/**
 *
 * @author dikshadesai
 */
public class Network {
    private String name;

    @Override
    public String toString() {
        return this.getName();
    }

    public Network(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
