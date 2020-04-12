/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.individuals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kales
 */
public class IndividualDirectory {
    
    private List<Individual> individualList;

    public IndividualDirectory() {
        
        individualList = new ArrayList<Individual>();
    }

    public List<Individual> getIndividualList() {
        return individualList;
    }

    public void setIndividualList(List<Individual> individualList) {
        this.individualList = individualList;
    }
    
    
    public Individual addIndividual(Individual i){
        if(!individualList.contains(i)){
            Individual ind = new Individual();
            return ind;
        }
        return null;
    }
    
    
    public boolean deleteIndividual(Individual i){
         if(individualList.contains(i)){
            individualList.remove(i);
            return true;
        }
        return false;
    }
    
    
}
