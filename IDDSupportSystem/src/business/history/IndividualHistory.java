/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.history;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kales
 */
public class IndividualHistory {

    
    public int weeks;
    public String comments;
    public List<String> condition;

    public IndividualHistory() {
        this.weeks = weeks;
        this.comments = comments;
        this.condition = condition;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    } 
    
    public List<String> getCondition() {
        if(condition==null){
            condition = new ArrayList<>();
        }
        return condition;
    }

    public void setCondition(List<String> condition) {
        this.condition = condition;
    }
    
    
}
