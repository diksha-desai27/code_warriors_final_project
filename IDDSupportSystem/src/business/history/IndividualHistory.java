/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.history;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kales
 */
public class IndividualHistory {

    
    private String status;
    private String comments;
    private List<String> condition;
    private Date meetingDate;
    private int progress;
    
    
    public IndividualHistory() {
        this.status = status;
        this.condition = condition;
        this.comments = comments;
        this.progress = progress;
        this.meetingDate = meetingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    
    
    
    
}
