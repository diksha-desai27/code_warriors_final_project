/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

/**
 *
 * @author dikshadesai
 */
public class Enterprise {
    private EnterpriseType enterpriseType;
    
    public enum EnterpriseType {
        Hospital("Hospital"), TrainingCentre("Training Centre");

        private String value;
        
        private EnterpriseType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
    }
}
